package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;

import entity.User;


@Controller
public class UserController {
	@Resource
	UserService userservice;
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public @ResponseBody String login(String userAccount,String userPassword){
		User user = new User();
		user.setAccount(userAccount);
		User result = userservice.selectUser(user);
		if(result == null || !result.getPassword().equals(userPassword)){
			return "0";
		}else{
			return "1";
		}
	}
	
	//查询个人全部信息
	@RequestMapping(value="selectMassage", method = RequestMethod.POST)
	public @ResponseBody User addUser(String account){
		User user = new User();
		user.setAccount(account);
		User selectOneMassage =userservice.selectUser(user);
		return selectOneMassage;
	}
	
	@RequestMapping(value="add", method = RequestMethod.POST)
	public @ResponseBody String addUser(String account,String nickName,String password,String headPortrait,String qq,String city){
		User user = new User();
		user.setAccount(account);
		user.setNickName(nickName);
		user.setPassword(password);
		user.setAuthorImg(headPortrait);
		user.setQq(qq);
		user.setCity(city);
		userservice.addUser(user);
		return "1";
	}
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public @ResponseBody String updateUser(String account,String nickName,String password,String headPortrait,String qq,String city){
		User u  = new User();
		u.setAccount(account);
		User user = userservice.selectUser(u);
		user.setNickName(nickName);
		user.setPassword(password);
		user.setAuthorImg(headPortrait);
		user.setQq(qq);
		user.setCity(city);
		userservice.updateUser(user);
		return "1";
	}
	
}

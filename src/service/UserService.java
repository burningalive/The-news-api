package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;

@Service
public class UserService {
	@Resource
	UserDao dao;
	
	public User selectUser(User user){
		return dao.selectUser(user);
	}
	public void addUser(User user){
		 dao.addUser(user);
	}
	public void updateUser(User user){
		 dao.updateUser(user);
	}
	public List<User> allUsers(){
		 return dao.allUsers();
	}
}

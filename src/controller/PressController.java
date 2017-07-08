package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.PressService;


import entity.Press;
import entity.ToHead;
import entity.ToOne;

@Controller
public class PressController {
	@Resource
	PressService pressservice;
	//��ѯȫ����������ȡ�
	@RequestMapping(value="selectAllPress", method = RequestMethod.POST)
	public @ResponseBody List<ToHead> getAllNews() {
		List<ToHead> allToHead=pressservice.showAllPress();
		return allToHead;
	}
	//��ѯָ��ĳ����Ϣ��
	@RequestMapping(value="selectOnePress", method = RequestMethod.POST)
	public @ResponseBody ToOne getOneNews(int id) {
		ToOne one =new ToOne();
		one.setId(id);
		ToOne selectOnePress=pressservice.showOnePress(one);
		return selectOnePress;
	}
	//ɾ��ָ����Ϣ
	@RequestMapping(value="deleteOnePress", method = RequestMethod.POST)
	public @ResponseBody String delOneNews(int id) {
		Press press=new Press();
		press.setId(id);
		pressservice.delOnePress(press);
		//ɾ��ɹ�����1
		return "1";
	}
	//����һ������
	@RequestMapping(value="insertOnePress", method = RequestMethod.POST)
	public @ResponseBody String addOneNews(String title,String newsImage, String titleImage,String brief,String content,int user_Id) {
		//��ȡϵͳʱ��
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String lastTime=format.format(date);
		Press press=new Press(title,newsImage,titleImage,brief,content,user_Id,lastTime);
		pressservice.addOnePress(press);
		//��ӳɹ�����1
		return "1";
	}
	//�޸��ƶ�����
	@RequestMapping(value="updateOnePress", method = RequestMethod.POST)
	public @ResponseBody String updOneNews(int id,String title,String newsImage, String titleImage,String brief,String content,int user_Id) {
		//��ȡϵͳʱ��
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String lastTime=format.format(date);
		Press press=new Press(id,title,newsImage,titleImage,brief,content,user_Id,lastTime);
		pressservice.updOnePress(press);
		//�޸ĳɹ�����1
		return "1";
	}
}

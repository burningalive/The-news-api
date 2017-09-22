package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.PressDao;
import entity.Press;
import entity.ToHead;
import entity.ToOne;

@Service
public class PressService {
	@Resource
	PressDao dao;
	public List<ToHead> showAllPress(){
		return dao.showAllPress();
	}
	public List<ToHead> showHomePageNews(){
		return dao.showHomePageNews();
	}
	public List<ToHead> showHomePageArticle(){
		return dao.showHomePageArticle();
	}
	public ToOne showOnePress(ToOne one){
		return dao.showOnePress(one);
	}
	public void delOnePress(Press press){
		dao.delOnePress(press);
	}
	public void addOnePress(Press press){
		dao.addOnePress(press);
	}
	public void updOnePress(Press press){
		dao.updOnePress(press);
	}
	
	
}

package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.PressDao;
import entity.Category;
import entity.Press;
import entity.ToHead;
import entity.ToOne;

@Service
public class PressService {
	@Resource
	PressDao dao;
	private List<ToHead> addHrefHead(List<ToHead> res) {
		for(ToHead i: res){
			i.setHref(i.getId());
		}
		return res;
	}
	public List<ToHead> showAllPress(){
		return addHrefHead(dao.showAllPress());
	}
	public List<ToHead> showHomePageNews(){
		return addHrefHead(dao.showHomePageNews());
	}
	public List<ToHead> showHomePageArticle(){
		return addHrefHead(dao.showHomePageArticle());
	}
	public List<ToHead> showNewsPage() {
		return addHrefHead(dao.showNewsPage());
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
	private List<Category> addHrefCate(List<Category> res) {
		for(Category i: res){
			i.setHref(i.getId());
		}
		return res;
	}
	public List<Category> getCategories(){
		return addHrefCate(dao.getCategories());
	}
	public List<ToHead> getArticleByCateId(int id) {
		return addHrefHead(dao.getArticleByCateId(id));
	}
	public List<ToHead> getArticles() {
		return addHrefHead(dao.getArticles());
	}
	
}

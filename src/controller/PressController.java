package controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

	@RequestMapping(value = "selectAllPress", method = RequestMethod.POST)
	public @ResponseBody
	List<ToHead> getAllNews() {
		List<ToHead> allToHead = pressservice.showAllPress();
		return allToHead;
	}
	
	@RequestMapping(value = "selectAllNews", method = RequestMethod.POST)
	@ResponseBody
	public List<ToHead> showHomePageNews() {
		List<ToHead> allToHead = pressservice.showHomePageNews();
		return allToHead;
	}
	
	@RequestMapping(value = "selectAllArticle", method = RequestMethod.POST)
	 @ResponseBody
	public List<ToHead> showHomePageArticle() {
		List<ToHead> allToHead = pressservice.showHomePageArticle();
		return allToHead;
	}
	
	@RequestMapping(value = "selectOnePress", method = RequestMethod.POST)
	public @ResponseBody
	ToOne getOneNews(int id) {
		ToOne one = new ToOne();
		one.setId(id);
		ToOne selectOnePress = pressservice.showOnePress(one);
		return selectOnePress;
	}

	@RequestMapping(value = "deleteOnePress", method = RequestMethod.POST)
	public @ResponseBody
	String delOneNews(int id) {
		Press press = new Press();
		press.setId(id);
		pressservice.delOnePress(press);
		//
		return "1";
	}

	@RequestMapping(value = "insertOnePress", method = RequestMethod.POST)
	public @ResponseBody
	String addOneNews(String title, String newsImage, String titleImage,
			String brief, String content, int user_Id) {
		Timestamp lastTime = new Timestamp(System.currentTimeMillis());  
		Press press = new Press(title, newsImage, titleImage, brief, content,
				user_Id, lastTime);
		pressservice.addOnePress(press);
		//
		return "1";
	}

	@RequestMapping(value = "updateOnePress", method = RequestMethod.POST)
	public @ResponseBody
	String updOneNews(int id, String title, String newsImage,
			String titleImage, String brief, String content, int user_Id) {
		Timestamp lastTime = new Timestamp(System.currentTimeMillis());
		Press press = new Press(id, title, newsImage, titleImage, brief,
				content, user_Id, lastTime);
		pressservice.updOnePress(press);
		return "1";
	}
	
	@RequestMapping("/selectNewsPage")
	@ResponseBody
	public List<ToHead> selectNewsPage() {
		List<ToHead> res = pressservice.showNewsPage();
		return res;
	}
}

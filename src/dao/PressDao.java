package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Press;
import entity.ToHead;
import entity.ToOne;

@Repository
public interface PressDao {
	List<ToHead> showAllPress();

	List<ToHead> showHomePageNews();

	List<ToHead> showHomePageArticle();
	
	List<ToHead> showNewsPage();

	ToOne showOnePress(ToOne one);

	void delOnePress(Press press);

	void addOnePress(Press press);

	void updOnePress(Press press);
}

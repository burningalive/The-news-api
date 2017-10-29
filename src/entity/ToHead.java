package entity;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ToHead {
	private int 		id;
	private String 		title;
	private String		lastTime;
	private Category	category;
	private String 		newsImage;
	private String 		titleImage;
	private String 		brief;
	private String 		authorImg;
	private String		href;
	public String getHref() {
		return href;
	}
	public void setHref(int id) {
		this.href = "#/newsInfo?press_id=" + id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(Timestamp lastTime) {
		String res = "";
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			res = sdf.format(lastTime);
			this.lastTime = res;
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
			this.lastTime = lastTime.toString();
		}
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getNewsImage() {
		return newsImage;
	}
	public void setNewsImage(String newsImage) {
		this.newsImage = newsImage;
	}
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAuthorImg() {
		return authorImg;
	}
	public void setAuthorImg(String authorImg) {
		this.authorImg = authorImg;
	}
	
	
}

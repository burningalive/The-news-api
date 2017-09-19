package entity;

import java.sql.Timestamp;

public class Press {
	private int id;
	private int user_Id;
	private String title;
	private Timestamp lastTime;
	private Category category;
	private String newsImage;
	private String titleImage;
	private String brief;
	private String content;
	private String like;
	private String comments;
	public Press(){}
	public Press(String title,String newsImage, String titleImage,String brief,String content,int user_Id,Timestamp lastTime){
		this.title=title;
		this.newsImage=newsImage;
		this.titleImage=titleImage;
		this.brief=brief;
		this.content=content;
		this.user_Id=user_Id;
		this.lastTime=lastTime;
	}
	public Press(int id,String title,String newsImage, String titleImage,String brief,String content,int user_Id,Timestamp lastTime){
		this.id=id;
		this.title=title;
		this.newsImage=newsImage;
		this.titleImage=titleImage;
		this.brief=brief;
		this.content=content;
		this.user_Id=user_Id;
		this.lastTime=lastTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getLastTime() {
		return lastTime;
	}
	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}

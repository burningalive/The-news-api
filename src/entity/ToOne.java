package entity;

public class ToOne {
	private int id;
	private String title;
	private String brief;
	private String lastTime;
	private String titleImage;
	private String content;
	private String authorImg;
	private String nickname;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthorImg() {
		return authorImg;
	}
	public void setAuthorImg(String authorImg) {
		this.authorImg = authorImg;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}

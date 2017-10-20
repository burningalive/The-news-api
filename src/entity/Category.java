package entity;

public class Category {
    private String name;
    private String href;
    private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHref() {
		return href;
	}
	public void setHref(int id) {
		this.href = "/#/more/articles"+id;
	}
}

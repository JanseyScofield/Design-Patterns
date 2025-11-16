package screen;

public class Screen {
	protected String name;
	protected Integer width;
	protected Integer heigth;
	
	public Screen(String name, Integer width, Integer heigth) {
		this.name = name;
		this.width = width;
		this.heigth = heigth;
	}
	
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeigth() {
		return heigth;
	}
	public void setHeigth(Integer heigth) {
		this.heigth = heigth;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("Showing " + this.name);
	}
}
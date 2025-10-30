package prototype;

public class Button implements Clonable{
	private String color;
	private int width;
	private int height;
	
	public Button(String color, int width, int height) {
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	public Button(Button clone) {
		if(clone != null) {
			this.color = clone.getColor();
			this.height = clone.getHeight();
			this.width = clone.getWidth();
		}
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String getColor() {
		return "Button color is: " + this.color;
	}
	
	@Override
	public Clonable copy() {
		return new Button(this);
	}
}

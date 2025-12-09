package flyweitght;

public class TreeType {
	private String name;
	private String color;
	private String textureColor;
	
	public TreeType(String name, String color, String textureColor) {
		this.name = name;
		this.color = color;
		this.textureColor = textureColor;
	}
	
	public void draw(int x, int y) {
		System.out.println(
				"Drawing " + this.name + ". Color: " + this.color +  ". Texture Color: " + this.textureColor +
				" in position: " + x + ", " + y
				);
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.color + " " + this.textureColor;
	}
}

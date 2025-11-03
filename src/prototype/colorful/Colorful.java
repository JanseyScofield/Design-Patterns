package prototype.colorful;

import prototype.pattern.Prototype;

public interface Colorful extends Prototype<Colorful>{
	public String getColor();
	public Colorful clone();
}

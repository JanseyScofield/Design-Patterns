package prototype;

import prototype.storableitem.StorableItem;

public class Sharpener implements StorableItem{

	private String name;
	private String material;
	
	public Sharpener(String name, String material) {
		this.name = name;
		this.material = material;
	}
	
	public Sharpener(Sharpener sharpener) {
		this(sharpener.getName(), sharpener.getMaterial());
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	public String getMaterial() {
		return this.material;
	}
	
	public void sharpenPencil(Pencil pencil) {
		if(pencil == null) {
			throw new IllegalArgumentException("This pencil doesn't exist");
		}
		pencil.sharpen();
	}
	
	@Override
	public Sharpener clone() {
		return new Sharpener(this);
	}
}

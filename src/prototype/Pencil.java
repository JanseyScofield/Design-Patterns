package prototype;

import prototype.storableitem.StorableItem;

public class Pencil implements StorableItem{
	private String name;
	private Integer length;
	
	public Pencil(String name, Integer length) {
		this.name = name;
		this.length = length;
	}
	
	public Pencil(Pencil pencil) {
		this(pencil.getName(), pencil.getLength());
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public void sharpen() {
		this.length -= 2;
	}

	@Override 
	public Pencil clone() {
		return new Pencil(this);
	}
}

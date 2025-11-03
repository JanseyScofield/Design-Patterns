package prototype;

import prototype.colorful.Colorful;

public class Car implements Colorful{
	private String color;
	private String brand;
	private int year;
	
	public Car(String color, String brand, int year) {
		this.color = color;
		this.brand = brand;
		this.year = year;
	}
	
	public Car(Car clone) {
		if(clone != null) {
			this.color = clone.getColor();
			this.brand = clone.getBrand();
			this.year = clone.getYear();
		}
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public int getYear() {
		return this.year;
	}
	
	@Override
	public String getColor() {
		return "Car color is: " + this.color;
	}

	@Override
	public Car clone() {
		return new Car(this);
	}

}

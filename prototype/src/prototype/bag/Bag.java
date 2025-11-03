package prototype.bag;

import java.util.Arrays;

import prototype.pattern.Prototype;
import prototype.storableitem.StorableItem;

public class Bag implements Prototype<Bag>{
	private StorableItem[] itens;
	private Integer length;
	private Integer itensAmount;
	
	public Bag(Integer length) {
		this.length = length;
		this.itens = new StorableItem[length];
		this.itensAmount = 0;
	}
	
	public Bag(Bag bag) {
		this(bag.getLength());
		this.itensAmount = bag.getItensAmount();
		this.itens = bag.getItens();
	}
	
	public boolean isFull() {
		return this.length <= this.itensAmount;
	}

	public Integer getLength() {
		return this.length;
	}
	
	public Integer getItensAmount() {
		return this.itensAmount;
	}
	
	public StorableItem[] getItens(){
		StorableItem[] itensCopy = new StorableItem[this.length];
		for(int i = 0; i < this.itensAmount; i++) {
			itensCopy[i] = this.itens[i].clone();
		}
		return itensCopy;
	}
	
	public StorableItem getItemByName(String name) {
		return Arrays.stream(this.itens)
					  .filter(i -> i.getName().toUpperCase() == name.toUpperCase())
					  .findFirst()
					  .orElse(null);
	}
	
	public void addItem(StorableItem item) throws Exception{
		if(isFull()) {
			throw new Exception("This bag is full");
		}
		
		for(int i = 0; i < this.itensAmount; i++) {
			if(this.itens[i] == null) {
				this.itens[i] = item;
				this.itensAmount++;
				return;
			}
		}
	}
	
	public void removeItemByName(String name) throws Exception {
		for(int i = 0; i < this.length; i++) {
			if(this.itens[i].getName().toUpperCase() == name.toUpperCase()) {
				this.itens[i] = null;
				this.itensAmount--;
				return;
			}
		}
		throw new Exception("This item isn't in this bag");
	}
	
	public Bag clone() {
		return new Bag(this);
	}
}

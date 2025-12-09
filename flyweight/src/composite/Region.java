package composite;

import java.util.ArrayList;
import java.util.List;

public class Region implements ForestElement{
	private List<ForestElement> children;
	private String name;
	
	public Region(String name) {
		this.children = new ArrayList<ForestElement>();
		this.name = name;
	}
	
	public Region(String name, List<ForestElement> children) {
		this.children = children;
		this.name = name;
	}
	
	public void addChild(ForestElement newChild) {
		children.add(newChild);
	}
	
	public boolean removeChild(ForestElement child) {
		return children.remove(child);
	}
	
	@Override
	public void render() {
		System.out.println("------------Drawing: " + this.name + "------------");
		for(ForestElement child : this.children) {
			child.render();
		}
		System.out.println("----------Finish " + this.name + "--------------");
	}
}

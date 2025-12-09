package composite;

import flyweitght.TreeType;

public class Tree implements ForestElement{

	private int x;	
	private int y;
	private TreeType treeType;
	
	public Tree(TreeType treeType, int x, int y) {	
		this.treeType = treeType;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void render() {
		this.treeType.draw(x, y);
	}
}

import composite.Tree;
import flyweight.TreeType;
import flyweight.TreeTypeFactory;

public class GameWorld {
	public void run1() {
		TreeTypeFactory.printAllTypes();
		Tree firstTree = new Tree(TreeTypeFactory.getTreeType("Oak", "red", "OakTexture.png"), 0, 0);
		firstTree.render();
		Tree secondTree = new Tree(TreeTypeFactory.getTreeType("Oak", "blue", "OakTexture.png"), 1, 1);
		secondTree.render();
		Tree thirdTree = new Tree(TreeTypeFactory.getTreeType("Oak", "red", "OakTexture.png"), 2, 2);
		thirdTree.render();
		Tree lastTree = new Tree(TreeTypeFactory.getTreeType("Oak", "blue", "OakTexture.png"), 1, 1);
		lastTree.render();
		TreeTypeFactory.printAllTypes();
	}
	
	public static void run2() {
		
	}
	
	public static void main(String[] args) {
		GameWorld gameWorld = new GameWorld();
		gameWorld.run1();
	}
}

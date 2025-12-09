import composite.Region;
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
		TreeTypeFactory.printAllTypes();
		Region firstRegion = new Region("First Region");
		firstRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Oak", "red", "OakTexture.png"), 0, 0));
		firstRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Oak", "blue", "OakTexture.png"), 1, 1));
		firstRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Oak", "red", "OakTexture.png"), 2, 2));
		firstRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Oak", "blue", "OakTexture.png"), 1, 1));
		Region firstSubRegion = new Region("First Sub Region");
		firstSubRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Pine", "green", "PineTexture.png"), 4, 6));
		firstSubRegion.addChild(new Tree(TreeTypeFactory.getTreeType("Pine", "green", "PineTexture.png"), 5, 6));
		firstRegion.addChild(firstSubRegion);
		firstRegion.render();
		TreeTypeFactory.printAllTypes();
	}
	
	public static void main(String[] args) {
		GameWorld gameWorld = new GameWorld();
		gameWorld.run2();
	}
}

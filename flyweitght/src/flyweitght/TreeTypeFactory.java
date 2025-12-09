package flyweitght;

import java.util.HashMap;

public class TreeTypeFactory {
	private static HashMap<String, TreeType> treeTypes = new HashMap<String, TreeType>();
	
	public static TreeType getTreeType(String name, String color, String textureColor) {
		String keyTree = name + color + textureColor;
		TreeType result = treeTypes.get(keyTree);
		if(result == null) {
			result = new TreeType(name, color, textureColor);
			treeTypes.put(keyTree, result);
		}
		return result;
	}
	
	public static void printAllTypes() {
		if(treeTypes.isEmpty()) {
			System.out.println("This factory is empty");
			return;
		}
		
		for(TreeType type : treeTypes.values()) {
			System.out.println(type.toString());
		}
	}
}

package prototype.storableitem;

import prototype.pattern.Prototype;

public interface StorableItem extends Prototype<StorableItem>{
	StorableItem clone();
	String getName();
}

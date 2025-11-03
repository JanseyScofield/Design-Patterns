package prototype.pattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManagement {
	private Map<String, Prototype<?>> prototypes = new HashMap<String, Prototype<?>>();
	
	public void putPrototype(String key, Prototype<?> proto) {
		prototypes.put(key, proto);
	}
	
	public void removePrototype(String key) {
		prototypes.remove(key);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getClone(String key) {
		Prototype<?> clone = prototypes.get(key);
		if(clone == null) {
			throw new IllegalArgumentException("This prototype doesn't exist");
		}
		return (T)clone.clone();
	}
}

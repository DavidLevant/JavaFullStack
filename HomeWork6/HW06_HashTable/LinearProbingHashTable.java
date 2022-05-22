import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class    LinearProbingHashTable<K, V> implements GradableMap<K, V> {

	Hashtable<K, V> ht = new Hashtable<K, V>();
	
	public LinearProbingHashTable(){
		// TODO Auto-generated method stub
		
	}
	
	public LinearProbingHashTable(int size){
		// TODO Auto-generated method stub
		
	}

	public LinearProbingHashTable(int size, double loadFactor){
		// TODO Auto-generated method stub
	
	}
	
	@Override
	public void clear() {
		ht.clear();
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		if ((ht.containsKey(arg0)) == true) {
			return true;
		} else {

		return false;}
	}

	@Override
	public boolean containsValue(Object arg0) {
		if ((ht.containsValue(arg0)) == true) {
			return true;
		} else {

			return false;}
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {

		return ht.values();
	}

	@Override
	public V get(Object arg0) {
		if (ht.get(arg0)== true){
			return ht.get(arg0);
		} else {
		return null; }
	}

	@Override
	public boolean isEmpty() {
		if (ht.isEmpty()== ht.size()){
			return true;
		} else {
			return false; }
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> otherMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V remove(Object key) {
		if (ht.remove(key) != null){
			ht.remove(key);
			return ht.ketSet();
		} else {
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashTableEntry<K, V>[] getArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setArray(HashTableEntry<K, V>[] array) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		
	}

}

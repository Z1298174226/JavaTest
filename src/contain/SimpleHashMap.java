package contain;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import net.mindview.util.*;

public class SimpleHashMap<K,V> extends AbstractMap<K,V>  {

	static final int SIZE = 997;
	@SuppressWarnings("unchecked")
	LinkedList<MapEntry<K,V>> [] buckets = 
	     new LinkedList[SIZE];
	
	public V put(K key,V values){
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] ==null){
			buckets[index] = new LinkedList<MapEntry<K,V>>();
			
		}
		LinkedList<MapEntry<K,V>> bucket = buckets[index];
		MapEntry<K,V> pair = new MapEntry<K,V>(key ,values);
		boolean found = false;
		ListIterator<MapEntry<K,V>> it = bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K,V> ipair = it.next();
			if(ipair.getKey().equals(key)){
				oldValue = ipair.getValue();
				it.set(pair);
				found = true;
				break;
			}
		}
		if(!found){
			buckets[index].add(pair);
			
		}
		return oldValue;
	}
	
	public V get(Object key){
		int index = Math.abs(key.hashCode())%SIZE;
		if(buckets[index] == null) return null;
		for(MapEntry<K,V> ipair: buckets[index])
			if(ipair.getKey().equals(key))
				return ipair.getValue();
		return null;
	}
	
	
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K,V>> bucket: buckets){
			if(bucket == null)continue;
			for(MapEntry<K,V> mpair: bucket)
				set.add(mpair);
		}
		return set;
	}
    public static void main(String[] args)  {
    	SimpleHashMap<String,String> m =
    			new SimpleHashMap<String,String>();
    	m.putAll(Countries.capitals(25));
    
    	System.out.println(m);
    	System.out.println(m.get("ERITREA"));
    	System.out.println(m.entrySet());
    	System.out.println("Hello".hashCode());
    }
}

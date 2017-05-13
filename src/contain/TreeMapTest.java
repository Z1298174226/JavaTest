package contain;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {
	static class ComparableClass<K> implements Comparator<K>{
        Collator collator = Collator.getInstance();
		@Override
		public int compare(Object arg0, Object arg1) {
			if(arg0 == null || arg1 == null){
				return 0;
			}
			CollationKey key1 = collator.getCollationKey(arg0.toString());
			
			CollationKey key2 = collator.getCollationKey(arg1.toString());
			
			return key1.compareTo(key2);
		}
		
	}
	public static void main(String[] args){
		TreeMap<String,String> tree = new TreeMap<String,String>(new TreeMapTest.ComparableClass<String>());
		for(int i =0;i<10;i++){
			String s = ""+(int)(Math.random()*1000);
			tree.put(s,s);
		}
		tree.put("ABC", "abc");
		tree.put("abc", "nihao");
		tree.put("上海市", "黄浦区");
		tree.put("北京市", "海淀区");
		Collection<String> col = tree.values();
		Iterator<String> it = col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		for(String  s:col){
			System.out.println(s);
		}
		
		
	}

}

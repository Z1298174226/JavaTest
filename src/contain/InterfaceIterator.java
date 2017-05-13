package contain;
/**
 * @author zhaoxudong
 * 用iterator而不是collection来表示容器之间的共性
 */
import java.util.Iterator;
import java.util.*;
import typeinfo.pets.*;
public class InterfaceIterator {
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet pet=it.next();
			System.out.print(pet.id()+":"+pet+" ");
		}
		System.out.println();
	}
	public static void display(Collection<Pet> pets){
		for(Pet p:pets){
			System.out.print(p.id()+":"+p+" ");
		//	System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args){
		List<Pet> petlist=Pets.arrayList(8);
		Set<Pet> petset=new TreeSet<Pet>(petlist);
		Map<String,Pet> petmap=new LinkedHashMap<String,Pet>();
		String[] names=("zhao, qian, sun, li, zhou"+"wu, zheng, wang").split(", ");
		for(int i=0;i<names.length;i++){
			petmap.put(names[i], petlist.get(i));
		}
		display(petlist);
		display(petset);
		display(petlist.iterator());
		display(petset.iterator());
		System.out.println(petmap);
		System.out.println(petmap.keySet());
		display(petmap.values());
		display(petmap.values().iterator());
		
	}

}

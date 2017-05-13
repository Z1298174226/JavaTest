package contain;
/**
 * @author zhaoxudong
 * foreach
 */
import typeinfo.pets.*;
import java.util.*;
public class IterableInnerClass implements Iterable<Pet> {
	List<Pet> petlist =Pets.arrayList(8);
	public Iterator<Pet> iterator(){		
		return new Iterator<Pet>(){
		//	private int index=0;
			public boolean hasNext(){
				return petlist.iterator().hasNext();
			}
			public Pet next(){
				return petlist.iterator().next();
			}
			public void remove(){
				petlist.iterator().remove();
			}
			
		};
	}

}

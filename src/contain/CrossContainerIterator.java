package contain;
/**
 * @author zhaoxudong
 * 迭代器：将遍历序列的操作与序列底层结构相分离
 */
import java.util.Iterator;
import java.util.*;
import typeinfo.pets.*;
public class CrossContainerIterator {
public static void display(Iterator<Pet> it){
	while(it.hasNext()){
		Pet p=it.next();
		System.out.print(p.id()+": "+p+" ");
	}
	System.out.println();
}

public static void main(String[] args){
	ArrayList<Pet> petlist=Pets.arrayList(8);
	List<Pet> petlink=new LinkedList<Pet>(petlist);
	Set<Pet> petset=new HashSet<Pet>(petlink);
	Map<String,List<?extends Pet>> petmap
	=new LinkedHashMap<String,List<?extends Pet>>();
	String names[]="zhao qian sun li zhou wu".split(" ");
	for(int i=0;i<names.length;i++){
		petmap.put(names[i],petlink);
	//	System.out.println(names[i]+" has "+petmap.get(names[i]));
	}
	//display(petlist.iterator());
	//display(petset.iterator());
	//display(petlink.iterator());
	//System.out.println((List)petmap.keySet());
	//System.out.println(petmap.values());
	//System.out.println(petlist.iterator());
	//System.out.println(petmap.get("zhao"));j
	display(((List)petmap.get("zhao")).iterator());
}
}

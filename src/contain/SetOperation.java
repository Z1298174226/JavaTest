package contain;
import java.util.*;
public class SetOperation {
	private static Set<String> set=new TreeSet<String>();
	private static Set<String> set1=new TreeSet<String>();
	public static void main(String[] args){
		Collections.addAll(set, "A B C D E F G H I J K L".split(" "));
		Collections.addAll(set1,"G H I J K L".split(" "));
		set1.addAll(Arrays.asList("O P Q".split(" ")));
		//Arrays.asList方法接受一个数组或者用逗号分隔的元素列表（可以使用可变参量）并将其转化为一个List对象）
		System.out.println("H:"+set.contains("H"));
		System.out.println("set has set1:"+set.containsAll(set1));
		set.remove("L");
		System.out.println("set has set1:"+set.containsAll(set1));
		set.removeAll(set1);
     	set.addAll(set1);
     	set.add("M");
		for(String s:set){
			StringBuilder buf=new StringBuilder();
			buf.append("'");
			buf.append(s);
			buf.append("' ");
			System.out.print(buf);
		}
		
	}

}

package contain;
/**
 * @author zhaoxudong
 * Foreach and Iterator
 */
import java.util.*;
//import Mr.zhao.util.*;
public class ForeachContains {
public static void main(String[] args){
	Collection<String> cs=new LinkedList<String>();
	//Collection´ÓInterable¼Ì³Ð¶øÀ´
	Collections.addAll(cs, 
			"Zhao xu dong is a genius".split(" "));
	for(String s:cs){
		StringBuilder buf=new StringBuilder();
		buf.append("'");
		buf.append(s);
		buf.append("' ");
	//	Print.print("'"+s+"' ");
	    System.out.print(buf);
	}
}
}

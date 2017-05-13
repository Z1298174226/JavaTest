package generic;
import java.util.*;
public class Test<T> {
	private  ArrayList<T> array=new ArrayList<T>();
	public  ArrayList<T> add(T t){
		array.add(t);
		return array;
	}
	public static void main(String[] args){
		Test<String> test=new Test<String>();
		Test<Integer> test1=new Test<Integer>();
		System.out.println(test.add(" "));
		System.out.println(test1.add(123));
		
		
	}

}

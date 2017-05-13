package rtti;
import java.util.*;
class CountedInteger{
	private static long counter;
	private final long id=counter++;
	//public CountedInteger(int i){}
	public String toString(){
		return Long.toString(id);
	}
}
class PetName{
	private static String sb="";
	private final String id=sb+"z";
	public String toString(){
		return id;
	}
}
public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type){
		this.type=type;
	}
	public List<T> creat(int nElements){
		List<T> result=new ArrayList<T>();
		try{
			for(int i=0;i<nElements;i++){
				result.add(type.newInstance());//T必须具有默认构造器
			}
			
		}catch(Exception e){
			throw new RuntimeException();
	}
		return result;
	}
	public static void main(String[] args){
		FilledList<CountedInteger> fl=new FilledList<CountedInteger>(CountedInteger.class);
           System.out.println(fl.creat(15));
        FilledList<PetName> fl1=new FilledList<PetName>(PetName.class);
        System.out.println(fl1.creat(14));
	}

}

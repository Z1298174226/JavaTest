package contain;
import java.util.*;
public class ResorveIterator<T> extends ArrayList<T> {
	public ResorveIterator(Collection<T> c){super(c);}
	public Iterable<T> resorve(){
		return new Iterable<T>(){
			public Iterator<T> iterator(){
				return new Iterator<T>(){ 
					int current=size()-1;
					public boolean hasNext(){
						return current>-1;
					}
					public T next(){
						return get(current--);
					}
					public void remove(){
						throw new UnsupportedOperationException();
					}		
				};
			}		
		};
	}
	public static void main(String[] args){
		ResorveIterator<String> reit=new ResorveIterator<String>(Arrays.asList
				(args[0].split(" ")));
		for(String s:reit){
			System.out.print(s);
		}
		System.out.println();
		for(String s:reit.resorve()){
			System.out.print(s);
		}
		System.out.println();	
	}
	

}

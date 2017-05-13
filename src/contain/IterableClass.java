package contain;
import java.util.*;
public class IterableClass implements Iterable<String> {
	protected String[] words="zhao xu dong is a genuis !".split(" ");
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=0;
			public boolean hasNext(){
				return index<words.length;
			}
			public String next(){
				return words[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Iterable<String> reBack(){
		return new Iterable<String>(){
			public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=words.length-1;
			public boolean hasNext(){
				return index>-1;
			}
			public String next(){
				return words[index--];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
			
		};
			}
		};
	}
	public static void main(String[] args){
		for(String s:new IterableClass().reBack()){
			StringBuilder buf=new StringBuilder();
		    buf.append("'");
		    buf.append(s);
		    buf.append("' ");
		    System.out.print(buf);
		}
	}

}

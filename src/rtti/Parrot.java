package rtti;

public class Parrot {
	int i;
	String str;
	public Parrot(int i){
		this.i = i;		
	}
	public Parrot (String str){
		this.str = str;
	}
	public Parrot (String str, int i){
		this.i = i;
		this.str = str;
	}
	public String toString(){
		return str +" "+ String.valueOf(i);
	}

}

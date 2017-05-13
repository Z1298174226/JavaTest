package rtti;
import Mr.zhao.util.*;
class Candy{
	static{
		Print.print("Loading Candy");
	}
}

class Gum{
	static{
		Print.print("Loading Gum");
	}
}
class Cookie{
	static{
		Print.print("Loading Cookie");
	}
}
public class ToyTest {
	public static void main(String[] args){
		Candy c=new Candy();
		new Gum();	
		Print.print(c.getClass());	
		try{
			Class.forName("rtti.s");//务必加包名
		}catch(ClassNotFoundException e){
			Print.print("Couldn't find");
		}
		/**
		try{
		Object obj=null;
		
		obj=Class.forName("Cookie").newInstance();
		}catch(InstantiationException e){
			
		}catch(IllegalAccessException e){
			
		}catch(ClassNotFoundException e){
			
		}
		*/
				
	}
}

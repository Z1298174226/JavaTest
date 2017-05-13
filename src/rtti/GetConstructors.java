package rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructors {
	
	final static int MAXINUM = 10;
	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException{
		Class<? extends Parrot> type = Parrot.class;
		try{
		Constructor<? extends Parrot> cons = type.getConstructor(int.class);
		Constructor<? extends Parrot> strs = type.getConstructor(String.class);
		Constructor<? extends Parrot> strcons = type.getConstructor(String.class,int.class);
		Parrot parrot = cons.newInstance(3);
		Parrot parrot1 = strs.newInstance("Hello");
		Parrot parrot2 = strcons.newInstance("fine",6);
		System.out.println(parrot.i);
		System.out.println(parrot1);
		System.out.println(parrot2);
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			
		}catch(InstantiationException e){
			
		}catch(IllegalArgumentException e){
			
		}
	
		}
	    

}

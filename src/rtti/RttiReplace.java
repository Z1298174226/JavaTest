package rtti;

import java.lang.reflect.*;
public class RttiReplace {
	private Object coffee; 
	public RttiReplace(Coffee coffee){
		this.coffee=coffee;
		
	}
	public void func(){
		System.out.println(coffee.getClass().getName());
		
	}

	public static void main(String[] args) throws Exception{
		Milk milk = new Milk();
		RttiReplace test = new RttiReplace(new Coffee(3));
		test.func();
		Class<?> testClass = test.getClass();
		Field testField = testClass.getDeclaredField("coffee");
		System.out.println(testField);
		testField.setAccessible(true);
		testField.set(test, milk);
		test.func();
	}

}

class Coffee{
	public int member;
	public Coffee(int num){
		member=num;
	}
	
}
class Milk{
	
}

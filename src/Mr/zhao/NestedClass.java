package Mr.zhao;
import  Mr.zhao.util.*;
public class NestedClass {
	public void fun(){
		Print.print("fun();");
	}
	public  static class Tester{		
		public static void main(String[] args)
		{
			NestedClass test=new NestedClass();
			test.fun();
		}
	}

}

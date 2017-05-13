package classTest;

public class StaticTest {
	private static String code = null; 
	{
		code = "Zhaoxudong";
	}
	public void gunc(final StaticTest test){
	
	
	}
	public static void func(){}
	public static void main(String[] args){
		StaticTest sta = new StaticTest();
		//func();
		sta.gunc(sta);
		System.out.println(code);
	}

}

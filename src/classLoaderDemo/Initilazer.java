package classLoaderDemo;

public class Initilazer {
	private static Initilazer init = new Initilazer();
	public static int count1 = 2;
	public static int count2 = 0;
	public int count3 = 5;
	private Initilazer(){
		count1 ++;
		count2 ++;
		count3 ++;
		System.out.println("constructor");
	}
	public static Initilazer getInstance(){
		return init;
	}
	public static void main(String[] args){
		Initilazer init = Initilazer.getInstance();
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(init.count3);
	}

}

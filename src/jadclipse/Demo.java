package jadclipse;

public class Demo {
	public  static int a =10;
	public static void display(){
		System.out.println("--------------->");
	}
	public static void main(String[] args){
		Demo demo = new Demo();
		Demo.display();
		a= 12;
		System.out.println(a);
	}

}

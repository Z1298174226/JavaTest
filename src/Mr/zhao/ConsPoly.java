package Mr.zhao;
/**Inside the constructor for polymorphic method*/
/**在任何事物发生之前，将分配给对象的存储空间初始化成二进制零*/
/**调用基类构造方法*/
/**按照声明的顺序调用成员的初始化方法*/
/**调用导出类的构造器*/

class Poly{
	void draw(){
		System.out.println("draw()");
	}
    public static void stafun(){
		System.out.println("Poly.stafun()");
	}
	Poly(){
		System.out.println("Before call the draw()");
		draw();
		System.out.println("After call the draw()");
	}
	
}
class RoundPoly extends Poly{
	private int radius=1;
	RoundPoly(int r)
	{
		this.radius=r;
		System.out.println("call RoundPoly.draw() ,"+"radius="+radius);
	}
	void draw(){
		System.out.println("call RoundPoly.draw() ,"+"radius="+radius);
	}
	public static void stafun(){
		System.out.println("RoundPoly.stafun()");
	}
	public String toString(){
		return "radius="+radius;
	}
}
public class ConsPoly {
	
	public static void main(String[] args)
	{
		Poly p=new RoundPoly(5);
		System.out.println(p);
		RoundPoly.stafun();
		Poly.stafun();
	}
}
		                
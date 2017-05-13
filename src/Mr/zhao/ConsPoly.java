package Mr.zhao;
/**Inside the constructor for polymorphic method*/
/**���κ����﷢��֮ǰ�������������Ĵ洢�ռ��ʼ���ɶ�������*/
/**���û��๹�췽��*/
/**����������˳����ó�Ա�ĳ�ʼ������*/
/**���õ�����Ĺ�����*/

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
		                
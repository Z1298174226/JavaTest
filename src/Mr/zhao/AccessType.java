package Mr.zhao;
import Mr.zhao.util.*;
class Soup1{
	private Soup1(){}//�޷�ͨ���������½�����
	public static Soup1 makeSoup(){
		System.out.println("Call makeSoup()");
		return new Soup1();
	}
}
 
class Soup2{
	private Soup2(){}
	private static Soup2 ps1=new Soup2();
	public static Soup2 access(){
		return ps1;
	}
	public void f(){Print.print("Call f()");}
}
public class AccessType {
	public static void main(String[] args)
	{
		Soup1 soup=Soup1.makeSoup();
		Soup2.access().f();//�Կ��Է���ͨ��static��Ա�����޷��½�����
	}

}

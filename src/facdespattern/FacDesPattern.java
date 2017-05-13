package facdespattern;
import Mr.zhao.util.*;
/**工厂设计模式*/
interface Service{
	public void method1();
	public void method2();
}
interface ServiceFactory{
	public Service getservice();
}
class Implementation1 implements Service{
	Implementation1(){}
	public void method1(){
		Print.print("Implementation1.method1()");
	}
	public void method2(){
		Print.print("Implementation1.method2()");
	}
	public static ServiceFactory fac=new ImplementationFac1();
}
class Implementation2 implements Service{
	Implementation2(){}
	public void method1(){
		Print.print("Implementation2.method1()");
	}
	public void method2(){
		Print.print("Implementation2.method2()");
	}
	public static ServiceFactory fac2=new ImplementationFac2();
}
class ImplementationFac1 implements ServiceFactory{
	public Service getservice(){
		return new Implementation1();
	}
}
class ImplementationFac2 implements ServiceFactory{
	public Service getservice(){
		return new Implementation2();
	}
}
public class FacDesPattern {
	public static void serviceConsumer(ServiceFactory factory)
	{
		Service s=factory.getservice();
		s.method1();
		s.method2();
	}
	public static void main(String[] args)
	{
		serviceConsumer(Implementation1.fac);
		serviceConsumer(Implementation2.fac2);
	}

}

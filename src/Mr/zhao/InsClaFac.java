package Mr.zhao;
import Mr.zhao.util.*;
/**使用匿名内部类实现工厂设计模式*/
interface Service{
	public void method1();
	public void method2();
}
interface ServiceFactory{
	public Service getservice();
}
class Implementation1 implements Service{
	private Implementation1(){}
	public void method1(){
		Print.print("Implementation1.method1()");
	}
	public void method2(){
		Print.print("Implementation1.method2()");
	}
    public static ServiceFactory fac=
    		new ServiceFactory(){
    	public Service getservice(){
    		return new Implementation1();
    	}
    };
}
class Implementation2 implements Service{
	private Implementation2(){}
	public void method1(){
		Print.print("Implementation2.method1()");
	}
	public void method2(){
		Print.print("Implementation2.method2()");
	}
	public static ServiceFactory fac2=
			new ServiceFactory(){
		public Service getservice(){
			return new Implementation2();
		}		
	};	
}
public class InsClaFac {
	public static void serviceConsumer(ServiceFactory factory)
	{
		/**完全隐藏了接口的实现*/
		Service s=factory.getservice();
		s.method1();
		s.method2();
	}
	public static void main(String[] args){
		serviceConsumer(Implementation1.fac);
		serviceConsumer(Implementation2.fac2);
		
	}

}

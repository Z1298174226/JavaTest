package refelect;
import java.lang.reflect.*;

interface DayOFLab{
	void programming(String lang);
	void read(String book);
	void write(String font);
}
class OpticalDayOFLab implements DayOFLab{
	public void programming(String lang){
		System.out.println("Programming with "+lang);
	}
	public void read(String book){
		System.out.println("Read "+book);
	}
	public void write(String font){
		System.out.println("Write with " + font);
	}
class MethodSelector implements InvocationHandler{
	private Object proxied;
	public MethodSelector(Object proxied){
		this.proxied=proxied;
	}
	public Object invoke(Object Proxy,Method method,Object[] args) throws Throwable{
		if(method.getName().equals("read")){
			System.out.println("I found my mum is "+method.getName());
		}
		return method.invoke(proxied, args);		
	}
	/*
	private Object proxied;
	public MethodSelector(Object proxied){
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("write")){
			System.out.println(" makes me happy");
		}
		return method.invoke(proxied, args);
	}
	*/
  } 
}
public class ProxyTest {
	public static void doSomething(DayOFLab interfac){
		interfac.programming("Java");
		interfac.read("STL");
		interfac.write("pencil");
		
	}
	
	public static void main(String[] args){
		DayOFLab day = new OpticalDayOFLab();
		doSomething(day);
		DayOFLab proxy = (DayOFLab)Proxy.newProxyInstance(
				DynamicProxy.class.getClassLoader(),
				new Class[] {DayOFLab.class},
				new MethodSelectors(day));
		doSomething(proxy);
	}

}

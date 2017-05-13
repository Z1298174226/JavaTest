package refelect;
import java.lang.reflect.*;

interface AnInterface{
	void cook(String arg);
	void wash(String arg);
	void clean(String arg);
	void study(String arg);
	
}
class Mother implements AnInterface{
	public void cook(String arg){
		System.out.println("My mum is cooking "+arg);
	}
	public void wash(String arg){
		System.out.println("My mum is washing "+arg);
	}
	public void clean(String arg){
		System.out.println("My mum is cleaning "+arg);
	}
	public void study(String arg){
		System.out.println("My mum is studying "+arg);
	}
}
class MethodSelectors implements InvocationHandler {
	private Object proxied;
	public MethodSelectors(Object proxied){
		this.proxied=proxied;
	}
	public Object invoke(Object Proxy,Method method,Object[] args) throws Throwable{
		if(method.getName().equals("wash")){
			System.out.println("I found my mum is "+method.getName());
		}
		return method.invoke(proxied, args);		
	}
	
}

public class DynamicProxy {
	public static void consumer(AnInterface ai){
		ai.cook("tomato");
		ai.clean("room");
		ai.study("math");
		ai.wash("clothes");
	}
	public static void main(String[] args){
		Mother mother=new Mother();
		//consumer(mother);
		AnInterface proxy = (AnInterface)Proxy.newProxyInstance(
				DynamicProxy.class.getClassLoader(),
				new Class[] {AnInterface.class},
				new MethodSelectors(mother));
		//proxy.wash("room");
		consumer(proxy);
		//System.out.println(AnInterface.class.getClassLoader());
		
				
	}

}

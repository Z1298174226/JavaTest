package refelect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class BlackBox {
	
//	interface Interaction{
//		void display();
//	}
//	
//	static class Action implements Interaction{
//		public void display(){
//			System.out.println("JDK1.7");
//		}
//	}
//	
//	public static String MethodName = "display";
//	
//	public static void method(){
//		System.out.println("JDK1.8");
//	}
//	static class MethodSelector implements InvocationHandler{
//		Object proxied;
//		public MethodSelector(Object proxied){
//			this.proxied = proxied;
//		}
//		public Object bind(){
//			return Proxy.newProxyInstance(proxied.getClass().getClassLoader(), proxied.getClass().getInterfaces(), this);
//		}
//		@Override
//		public Object invoke(Object proxy, Method arg1, Object[] arg2) throws Throwable {
//			if(arg1.getName().equals(MethodName)){
//				method();
//			}
//			return arg1.invoke(proxied, arg2);
//		}
//	}
//	static class MethodSelector implements InvocationHandler{
//        Object proxied;
//        public MethodSelector(Object proxied){
//        	this.proxied = proxied;
//        }
//        
//        public Object bind(){
//        	return Proxy.newProxyInstance(proxied.getClass().getClassLoader(),
//        			proxied.getClass().getInterfaces(),this);
//        }
//      
//		@Override
//		public Object invoke(Object proxy, Method arg1, Object[] arg2) throws Throwable {
//			if(arg1.getName().equals(MethodName)){
//				System.out.println("JDK1.8");
//			}
//			//return null;
//			return arg1.invoke(proxied, arg2);
//		}		
//	}
//	public static void main(String[] args){
//		Interaction action = (Interaction) new MethodSelector(new Action()).bind();
//		action.display();
////		System.getProperties().put("sun.misc.ProxyGenerator.SaveGeneratedFiles","true");
//	}
	static interface Action{
		void display();
	}
	
	static class ActionImp implements Action{
		@Override
		public void display(){
			System.out.println("JDK1.7");
		}
	}
	static class MethodSelect implements InvocationHandler{
        Object proxied;
        public MethodSelect(Object proxied){
        	this.proxied = proxied;
        }
        
        public Object bind(){
        	return Proxy.newProxyInstance(proxied.getClass().getClassLoader(), proxied.getClass().getInterfaces(), this);
        }
		
		@Override
		public Object invoke(Object proxy, Method arg1, Object[] arg2) throws Throwable {
			if(arg1.getName().equals("display"))
				System.out.println("JDK1.8");
			return arg1.invoke(proxied,arg2);
			
		}
		
	}
	
	public static void main(String[] args){
		Action act = (Action) new MethodSelect(new ActionImp()).bind();
		act.display();
	}

}

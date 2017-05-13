package classLoaderDemo;

import java.io.IOException;


public class ClassLoaderTest {
	public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		ClassLoader myloader = new ClassLoader(){
			@Override 	
			public Class<?> loadClass(String name) throws ClassNotFoundException{
				try{
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
					java.io.InputStream is = getClass().getResourceAsStream(fileName);
				
						System.out.println(getClass());
					
					if(is == null){
						return super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name,b,0,b.length);
				}catch(IOException ex){
					throw new ClassNotFoundException(name);
				}
			}
		};
		Object obj = myloader.loadClass("classLoaderDemo.ClassLoaderTest").newInstance();
		System.out.println(obj.getClass());
		//ClassLoaderTest 由系统应用成俗类加载器加载
		System.out.println(obj.getClass());
		System.out.println(obj instanceof ClassLoaderTest);
	}

}

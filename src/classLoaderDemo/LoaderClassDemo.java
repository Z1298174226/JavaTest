package classLoaderDemo;

import java.io.IOException;
import java.io.InputStream;


public class LoaderClassDemo {
	public static void main(String[] args){
		ClassLoader myLoader = new ClassLoader(){
			@Override 
			public Class<?> loadClass(String fileName) throws ClassNotFoundException{
				try{
				 
					String name = fileName.substring(fileName.lastIndexOf(".") + 1 ) + ".class";
					InputStream is = (InputStream) getClass().getResourceAsStream(name);
					if(is == null){
						return super.loadClass(fileName);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(fileName,b,0,b.length);
				}catch(IOException ex){
					throw new ClassNotFoundException(fileName);
				}
			}
		};
		try{
		Object obj = myLoader.loadClass("classLoaderDemo.ClassLoaderDemo").newInstance();
		System.out.println(obj instanceof LoaderClassDemo);
		}catch(ClassNotFoundException ex){
			
		}catch(InstantiationException ex){
			
		}catch(IllegalAccessException ex){
			
		}
	}

}

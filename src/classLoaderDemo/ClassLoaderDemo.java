 package classLoaderDemo;
import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderDemo {
//	public static void main(String[] args){
//		ClassLoader myloader = new ClassLoader(){
//			@Override
//			public Class<?> loadClass(String fileName) throws ClassNotFoundException{
//				try{
//				String name = fileName.substring(fileName.lastIndexOf(".") +  1) + ".class";
//				
//			//	InputStream is = getClass().getResourceAsStream(name);
//				InputStream is = getClass().getResourceAsStream(name);
//				if(is == null){
//				//	return super.loadClass(fileName);
//					return super.loadClass(fileName);
//				}
//				byte[] b = new byte[is.available()];
//				is.read(b);			
//				return defineClass(fileName,b,0,b.length);
//				}catch(IOException ex){
//					throw new ClassNotFoundException(fileName);
//				}
//				
//			}
//		};
//		try{
//		Object obj = myloader.loadClass("classLoaderDemo.ClassLoaderDemo").newInstance();
//		Object obj1 = ClassLoaderDemo.class.newInstance();
//		System.out.println(obj.getClass().getClassLoader());
//		System.out.println(obj1.getClass().getClassLoader());
//		System.out.println(obj instanceof ClassLoaderDemo);
//		System.out.println(obj1 instanceof ClassLoaderDemo);
//		}catch(IllegalAccessException ex){
//			
//		}catch(InstantiationException ex){
//			
//		}catch(ClassNotFoundException ex){
//			
//		}
//		
//	}
//	  
	 public static void main(String[] args){
		 ClassLoader myLoader = new ClassLoader(){
			 @Override
			 public Class<?> loadClass(String fileName) throws ClassNotFoundException{
				 String name = fileName.substring(fileName.lastIndexOf(".") + 1) + ".class";
				 try{
					 InputStream is = getClass().getResourceAsStream(name);
					 if( is == null){
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
			 System.out.println(obj instanceof ClassLoaderDemo);
			 System.out.println(obj.getClass().getClassLoader());
			 Object objCopy = ClassLoaderDemo.class.newInstance();
			 System.out.println(objCopy instanceof ClassLoaderDemo);
			 System.out.println(objCopy.getClass().getClassLoader());
		 }catch(ClassNotFoundException ex){
			 
		 }catch(IllegalAccessException ex){
			 
		 }catch(InstantiationException ex){
			 
		 }
	 }

}

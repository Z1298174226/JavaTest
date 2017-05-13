package refelect;
import java.lang.reflect.*;
import java.util.regex.*;
public class Constructor {
	private static String usage =
		    "usage:\n" +
		    "ShowMethods qualified.class.name\n" +
		    "To show all methods in class or:\n" +
		    "ShowMethods qualified.class.name word\n" +
		    "To search for methods involving 'word'";
	private static Pattern p=Pattern.compile("\\W+\\.");
	public static void main(String[] args){
		
		if(args.length<1){
			      System.out.println(usage);
			      }
		
				 try{
				 Class<?> c=Class.forName(args[0]);
				 Method[] mets=c.getMethods();
				 Method[] metsd=c.getDeclaredMethods();
				 for(Method met:mets){
					 System.out.println(p.matcher(met.toString()).replaceAll(""));
					// System.out.println(met);
				 }
				 System.out.println();
				 for(Method met:metsd){
					 System.out.println(p.matcher(met.toString()).replaceAll(""));
				 }
				 System.out.println();
				 
				 Field[] fields=c.getDeclaredFields();
				 for(Field field:fields){
					// System.out.println(p.matcher(field.toString()).replaceAll(""));
					 System.out.println(field);
				 }
				 Object obj=c.newInstance();
				 
				 System.out.println(obj.getClass());
				 System.out.println();
				 
				// Constructor[] cons=c.getConstructors();
			   
				 }catch(ClassNotFoundException e){
					 System.out.print("No such class: " + e);
				 }catch(IllegalAccessException e){
					 
				 }catch(InstantiationException e){
					 
				 }
			 
			
		
	}
	 

}

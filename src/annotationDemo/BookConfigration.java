package annotationDemo;

import java.lang.reflect.Field;

public class BookConfigration {
	public String bookNameInfo = "������֣� ";
	public String bookTypeInfo = "������ࣺ ";
	public String bookProvider = "��Ĺ�Ӧ�̣� ";
	public void configration(Class<?> clazz){
		boolean is = clazz.isAnnotationPresent(Description.class);
		if(is){
			Description d = clazz.getAnnotation(Description.class);
				System.out.println(d.value());
			
		}
		//Field[] fields = clazz.getDeclaredFields();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field: fields){
			
			if(field.isAnnotationPresent(Description.class)){
				Description d = field.getAnnotation(Description.class);
			}
			if(field.isAnnotationPresent(BookName.class)){
				BookName name = field.getAnnotation(BookName.class);
				System.out.println(bookNameInfo + name.name());
			}
			
			if(field.isAnnotationPresent(BookType.class)){
				BookType type = field.getAnnotation(BookType.class);
				System.out.println(bookTypeInfo + type.bookType());
			}
			if(field.isAnnotationPresent(BookProvider.class)){
				BookProvider provider = field.getAnnotation(BookProvider.class);
				System.out.println(bookProvider + provider.id() + " "+ provider.providerName()+ " " + provider.providerAddress());
			}
		}
		
		
	    
	}

}

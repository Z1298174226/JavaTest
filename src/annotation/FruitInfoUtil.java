package annotation;
/*
 * 　java.lang.reflect 包下主要包含一些实现反射功能的工具类，实际上，java.lang.reflect 包所有提供的反射API扩充了
 * 读取运行时Annotation信息的能力。当一个Annotation类型被定义为运行时的Annotation后，该注解才能是运行时可见，当class文件
 * 被装载时被保存在class文件中的Annotation才会被虚拟机读取。
　　AnnotatedElement 接口是所有程序元素（Class、Method和Constructor）的父接口，所以程序通过反射获取了某个类的AnnotatedElement
对象之后，程序就可以调用该对象的如下四个个方法来访问Annotation信息：

　　方法1：<T extends Annotation> T getAnnotation(Class<T> annotationClass): 
返回改程序元素上存在的、指定类型的注解，如果该类型注解不存在，则返回null。
　　方法2：Annotation[] getAnnotations():返回该程序元素上存在的所有注解。
　　方法3：boolean is AnnotationPresent(Class<?extends Annotation> annotationClass):
判断该程序元素上是否包含指定类型的注解，存在则返回true，否则返回false.
　　方法4：Annotation[] getDeclaredAnnotations()：返回直接存在于此元素上的所有注释。与此接口中的其他方法不同，该方法将忽略继承的注释。（如果没有注释直接存在于此元素上，则返回长度为零的一个数组。）该方法的调用者可以随意修改返回的数组；这不会对其他调用者返回的数组产生任何影响。
 */
import java.lang.reflect.*;
/*
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";
        
        Field[] fields = clazz.getDeclaredFields();
        
        for(Field field :fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor();/*.toString();*/
   /*             System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
*/
public class FruitInfoUtil{
	public static void getFruitInfo(Class<?> clazz){
		String strFruitName="水果名称： ";
		String strFruitColor="水果颜色： ";
		String strPrividerInfo="供应商信息： ";
		
		Field[] fields=clazz.getDeclaredFields();
		for(Field field:fields){
			if(field.isAnnotationPresent(FruitName.class)){
				FruitName fruitName =field.getAnnotation(FruitName.class);
				System.out.println(strFruitName+fruitName.value());
			}
			else if(field.isAnnotationPresent(FruitColor.class)){
				FruitColor fruitColor =field.getAnnotation(FruitColor.class);
				System.out.println(strFruitColor+ fruitColor.fruitColor().toString());
				
			}
			else if(field.isAnnotationPresent(FruitProvider.class)){
				FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
				System.out.println(strPrividerInfo+ "供应商id： "+fruitProvider.id()+" 供应商名称： "+fruitProvider.name()+" 供应商地址 ： "+fruitProvider.address());
			}
		}
	}
}
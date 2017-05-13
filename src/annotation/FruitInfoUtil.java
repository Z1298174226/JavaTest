package annotation;
/*
 * ��java.lang.reflect ������Ҫ����һЩʵ�ַ��书�ܵĹ����࣬ʵ���ϣ�java.lang.reflect �������ṩ�ķ���API������
 * ��ȡ����ʱAnnotation��Ϣ����������һ��Annotation���ͱ�����Ϊ����ʱ��Annotation�󣬸�ע�����������ʱ�ɼ�����class�ļ�
 * ��װ��ʱ��������class�ļ��е�Annotation�Żᱻ�������ȡ��
����AnnotatedElement �ӿ������г���Ԫ�أ�Class��Method��Constructor���ĸ��ӿڣ����Գ���ͨ�������ȡ��ĳ�����AnnotatedElement
����֮�󣬳���Ϳ��Ե��øö���������ĸ�������������Annotation��Ϣ��

��������1��<T extends Annotation> T getAnnotation(Class<T> annotationClass): 
���ظĳ���Ԫ���ϴ��ڵġ�ָ�����͵�ע�⣬���������ע�ⲻ���ڣ��򷵻�null��
��������2��Annotation[] getAnnotations():���ظó���Ԫ���ϴ��ڵ�����ע�⡣
��������3��boolean is AnnotationPresent(Class<?extends Annotation> annotationClass):
�жϸó���Ԫ�����Ƿ����ָ�����͵�ע�⣬�����򷵻�true�����򷵻�false.
��������4��Annotation[] getDeclaredAnnotations()������ֱ�Ӵ����ڴ�Ԫ���ϵ�����ע�͡���˽ӿ��е�����������ͬ���÷��������Լ̳е�ע�͡������û��ע��ֱ�Ӵ����ڴ�Ԫ���ϣ��򷵻س���Ϊ���һ�����顣���÷����ĵ����߿��������޸ķ��ص����飻�ⲻ������������߷��ص���������κ�Ӱ�졣
 */
import java.lang.reflect.*;
/*
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" ˮ�����ƣ�";
        String strFruitColor=" ˮ����ɫ��";
        String strFruitProvicer="��Ӧ����Ϣ��";
        
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
                strFruitProvicer=" ��Ӧ�̱�ţ�"+fruitProvider.id()+" ��Ӧ�����ƣ�"+fruitProvider.name()+" ��Ӧ�̵�ַ��"+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
*/
public class FruitInfoUtil{
	public static void getFruitInfo(Class<?> clazz){
		String strFruitName="ˮ�����ƣ� ";
		String strFruitColor="ˮ����ɫ�� ";
		String strPrividerInfo="��Ӧ����Ϣ�� ";
		
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
				System.out.println(strPrividerInfo+ "��Ӧ��id�� "+fruitProvider.id()+" ��Ӧ�����ƣ� "+fruitProvider.name()+" ��Ӧ�̵�ַ �� "+fruitProvider.address());
			}
		}
	}
}
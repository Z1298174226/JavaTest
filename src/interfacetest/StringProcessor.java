package interfacetest;
import java.util.*;
import Mr.zhao.util.*;
//����һ���ܸ��������ݵĲ�������Ĳ�ͬ�����в�ͬ��Ϊ�ķ�������Ϊ�������ģʽ
interface Processor{
	String name();
	Object process(Object input);
}
 class Apply{
	public static void process(Processor P,Object s){
	Print.print("Using processor "+P.name());
	Print.print(P.process(s));
	}
}
public abstract class StringProcessor implements Processor {
	public String name(){
		return getClass().getSimpleName();//��ȡ���ʾ��
	}
	//���ô���ĵ�һ�ַ�ʽ�ǿͻ��˳���Ա��ѭ�ýӿ�����д�����Լ�����
	public abstract String process(Object input);
	public static String s=
			"If she weighs the same as a duck,she's made of wood";
    public static void main(String[] args){
    	Apply.process(new Upcase(),s);
    	Apply.process(new Downcase(),s);
    	Apply.process(new Splitter(),s);
    }
}
class Upcase extends StringProcessor{
	public String process(Object input){
		return ((String)input).toUpperCase();
	}
}
class Downcase extends StringProcessor{
	public String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends StringProcessor{
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}

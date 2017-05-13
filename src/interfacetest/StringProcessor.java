package interfacetest;
import java.util.*;
import Mr.zhao.util.*;
//创建一个能根据所传递的参数对象的不同而具有不同行为的方法，成为策略设计模式
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
		return getClass().getSimpleName();//获取类标示符
	}
	//复用代码的第一种方式是客户端程序员遵循该接口来编写他们自己的类
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

package rtti;
/**
 * 
 * @author zhaoxudong
 * 泛化的Class引用
 */
public class GenericClassReferences {
	public static void main(String[] args){
		Class intClass=Integer.TYPE;
		Class<Integer> genericIntClass=Integer.TYPE;
		genericIntClass =Integer.class;
	//	genericIntClass=Double.class;
		//强制编译器进行类型检查；
	}

}

package rtti;
/**
 * 
 * @author zhaoxudong
 * ������Class����
 */
public class GenericClassReferences {
	public static void main(String[] args){
		Class intClass=Integer.TYPE;
		Class<Integer> genericIntClass=Integer.TYPE;
		genericIntClass =Integer.class;
	//	genericIntClass=Double.class;
		//ǿ�Ʊ������������ͼ�飻
	}

}

package classTest;
public class ClassTest implements InterfaceTest{
	private final Class<?> type = ClassTest.class;
	public static void main(String[] args){
		ClassTest test = new ClassTest();
		for(Class<?> typeClass : test.type.getInterfaces()){
			System.out.println(typeClass.getName().toString());
		}
		System.out.println(test.type.getSuperclass().getName().toString());
	}

}

package generic;

public class GenericMethods {
	public static <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
	public static void main(String[] args){
		GenericMethods gm=new GenericMethods();
		gm.f("");
		gm.f(gm);
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f("@");
		gm.f(GenericMethods.class);
		try{
		gm.f(GenericMethods.class.newInstance());
		
		}catch(Exception e){
			throw new RuntimeException();
		
		}
		try{
			gm.f(Class.forName("GenericMethods"));
		}catch(Exception e){
			throw new RuntimeException();
		}
	}

}

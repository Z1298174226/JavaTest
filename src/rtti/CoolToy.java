package rtti;
interface HasBatteries{}
interface WaterProof{}
interface Shoots{}
class Toy{
	static{
		System.out.println("Loading Toy");
	}
	public Toy(){}
	public Toy(int i){}
}
public class CoolToy extends Toy implements HasBatteries,WaterProof,Shoots {
	public static void printInfo(Class cc){
		System.out.println("Class name: "+cc.getName()+" is interface? "
				+ "["+cc.isInterface()+"]");
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Canonical name: "+cc.getCanonicalName());
	}
	public static void main(String[] args){
	//	Class c=null;
		Class cc=Toy.class;
		Class cface=WaterProof.class;
		//Class cint=short.class;
	//	Class cint =Short.TYPE;
	/**
		try{
			c=Class.forName("rtti.CoolToy");
		}catch(ClassNotFoundException e){
			System.out.println("Couldn't find class");
			System.exit(1);
		}
		*/
	//	printInfo(c);
		printInfo(cc);
		printInfo(cface);
	//	printInfo(cint);
		/**
		for(Class face:c.getInterfaces()){
			printInfo(face);
		}
		Class up=c.getSuperclass();
		Object obj=null;
		try{
			obj=up.newInstance();
		}catch(InstantiationException e){
		System.exit(1);	
		}catch(IllegalAccessException e){
			System.exit(1);
		}
		printInfo(obj.getClass());
		*/
	}

}

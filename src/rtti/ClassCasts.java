package rtti;
class Building{}
class House extends Building{}
public class ClassCasts {
	public static void main(String[] args){
	Building b=new Building();
	//.classû�м̳�����
	Class<Building> bclass=null;
	//bclass=House.class;
	bclass=Building.class;
	Class<House> h=House.class;
	Object obj=null;
	try{
		obj=h.newInstance();
	}catch(Exception e){
		throw new RuntimeException();
	}
	//House house=h.cast(b);
	//House house=null;
	//house=(House)b;
	if(obj instanceof Building)//��������������
	{
		System.out.println("Yes!");
	}
	
	}
}

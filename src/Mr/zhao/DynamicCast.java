/**确保正确清理*/
package Mr.zhao;
import Mr.zhao.util.*;
class Characteristic{
	private String s;
	Characteristic(String s)
	{
		this.s=s;
		Print.print("Creating Characteristic "+s);
	}
	protected void dispose()
	{
		Print.print("disposing Characteristic "+s);
	}
	public String toString()
	{
		return "s="+s;
	}
}
class Description{
	private String s;
	Description(String s)
	{
		this.s=s;
		Print.print("Creating Description "+s);
	}
	protected void dispose(){
		Print.print("disposing Description "+s);
	}
	public String toString()
	{
		return "s="+s;
	}
}
class LivingCreature{
	private Characteristic p=new Characteristic("is alibe");
	private Description t=new Description("Basic Living Creature");
	LivingCreature(String ss){
		Print.print("LivingCreature()");
		Print.print("***************");
		func();
		Print.print("***************");
	}
	protected void dispose(){
		Print.print("LivingCreature dispose()");
		t.dispose();
		p.dispose();
	}
	void func()
	{
		Print.print(p);Print.print(t);
	}
}
class Animal extends LivingCreature{
	private Characteristic p=new Characteristic("has heart");
	private Description t=new Description("Animals not Vegetables");
	Animal(){
		super("zhao");
		Print.print("Animal()");
		Print.print("***************");
		func();
		Print.print("***************");
	}
	protected void dispose(){
		Print.print("Animal dispose()");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	void func()
	{
		Print.print(p);Print.print(t);
	}
	
}
class Amphibian extends Animal{
	private Characteristic p=new Characteristic("can live in water");
	private Description t=new Description("both water and land");
	Amphibian()
	{
		Print.print("Amphibian()");
		Print.print("***************");
		func();
		Print.print("***************");
	}
	protected void dispose(){
		Print.print("Amphibian dispose()");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	void func()
	{
		Print.print(p);Print.print(t);
	}
}
public class DynamicCast extends Amphibian {
	private Characteristic p=new Characteristic("Croaks");
	private Description t=new Description("Eats bugs");
	public DynamicCast(){
		Print.print("DynamicCast()");
		Print.print("***************");
		func();
		Print.print("***************");
		
	}
	protected void dispose(){
		Print.print("DynamicCast dispose()");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	void func()
	{
		Print.print(p);Print.print(t);
	}
	public static void main(String[] args)
	{
		DynamicCast dan=new DynamicCast();
		try{}
		finally{
		Print.print("Bye!");
		dan.dispose();
		}
	}
	

}

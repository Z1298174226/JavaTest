package Mr.zhao;

class Bowl{
	Bowl(int marker)
	{
		System.out.println("Bowl("+marker+")");
	}
	void f1(int marker){
		System.out.println("f1("+marker+")");
		
	}
}
class Table{
	static Bowl bowl1=new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	Table f2(int marker)
	{
		System.out.println("f2("+marker+")");
		return this;
	}
	void f3(int marker)
	{
		 this.f2(marker);
	}
	static Bowl bowl2=new Bowl(2);
}
class Cupboard{
	Bowl bowl3=new Bowl(3);
	static Bowl bowl4=new Bowl(4);
	Cupboard()
	{
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker)
	{
		System.out.println("f3("+marker+")");
	}
	static Bowl bowl5=new Bowl(5);
}
class A{};
enum Spiciness{
	NOT,MILD,HOT,STATIC,FLAMING
}

public class test {	
	static void f(float i,Character... args){ //args本质上仍为数组
			System.out.println("first");
		}
    static void f(char c,Character... args){
			System.out.println("second");
		}
    static void f1(Object...strings )
    {
    	for(Object obj:strings)
    		System.out.print(obj+" ");
    	    System.out.println();
    }
    static void f(int required,String...strings )
    {
    	System.out.println("required: "+required+" ");
    	for(String s:strings)
    		System.out.print(s+" ");
    	    System.out.println();
    }
   
	
   public static void main(String[] args)
   {
	   System.out.println("Creat new Cupboard() in main");
	   new Cupboard();
	   System.out.println("Creat new Cuoboard() in main");
	   new Cupboard();
	   table.f3(5);
	   table.f2(9).f2(10);
	   cupboard.f3(1);
	   f(1,'a','b','c','d');
	   f('a','b');
	   f('a',"one","two");
	   f(1,"one");
	   f(2,"two","one");
	   f(0);
	   f1(new A(),new A());
	   f1("zhao","xu","dong");
	   f1(new Table(),new Cupboard());
	   Spiciness howHot=Spiciness.FLAMING;
	   System.out.println(howHot);
	   for(Spiciness s:Spiciness.values())
	     System.out.println(s +", ordinal "+s.ordinal());
   }
   static Table table=new Table();
   static Cupboard cupboard=new Cupboard();
}

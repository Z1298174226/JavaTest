package Mr.zhao;
/**协变返回类型*/
class Grain{
	public String toString(){return "Grain";}
}
class Wheat extends Grain{
	public String toString(){return "Wheat";}
}
class Mill{
	Grain process(){return new Grain();}
	Grain process(String s){return new Grain();}
}
class WheatMill extends Mill{
	@Override Wheat process(){return new Wheat();}  
}
public class CovarRet {
	public static void main(String[] args)
	{
		Mill m=new Mill();
		Grain g=m.process();
		System.out.println(g);
	    m=new WheatMill();
	    g=m.process();     //返回更为具体的类型
	    //g=m.process("cat");     //并不会覆盖基类中的重载方法（名称屏蔽）
	    System.out.println(g);
	}
}

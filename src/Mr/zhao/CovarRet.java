package Mr.zhao;
/**Э�䷵������*/
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
	    g=m.process();     //���ظ�Ϊ���������
	    //g=m.process("cat");     //�����Ḳ�ǻ����е����ط������������Σ�
	    System.out.println(g);
	}
}

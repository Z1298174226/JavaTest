package Mr.zhao;
class Destination{
	public String label;
	Destination(){}
	String readLabel(){return label;}
}
public class AnonyInClaFinal {
	public Destination desination(final String dest,final float price){
		//�������һ�������ڲ��࣬����ϣ����ʹ��һ�������ⲿ����Ķ�����ô��������Ҫ��
		//�������final
		return new Destination(){
			private int cost;
			{
				cost=Math.round(price);
				if(cost>100)
					System.out.println("Over budget!");
			}
			private String label=dest;
			public String readLabel(){
				return label;
			}
		};
	}
	public static void main(String[] args){
		AnonyInClaFinal a=new AnonyInClaFinal();
		Destination d=a.desination("Tasmanian",101.395F);
	}

}

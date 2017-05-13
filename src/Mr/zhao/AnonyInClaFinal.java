package Mr.zhao;
class Destination{
	public String label;
	Destination(){}
	String readLabel(){return label;}
}
public class AnonyInClaFinal {
	public Destination desination(final String dest,final float price){
		//如果定义一个匿名内部类，并且希望他使用一个在其外部定义的对象，那么编译器会要求
		//其参数是final
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

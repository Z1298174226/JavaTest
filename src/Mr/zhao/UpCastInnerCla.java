package Mr.zhao;
interface Destination1{
	String readLabel();
}
interface Contents{
	int value();
}
public class UpCastInnerCla {
	private  class PContents implements Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	protected class PDestination implements Destination1{
		private String label;
		private PDestination(String whereTo)
		{
			label=whereTo;
		}
		public String readLabel(){
			return label;
		}
	}
	public Destination1 destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}

	public static void main(String[] args){
		UpCastInnerCla p=new UpCastInnerCla();
		Contents c=p.contents();
		Destination1 d=p.destination("Tasmania");
	}

}

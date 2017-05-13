package innerclass;
interface Selec{
	boolean end();
	Object current();
	void next();	
}
public class Selector {
	private Object[] items;
	private int next=0;
	public Selector(int size){
		items=new Object[size];
	}
	public void add(Object x){
		if(next<items.length){
			items[next++]=x;
		}
	}
	//普通的内部类对象隐式地保存了一个引用，指向创建它的外围类对象，即内部类拥有外围类所有元素的访问权
	private class SequenceSelctor implements Selec{
		private int i=0;
		public boolean end(){
			return i==items.length;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if(i<items.length) i++;
		}
}
	public Selec select(){
		return new SequenceSelctor();
	}
	public static void main(String[] args)
	{
		Selector selct=new Selector(10);
		for(int i=0;i<10;i++){
			selct.add(i);//Integer.toString(i));
		}
		Selec selectors=selct.select();
		while(!selectors.end()){
			System.out.print(selectors.current()+" ");
			selectors.next();
		}
		
	}

}

package adapter;
/** 适配器设计模式
*@author Mr.zhao
*/
import Mr.zhao.util.*;
interface Process{
	public String name();
	public Object process(Object input);
}
class Filter{
	public String name(){
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input){
		return input;
	}
}
class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff){
		this.cutoff=cutoff;
	}
}
class Waveform{
	private static long conter;
	private final long id=conter++;
	public String toString(){
		return "Waveform "+id;
	}
}
//用到了代理
//类Filter与接口Process具有相同的接口的元素，但Filter不能为类Apply所接受，所以需要实现接口Process，以
//Filter的对象作为代理
class FilterAdpter implements Process{
	private Filter filter;
	public FilterAdpter(Filter filter){
		this.filter=filter;
	}
	public String name(){
		return filter.name();
	}
	public Waveform process(Object input){
		return filter.process((Waveform)input);
	}
}
class Apply{
	public static void process(Process p,Object s)
	{
		Print.print("Using process "+p.name());
		Print.print(p.process(s));
	}
}
public class Adpter {
	public static void main(String[] args){
		Waveform wave=new Waveform();
		Apply.process(new FilterAdpter(new LowPass(2.0) ), wave);
	}
	

}

package exception;
/**
 * about �쳣���ơ��쳣����ջ�켣
 * @author zhaoxudong
 *
 */
class BaseballException extends Exception{}
class Foul extends BaseballException{}
class StrikeException extends BaseballException{}
class Stupid extends Exception{}
abstract class Inning{
	public Inning()throws BaseballException{
		//throw new BaseballException();
	}
	public void event()throws BaseballException{}
	public abstract void atBat() throws Foul,StrikeException;
	public void walk(){}
	public void run()throws Stupid{}
	
}
class StromException extends Exception{}
class RainedOut extends StromException{}
class PopFoul extends Foul{}
class SuperStupid extends Stupid{}

interface Strom{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}
public class StoryInning extends Inning implements Strom {
	public StoryInning()throws RainedOut,BaseballException{
	   //throw new RainedOut();			
	}
	public StoryInning(String s) throws Foul,BaseballException{}
	public void run()throws SuperStupid{}
	public  void event(){}
	public void rainHard()throws RainedOut{}
	public void atBat() throws PopFoul,StrikeException{
		PopFoul pop= new PopFoul();
		pop.initCause(new PopFoul());
		throw pop;	
	}
	public  void func() throws PopFoul,StrikeException{atBat();}
	public static void main(String[] args){
		//DynamicFields.main(args);
		try{
			StoryInning story=new StoryInning();
		//	StoryInning story =new StoryInning(); //ע����upcast������
		//	story.event();
			story.func();
		//	story.run();
		}catch(Foul e){
			e.printStackTrace();		
		}
		catch(BaseballException e){
			e.printStackTrace();	
		}
		catch(RainedOut e){
			e.printStackTrace();		
	}
		
	}
}


package dynamic;
class Human{  
	@Override
	public String toString(){
		return "Human";
	}
}    
class Man extends Human{
	//@Override
	public String toString(){
		return "man";
	}
}  
class Woman extends Human{
	//@Override
	public String toString(){
		return "woman";
	}
}  

public class StaticPai{  

//    public void say(Human hum){  
//        System.out.println("I am human");  
//    }  
//    public void say(Man hum){  
//        System.out.println("I am man");  
//    }  
//    public void say(Woman hum){  
//        System.out.println("I am woman");  
//    }  
    public static  void show(Human human){
    	System.out.println(human);
    }
    public static void main(String[] args){  
        Human man = new Man();  
        Human woman = new Woman();  
       // StaticPai sp = new StaticPai();  
//       System.out.println(man);
//       System.out.println(woman);
        show(man);
        show(woman);
        
    }  
}  
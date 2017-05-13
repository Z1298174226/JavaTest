package polymorphism.shap;
import java.util.*;
import Mr.zhao.*;

class Shape{
	void draw(){}
	void erase(){}
}
class Circle extends Shape{
	public void draw(){System.out.println("Call Circle.draw()");}
	public void erase(){System.out.println("Call Circle.erase()");}
	
}
class Square extends Shape{
	public void draw(){System.out.println("Call Square.draw() ");}
	public void erase(){System.out.println("Call Square.erase()");}
}
class Triangle extends Shape{
	public void draw(){System.out.println("Call Triangle.draw() ");}
	public void erase(){System.out.println("Call Triangle.erase()");}
}
class RandomShapeGenerator{
	private Random rand=new Random(47);
	public Shape next(){
		switch(rand.nextInt(3)){
			default:
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
		}
	}	
}

public class Shapes {
private static RandomShapeGenerator gen=new RandomShapeGenerator();
public static void main(String[] args)
{
	Shape[] s=new Shape[9];
	for(int i=0;i<s.length;i++)
		s[i]=gen.next();
	for(Shape shp:s)
		shp.draw();
	ConsPoly.main(args);
	CovarRet.main(args);
	//Poly.stafun();
}
}

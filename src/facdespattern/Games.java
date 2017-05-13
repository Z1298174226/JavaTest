package facdespattern;
import Mr.zhao.util.*;
interface Game{
	boolean move();
}
interface GameFactory{
	Game getgame();
}
class Checkers implements Game{
	private Checkers(){}
	private int moves=0;
	private static final int MOVES=5;
	public boolean move(){
		Print.print("Checkers move"+moves);
		return ++moves !=MOVES;
	}
	public static GameFactory factory=new GameFactory(){
		public Game getgame(){
			return new Checkers();
		}
	};
}
class Chess implements Game{
	private Chess(){}
	private int moves=0;
	private static final int MOVES=4;
	public boolean move(){
		Print.print("Chess move"+moves);
		return ++moves !=MOVES;
	}
	public static GameFactory factory=new GameFactory(){
		public Game getgame(){
			return new Chess();
		}
	};
}
public class Games {
	public static void playgame(GameFactory factory){
		Game game=factory.getgame();
		while(game.move())
			;
	}
	public static void main(String[] args){
		playgame(Checkers.factory);
		playgame(Chess.factory);
		
	}

}

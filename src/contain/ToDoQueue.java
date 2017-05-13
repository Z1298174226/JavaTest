package contain;
/*
 * 优先级队列（含两个优先级权值）
 */
import java.util.PriorityQueue;

public class ToDoQueue extends PriorityQueue<ToDoQueue.ToDoList>{
	 class ToDoList implements Comparable<ToDoList>{
        
		private String item;
		private char primary;
		private int seconday;
		
		public ToDoList(String item, char primary, int secondary){
			this.item = item;
			this.primary = primary;
			this.seconday = secondary;
		}
		@Override
		public int compareTo(ToDoList arg0) {
			if(primary > arg0.primary)
				return +1;
			if(primary ==arg0.primary){
				if(seconday > arg0.seconday){
					return +1;
				}
				else{
					return 0;
				}
			}
			return -1;
		}
		
		@Override
		
		public String toString(){
			return Character.toString(primary) + seconday +" : "+ item;
		}
		
	}
	
	    
		public void add(String item,char primary, int seconday){
			super.add(new ToDoList(item,primary,seconday));
		}
		public static void main(String[] args){
			ToDoQueue queue = new ToDoQueue();
			queue.add("Zhao",'A',2);
			queue.add("Sun",'B',3);
			queue.add("Qian",'B',1);
			while(!queue.isEmpty()){
				System.out.println(queue.poll());
				
			}
			System.out.println(queue.poll());
			queue.add("Wei",'E',6);
			while(!queue.isEmpty()){
				System.out.println(queue.remove());
			}
		}
	

}

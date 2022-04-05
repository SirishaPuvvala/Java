package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo
{
	public static void main(String[] args) {
	PriorityQueue<String> q = new PriorityQueue<String>();
    System.out.println("Add elements to Object: ");
    q.add("A");
    q.add("B");
    q.add("C");
    q.add("D");
    System.out.println("Collection object elements: ");
    System.out.println(q);
    System.out.println("Traverse the elements using collection object: ");
	Iterator<String> it = q.iterator();
	while(it.hasNext())
	{
	System.out.println("Elements : "+ it.next());	
	}
	System.out.println(q.isEmpty());
	System.out.println("First element: "+q.peek());
	System.out.println(q);
	System.out.println("Remove element :"+q.remove());    
	}

}

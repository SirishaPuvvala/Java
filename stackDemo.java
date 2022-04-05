package Stack;

import java.util.Iterator;
import java.util.Stack;

public class stackDemo
{
	public static void main(String[]args)
	{
    Stack<String> s = new Stack<String>();
    System.out.println("Add elements to object s:");
    s.add("A");
    s.add("B");
    s.add("C");
    Iterator<String> i = s.iterator();
    System.out.println("First element from object: "+s.peek());
    System.out.println("Remove element from stack object: "+s.pop()); //last element gets removed(Here C is removed)
   }
}

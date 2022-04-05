import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		al.add("Siri");
		System.out.println("Initially:"+al);
	    al.removeAll(al);                          //removeAll()
		al.add("Syamu");
		al.clear();                                //clear()
		System.out.println("After performing clear and remove: "+al);
		al.add("Paddu");
		al.add("Kesava");
		System.out.println("Collection of elements: "+al);
		al.remove("Siri");                         //remove()
		System.out.println(al);
		al.add("Sirisha");                         //add()
		al.add("Syamu");
		System.out.println(al);
		System.out.println(al.isEmpty());            //isEmpty()
		System.out.println(al.contains("Paddu"));    //contains()
		System.out.println(al.size());               //size()
		System.out.println(al.clone());              //clone()
		System.out.println(al.indexOf("Paddu"));     //indexOf()
		System.out.println(al.lastIndexOf("Paddu")); //lastIndexOf()
		
		Iterator<String> it = al.iterator();
		System.out.println("Printing the elements using iterator: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator<String> li = al.listIterator();
		System.out.println("Printing the elements using list iterator: ");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Printing elements using ennumerator: ");
		
	}
}

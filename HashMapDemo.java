package Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapDemo 
{
  public static void main(String[] args)
  {
    Map h = new HashMap();
    h.put(1,"Siri");
    h.put(2, "Syamu");
    h.put(3, "Kesava");
    h.put(6, "Padma");
    System.out.println(h); //displays unordered set of elements 
	h.put(4, "Srii"); //set can have duplicate values
	h.put(5, "Siri"); //set shouldn't contain duplicate keys - when the duplicate keys are given the last one gets displayed
	h.put(6, "");     //set allows null values
	h.put("", "vaidehi"); //keys can't be null 
	System.out.println(h);
	//to traverse the map, convert the map to set
	Set s = h.entrySet();
	Iterator it = s.iterator();
	while(it.hasNext())
	{
		Map.Entry m=(Map.Entry)it.next();
        System.out.println(m.getKey()+"\t"+m.getValue());
	}
   }
}

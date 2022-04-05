package Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDesc 
{
	public static void main(String[] args) 
	{
    TreeMap<Integer, String> t = new TreeMap<Integer, String>();
    t.put(1, "Siri");
    t.put(2, "Syam");
    t.put(3, "Sruthi");
    t.put(5, "Shafia");
    t.put(4, "Srinu");
    Set s = t.entrySet();
	Iterator it = s.iterator();
	while(it.hasNext())
	{
		System.out.println();
	}
	}

}

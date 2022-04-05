package Java_11;

public class string_methods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	String a1 = "Ramya";
	String a2 = new String("Sri");
	char a[] = {'M','a','h','e','s','h'};
	String a3 = new String(a);
	String a5 = "RAMYA";
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	String a4 = new String();
	System.out.println(a4);
	System.out.println("Length of a1 = "+a1.length());
	System.out.println("The concaatination of a1 and a2 : " + a1.concat(a2));
	System.out.println("Character at 2nd position of a1: "+a1.charAt(2));
	System.out.println("ASCII of character at 2nd position of a1: "+(int)a1.charAt(2));
	if(a1.equals(a2))
		System.out.println("Equals");
	System.out.println("Not Equals");
	if(a1.equalsIgnoreCase(a5))
		System.out.println("Equals");
	System.out.println("Not Equals");
	String a6 = "hello";
	System.out.println(a6.startsWith("he"));
	System.out.println(a6.startsWith("ha"));
	System.out.println(a6.endsWith("lo"));
	System.out.println("First occurance of substring : "+a3.indexOf("h"));
	System.out.println("Last occurance of substring : "+a3.lastIndexOf("h"));
	System.out.println(a3.substring(0,3));
	System.out.println(a3.replace('h', 'a'));
	String s4 = "Hello";
	char ch[] = new char[5];
	s4.getChars(0, 4, ch, 0);
	for(int i=0;i<ch.length;i++)
		System.out.println(ch[i]);
	}
	
}

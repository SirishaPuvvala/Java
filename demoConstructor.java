package Java_11;
class Person1
{
String name;
int id;
Person1()
{
	name = "Sirisha";
	id = 31371;
}

//parameterized constructor
/*
public Person(String name, int id)
{
super();
this.name = name;
this.id = id;
} 
*/
void display() 
{
System.out.println("Name: "+name);
System.out.println("Id: "+id);
}
}
public class demoConstructor 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person siri = new Person();
		siri.display();
	}

}
//defining more than one constructor with same name and varying in parameters - constructor overloading

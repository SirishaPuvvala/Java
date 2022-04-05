package Java_11;
class Person
{
	String name;
	int id;
	void display() 
	{
	System.out.println("My name is: "+name);	
	System.out.println("My id is: "+id);
	}
}
public class classDemo 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person1 siri = new Person1();
		System.out.println("Address of siri object: "+siri.hashCode());
        siri.name = "Sirisha";
        siri.id = 31371; 
        siri.display();
	}
}
/*Initialization of instance variables - 1.from other class 2.within the same class 3.using constructor
Instance members - members of class, which are stored in object. creation of object in the sense allocating memory using new keyword
Instance method - Method which contains instance variables
Constructor - 1.no return type 2. Class name is given as the name for constructor 3.Initialization of instance variables
Two types:
1.Default constructor  - If constructor doesn't take any parameters from user then it is default , invoked - while creating an object to the class - no parameters passing
2.Parameterized constructor - define constructor with parameters, user will provide that parameters, invoking or called, while creating an object - we should pass parameters.
-To initialize instance variables - created constructor
*/
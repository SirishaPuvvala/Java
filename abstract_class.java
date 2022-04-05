package Java_11;

/*abstract public class abstract_class 
{
abstract void display();
}
abstract_class a1;
class B extends abstract_class
{

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}
*/

abstract class Super2
{
	abstract void calculate(int x);
}
class sub2 extends Super2
{
	void calculate(int x)
	{
		System.out.println("Square of x = "+ (x*x));
	}
}
class sub3 extends Super2
{
	void calculate(int x)
	{
		System.out.println("Cube of x = "+ (x*x*x));
	}
}
public class abstract_class
{
	public static void main(String[] args)
	{
		sub2 s = new sub2();
		s.calculate(10);
		sub3 s1 = new sub3();
		s1.calculate(10);
	}
}
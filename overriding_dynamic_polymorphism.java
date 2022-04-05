package Java_11;
class Super
{
	void calculate(int x)
	{
		System.out.println("Square of x = "+ (x*x));
	}
}
class sub extends Super
{
	void calculate(int x)
	{
		System.out.println("Cube of x = "+ (x*x*x));
	}
}
public class overriding_dynamic_polymorphism {
public static void main(String[]args)
{
sub s1 = new sub();	
s1.calculate(5);
}
}

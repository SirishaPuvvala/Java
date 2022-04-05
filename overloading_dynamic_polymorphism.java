package Java_11;
class Demo{
	void calculate(int x)
	{
		System.out.println("Square of x: "+ (x*x));
	}
	void calculate(int x, int y)
	{
		System.out.println("Area of triangle: "+(0.5*x*y));
	}
}
public class overloading_dynamic_polymorphism {
public static void main(String[]args)
{
	Demo d = new Demo();
	d.calculate(10);
	d.calculate(10,20);
}
}


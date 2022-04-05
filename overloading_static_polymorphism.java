package Java_11;
class Demo1{
	static void calculate(int x)
	{
		System.out.println("Square of x: "+ (x*x));
	}
	static void calculate(int x, int y)
	{
		System.out.println("Area of triangle: "+(0.5*x*y));
	}
}
public class overloading_static_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Demo1.calculate(10);
    Demo1.calculate(10, 20);
	}

}

package Java_11;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 10,b;
    try
    {
    	System.out.println("Open files:");
    	System.out.println("a="+a);
    	b = a/0;
    	System.out.println("b="+b);
    	int x[] = {10,20,30,40};
    	x[8] = 90;
    }
    catch(ArithmeticException ae)
    {
    	System.out.println(ae);
    	System.out.println("Any number cannot be divided by 0");
    }
    //arithmeticblockexception gets executed
    catch(ArrayIndexOutOfBoundsException aoe)
    {
    	System.out.println(aoe);
    	System.out.println("Index should be within the range");
    }
    finally
    {
    System.out.println("Close the file");	
    }
	}
}

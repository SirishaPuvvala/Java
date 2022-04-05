package Java_11;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println("It's the addition of 16 with the number of characters");
		StringBuffer sb3 = new StringBuffer("Ramya");
		System.out.println(sb3);
		System.out.println(sb3.insert(5, "Krishna"));
		System.out.println(sb3.delete(0, 5));
		

	}

}

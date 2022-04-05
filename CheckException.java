package Java_11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CheckException {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name");
    String name = br.readLine();
    System.out.println("Entered name: "+ name);
	}
}

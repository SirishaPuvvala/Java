package Java_11;
interface siri{
	float hght = 5.4f;
	void displayHeight();
}
interface sri{
	float hght = 5.8f;
	void displayHeight();
}
//by default the variables in interface are static, final, protected
class Child implements siri, sri //implementation class
{
	float hght; //store only hght of child
	public void displayHeight() //abstarct method body , so it should be public
	{
		hght = (siri.hght + sri.hght)/2;
		System.out.println("Her height :"+ siri.hght);
		System.out.println("His height :"+sri.hght);
		System.out.println("Baby height :"+hght);
	} //interface abstract method body
}
//child - sub class, siri,sri - super class(interface)
public class multiple_inheritance_demo {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.displayHeight();
	}

}

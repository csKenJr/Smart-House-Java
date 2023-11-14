import java.io.IOException;
import java.util.Scanner;

public class ApplianceListTest {

	public static Scanner in=new Scanner(System.in);
	
	public static void main(String[]args) throws IOException {
		String filename;
		System.out.println("Please enter a filename to load:");
		filename = in.next();
		ApplianceList t1 = new ApplianceList(65102, filename);
		System.out.println(t1.getSize());
		System.out.println(t1.toString());
		ApplianceList t2 = new ApplianceList(filename);
		
	}

	
}

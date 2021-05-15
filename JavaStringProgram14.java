//Java program to get the contents of a given string as a byte array//

package strings;
import java.util.Scanner;

public class JavaStringProgram14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter another String : ");
		String str2 = sc.nextLine();
		byte bytearray[];
		byte bytearray1[];
		bytearray = str.getBytes();
		bytearray1 = str2.getBytes();
		System.out.println(bytearray);
		System.out.println(bytearray1);
		if(bytearray == bytearray1)
			System.out.println(str+" equals "+str2);
		else
			System.out.println(str+" not equals "+str2);
		sc.close();
	}

}

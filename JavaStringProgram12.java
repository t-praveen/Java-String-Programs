//Java program to check whether a given string ends with the contents of another string. //

package strings;
import java.util.Scanner;

public class JavaStringProgram12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter another String : ");
		String str2 = sc.nextLine();
		System.out.print("Enter a specified sequence of characters to check wether both the strings end with the same sequence or not : ");
		String s = sc.nextLine();
		boolean result1 = str1.endsWith(s);
		boolean result2 = str2.endsWith(s);
		if(result1 == result2)
			System.out.println("Yes , Both the strings end with "+s+" . ");
		else
			System.out.println("No , Both the strings does not end with "+s+" . ");
		sc.close();
	}

}

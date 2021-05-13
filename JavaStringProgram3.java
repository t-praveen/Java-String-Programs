//Java program to get the character (Unicode code point) before the specified index within the String//

package strings;
import java.util.Scanner;

public class JavaStringProgram3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter a poistin to find the character unicode at that particular position : ");
		int n = sc.nextInt();
		if(n > str.length())
			System.out.println("Doesnt exist .");
		System.out.println("The Character unicode at entered position is : " +str.codePointBefore(n));
		sc.close();
		
	}

}

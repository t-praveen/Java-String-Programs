//Java program to count a number of Unicode code points in the specified text range of a String.//

package strings;
import java.util.Scanner;

public class JavaStringProgram4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		int ctr = str.codePointCount(1 , 4);
		System.out.println("The no. of unicode points present in the string is  : " +ctr);
		sc.close();
		
	}

}
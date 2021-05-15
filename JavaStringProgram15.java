//Java program to get the contents of a given string as a character array.//

package strings;
import java.util.Scanner;

public class JavaStringProgram15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int len = ch.length;  
        System.out.println("Char Array length: " + len);  
		for(char c: ch)
		{
			System.out.println(c);
		}
			sc.close();
		

	}

}

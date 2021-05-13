package strings;
import java.util.Scanner;

public class JavaStringProgram1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		System.out.print("Enter a poistin to find the character at that particular position : ");
		int n = sc.nextInt();
		if(n > str.length())
			System.out.println("Doesnt exist .");
		System.out.println("The Character at position "+n+" is : " +str.charAt(n));
		sc.close();
		
	}

}

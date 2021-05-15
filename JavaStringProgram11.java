package strings;

public class JavaStringProgram11 {

	public static void main(String[] args) {
		
		 	char[] arr_num = new char[] { '1', '2', '3', '4' };
	        String str = String.copyValueOf(arr_num, 1, 3);
	        System.out.println("The book contains " + str +" pages.\n");
		
	}

}

// Java program to get the canonical representation of the string object.//

package strings;

public class javaStringProgram18 {

	public static void main(String[] args) {
	
		String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
		

	}

}

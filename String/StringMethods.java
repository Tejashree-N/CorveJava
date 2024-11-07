package string;

public class StringMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Tejashree";
	    String lastName = "Nyaynirgune";
	    System.out.println(firstName + " " + lastName);
	    
	    String txt = "Please locate where 'locate' occurs!";
	    System.out.println(txt.indexOf("locate")); 
	    
	    
	    String myStr = "Hello";
	    char result = myStr.charAt(0);
	    System.out.println(result);
	    
	    String myStr1 = "Hello";
	    String myStr2 = "Hello";
	    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

	    String myStr3 = "Hello";
	    String myStr4= "Hello";
	    String myStr5 = "Another String";
	    System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
	    System.out.println(myStr1.equals(myStr3)); // false


	}
}

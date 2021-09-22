package assignment3;

import java.util.Scanner;


public class ChackingAlphaNumerics {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc = new Scanner(System.in);

		    System.out.println("Enter The String");
		    String input = sc.nextLine();
		    
		    int n = input.length();
		    
		    boolean Char = false, Number = false;
		    
		    for(int i=0; i<n; i++) {
		    	if(Char == false) {
		    		Char = isChar(input.charAt(i));
		    	}
		    	if(Number == false) {
		    		Number = isNumber(input.charAt(i));
		    	}
		    }
		    
		    if(Char && Number) {
		    	System.out.println("Given String is Alpha Numeric");
		    }else {
		    	System.out.println("Given String is not an Alpha Numeric");
		    }
	    
		    
	}
	
	
	public static boolean isChar(char c) {
		if((c >= 'a' && c <= 'z') || (c >='A' && c <= 'Z')) {
					return true;
		}
			return false;	
	}
	
	public static boolean isNumber(char c) {
		if(c >='0' && c <= '9') {
					return true;
		}
			return false;	
	}

}



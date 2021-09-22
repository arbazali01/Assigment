package assignment3;

import java.util.Scanner;

public class CaptaliseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your String");
		String input = sc.nextLine();
		String capitalInput = "";
		capitalInput = captalised(input);
		
       System.out.println(capitalInput);
	}
	
	
	public static String captalised(String str) {
		
		
		str = str.toUpperCase();
		
		return str;
	}
	

}

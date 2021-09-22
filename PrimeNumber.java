package assignment3;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=15;i<=80;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}	
	}
	
	public static boolean isPrime(int num) {
		boolean f = true;
		for(int i=2; i*i<=num; i++) {
			if(num % i == 0) {
				f = false;
				break;
				
			}
	    }
       if(f) {
    	   return true;
       }else {
    	   return false;
       }
   }
}
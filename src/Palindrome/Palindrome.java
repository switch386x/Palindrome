package Palindrome;

public class Palindrome {
		  
	public static boolean isPalindrome(int number, int base) {
	        int forward = number;
	        int reversed = 0;
	        int digit;
	 
	        while (number > 0) {
	            digit = number % base;
	            reversed = reversed * base + digit;
	            number = number / base;
	        }
	        //boolean x = (forward == reversed);
	        //System.out.println(x);
	        return (forward == reversed);
	        
	}
	
	public static void sumPalindrome(int a, int b, int n){
		 int sum = 0;
		 
	        for (int i = 0; i <= n; i++) {
	            if (isPalindrome(i, a) && isPalindrome(i, b)) {
	                sum += i;
	            }
	        }
	        System.out.println(sum);
	        }
	
	public static void main(String[] args) {
	        System.out.println(Palindrome.isPalindrome(16,2));
	        Palindrome.sumPalindrome(10, 2, 40);
	}
}


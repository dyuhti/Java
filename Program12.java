import java.util.Scanner;

public class Program12 {
    
    // Check if number is palindrome
    static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    // Reverse a number
    static long reverseNumber(long num) {
        long reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        
        try {
            long num = Long.parseLong(input);
            
            if (num < 0) {
                System.out.println("Please enter a positive number.");
                sc.close();
                return;
            }
            
            System.out.println("\n" + num + " (Input Number)");
            
            int iterations = 0;
            final int MAX_ITERATIONS = 100; // Prevent infinite loop
            
            while (!isPalindrome(num) && iterations < MAX_ITERATIONS) {
                long reversed = reverseNumber(num);
                long sum = num + reversed;
                
                System.out.println(num + " + " + reversed + " = " + sum);
                
                num = sum;
                iterations++;
            }
            
            if (isPalindrome(num)) {
                System.out.println(num + " (Palindrome)");
            } else {
                System.out.println("Could not find palindrome within " + MAX_ITERATIONS + " iterations.");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        
        sc.close();
    }
}
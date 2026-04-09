import java.util.Scanner;

public class Program5 {
    
    // Calculate factorial
    static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Invalid
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        String input = sc.nextLine();
        
        // Check if input is a valid number
        try {
            int n = Integer.parseInt(input);
            
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = calculateFactorial(n);
                System.out.println(n + " Factorial = " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        
        sc.close();
    }
}
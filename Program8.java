import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // Handle edge cases
        if (m == 0) {
            System.out.println("Multiplication table for 0 is not meaningful.");
            sc.close();
            return;
        }
        
        if (n < 1) {
            System.out.println("N should be at least 1.");
            sc.close();
            return;
        }
        
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
        
        sc.close();
    }
}
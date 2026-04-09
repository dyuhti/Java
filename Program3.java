import java.util.Scanner;

public class Program3 {
    
    // Method to check if a number is composite
    static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return false; // 2 and 3 are prime, not composite
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return true; // Composite
        }
        
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        
        // Ensure a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        StringBuilder compositeNumbers = new StringBuilder();
        
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                if (compositeNumbers.length() > 0) {
                    compositeNumbers.append(", ");
                }
                compositeNumbers.append(i);
            }
        }
        
        if (compositeNumbers.length() > 0) {
            System.out.println("\nComposite Numbers: " + compositeNumbers.toString());
        } else {
            System.out.println("\nNo composite numbers found in the range.");
        }
        
        sc.close();
    }
}
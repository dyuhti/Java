import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to be printed: ");
        int num = sc.nextInt();
        
        System.out.print("Max Number of time printed: ");
        int max = sc.nextInt();
        
        // Print ascending pattern
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        
        // Print descending pattern
        for (int i = max - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
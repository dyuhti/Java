import java.util.Scanner;

public class Program7 {
    
    static double calculateTax(double income) {
        if (income <= 0) {
            return 0;
        }
        if (income <= 150000) {
            return 0; // No tax
        } else if (income <= 300000) {
            return (income - 150000) * 0.10;
        } else if (income <= 500000) {
            return (150000 * 0.10) + ((income - 300000) * 0.20);
        } else {
            return (150000 * 0.10) + (200000 * 0.20) + ((income - 500000) * 0.30);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the income: ");
        double income = sc.nextDouble();
        
        double tax = calculateTax(income);
        
        System.out.println("Tax = " + (long)tax);
        
        sc.close();
    }
}
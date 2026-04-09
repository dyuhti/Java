import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter -1 to exit…");
        
        int positiveCount = 0;
        int negativeCount = 0;
        double positiveSum = 0;
        double negativeSum = 0;
        
        while (true) {
            System.out.print("Enter the number: ");
            double num = sc.nextDouble();
            
            if (num == -1) {
                break;
            }
            
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
            // If num == 0, it's neither positive nor negative, so skip it
        }
        
        if (negativeCount > 0) {
            double avgNegative = negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + avgNegative);
        } else {
            System.out.println("No negative numbers entered.");
        }
        
        if (positiveCount > 0) {
            double avgPositive = positiveSum / positiveCount;
            System.out.println("The average of positive numbers is : " + avgPositive);
        } else {
            System.out.println("No positive numbers entered.");
        }
        
        sc.close();
    }
}
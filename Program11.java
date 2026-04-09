import java.util.Scanner;
import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lower range: ");
        int lower = sc.nextInt();
        
        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();
        
        // Ensure lower <= upper
        if (lower > upper) {
            System.out.println("Lower range cannot be greater than upper range.");
            sc.close();
            return;
        }
        
        ArrayList<String> pairs = new ArrayList<>();
        
        for (int i = lower; i <= upper; i++) {
            long square = (long)i * i;
            pairs.add("(" + i + ", " + square + ")");
        }
        
        System.out.println("[" + String.join(", ", pairs) + "]");
        
        sc.close();
    }
}
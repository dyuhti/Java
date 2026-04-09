import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter * to exit…");
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        
        while (true) {
            System.out.print("Enter any character: ");
            String input = sc.nextLine();
            
            if (input.isEmpty()) {
                continue;
            }
            
            char ch = input.charAt(0);
            
            if (ch == '*') {
                break;
            }
            
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        
        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers = " + numberCount);
        
        sc.close();
    }
}
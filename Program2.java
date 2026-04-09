import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int specialCharCount = 0;
        StringBuilder specialChars = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            // Check if character is not alphanumeric and not space
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                specialCharCount++;
                specialChars.append(c).append(" ");
            }
        }
        
        System.out.println("\nSpecial Characters: " + specialChars.toString());
        System.out.println("Number of Special Characters: " + specialCharCount);
        
        sc.close();
    }
}
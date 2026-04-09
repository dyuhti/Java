import java.util.Scanner;

public class Program6 {
    
    // Check if year is leap year
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    // Validate date format
    static boolean isValidDate(String[] parts) {
        try {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            
            if (month < 1 || month > 12) {
                return false;
            }
            if (day < 1 || day > 31) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Date (DD/MM/YYYY): ");
        String dateStr = sc.nextLine();
        
        String[] parts = dateStr.split("/");
        
        if (parts.length != 3) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY");
            sc.close();
            return;
        }
        
        if (!isValidDate(parts)) {
            System.out.println("Invalid date values.");
            sc.close();
            return;
        }
        
        try {
            int year = Integer.parseInt(parts[2]);
            
            if (isLeapYear(year)) {
                System.out.println("Given year is Leap Year");
            } else {
                System.out.println("Given year is Non Leap Year");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid year format.");
        }
        
        sc.close();
    }
}
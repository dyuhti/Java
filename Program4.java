import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program4 {
    
    // Calculate Mean
    static double calculateMean(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    
    // Calculate Median
    static double calculateMedian(double[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
    
    // Calculate Mode
    static double calculateMode(double[] arr) {
        HashMap<Double, Integer> frequencyMap = new HashMap<>();
        
        for (double num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        double mode = arr[0];
        int maxFrequency = 0;
        
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        return mode;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        double[] arr = new double[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        
        double mean = calculateMean(arr);
        double median = calculateMedian(arr);
        double mode = calculateMode(arr);
        
        System.out.println("\nMean = " + Math.round(mean));
        System.out.println("Median = " + median);
        System.out.println("Mode = " + (int)mode);
        
        sc.close();
    }
}
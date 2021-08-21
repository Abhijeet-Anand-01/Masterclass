import java.util.Scanner;
 
public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage() {
        
        Scanner scan = new Scanner(System.in);
        int sum = 0, count = 0;
        
        while(true) {
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                count++;
                sum += num;
            }
            else {
                System.out.print("SUM = " + sum + " AVG = " + Math.round((double)(sum / count)));
                break;
            }
        }
    }
}

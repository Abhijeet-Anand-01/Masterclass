public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number) {
        
        if (number < 0) {
            return -1;
        }
        
        int sum = 0;
        while (number > 0) {
            int checkEven = number % 10;
            number /= 10;
            
            if (checkEven % 2 == 0) {
                sum += checkEven;
            }
        }
        return sum;
    }
}

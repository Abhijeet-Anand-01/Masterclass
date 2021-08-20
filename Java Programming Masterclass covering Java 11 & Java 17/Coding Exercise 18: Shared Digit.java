public class SharedDigit {
    
    public static boolean hasSharedDigit(int num1, int num2) {
        
        if (!((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))) {
            return false;
        }
        
        int lastDigitOfNum1 = num1 % 10;
        int firstDigitOfNum1 = num1 / 10;
        int lastDigitOfNum2 = num2 % 10;
        int firstDigitOfNum2 = num2 / 10;
        
        if (lastDigitOfNum1 == lastDigitOfNum2 || lastDigitOfNum1 == firstDigitOfNum2 || firstDigitOfNum1 == lastDigitOfNum2 || firstDigitOfNum1 == firstDigitOfNum2) {
            return true;
        }
        return false;
    }
}

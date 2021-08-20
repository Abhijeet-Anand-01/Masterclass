public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        
        if (!(isValid(num1) && isValid(num2) && isValid(num3))) {
            return false;
        }
        
        int rightmostNum1 = num1 % 10;
        int rightmostNum2 = num2 % 10;
        int rightmostNum3 = num3 % 10;
        
        if ((rightmostNum1 == rightmostNum2) || (rightmostNum2 == rightmostNum3) || (rightmostNum1 == rightmostNum3)) {
            return true;
        }
        return false;
    }
    
    public static boolean isValid(int num) {

        if (!(num >= 10 && num <=1000)) {
            return false;
        }
        return true;
    }
}

public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int first, int second) {
        
        int result = -1;
        if(first < 10 || second < 10) {
            return result;
        }
        
        int smallestNum = Math.min(first, second);
        for (int i = smallestNum; i > 0; i--) {
            if(first % i == 0 && second % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}

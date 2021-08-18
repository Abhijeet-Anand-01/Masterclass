public class MinutesToYearsDaysCalculator {
    
    public static void printYearsAndDays(long minutes) {
         
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
        int days = (int)(minutes / 60) / 24;
        int years = (int)days / 365;
        days = days % 365;
        
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }      
}

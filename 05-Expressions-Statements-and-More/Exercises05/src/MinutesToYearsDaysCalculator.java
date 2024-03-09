public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = (long) (minutes / (24 * 60));
        long years = (long) (days / 365);
        days %= 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }


    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}

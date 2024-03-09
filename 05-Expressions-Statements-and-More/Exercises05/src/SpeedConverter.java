public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long kph = toMilesPerHour((kilometersPerHour));

        if (kph == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = "
                    + kph + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(toMilesPerHour(1.5));
        printConversion(toMilesPerHour(10.25));
        printConversion(toMilesPerHour(-5.6));
        printConversion(toMilesPerHour(25.42));
        printConversion(toMilesPerHour(75.114));
    }
}

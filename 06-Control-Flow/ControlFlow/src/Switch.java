public class Switch {
    public static void main(String[] args) {
        int value = 3;

        switch (value) {
            case 1 -> System.out.println("Value is 1");
            case 2, 3 -> System.out.println("Value is 2 or 3");
            default -> System.out.println("Value is something else");
        }

        System.out.println(getQuarter("Oct"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dev" -> "4th";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }
}

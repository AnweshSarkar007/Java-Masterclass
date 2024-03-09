public class SwitchChallenge {
    public static String toNATO(char c) {
        switch (c) {
            case 'A': return "Able";
            case 'B': return "Baker";
            case 'C': return "Charlie";
            case 'D': return "Dog";
            case 'E': return "Easy";
            case 'F': return "Fox";
            case 'G': return "George";
            case 'H': return "How";
            case 'I': return "Item";
            case 'J': return "Jig";
            case 'K': return "King";
            case 'L': return "Love";
            case 'M': return "Mike";
            case 'N': return "Nan";
            case 'O': return "Oboe";
            case 'P': return "Peter";
            case 'Q': return "Queen";
            case 'R': return "Roger";
            case 'S': return "Sugar";
            case 'T': return "Tare";
            case 'U': return "Uncle";
            case 'V': return "Victor";
            case 'W': return "William";
            case 'X': return "X-ray";
            case 'Y': return "Yoke";
            case 'Z': return "Zebra";
            default: return "-";
        }
    }

    public static String toNATO(String text) {
        String finalString = "";
        for (int i = 0; i < text.length(); i++) {
            finalString += (toNATO(text.charAt(i)) + " ");
        }
        return finalString.trim();
    }

    public static String dayOfWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }

    public static void main(String[] args) {
        System.out.println(toNATO("CAR"));
        System.out.println(dayOfWeek(4));
    }
}

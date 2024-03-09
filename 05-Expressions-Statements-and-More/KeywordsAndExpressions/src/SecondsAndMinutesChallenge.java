public class SecondsAndMinutesChallenge {
    public static void getDurationString(int sec) {
        if (sec < 0) {
            System.out.println("Invalid seconds");
            return;
        }

        int m = (int) (sec / 60);
        int s = (int) (sec % 60);
        int h = (int) (m / 60);
        m %= 60;

        System.out.println(h + "h " + m + "m " + s + "s ");
    }

    public static void getDurationString(int min, int sec) {
        if ((min < 0 || (sec < 0 || sec > 60))) {
            System.out.println("Invalid minutes or seconds");
        }

        getDurationString((60 * min) + sec);
    }

    public static void main(String[] args) {
        getDurationString(3945);
        getDurationString(65, 45);
    }
}

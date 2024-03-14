public class While {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j += 1;
        }

        j = 1;
        while (true) {
            if (j > 5) {
                break;
            }

            System.out.println(j);
            j += 1;
        }

        j = 1;
        boolean isReady = false;
        do {
            System.out.println(j);
            j += 1;
            isReady = j <= 5;
        } while (isReady);
    }
}

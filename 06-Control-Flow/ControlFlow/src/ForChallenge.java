public class ForChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println("There are " + counter + " prime numbers!");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int checkTill = (int) Math.sqrt(n);
        for (int i = 2; i <= checkTill; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

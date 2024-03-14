public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int d = 2;
        int maxPrime = 0;
        while (number > 1) {
            while (number % d == 0) {
                maxPrime = d;
                number /= d;
            }
            d++;
        }

        return maxPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}

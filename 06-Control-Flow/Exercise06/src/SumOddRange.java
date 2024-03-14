public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num <= 0) {
            return false;
        }

        return num % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (end < 0) || (start < 0)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int numDigsCount = getDigitCount(number);
        int reversed = reverse(number);
        int revDigsCount = getDigitCount(reversed);
        int tailingZerosCount = numDigsCount - revDigsCount;

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number == 0) {
            System.out.println(words[0]);
            return;
        }

        while (reversed > 0) {
            System.out.println(words[reversed % 10]);
            reversed /= 10;
        }

        for (int i = 0; i < tailingZerosCount; i++) {
            System.out.println(words[0]);
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = (10 * rev) + (num % 10);
            num /= 10;
        }

        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("-----------------------------");

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("-----------------------------");

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}

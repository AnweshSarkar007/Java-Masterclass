public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int last1 = num1 % 10;
        int last2 = num2 % 10;
        int last3 = num3 % 10;

        int same = 0;
        if (last1 == last2) {
            same++;
        }
        if (last2 == last3) {
            same++;
        }
        if (last3 == last1) {
            same++;
        }

        return same >= 1;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}

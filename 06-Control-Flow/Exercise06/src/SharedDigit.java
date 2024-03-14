public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int[] digits = new int[10];
        while (num1 > 0) {
            digits[num1 % 10] = 1;
            num1 /= 10;
        }

        while (num2 > 0) {
            if (digits[num2 % 10] == 1) {
                return true;
            }
            num2 /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}

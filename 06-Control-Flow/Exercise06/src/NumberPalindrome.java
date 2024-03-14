public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int rev = 0;
        int num = Math.abs(number);

        while (number != 0) {
            rev = (10 * rev) + (number % 10);
            number /= 10;
        }

        rev = Math.abs(rev);
        return rev == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}

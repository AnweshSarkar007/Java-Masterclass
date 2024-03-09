public class TeenNumberChecker {
    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    public static void main(String[] args) {
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
        System.out.println();

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}

public class EqualSumChecker {
    public static boolean hasEqualSum(int n1, int n2, int sum) {
        return (n1 + n2) == sum;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}

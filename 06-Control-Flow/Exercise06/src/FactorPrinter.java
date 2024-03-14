public class FactorPrinter {
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}

public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmt = calculateInterest(10_000, rate);
            System.out.println(interestAmt);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

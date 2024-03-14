import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                count++;
                sum += num;
                avg = Math.round((sum * 1.0) / count);
            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}

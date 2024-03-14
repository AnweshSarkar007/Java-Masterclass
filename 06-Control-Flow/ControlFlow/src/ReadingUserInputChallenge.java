import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number #" + (i + 1) + ": ");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                i++;
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        } while (i < 5);

        System.out.println("The final sum is: " + sum);
    }
}

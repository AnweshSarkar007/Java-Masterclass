import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int input = 0;

        while (true) {
            try {
                System.out.print("Enter a number. Enter any character to quit |> ");
                input = Integer.parseInt(scanner.nextLine());
                min = Math.min(min, input);
                max = Math.max(max, input);
                System.out.println("Min: " + min + "\tMax: " + max);
            } catch (NumberFormatException e) {
                break;
            }
        }
    }
}

public class WhileChallenge {
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int i = 5;
        int counterEven = 0;
        int counterOdd = 0;
        while (i <= 20) {
            if (isEvenNumber((i))) {
                counterEven++;
                System.out.println(i);
            } else {
                counterOdd++;
            }

            if (counterEven >= 5) {
                break;
            }
            i += 1;
        }

        System.out.println(counterEven + " even numbers found!");
        System.out.println(counterOdd + " odd numbers found!");
    }
}

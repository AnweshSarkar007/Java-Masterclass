public class Challenge {
    public static void main(String[] args) {
        double first = 20.0, second = 80.0;
        double third = (first + second) * 100;
        double fourth = third % 40.0;
        boolean isZero = fourth == 0.00;

        System.out.println(isZero);

        if(!isZero) {
            System.out.println("got some remainder!");
        }
    }
}

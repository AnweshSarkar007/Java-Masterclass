public class MethodOverloadingChallenge {
    public static double convertToCentimeters(int inches) {
        return 2.54 * inches;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((12 * feet) + inches);
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }
}

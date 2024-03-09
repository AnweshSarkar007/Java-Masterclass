public class Methods {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void main(String[] args) {
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        System.out.println("Your final score was " +
                calculateScore(true, 10_000, 5, 200));
    }
}

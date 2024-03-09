public class MethodsChallenge {
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        displayHighScorePosition("A", calculateHighScorePosition(1500));
        displayHighScorePosition("B", calculateHighScorePosition(1000));
        displayHighScorePosition("C", calculateHighScorePosition(500));
        displayHighScorePosition("D", calculateHighScorePosition(100));
        displayHighScorePosition("E", calculateHighScorePosition(25));
    }
}

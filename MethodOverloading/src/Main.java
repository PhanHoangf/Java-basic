public class Main {
    public static void main (String args) {
        int score = calculateScore( "Tim", 500 );
        System.out.println( score );
    }

    public static int calculateScore (String playerName, int score) {
        return score * 1000;
    }
}

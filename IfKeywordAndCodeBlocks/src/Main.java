public class Main {
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 5003;
        int levelCompleted = 5;
        int bonus = 5;

        if ( score > 5002 ) {
            System.out.println( "Your score was " + score );
        } else {
            System.out.println( "You're a chicken" );
        }
    }
}

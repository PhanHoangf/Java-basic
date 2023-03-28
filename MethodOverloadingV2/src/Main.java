public class Main {
    public static void main (String[] args) {
        char asterisk = '*';
        String test = "*BookName*";

        boolean isStar = test.charAt( 0 ) == asterisk && test.charAt( test.length() -1 ) == asterisk;

        System.out.println(isStar);

        calculateScore( "Tim", 500 );
        calculateScore( 70 );
        calculateScore();
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println( playerName + " score: " + score );
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println( "Unnamed score: " + score );
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println( "NO" );
        return 0;
    }
}
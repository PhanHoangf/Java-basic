public class MainChallenge {
    public static void main (String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int highScore = 0;
//
//        highScore = calculateScore( gameOver, score, levelCompleted, bonus );
//        System.out.println( "The highScore is " + highScore );
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore( gameOver, score, levelCompleted, bonus );
//        System.out.println( "The highScore is " + highScore );
//        int playerScore = 500;
//        int position = calculateHighScorePosition( playerScore );
//        String playerName = "HazelPT";
//        displayHighScorePosition( playerName, position );

//        float rounded = (float) 3.1756;
//        areEqualByThreeDecimalPlaces( -3.123, 3.123 );

        boolean res = hasTeen( 22, 23, 34 );
        System.out.println( res );
    }

    public static boolean areEqualByThreeDecimalPlaces (double first, double second) {
        int first1 = (int) (first * 1000);
        int second1 = (int) (second * 1000);
        return first1 == second1;
    }

    public static boolean hasTeen (int number1, int number2, int number3) {
        return isTeen( number1 ) ||
                isTeen( number2 ) ||
                isTeen( number3 );
    }

    public static boolean isTeen (int age) {
        return age >= 13 && age <= 19;
    }


    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if ( gameOver ) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }

    public static int displayHighScorePosition (String playerName, int position) {
        System.out.println( playerName + " managed to get into " + position + " on the high score list" );
        return 0;
    }

    public static int calculateHighScorePosition (int playerScore) {
        if ( playerScore >= 1000 ) {
            return 1;
        } else if ( playerScore >= 500 ) {
            return 2;
        } else if ( playerScore >= 100 ) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void checkNumber (int number) {
        if ( number > 0 ) {
            System.out.println( "positive" );
        } else if ( number < 0 ) {
            System.out.println( "negative" );
        } else {
            System.out.println( "zero" );
        }
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if ( kilometersPerHour < 0 ) {
            return -1;
        }
        return Math.round( kilometersPerHour / 1.609 );
    }

    public static void printConversion (double kilometersPerHour) {
        if ( kilometersPerHour < 0 ) {
            System.out.println( "Invalid Value" );
        } else if ( kilometersPerHour == 0.0d ) {
            System.out.println( 0.0 + " km/h" + " = " + 0 + " mi/h" );
        } else {
            System.out.println( kilometersPerHour + " km/h" + " = " + Math.round( kilometersPerHour / 1.609 ) + " mi/h" );
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int megaBytes = 0;
        int remainingKb = 0;

        if ( kiloBytes < 0 ) {
            System.out.println( "Invalid Value" );
        } else {
            megaBytes = kiloBytes / 1024;
            remainingKb = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + remainingKb + " KB" );
        }
    }

    public static boolean shouldWakeUp (boolean isBark, int hourOfDay) {
        return isBark && (hourOfDay < 8 || hourOfDay > 22) && hourOfDay >= 0 && hourOfDay <= 23;
    }

    public static boolean isLeapYear (int year) {
        if ( year < 1 || year > 9999 ) {
            return false;
        } else if ( year % 4 == 0 ) {
            if ( year % 100 == 0 ) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;

    }
}

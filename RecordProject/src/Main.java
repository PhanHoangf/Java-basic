public class Main {
    public static void main (String[] args) {
        for ( int i = 1; i <= 5; i++ ) {
            LPAStudent s = new LPAStudent( "S92300" + i, switch ( i ) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "PTHoang";
                case 4 -> "Lisa";
                case 5 -> "Kloop";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass" );
            System.out.println( s );
        }
    }
}
public class Main {
    public static void main (String[] args) {
        System.out.println( "Hello world!" );

        int newValue = 50;
        if ( newValue == 50 ) {
            System.out.println( "Hi there" );
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if ( isDomestic ) {
            System.out.println( "This car is domestic to our country" );
        }
    }
}
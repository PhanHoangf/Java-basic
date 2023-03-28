public class Main {
    public static void main (String[] args) {
        Car myCar = new Car();
        myCar.setDoors( 3 );
        myCar.setColor( "Red" );
        myCar.setModel( "TeslaV1" );
        myCar.setConvertible( true );
        myCar.setMake( "Tesla" );
        myCar.describeCar();
    }
}
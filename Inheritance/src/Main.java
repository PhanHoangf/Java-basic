public class Main {
    public static void main (String[] args) {
        Animal animal = new Animal( "Generic", "Huge", 400 );
        doAnimalStuff( animal, "slow" );

        Dog dog = new Dog();

        Dog yorkie = new Dog( "Yorkie", 15 );
        doAnimalStuff( yorkie, "fast" );
    }

    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoise();
        animal.move( speed );
        System.out.println( animal );
        System.out.println( "_ _ _ _" );
    }
}
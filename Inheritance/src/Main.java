public class Main {
    public static void main (String[] args) {
        Animal animal = new Animal( "Generic", "Huge", 400 );
        doAnimalStuff( animal, "slow" );

        Dog dog = new Dog();

        Dog yorkie = new Dog( "Yorkie", 15 );
        doAnimalStuff( yorkie, "fast" );

        Fish goldie = new Fish( "Goldfish", 0.25, 2, 3 );
        doAnimalStuff( goldie, "fast" );
    }

    public static void doAnimalStuff (Animal animal, String speed) {
        animal.makeNoise();
        animal.move( speed );
        System.out.println( animal );
        System.out.println( "_ _ _ _" );
    }
}
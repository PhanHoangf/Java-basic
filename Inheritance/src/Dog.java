public class Dog extends Animal {
    private String earShape;

    private String tailShape;

    Dog () {
    }

    Dog (String type, double weight, String earShape, String tailShape) {
        super( type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight );
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    Dog (String type, double weight) {
        this( type, weight, "Perky", "Curled" );
    }

    public String getEarShape () {
        return earShape;
    }

    public void setEarShape (String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape () {
        return tailShape;
    }

    public void setTailShape (String tailShape) {
        this.tailShape = tailShape;
    }

    @Override
    public String toString () {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise () {
        bark();
    }

    @Override
    public void move (String speed) {
        super.move( speed );
//        System.out.println( "Dogs walk, run and wag their tail" );
        if ( speed == "slow" ) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark () {
        System.out.println( "Woof! " );
    }

    private void run () {
        System.out.println( "Dog Running! " );
    }

    private void walk () {
        System.out.println( "Dog Walking! " );
    }

    private void wagTail () {
        System.out.println( "Tail Wagging! " );
    }
}

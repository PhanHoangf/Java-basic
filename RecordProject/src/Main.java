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

        Student pojoStudent = new Student( "S92400", "Hazel", "05/11/1985", "Java Class" );
        LPAStudent recordStudent = new LPAStudent( "S92600", "Hazel123", "05/11/1985", "Java Class" );

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList( pojoStudent.getClassList() + ", Java OOP class" );

        // Record is readonly

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
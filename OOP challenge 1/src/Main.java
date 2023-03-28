public class Main {
    public static void main (String[] args) {
//        BankAccount myAccount = new BankAccount(
//                "12345",
//                1000000,
//                "Hazel",
//                "hz@pt.com",
//                "123-456-789"
//        );
        BankAccount myAccount = new BankAccount();
//        myAccount.setBalance( 1000000 );
//        myAccount.setAccNumber( "1999201987" );
//        myAccount.setEmail( "my@email.com" );
//        myAccount.setPhoneNumber( "0123456789" );
//        myAccount.setCustomerName( "My name" );

        myAccount.deposit( 2000000 );
        myAccount.withdraw( 3000000 );
    }
}
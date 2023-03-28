public class BankAccount {
    private String accNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount () {
        this( "987654", 5000000, "defaultName", "defaultEmail", "Phone fault" );
        System.out.println( "Empty constructor called" );
    }

    public BankAccount (String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount (String accNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println( "Account constructor with parameters called" );
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }

    public String getCustomerName () {
        return customerName;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (int amount) {
        this.balance += amount;
        this.logBalance();
    }

    public void withdraw (int amount) {
        if ( amount < 0 || amount > balance ) {
            System.out.println( "Invalid amount" );
        } else {
            this.balance -= amount;
            this.logBalance();
        }
    }

    public void logBalance () {
        System.out.println( "Current balance " + balance );
    }

    public String getAccNumber () {
        return accNumber;
    }

    public void setAccNumber (String accNumber) {
        this.accNumber = accNumber;
    }
}
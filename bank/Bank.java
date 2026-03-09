package bank;

class Account {
    // String name; // Default Access modifier
    public String name; // public Access modifier - Everybody will be able to access this
    protected String email; // protected Access modifier - in this pacage or program everybody will be able
                            // to access this but in different package only sub classes will be able to
                            // access this modifier.
    private String password; // private Access modifier - Only this class (Account class will be able to
                             // access this modifier)

    // for the private modifier - we use getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Hem Raj";
        account1.email = "hemsa@gmail.com";
        // account1.password = "abcd"; // not able to set password bcz it is private
        // access modifier

        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

public class userInfo {
    private String firstName;
    private String lastName;
    private int balance;

    public userInfo(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String toString() {
return
"First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Balance: $" + balance;
    }
}

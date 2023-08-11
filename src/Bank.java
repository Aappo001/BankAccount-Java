import java.util.Scanner;
public class Bank {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName;
        String lastName;
        int balance = 0;
        String choice = "a";
        System.out.println("Hello, welcome to Wells Fargo. What is your first name?");
        firstName = keyboard.next();
        System.out.println("What is your last name?");
        lastName = keyboard.next();
        System.out.println("Welcome back " + firstName);
        userInfo user = new userInfo(firstName, lastName, balance);
        while ((choice.equalsIgnoreCase("a") || (choice.equalsIgnoreCase("b")) || (choice.equalsIgnoreCase("c")))) {
            System.out.println("what would you like to do? (Please type the letter that corresponds to your desired action)");
            System.out.println(showMenu());
            choice = keyboard.next();
            System.out.println(actions(firstName, lastName, balance, choice, user) + "\n");
            balance = user.getBalance();
        }

    }

    public static String showMenu() {
        return "a: Show account details \n" +
                "b: Make a deposit \n" +
                "c: Make a withdrawal \n" +
                "d: logout";
    }

    public static userInfo actions(String firstName, String lastName, int balance, String choice, userInfo user) {
        if (choice.equalsIgnoreCase("a")) {

        } else if (choice.equalsIgnoreCase("b")) {
            System.out.println("How much would you like to deposit?");
            balance += keyboard.nextInt();
            user.setBalance(balance);
        } else if (choice.equalsIgnoreCase("c")) {
            int withdraw;
            System.out.println("How much would you like to withdraw?");
            withdraw = keyboard.nextInt();
            if (withdraw <= balance) {
                balance = balance - withdraw;
                user.setBalance(balance);
            } else {
                System.out.println("Insufficient funds");
            }
        } else if (choice.equalsIgnoreCase("d")) {
           System.out.println("Thank you for banking with Wells Fargo, have a great day.");
        }
        return user;
    }
}

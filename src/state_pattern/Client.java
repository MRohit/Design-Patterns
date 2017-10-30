package state_pattern;

public class Client {
    public static void main(String args[]) {
        Customer cust = new Customer("Paul");
        cust.addRentals(new Rental(new Movie("Fast 5",1),10));
        System.out.println("Statement:"+cust.statement());
    }
}

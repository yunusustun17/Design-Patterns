package Facade;

public class App {
    public static void main(String[] args) {
        Customer john = new Customer("john", "doe");

        CreditCardFacade creditCardFacade = new CreditCardFacade();
        creditCardFacade.createCreditCard(john);
    }
}

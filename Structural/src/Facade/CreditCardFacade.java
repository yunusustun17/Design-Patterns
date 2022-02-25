package Facade;

public class CreditCardFacade {
    public void createCreditCard(Customer customer) {
        CreditCardManager creditCardManager = new CreditCardManager();

        BlackListService blackListService = new BlackListService();

        if (blackListService.checkEmployeeIsTheBlackList(customer)) {
            creditCardManager.createCreditCard(customer);
        }
    }
}

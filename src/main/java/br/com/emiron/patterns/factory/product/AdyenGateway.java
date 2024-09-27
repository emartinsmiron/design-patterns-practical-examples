package br.com.emiron.factory.product;

public class AdyenGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Adyen: "+amount;
    }
}

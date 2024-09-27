package br.com.emiron.factory;

public class AdyenGateway implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Adyen: "+amount;
    }
}

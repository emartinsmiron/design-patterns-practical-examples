package br.com.emiron.factory.product;

public class VindiGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Vindi: "+amount;
    }
}

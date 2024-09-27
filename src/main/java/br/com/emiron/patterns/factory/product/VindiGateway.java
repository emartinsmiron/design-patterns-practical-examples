package br.com.emiron.factory;

public class VindiGateway implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Vindi: "+amount;
    }
}

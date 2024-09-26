package br.com.emiron.factory;

public class PagarmeGateway implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Pagarme: "+amount;
    }
}

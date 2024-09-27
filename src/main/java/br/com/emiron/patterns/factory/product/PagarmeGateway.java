package br.com.emiron.factory.product;

public class PagarmeGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Pagarme: "+amount;
    }
}

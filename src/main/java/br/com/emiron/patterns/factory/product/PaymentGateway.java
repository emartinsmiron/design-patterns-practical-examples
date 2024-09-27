package br.com.emiron.factory.product;

public interface PaymentGateway {
    String processPayment(double amount);
}

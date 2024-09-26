package br.com.emiron.factory;

public interface PaymentGateway {
    String processPayment(double amount);
}

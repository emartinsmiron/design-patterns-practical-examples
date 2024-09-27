package br.com.emiron.factory;

public abstract class PaymentGatewayFactory {

    public abstract PaymentGateway createPaymentGateway();

    public String process(double amount){
        PaymentGateway paymentGateway = createPaymentGateway();
        return paymentGateway.processPayment(amount);
    }
}

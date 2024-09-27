package br.com.emiron.factory.creators;

import br.com.emiron.factory.product.PaymentGateway;

public abstract class PaymentGatewayFactory {

    public abstract PaymentGateway createPaymentGateway();

    public String process(double amount){
        PaymentGateway paymentGateway = createPaymentGateway();
        return paymentGateway.processPayment(amount);
    }
}

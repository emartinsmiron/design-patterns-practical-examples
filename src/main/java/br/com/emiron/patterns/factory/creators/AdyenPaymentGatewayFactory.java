package br.com.emiron.factory.creators;

import br.com.emiron.factory.product.AdyenGateway;
import br.com.emiron.factory.product.PaymentGateway;

public class AdyenPaymentGatewayFactory extends PaymentGatewayFactory{
    @Override
    public PaymentGateway createPaymentGateway() {
        return new AdyenGateway();
    }
}

package br.com.emiron.factory.creators;

import br.com.emiron.factory.product.PaymentGateway;
import br.com.emiron.factory.product.VindiGateway;

public class VindiPaymentGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new VindiGateway();
    }
}

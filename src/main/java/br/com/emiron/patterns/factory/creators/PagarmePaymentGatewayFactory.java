package br.com.emiron.factory.creators;

import br.com.emiron.factory.product.PagarmeGateway;
import br.com.emiron.factory.product.PaymentGateway;

public class PagarmePaymentGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new PagarmeGateway();
    }
}

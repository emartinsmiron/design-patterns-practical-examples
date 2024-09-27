package br.com.emiron.factory;

import br.com.emiron.factory.creators.PaymentGatewayFactory;
import br.com.emiron.factory.product.PaymentGateway;

public class Run {
    public static void main(String[] args){
             PaymentGatewayProviderFactory factory = new PaymentGatewayProviderFactory();

        PaymentGatewayFactory vindiGateway = factory.getPaymentGateway(GatewayProvider.VINDI);
        System.out.println(vindiGateway.createPaymentGateway().processPayment(85.54));

    }

}

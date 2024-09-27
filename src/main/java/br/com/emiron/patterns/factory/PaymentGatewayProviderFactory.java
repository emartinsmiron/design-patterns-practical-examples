package br.com.emiron.factory;

import br.com.emiron.factory.creators.AdyenPaymentGatewayFactory;
import br.com.emiron.factory.creators.PagarmePaymentGatewayFactory;
import br.com.emiron.factory.creators.PaymentGatewayFactory;
import br.com.emiron.factory.creators.VindiPaymentGatewayFactory;

import java.util.HashMap;
import java.util.Map;

public class PaymentGatewayProviderFactory {
    private final Map<GatewayProvider, PaymentGatewayFactory> paymentGateways = new HashMap<>();

    public PaymentGatewayProviderFactory() {
        paymentGateways.put(GatewayProvider.PAGARME, new PagarmePaymentGatewayFactory());
        paymentGateways.put(GatewayProvider.VINDI, new VindiPaymentGatewayFactory());
        paymentGateways.put(GatewayProvider.ADYEN, new AdyenPaymentGatewayFactory());
    }

    public PaymentGatewayFactory getPaymentGateway(GatewayProvider gatewayProvider) {
        var paymentGatewayFactory = paymentGateways.get(gatewayProvider);
        if (paymentGatewayFactory == null){
                throw new IllegalArgumentException("Unknown Payment Gateway" + gatewayProvider);
        }
        return paymentGatewayFactory;
    }
}

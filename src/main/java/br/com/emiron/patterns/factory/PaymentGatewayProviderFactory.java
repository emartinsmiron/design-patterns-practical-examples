package br.com.emiron.factory;

import java.util.HashMap;
import java.util.Map;

public class PaymentGatewayProviderFactory {
    private final Map<String, PaymentGateway> paymentGateways = new HashMap<>();

    public PaymentGatewayProviderFactory() {
        paymentGateways.put("pagarmeGateway", new PagarmeGateway());
        paymentGateways.put("vindiGateway", new VindiGateway());
        paymentGateways.put("adyenGateway", new AdyenGateway());
    }

    public PaymentGateway getPaymentGateway(String gatewayType) {
        var paymentGateway = paymentGateways.get(gatewayType);
        if (paymentGateway == null){
                throw new IllegalArgumentException("Unknown Payment Gateway" + gatewayType);
        }
        return paymentGateway;
    }
}

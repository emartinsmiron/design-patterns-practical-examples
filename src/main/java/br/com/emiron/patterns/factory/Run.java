package br.com.emiron.factory;

public class Run {
    public static void main(String[] args){
             PaymentGatewayProviderFactory factory = new PaymentGatewayProviderFactory();

        PaymentGateway vindiGateway = factory.getPaymentGateway("vindiGateway");
        System.out.println(vindiGateway.processPayment(85.54));

    }

}

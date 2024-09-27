package br.com.emiron.abstractfactory.provider;

public class SAMLProvider implements AuthProvider {
    @Override
    public boolean authenticate(String username, String password) {
        System.out.printf("Authenticating via SAML for user: %s%n", username );
        return true;
    }
}

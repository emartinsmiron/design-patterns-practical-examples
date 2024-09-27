package br.com.emiron.abstractfactory.provider;

public class OauthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String username, String password) {
        System.out.printf("Authenticating via Oauth for user: %s%n", username );
        return true;
    }
}

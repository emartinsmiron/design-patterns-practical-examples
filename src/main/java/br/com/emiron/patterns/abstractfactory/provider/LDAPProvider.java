package br.com.emiron.abstractfactory.provider;

public class LDAPProvider implements AuthProvider {
    @Override
    public boolean authenticate(String username, String password) {
        System.out.printf("Authenticating via LDAP for user: %s%n", username );
        return true;
    }
}
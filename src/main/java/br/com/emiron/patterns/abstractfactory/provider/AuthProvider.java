package br.com.emiron.abstractfactory.provider;

public interface AuthProvider {
    boolean authenticate(String username, String password);
}

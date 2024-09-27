package br.com.emiron.abstractfactory;

import br.com.emiron.abstractfactory.factory.AuthFactory;
import br.com.emiron.abstractfactory.factory.LDAPFactory;

public class App {
    public static void main(String[] args) {
        AuthFactory factory = new LDAPFactory();
        AuthenticationApp app = new AuthenticationApp(factory, "emiron", "teste");
        app.authenticateUser("teste", "teste");
    }
}

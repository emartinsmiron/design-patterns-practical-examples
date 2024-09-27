package br.com.emiron.abstractfactory;

import br.com.emiron.abstractfactory.factory.AuthFactory;
import br.com.emiron.abstractfactory.provider.AuthProvider;
import br.com.emiron.abstractfactory.userdetails.UserDetails;

public class AuthenticationApp {
    private AuthProvider authProvider;
    private UserDetails userDetails;

    public AuthenticationApp(AuthFactory factory, String username, String email) {
        this.authProvider = factory.createAuthProvider();
        this.userDetails = factory.createUserDetails(username, email);
    }

    public void authenticateUser(String username, String password){
        if(authProvider.authenticate(username, password)){
            System.out.printf("%s Authenticated", username);
        }else {
            throw new RuntimeException("Could not authenticate, try again latter");
        }

    }
}

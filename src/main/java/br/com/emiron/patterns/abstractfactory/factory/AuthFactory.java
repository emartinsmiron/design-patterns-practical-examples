package br.com.emiron.abstractfactory.factory;

import br.com.emiron.abstractfactory.provider.AuthProvider;
import br.com.emiron.abstractfactory.userdetails.UserDetails;

public interface AuthFactory {
    AuthProvider createAuthProvider();
    UserDetails createUserDetails(String username, String email);
}

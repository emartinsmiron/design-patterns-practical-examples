package br.com.emiron.abstractfactory.factory;

import br.com.emiron.abstractfactory.provider.AuthProvider;
import br.com.emiron.abstractfactory.provider.LDAPProvider;
import br.com.emiron.abstractfactory.provider.OauthProvider;
import br.com.emiron.abstractfactory.userdetails.OauthUserDetails;
import br.com.emiron.abstractfactory.userdetails.UserDetails;

public class LDAPFactory implements AuthFactory {
    @Override
    public AuthProvider createAuthProvider() {
        return new LDAPProvider();
    }

    @Override
    public UserDetails createUserDetails(String username, String email) {
        return new OauthUserDetails(username, email);
    }
}

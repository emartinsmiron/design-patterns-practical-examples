package br.com.emiron.abstractfactory.factory;

import br.com.emiron.abstractfactory.provider.AuthProvider;
import br.com.emiron.abstractfactory.provider.OauthProvider;
import br.com.emiron.abstractfactory.provider.SAMLProvider;
import br.com.emiron.abstractfactory.userdetails.OauthUserDetails;
import br.com.emiron.abstractfactory.userdetails.UserDetails;

public class SAMLFactory implements AuthFactory {
    @Override
    public AuthProvider createAuthProvider() {
        return new SAMLProvider();
    }

    @Override
    public UserDetails createUserDetails(String username, String email) {
        return new OauthUserDetails(username, email);
    }
}

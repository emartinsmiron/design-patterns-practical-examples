package br.com.emiron.abstractfactory.userdetails;

public class SAMLUserDetails implements  UserDetails{

    private String username;
    private String email;

    public SAMLUserDetails(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getEmail() {
        return email;
    }
}

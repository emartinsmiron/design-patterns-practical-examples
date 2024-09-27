package br.com.emiron.abstractfactory.userdetails;

public class LDAPUserDetails implements  UserDetails{

    private String username;
    private String email;

    public LDAPUserDetails(String username, String email) {
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

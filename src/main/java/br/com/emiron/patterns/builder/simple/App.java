package br.com.emiron.builder.simple;

public class App {
    public static void main(String ... args){
        User u = new User.UserBuilder("Eduardo").email("e@e.com.br").birthDate("03/03/03").build();
        System.out.println(u);

        User u2 = new User.UserBuilder("Cláudio").birthDate("03/03/03").build();
        System.out.println(u2);
    }
}

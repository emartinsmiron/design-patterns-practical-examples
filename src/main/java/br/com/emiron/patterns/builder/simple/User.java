package br.com.emiron.builder.simple;

public class User {
    private String name;
    private String birthDate;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private String birthDate;
        private String email;

        public UserBuilder(String name){
            this.name = name;
        }

        public UserBuilder birthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            var u = new User();
            u.setName(this.name);
            u.setBirthDate(this.birthDate);
            u.setEmail(this.email);
            return u;
        }
    }

}

package br.com.emiron.prototype.simple;

public class AccountBalance implements Cloneable {

    private double balance;


    public AccountBalance applyTax(double taxRate) {
        AccountBalance clone = this.clone();
        clone.balance *= ((100 - taxRate)/100);
        return clone;
    }

    public void deposit(double amount){
        this.balance += amount;
    }


    public void printBalance() {
        System.out.printf("Balance: %f\n ", this.balance);
    }

    @Override
    public AccountBalance clone() {
        try {
            return (AccountBalance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

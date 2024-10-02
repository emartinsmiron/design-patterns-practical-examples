package br.com.emiron.prototype.simple;

public class App {
    public static void main(String[] args) {
        AccountBalance accountBalance = new AccountBalance();
        accountBalance.deposit(100);
        accountBalance.printBalance();
        AccountBalance balanceAfterTax = accountBalance.applyTax(1);
        balanceAfterTax.printBalance();
    }

}

package accounts;

import accounts.transactions.ITransactions;

abstract public class Account implements ITransactions {

    int accountNumber;
    double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    abstract public void showInfo();
}
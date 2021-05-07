package customers;

import helper.Help;
import accounts.Account;
import java.util.ArrayList;
import accounts.operations.AccountOperations;

public class Customer extends Account implements AccountOperations {

    private String name;
    private int nid;
    private ArrayList<Account> accounts;

    public Customer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getName() {
        return this.name;
    }

    public int getNid() {
        return this.nid;
    }


    /**
     * 
     * @class       AccountOperation
     * @abstract    Method
     * 
     */

    public void customerAccountStart() {
        int choise = 0;
        int aNumber = -1;
        double aBalance = -1.0;

        Help.generateOptionsList(new String[] {
            "Insert New Account",
            "Remove Existing Account",
            "Show All Accounts"
        });

        if((choise = Help.readInteger()) == -1) {
            return;
        }

        switch (choise) {
            case 1:

                while(true) {
                    Help.echo("\tEnter Account Number: ");
                    aNumber = Help.readInteger();

                    if (aNumber != -1) {
                        break;
                    }
                }

                while(true) {
                    Help.echo("\tEnter Account Balance: ");
                    aBalance = Help.readDouble();

                    if (aBalance != -1) {
                        break;
                    }
                }

                this.setAccountNumber(aNumber);
                this.setBalance(aBalance);
                // Help.echoLn(this.setAccountNumber());
                // Help.echoLn(this.setAccountNumber());

                this.insertAccount(this);

                aNumber = -1;
                aBalance = -1.0;
                break;

            case 2:
                while(true) {
                    Help.echo("\tEnter Account Number: ");
                    aNumber = Help.readInteger();

                    if (aNumber != -1) {
                        break;
                    }
                }

                Account a = this.getAccount(aNumber);
                if(a != null) {
                    this.removeAccount(a);
                    Help.echoLn("\nSuccessfully Delete\n");
                } else {
                    Help.echoLn("\nCan't Find!!\n");
                }

                aNumber = -1;
                aBalance = -1.0;
                break;

            case 3:
                this.showAllAccounts();
                break;

            default:
                Help.echoLn("\nWrong Option!!\n");
                break;
        }
    }

    public void insertAccount(Account a) {
        this.accounts.add(a);
    }

    public void removeAccount(Account a) {
        this.accounts.remove(a);
    }

    public Account getAccount(int accountNumber) {
        for(Account account : this.accounts) {
            if(nid == account.getAccountNumber()) {
                return account;
            }
        }
        return null;
    }

    public void showAllAccounts() {
        ArrayList<String> customers = Help.readFile(Help.ACCOUNT_PATH);
        int count = 0;
        for (int i = 0; i < customers.size();i++) {
            String customer[] = customers.get(i).split("    ");
            if(customer[0].equals("" + this.getNid())){
                Help.echoLn("Account " + (++count) + ": ");
                Help.echoLn("\tAccount Number: " + customer[1]);
                Help.echoLn("\tAccount Balance: " + customer[2]);
            } else {
                continue;
            }
        }
        // for (Account account : this.accounts) {
        //     Help.echoLn("Account:");
        //     Help.echoLn("\tAccount Number: " + account.getAccountNumber());
        //     Help.echoLn("\tAccount Balance: " + account.getBalance());
        // }
    }

    /***************************
        End AccountOperation
    ****************************/


    /**
     * 
     * @class       Account
     * @abstract    Method
     * 
     */

    public void showInfo() {
        
    }

    /******************
        End Account
    *******************/


    /**
     * 
     * @class       ITransactions
     * @abstract    Method
     * 
     */

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void transfer(Account a, double amount) {

    }

    /****************************************
        End ITransactions Abstract Method
    *****************************************/
}

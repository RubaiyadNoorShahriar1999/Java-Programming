package start;

import bank.Bank;
import helper.Help;

class Start {

    public Start() {
        int choise = 0;
        Bank bank = new Bank();

        while (true) {

            Help.generateOptionsList(new String[] {
                "Employee Management",
                "Customer Management",
                "Customer Account Management",
                "Account Transactions",
                "Exit"
            });

            if((choise = Help.readInteger()) == -1) {
                continue;
            }

            switch (choise) {
                case 5:
                    return;

                case 1:
                    bank.employeeStart();
                    break;

                case 2:
                    bank.customerStart();
                    break;

                case 3:
                    bank.accountStart();
                    break;

                case 4:

                    break;

                default:
                    Help.echoLn("\nWrong Option!!\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Start();
    }
}

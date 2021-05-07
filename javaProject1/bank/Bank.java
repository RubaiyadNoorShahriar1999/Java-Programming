package bank;

import helper.Help;
import employees.Employee;
import customers.Customer;
import java.util.ArrayList;
import employees.operations.EmployeeOperations;
import customers.operations.CustomerOperations;

public final class Bank implements EmployeeOperations, CustomerOperations {

    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    /*
     *
     * @Class       Bank
     * @Method      Initialize
     * 
     */

    public Bank() {
        // init the database
        // store in ArrayList from database
    }
    
    /*******************
        End Employee
    ********************/


    /*
     *
     * @Class       Employee
     * @Method      All Employee Functionality 
     * 
     */

    public void employeeStart() {
        int choise = 0;
        String eName = null;
        int eId = -1;
        double eSalary = -1.0;
        Employee employee = new Employee();

        Help.generateOptionsList(new String[] {
            "Insert New Employee",
            "Remove Existing Employee",
            "Show All Employees"
        });

        if((choise = Help.readInteger()) == -1) {
            return;
        }

        switch (choise) {
            case 1:

                while(true) {
                    Help.echo("\tEnter Employee Name: ");
                    eName = Help.readString();

                    if (!eName.equals(null)) {
                        break;
                    }
                }

                while(true) {
                    Help.echo("\tEnter Employee ID: ");
                    eId = Help.readInteger();

                    if (eId != -1) {
                        break;
                    }
                }

                while(true) {
                    Help.echo("\tEnter Employee Salary: ");
                    eSalary = Help.readDouble();

                    if (eSalary != -1.0) {
                        break;
                    }
                }

                employee.setName(eName);
                employee.setEmpId(eId);
                employee.setSalary(eSalary);
                // Help.echoLn(employee.getName());
                // Help.echoLn(employee.getEmpId());
                // Help.echoLn(employee.getSalary());

                this.insertEmployee(employee);

                employee = null;
                eName = null;
                eId = -1;
                eSalary = -1.0;
                break;

            case 2:
                while(true) {
                    Help.echo("\tEnter Employee ID: ");
                    eId = Help.readInteger();

                    if (eId != -1) {
                        break;
                    }
                }

                employee = this.getEmployee(eId);
                if(employee != null) {
                    this.removeEmployee(employee);
                    Help.echoLn("\nSuccessfully Delete\n");
                } else {
                    Help.echoLn("\nCan't Find!!\n");
                }

                employee = null;
                eName = null;
                eId = -1;
                eSalary = -1.0;
                break;

            case 3:
                this.showAllEmployees();
                break;

            default:
                Help.echoLn("\nWrong Option!!\n");
                break;
        }
    }

    public void insertEmployee(Employee e) {
        this.employees.add(e);
    }

    public void removeEmployee(Employee e) {
        this.employees.remove(e);
    }

    public Employee getEmployee(int empId) {
        for(Employee employee : this.employees) {
            if(empId == employee.getEmpId()) {
                return employee;
            }
        }
        return null;
    }

    public void showAllEmployees() {
        ArrayList<String> employees = Help.readFile(Help.EMPLOYEE_PATH);
        for (int i = 0; i < employees.size(); i++) {
            String employee[] = employees.get(i).split("    ");
            Help.echoLn("Employee " + (i+1) + ": ");
            Help.echoLn("\tEmployee Name: " + employee[0]);
            Help.echoLn("\tEmployee ID: " + employee[1]);
            Help.echoLn("\tEmployee Salary: " + employee[2]);
        }
        // for (Employee employee : this.employees) {
        //     Help.echoLn("Employee:");
        //     Help.echoLn("\tEmployee Name: " + employee.getName());
        //     Help.echoLn("\tEmployee ID: " + employee.getEmpId());
        //     Help.echoLn("\tEmployee Salary: " + employee.getSalary());
        // }
    }

    /*******************
        End Employee
    ********************/


    /*
     *
     * @Class       Customer
     * @Method      All Customer Functionality 
     * 
     */

    public void customerStart() {
        int choise = 0;
        String cName = null;
        int cNid = -1;
        Customer customer = new Customer();

        Help.generateOptionsList(new String[] {
            "Insert New Customer",
            "Remove Existing Customer",
            "Show All Customers"
        });

        if((choise = Help.readInteger()) == -1) {
            return;
        }

        switch (choise) {
            case 1:

                while(true) {
                    Help.echo("\tEnter Customer Name: ");
                    cName = Help.readString();

                    if (!cName.equals(null)) {
                        break;
                    }
                }

                while(true) {
                    Help.echo("\tEnter Customer ID: ");
                    cNid = Help.readInteger();

                    if (cNid != -1) {
                        break;
                    }
                }

                customer.setName(cName);
                customer.setNid(cNid);
                // Help.echoLn(customer.getName());
                // Help.echoLn(customer.getNid());

                this.insertCustomer(customer);

                customer = null;
                cName = null;
                cNid = -1;
                break;

            case 2:
                while(true) {
                    Help.echo("\tEnter Customer NID: ");
                    cNid = Help.readInteger();

                    if (cNid != -1) {
                        break;
                    }
                }

                customer = this.getCustomer(cNid);
                if(customer != null) {
                    this.removeCustomer(customer);
                    Help.echoLn("\nSuccessfully Delete\n");
                } else {
                    Help.echoLn("\nCan't Find!!\n");
                }

                customer = null;
                cName = null;
                cNid = -1;
                break;

            case 3:
                this.showAllCustomers();
                break;

            default:
                Help.echoLn("\nWrong Option!!\n");
                break;
        }
    }

    public void insertCustomer(Customer c) {
        this.customers.add(c);
    }

    public void removeCustomer(Customer c) {
        this.customers.remove(c);
    }

    public Customer getCustomer(int nid) {
        for(Customer customer : this.customers) {
            if(nid == customer.getNid()) {
                return customer;
            }
        }
        return null;
    }

    public void showAllCustomers() {
        ArrayList<String> customers = Help.readFile(Help.CUSTOMER_PATH);
        for (int i = 0; i < customers.size(); i++) {
            String customer[] = customers.get(i).split("    ");
            Help.echoLn("Customer " + (i+1) + ": ");
            Help.echoLn("\tCustomer Name: " + customer[0]);
            Help.echoLn("\tCustomer NID: " + customer[1]);
        }
        // for (Customer Customer : this.customers) {
        //     Help.echoLn("Customer:");
        //     Help.echoLn("\tCustomer Name: " + Customer.getName());
        //     Help.echoLn("\tCustomer NID: " + Customer.getNid());
        // }
    }

    /*******************
        End Customer
    ********************/



    /*
     *
     * @Class       Customer Accounts
     * @Method      All Customer Accounts Functionality 
     * 
     */

    public void accountStart() {
        Customer customer = null;
        int cNid = -1;
    
        Help.echo("\tEnter Customer NID: ");

        if((cNid = Help.readInteger()) == -1) {
            return;
        }

        customer = this.getCustomer(cNid);

        if(customer != null) {
            customer.customerAccountStart();
        } else {
            Help.echoLn("\nCan't Find!!\n");
            return;
        }

    }

    /****************************
        End Customer Accounts
    *****************************/

}
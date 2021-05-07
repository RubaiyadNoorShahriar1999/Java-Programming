package customers.operations;

import customers.Customer;

public interface CustomerOperations {

    void insertCustomer(Customer c);
    void removeCustomer(Customer c);
    Customer getCustomer(int nid);
    void showAllCustomers();
}
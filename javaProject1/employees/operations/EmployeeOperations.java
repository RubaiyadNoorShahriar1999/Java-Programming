package employees.operations;

import employees.Employee;

public interface EmployeeOperations {
    void insertEmployee(Employee e);
    void removeEmployee(Employee e);
    Employee getEmployee(int empId);
    void showAllEmployees();
}
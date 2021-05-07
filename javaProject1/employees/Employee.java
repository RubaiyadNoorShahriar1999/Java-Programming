package employees;

public class Employee {

    private String name;
    private int empId;
    private double salary;

    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmpId() {
        return this.empId;
    }

    public double getSalary() {
        return this.salary;
    }
}
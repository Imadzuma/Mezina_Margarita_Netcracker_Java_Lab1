package employee;

import java.util.Objects;

public class Employee {
    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructors
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters & Setters
    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override metods
    @Override
    public String toString() {
        return "employee[id=" + id + ",name='" + firstName + ' ' + lastName + ",salary=" + salary + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee)obj;
        return id == employee.id;
    }
    @Override
    public int hashCode(){
        int result = 103;
        result = 31 * result + id;
        return result;
    }

    // New metods
    public String getName() {
        return firstName + " " + lastName;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }
}

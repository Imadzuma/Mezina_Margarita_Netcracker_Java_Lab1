package employee;

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

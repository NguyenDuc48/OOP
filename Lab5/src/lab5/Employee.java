package lab5;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        int newSalary = (int) (this.salary * (1 + percent / 100.0));
        this.setSalary(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id = " + id +

                ", firstName = '" + firstName + '\'' +

                ", lastName = '" + lastName + '\'' +
                ", salary = " + salary +
                ']';
    }
}

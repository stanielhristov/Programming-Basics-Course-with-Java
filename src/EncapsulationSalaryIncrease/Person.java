package EncapsulationSalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary (double percentage) {
        if (this.age > 30) {
            this.salary = this.salary + this.salary * percentage / 100;
        } else {
            this.salary = this.salary + this.salary * percentage / 100 / 200;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f lev.", firstName, lastName, salary);
    }

    public int getAge() {
        return age;
    }

    private int age;

}

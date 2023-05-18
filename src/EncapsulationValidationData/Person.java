package EncapsulationValidationData;

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
        this.setSalary(salary);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
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

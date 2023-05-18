package EncapsulationExerciseShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public void setName(String name) {
        this.name = name;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
       if (!name.isEmpty()) {
           return name;
       } else {
           throw new IllegalArgumentException("Name cannot be empty");
       }
    }

    public double getCost() {
        if (cost >= 0) {
            return cost;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }

    }

    private Product(String name, double cost) {
        setName(name);
        setCost(cost);

    }
}

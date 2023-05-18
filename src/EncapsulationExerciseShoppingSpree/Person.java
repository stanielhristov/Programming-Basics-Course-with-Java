package EncapsulationExerciseShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> productList;

    private void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }

    }

    private void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.productList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void buyProduct (Product product) {
        if (this.money >= product.getCost()) {
            this.productList.add(product);
            this.money -= product.getCost();
        } else {
           String message = getName() + "can't afford " + product.getName();
            throw new IllegalArgumentException(message);

        }

    }
}

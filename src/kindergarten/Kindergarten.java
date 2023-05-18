package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (capacity > 0) {
            registry.add(child);
            capacity--;
            return true;
        }
        return false;
    }

    public boolean removeChild(String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                registry.remove(child);
                capacity++;
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount() {
        return registry.size();
    }

    public Child getChild(String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                return child;
            }
        }
        return null;
    }

    public String registryReport() {
        StringBuilder reporter = new StringBuilder();
        reporter.append(String.format("Registered children in %s:", this.name));
        Comparator<Child> comparator = Comparator.comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName);

        registry.stream()
                .sorted(comparator)
                .forEach(child -> reporter.append(String.format("%n -- %n %s", child)));

        return reporter.toString();
    }
}

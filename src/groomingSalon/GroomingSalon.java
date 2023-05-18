package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public List<Pet> getData() {
        return data;
    }

    public void setData(List<Pet> data) {
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            data.add(pet);
        }
    }
    public boolean remove (String name) {

        for (Pet pet : data) {
            if (pet.getName().equals(name)) {
                return this.data.remove(pet);
            }
        }
        return false;
    }
    public Pet getPet (String name, String owner) {

        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }
    public int getCount () {
        return data.size();
    }
    public String getStatistics() {
       StringBuilder builder = new StringBuilder();
       builder.append(" The grooming salon has the following clients:").append("\n");
       for (Pet pet : this.data) {
           builder.append(pet.toString()).append("\n");
       }


        return builder.toString();

    }
}

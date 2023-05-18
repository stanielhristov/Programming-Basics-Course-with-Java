package EncapsulationFirstAndReserveTeam;

import EncapsulationSalaryIncrease.Person;

import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Person> reserveTeam;

    public Team(String name, List<Person> firstTeam, List<Person> secondTeam) {
        this.name = name;
        this.firstTeam = firstTeam;
        this.reserveTeam = secondTeam;
    }
    public void addPlayer (Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
}

package com.example.firstSpringBoot.example;

public class District {

    private String name;
    private String population;

    public District(String name, String population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}

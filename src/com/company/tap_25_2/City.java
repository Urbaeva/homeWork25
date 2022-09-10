package com.company.tap_25_2;

public class City implements Comparable<City>{
    private int code;
    private String name;
    private long population;

    public City(int code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                "}\n";
    }

    @Override
    public int compareTo(City o) {
        return o.code - this.code;
    }
}

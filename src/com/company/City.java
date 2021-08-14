package com.company;

import java.util.Objects;

public class City implements Comparable<City> {
    private String name;
    private Integer code;

    public City() {}

    public City(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("%s, код города: %s", this.name, this.code);
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(code, o.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    @Override
    public boolean equals(Object obj) {
       if(obj == this) return true;
       if(!(obj instanceof City)) return false;

       City city = (City) obj;
       return Objects.equals(this.name, city.name)
               && Objects.equals(this.code, city.code);
    }
}

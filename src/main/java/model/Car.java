package model;


public class Car {
    private String name;
    private String model;
    private int year;

    public Car(String name, String mark, int year) {
        this.name = name;
        this.model = mark;
        this.year = year;
    }

    public String getName() { return name; }

    public String getModel() { return model; }

    public int getYear() { return year; }

}

package com.test.good;

/**
 * Created by Elena on 02.07.2014.
 */
public class TV extends Good{

    private Double screenDiameter;
    private String color;

    public TV() {
    }

    public TV(Double screenDiameter, String color) {
        this.screenDiameter = screenDiameter;
        this.color = color;
    }

    public Double getScreenDiameter() {
        return screenDiameter;
    }

    public void setScreenDiameter(Double screenDiameter) {
        this.screenDiameter = screenDiameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " "
                + "\nPrice: " + getPrice() + " "
                + "\nScreen diameter: " + getScreenDiameter() + " "
                + "\nColor: " + getColor();
    }
}

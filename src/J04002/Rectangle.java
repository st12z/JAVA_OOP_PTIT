/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

/**
 *
 * @author T
 */
public class Rectangle {

    private double width, height;
    private String color;

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void chuanHoaColor() {
        color = Character.toUpperCase(this.color.charAt(0)) + this.color.toLowerCase().substring(1);
    }

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("%.0f", Perimeter()) + " " + String.format("%.0f", Area()) + " " + color;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class J04002 {

    public static class Rectange {

        private double width, height;
        private String color;

        public Rectange() {

        }

        public Rectange(double width, double height, String color) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String color = sc.next();
        if (x > 0 && y > 0) {
            Rectange a = new Rectange(x, y, color);
            a.chuanHoaColor();
            System.out.println(a);
        }
        else{
            System.out.println("INVALID");
        }
    }
}

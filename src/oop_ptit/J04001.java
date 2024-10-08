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
public class J04001 {

    public static class Point {

        private double x;
        private double y;

        public Point() {
            x = y = 0;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point a) {
            return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y)*(this.y - a.y));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(String.format("%.4f", a.distance(b)));
        }

    }
}

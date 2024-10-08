/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04009;

/**
 *
 * @author T
 */
public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point another){
        return Math.sqrt(Math.pow(this.x-another.x,2)+Math.pow(this.y-another.y,2));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001;

/**
 *
 * @author T
 */
public class Point {
    private double x,y;
    public Point(){
        
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point another){
        return Math.sqrt((this.x-another.x)*(this.x-another.x)+(this.y-another.y)*(this.y-another.y));
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04019;

/**
 *
 * @author T
 */
public class Triangle {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Boolean valid(){
        double d1=a.distance(b);
        double d2=b.distance(c);
        double d3=c.distance(a);
        if(d1+d2<=d3 || d1+d3<=d2 ||d2+d3<=d1) return false;
        return true;
    }
    public String getPerimeter(){
        double d1=a.distance(b);
        double d2=b.distance(c);
        double d3=c.distance(a);
        return String.format("%.3f", d1+d2+d3);
    }
}

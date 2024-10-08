/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04009;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b= new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double d1=a.distance(b);
            double d2=b.distance(c);
            double d3=a.distance(c);
            if(d1+d2<=d3 || d1+d3<=d2 || d2+d3<=d1){
                System.out.println("INVALID");
            }
            else{
                double p =(d1+d2+d3)/2;
                double s=Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
                System.out.printf("%.2f",s);
                System.out.println("");
            }
        }
    }
}

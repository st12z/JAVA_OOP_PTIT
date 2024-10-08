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
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double n=sc.nextDouble();
            double h=sc.nextDouble();
            for(int i=1;i<=n-1;i++){
                double h1=(double) (h*Math.sqrt(i/n));
                System.out.print(String.format("%.6f", h1)+" ");
            }
            System.out.println("");
        }
        System.exit(0);
    }
}

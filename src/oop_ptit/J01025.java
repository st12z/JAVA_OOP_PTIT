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
public class J01025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1, b1, a2, b2;
        int x1, y1, x2, y2;
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        int minX1 = Math.min(a1, x1);
        int maxX2 = Math.max(a2, x2);
        int minY1 = Math.min(b1, y1);
        int maxY2 = Math.max(b2, y2);
        
        int minCanh = Math.max(maxY2 - minY1, maxX2 - minX1);
        System.out.println(minCanh*minCanh);

    }
}

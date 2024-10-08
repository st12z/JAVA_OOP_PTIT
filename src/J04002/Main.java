/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04002;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String color = sc.next();
        if (x > 0 && y > 0) {
            Rectangle a = new Rectangle(x, y, color);
            a.chuanHoaColor();
            System.out.println(a);
        }
        else{
            System.out.println("INVALID");
        }
    }
}

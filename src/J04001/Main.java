/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point x = new Point(sc.nextDouble(), sc.nextDouble());
            Point y = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(String.format("%.4f", x.distance(y)));
        }
    }
}

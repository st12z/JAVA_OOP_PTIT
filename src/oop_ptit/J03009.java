/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class J03009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String a[] = s1.split("\\s++");
            String b[] = s2.split("\\s++");
            TreeSet<String> set = new TreeSet<>();

            for (String s : a) {
                set.add(s);
            }
            for (String x : b) {
                if (set.contains(x) == true) {
                    set.remove(x);
                }
            }
            for (String x : set) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}

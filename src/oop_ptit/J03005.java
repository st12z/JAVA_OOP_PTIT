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
public class J03005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String a[] = s.split("\\s++");
            for (int i = 0; i < a.length; i++) {
                a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
                a[0]=a[0].toUpperCase();
            }
            for (int i = 1; i < a.length; i++) {
                System.out.print(a[i]);
                if(i!=a.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println(", "+a[0]);
        }

    }
}

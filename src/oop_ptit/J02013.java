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
public class J02013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int ok = 0;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int min = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = min;
                    ok = 1;
                }
            }
            if (ok == 1) {
                for (int j = 0; j <= n - 1; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println("");
            }
        }

    }
}

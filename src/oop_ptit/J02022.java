/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J02022 {

    public static int n;
    public static Integer a[];

    public static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new Integer[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
    }

    public static boolean check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }

    public static void sinh() {
        while (true) {
            int i = n - 1;
            if (check()) {
                in();
            }
            while (i >= 1 && a[i] >= a[i + 1]) {
                i--;
            }
            if (i == 0) {
                return;
            }
            int k = n;
            while (a[k] < a[i]) {
                k--;
            }
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            int l = i + 1;
            int r = n;
            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            init();
            sinh();
            System.out.println("");
        }
    }
}

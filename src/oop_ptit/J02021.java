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
public class J02021 {

    public static int n, k;
    public static int a[];
    public static int cnt=0;
    public static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
    }

    public static void in() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void sinh() {
        while (true) {
            int i = k;
            in();
            cnt+=1;
            while (i >= 1 && a[i] == n - k + i) {
                i--;
            }
            if (i == 0) {
                System.out.println("");
                return;
            }
            a[i] += 1;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        init();
        sinh();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}

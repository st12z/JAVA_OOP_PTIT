/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J02034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int cnt[] = new int[201];
        int maxValue = -1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]] = 1;
            maxValue = Math.max(maxValue, a[i]);
        }
        int ok=0;
        for (int i = 1; i <= maxValue; i++) {
            if (cnt[i] == 0) {
                System.out.println(i);
                ok=1;
            }
        }
        if(ok==0){
            System.out.println("Excellent!");
        }
    }
}

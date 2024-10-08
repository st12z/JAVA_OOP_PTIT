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
public class J02023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        if (9 * n < s || s <= 0) {
            System.out.println("-1 -1");
            return;
        }
        String res = "";
        int cs = 9;
        int temp = s;
        while (temp >= cs) {
            res += "9";
            temp -= 9;
        }
        String max = res + temp;
        String min = res;
        while (max.length() < n) {
            max += "0";
        }

        while (min.length() < n && temp > 0) {
            for (int i = 8; i >= 0; i--) {
                if (temp >= i) {
                    min += temp;
                    temp -= i;
                    break;
                }
            }
        }
        if (min.length() < n) {
            String x = min.charAt(min.length() - 1) + "";
            StringBuilder sb = new StringBuilder(min);
            sb.deleteCharAt(min.length() - 1);
            min = sb.reverse().toString();
            min = Integer.parseInt(x) - 1 + min;
            while (min.length() < n - 1) {
                min = "0" + min;
            }
            min = 1 + min;
        } else {
            StringBuilder sb = new StringBuilder(min);
            min = sb.reverse().toString();
        }
        System.out.println(min + " " + max);
    }

}

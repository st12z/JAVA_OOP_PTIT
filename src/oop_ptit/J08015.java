/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J08015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Map<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(a[i])) {
                    long fre = map.get(a[i]);
                    map.put(a[i], fre + 1);
                } else {
                    map.put(a[i], (long)1);
                }
            }
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                if (map.containsKey(k - a[i])) {
                    if (a[i] != k - a[i]) {
                        cnt += map.get(k - a[i]) * map.get(a[i]);
                        map.remove(a[i]);
                        map.remove(k - a[i]);
                    }
                    else{
                        cnt+= map.get(a[i])*(map.get(a[i])-1)/2;
                        map.remove(a[i]);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}

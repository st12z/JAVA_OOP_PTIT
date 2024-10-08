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
public class J02016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n= sc.nextInt();
            long a[]=new long[n];
            Map<Long,Long> map = new HashMap<>();
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            for(int i=0;i<n;i++){
                map.put(a[i]*a[i],1L);
            }
            int check=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    long x=a[i]*a[i]+a[j]*a[j];
                    if(map.containsKey(x)){
                        check=1;
                    }
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

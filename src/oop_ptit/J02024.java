/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class J02024 {
    public static Integer a[];
    public static int x[];
    public static int n;
    public static Set<String> set;
    public static void out(int i){
        String s="";
        for(int j=0;j<=i;j++){
            s+=x[j];
            if(j!=i) s+=' ';
        }
        set.add(s);
    }
    public static void Try(int i,int s,int cur){
        for(int j=cur;j<=n-1;j++){
            x[i]=a[j];
            if((s+a[j])%2==1){
                out(i);
            }
            Try(i+1, s+a[j],j+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            set = new TreeSet<>();
            n=sc.nextInt();
            a=new Integer[n];
            x=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            Try(0, 0,0);
            for(String s:set) System.out.println(s);
        }
    }
}

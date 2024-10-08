/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J08024 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while(!q.isEmpty()){
                int a=q.poll();
                if(a%n==0){
                    System.out.println(a);
                    break;
                }
                q.add(a*10);
                q.add(a*10+9);
            }
        }
    }
}

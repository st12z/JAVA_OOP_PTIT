/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList();
            q.add("6");
            q.add("8");
            List<String> list = new ArrayList<>();
            while(!q.isEmpty()){
                String x=q.poll();
                if(x.length()<=n) list.add(x);
                else break;
                q.add(x+"6");
                q.add(x+"8");
            }
            System.out.println(list.size());
            
            for(int i=list.size()-1;i>=0;i--) System.out.print(list.get(i)+" ");
            System.out.println("");
        }
    }
}

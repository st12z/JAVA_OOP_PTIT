/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author T
 */
public class J08022 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Stack<Integer> st =new Stack();
            int res[]=new int[n];
            res[n-1]=-1;
            st.push(n-1);
            for(int i=n-2;i>=0;i--){
                while(!st.isEmpty() && a[i]>=a[st.peek()]) st.pop();
                if(st.isEmpty()){
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }
                st.push(i);
            }
            for(int i=0;i<n;i++){
                if(res[i]!=-1) System.out.print(a[res[i]]+" ");
                else System.out.print(res[i]+" ");
            }
            System.out.println("");
        }
    }
}

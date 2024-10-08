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
public class J02017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st = new Stack();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(st.size()==0){
                st.push(a[i]);
            }
            else{
                int x=st.peek();
                if((x+a[i])%2==0){
                    st.pop();
                }
                else{
                    st.push(a[i]);
                }
            }
        }
        System.out.println(st.size());
    }
}

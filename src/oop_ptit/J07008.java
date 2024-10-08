/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07008 {
    static ArrayList<String> res=new  ArrayList<>();
    static int a[];
    static int n;
    static int x[];
    public static void in(int k){
        String s="";
        for(int i=0;i<=k;i++){
            s=s+x[i]+" ";
        }
        res.add(s);
    }
    public static void Try(int i,int cur){
        for(int j=cur;j<n;j++){
            if(i==0){
                x[i]=a[j];
                Try(i+1,j+1);
            }
            else{
                if(a[j]>x[i-1]){
                    x[i]=a[j];
                    in(i);
                    Try(i+1, j+1);
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/oop_ptit/DAYSO.in");
        Scanner sc = new Scanner(f);
        n = sc.nextInt();
        a=new int[n];
        x=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Try(0,0);
        Collections.sort(res);
        for(String s:res){
            System.out.println(s);
        }
    }
}

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
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n-1;i++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if(map.containsKey(x)==false){
                map.put(x, 1);
            }
            else{
                int fre =map.get(x);
                map.put(x, fre+1);
            }
            if(map.containsKey(y)==false){
                map.put(y, 1);
            }
            else{
                int fre =map.get(y);
                map.put(y, fre+1);
            }
        }
        int check=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==n-1){
                check=1;
            }
        }
        if(check==1) System.out.println("Yes");
        else System.out.println("No");
    }
}

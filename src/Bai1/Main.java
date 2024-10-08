/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.*;
import java.io.*;
/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Diem> list = new ArrayList<>();
        double minV=11.0,maxV=-1.0;
        for(int i=0;i<n;i++){
            double x=sc.nextDouble();
            if(x>maxV){
                maxV=x;
            }
            if(x<minV){
                minV=x;
            }
            Diem a = new Diem(x);
            list.add(a);
        }
        double average=0;
        int cnt=0;
        for(Diem x:list){
            if(x.getValue()!=minV && x.getValue()!=maxV){
                average+=x.getValue();
                cnt+=1;
            }
        }
        System.out.printf("%.02f",average/cnt);
    }
}

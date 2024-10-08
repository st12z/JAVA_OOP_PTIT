/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J05081 {
    public static class MatHang implements Comparable<MatHang>{
        private String ma,ten,donVi;
        private int giaMua,giaBan;
        private int profit;
        public MatHang(int index, String ten, String donVi, int giaMua, int giaBan) {
            String cs=index+"";
            while(cs.length()<3){
                cs="0"+cs;
            }
            this.ma ="MH"+cs;
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            profit=giaBan-giaMua;
        }

        @Override
        public int compareTo(MatHang o) {
           if(this.profit!=o.profit){
               return o.profit-this.profit;
           }
           return this.ma.compareTo(o.ma);
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+donVi+" "+giaMua+" "+giaBan+" "+profit;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MatHang(i+1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(MatHang x:list){
            System.out.println(x);
        }
    }
}

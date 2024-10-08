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
class BangDiem implements Comparable<BangDiem>{
    private String ma,ten;
    private int diemLT,diemTH,diemThi;
    private double average;
    private String xepLoai;
    private static int cnt=1;
    public BangDiem(String ten, int diemLT, int diemTH,int diemThi) {
        this.ma =String.format("SV%02d", cnt++);
        ten =ten.trim().toLowerCase();
        String a[]=ten.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            res+=a[i];
            if(i!=a.length-1) res+=" ";
        }
        this.ten = res;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.average = (diemLT*0.25+diemTH*0.35+diemThi*0.4);
        if(this.average>8) this.xepLoai="GIOI";
        else if(this.average>=6.5 && this.average<8) this.xepLoai="KHA";
        else if(this.average >=5 && this.average<6.5) this.xepLoai="TRUNG BINH";
        else{
            this.xepLoai="KEM";
        }
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.average <o.average) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.2f", average)+" "+xepLoai;
    }
    
}
public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("src/oop_ptit/BANGDIEM.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<BangDiem> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new BangDiem(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(BangDiem x:list){
            System.out.println(x);
        }
    }
          
}

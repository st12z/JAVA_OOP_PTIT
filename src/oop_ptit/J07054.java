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
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class MonHoc implements Comparable<MonHoc>{
    private String ma,ten;
    private double diemOOP,diemCplus,diemC;
    private double average;
    private int xepLoai;
    private static int cnt=1;
    public MonHoc(String ten, double diemOOP, double diemCplus, double diemC) {
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
        this.diemOOP = diemOOP;
        this.diemCplus = diemCplus;
        this.diemC = diemC;
        this.average=(diemOOP*3+diemCplus*3+diemC*2)/8;
    }

    public void setXepLoai(int xepLoai) {
        this.xepLoai = xepLoai;
    }

    public double getAverage() {
        return average;
    }

    public int getXepLoai() {
        return xepLoai;
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.2f", average)+" "+xepLoai;
    }

    @Override
    public int compareTo(MonHoc o) {
        if (this.average!=o.average){
            if(this.average<o.average) return 1;
            return -1;
        }
        return this.ma.compareTo(o.ma);
    }
    
}
public class J07054 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("src/oop_ptit/BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MonHoc(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        list.get(0).setXepLoai(1);
        for(int i=1;i<n;i++){
            if(list.get(i).getAverage()==list.get(i-1).getAverage()){
                list.get(i).setXepLoai(list.get(i-1).getXepLoai());
            }
            else{
                list.get(i).setXepLoai(i+1);
              
            }
        }
        for(MonHoc x:list){
            System.out.println(x);
        }
    }
}

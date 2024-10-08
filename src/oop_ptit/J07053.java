/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author T
 */
class ThiSinh_J07053{
    private String ma,ten,namSinh;
    private double diemLT,diemTH;
    private int tuoi;
    private static int cnt=1;
    private double diemThuong;
    private double total;
    private String xepLoai;
    public ThiSinh_J07053(String ten, String namSinh, double diemLT, double diemTH) {
        this.ma = String.format("PH%02d", cnt++);
        ten =ten.trim().toLowerCase();
        String a[]=ten.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            res+=a[i];
            if(i!=a.length-1) res+=" ";
        }
        this.ten = res;
        this.namSinh = namSinh;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.tuoi =2021- Integer.parseInt(namSinh.substring(namSinh.lastIndexOf("/")+1));
        if(diemLT>=8 && diemTH>=8) this.diemThuong=1;
        else if(diemLT>=7.5 && diemTH>=7.5) this.diemThuong=0.5;
        else{
            this.diemThuong=0;
        }
        total=Math.round((diemLT+diemTH)/2+diemThuong);
        total =total>10?10:total;
        if(total<5) this.xepLoai="Truot";
        else if(total >=5 && total<=6) this.xepLoai="Trung binh";
        else if(total==7) this.xepLoai="Kha";
        else if(total==8) this.xepLoai="Gioi";
        else{
            this.xepLoai="Xuat sac";
        }
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+tuoi+" "+(int)total+" "+xepLoai;
    }
    
   
}
public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/XETTUYEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println(new ThiSinh_J07053(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
    }
}

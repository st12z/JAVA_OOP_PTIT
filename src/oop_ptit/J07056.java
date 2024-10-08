/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class TienDien implements Comparable<TienDien>{
    private String ma,ten;
    private String hoGD;
    private int first,last;
    private int tienDM,tienVuotDM;
    private double VAT;
    private static int cnt=1;
    private int soDien;
    private int dinhMuc;
    private double total;
    public TienDien(String ten, String hoGD, int first, int last) {
        this.ma =String.format("KH%02d", cnt++);
        ten =ten.trim().toLowerCase();
        String a[]=ten.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            res+=a[i];
            if(i!=a.length-1) res+=" ";
        }
        this.ten = res;
        this.hoGD = hoGD;
        this.first = first;
        this.last = last;
        this.soDien = last-first;
        if(hoGD.equals("A")){
            dinhMuc=100;
        }
        else if(hoGD.equals("B")) dinhMuc=500;
        else dinhMuc=200;
        this.tienDM = soDien<dinhMuc ? soDien*450:450*dinhMuc;
        this.tienVuotDM=soDien>dinhMuc?(soDien-dinhMuc)*1000:0;
        this.VAT =0.05*tienVuotDM;
        this.total =this.total==(int)(tienDM+tienVuotDM+VAT)?(int)(tienDM+tienVuotDM+VAT):(tienDM+tienVuotDM+VAT);
    }

    @Override
    public int compareTo(TienDien o) {
        if(this.total <o.total) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+tienDM+" "+tienVuotDM+" "+(int)VAT+" "+(int)total;
    }
    
}
public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<TienDien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String s[]= sc.nextLine().split("\\s+");
            list.add(new TienDien(ten, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }
        Collections.sort(list);
        for(TienDien x:list){
            System.out.println(x);
        }
    }
}

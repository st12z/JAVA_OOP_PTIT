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
class Student implements Comparable<Student>{
    private String ma,ten,danToc,area;
    private double diemThi;
    private double total;
    private String status;
    private static int cnt=1;
    private double plus;
    public Student(String ten, double diemThi, String danToc, String area) {
        this.ma =String.format("TS%02d", cnt++);
        ten =ten.trim().toLowerCase();
        String a[]=ten.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            res+=a[i];
            if(i!=a.length-1) res+=" ";
        }
        this.ten = res;
        this.danToc = danToc;
        this.area = area;
        this.diemThi = diemThi;
        if(area.equals("1")) plus=1.5;
        else if(area.equals("2")) plus=1;
        if(danToc.equals("Kinh")==false) plus+=1.5;
        this.total=diemThi+plus;
        if(total>=20.5) this.status="Do";
        else{
            this.status="Truot";
        }
    }

    @Override
    public int compareTo(Student o) {
        if(this.total <o.total) return 1;
        if(this.total>o.total) return -1;
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.1f", total)+" "+status;
    }
    
}
public class J07057 {
     public static void main(String[] args) throws FileNotFoundException {
         Scanner sc = new Scanner(new File("src/oop_ptit/THISINH.in"));
         int n = Integer.parseInt(sc.nextLine());
         List<Student> list = new ArrayList<>();
         for(int i=0;i<n;i++){
             list.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine()));
         }
         Collections.sort(list);
         for(Student x:list){
             System.out.println(x);
         }
     }
}

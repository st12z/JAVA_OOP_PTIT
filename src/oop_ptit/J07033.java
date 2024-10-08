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
class SinhVien_J07033 implements Comparable<SinhVien_J07033> {

    private String msv, ten, lop, email;

    public SinhVien_J07033() {

    }

    public SinhVien_J07033(String msv, String ten, String lop, String email) {
        this.msv = msv;

        String a[]=ten.trim().toLowerCase().split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
        }
        for(int i=0;i<a.length;i++){
            res+=a[i];
            if(i!=a.length-1) res+=" ";
        }
        this.ten=res;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien_J07033 o) {
        return this.msv.compareTo(o.msv);
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }

}

public class J07033 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien_J07033> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien_J07033(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }   
        Collections.sort(list);
        for(SinhVien_J07033 i:list){
            System.out.println(i);
        }
    }
}

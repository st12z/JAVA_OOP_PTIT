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
class SinhVien_J07081 implements Comparable<SinhVien_J07081>{
    private String ma,hoten,soDT,email;
    private String ten,ho,tenDem;
    public SinhVien_J07081(String ma, String ten, String soDT, String email) {
        String a[]=ten.split("\\s+");
        this.ten=a[a.length-1];
        this.ho=a[0];
        this.ma = ma;
        this.hoten = ten;
        this.soDT = soDT;
        this.email = email;
    }

    

    @Override
    public String toString() {
        return ma+" "+hoten+" "+soDT+" "+email;
    }

    @Override
    public int compareTo(SinhVien_J07081 o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(ho)){
                if(this.hoten.equals(o.hoten)) return this.ma.compareTo(o.ma);
                return this.hoten.compareTo(o.hoten);
            }
            return this.ho.compareTo(o.ho);
            
        }
        return this.ten.compareTo(o.ten);
    }
    
}
public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/SINHVIEN.in"));
        int n =Integer.parseInt(sc.nextLine());
        List<SinhVien_J07081> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien_J07081(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(SinhVien_J07081 x:list){
            System.out.println(x);
        }
    }
}

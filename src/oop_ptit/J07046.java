/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class Guest implements Comparable<Guest>{
    private String ma,ten,maPhong;
    private Date ngayDen,ngayDi;
    private long soNgay;
    private static int cnt=1;

    public Guest( String ten, String maPhong, Date ngayDen, Date ngayDi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.soNgay = (ngayDi.getTime()-ngayDen.getTime())/(1000l*60*60*24);
        
    }
    @Override
    
    public String toString(){
        return ma+" "+ten+" "+maPhong+" "+soNgay;
    }

    @Override
    public int compareTo(Guest o) {
        return (int)(-this.soNgay+o.soNgay);
    }
}
public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("src/oop_ptit/KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Guest> list = new ArrayList<>();
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        for(int i=0;i<n;i++){
            list.add(new Guest(sc.nextLine(),sc.nextLine(), date.parse(sc.nextLine()), date.parse(sc.nextLine())));
        }
        Collections.sort(list);
        for(Guest i :list){
            System.out.println(i);
        }
    }
}

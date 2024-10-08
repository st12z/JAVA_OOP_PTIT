/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class J04015 {
    public static class GiaoVien{
        private String maNgach,ten;
        private int luongCB;
        private int phuCap;
        private int bacLuong;
        public GiaoVien(){
            
        }

        public GiaoVien(String maNgach, String ten, int luongCB) {
            this.maNgach = maNgach;
            this.ten = ten;
            this.luongCB = luongCB;
            if(maNgach.charAt(1)=='T') phuCap=2000000;
            else if(maNgach.charAt(1)=='P') phuCap=900000;
            else phuCap=500000;
            
            bacLuong=Integer.parseInt(maNgach.substring(2));
        }
        public int thuNhap(){
            
            return bacLuong*luongCB+phuCap;
            
        }
        public String toString(){
            return maNgach+" "+ten+" "+bacLuong+" "+phuCap+" "+thuNhap();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(a);
    }
}

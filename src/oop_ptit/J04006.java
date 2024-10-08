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
public class J04006 {
    public static class SinhVien{
        private String maSV="B20DCCN001";
        private String ten,lop,namSinh;
        private float gpa;
        public SinhVien(){
            
        }

        public SinhVien(String ten, String lop, String namSinh, float gpa) {
            this.ten = ten;
            this.lop = lop;
            this.namSinh = namSinh;
            this.gpa = gpa;
        }
        public void chuanHoa(){
            if(namSinh.charAt(1)=='/') namSinh="0"+namSinh;
            if(namSinh.charAt(4)=='/'){
                StringBuilder sb = new StringBuilder(namSinh);
                sb.insert(3, '0');
                namSinh=sb.toString();
            }
        }
        @Override
        public String toString() {
            return maSV+" "+ten+" "+lop+" "+namSinh+" "+String.format("%.2f", gpa);
        }
        
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        a.chuanHoa();
        System.out.println(a);
    }
}

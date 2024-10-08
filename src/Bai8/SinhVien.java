/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

/**
 *
 * @author T
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv,ten,lop,email,soDienThoai;

    public SinhVien() {
    }
    
    public SinhVien(String msv, String ten, String lop, String email, String soDienThoai) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.soDienThoai = "0"+soDienThoai;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)){
            return this.msv.compareTo(o.msv);
        }
        return this.lop.compareTo(o.lop);
    }

    @Override
    public String toString() {
        return msv+" "+ten+" "+lop+" "+email+" "+soDienThoai;
    }
    
    
}

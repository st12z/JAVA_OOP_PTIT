/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author T
 */
public class SinhVien {
    private String msv,ten,sdt,email;

    public SinhVien() {
    }

    public String getTen() {
        return ten;
    }
    
    public String getMsv() {
        return msv;
    }
    
    public SinhVien(String msv, String ten, String sdt, String email) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv+" "+ten;
    }
    
}

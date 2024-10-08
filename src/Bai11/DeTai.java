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
public class DeTai {

    private String maDT, gVien, tenDT;
    public String getTenDT() {
        return tenDT;
    }
    
    public DeTai() {
    }

    public DeTai(int maDT, String gVien, String tenDT) {
        this.maDT = String.format("DT%03d", maDT);
        this.gVien = gVien;
        this.tenDT = tenDT;
    }

    public String getMaDT() {
        return maDT;
    }

    @Override
    public String toString() {
        return tenDT + " " + gVien;
    }

}

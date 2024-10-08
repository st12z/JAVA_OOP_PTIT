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
public class HoiDong {

    private String msv, maDT,maHD;
    public HoiDong () {
    }

    public String getMsv() {
        return msv;
    }

    public String getMaDT() {
        return maDT;
    }

    public String getMaHD() {
        return maHD;
    }
    
    public HoiDong(String msv, String maDT, String maHD) {
        this.msv = msv;
        this.maDT = maDT;
        this.maHD = maHD;
    }

    @Override
    public String toString() {
        return msv+" "+maDT+" "+maHD;
    }

   

    
}

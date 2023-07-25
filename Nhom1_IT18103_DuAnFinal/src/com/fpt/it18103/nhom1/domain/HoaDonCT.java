/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;


/**
 *
 * @author admin
 */
public class HoaDonCT {

    private HoaDon hd;
    private ChiTietSP ctsp;
    private int soLuong;
    private float donGia;

    public HoaDonCT() {
    }

    public HoaDonCT(int soLuong, float donGia) {
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDonCT(HoaDon hd, ChiTietSP ctsp, int soLuong, float donGia) {
        this.hd = hd;
        this.ctsp = ctsp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    
    

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public ChiTietSP getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSP ctsp) {
        this.ctsp = ctsp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonCT{" + "hd=" + hd + ", ctsp=" + ctsp + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.viewmodel;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.HoaDon;


/**
 *
 * @author admin
 */
public class ViewModelHoaDonCT {

    private HoaDon hoaDon;
    private ChiTietSP ctsp;
    private int soLuong;
    private float donGia;
    private float tongTien;

    public ViewModelHoaDonCT() {
    }

    public ViewModelHoaDonCT(HoaDon hoaDon, ChiTietSP ctsp, int soLuong, float donGia, float tongTien) {
        this.hoaDon = hoaDon;
        this.ctsp = ctsp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tongTien = tongTien;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
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

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.viewmodel;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.HoaDon;

/**
 *
 * @author Admin
 */
public class ViewModelGioHangThanhToan {

    private HoaDon hd;
    private ChiTietSP ctsp;
    private int soLuong;
    private float donGia;
    private float thanhTien;

    public ViewModelGioHangThanhToan() {
    }

    public ViewModelGioHangThanhToan(HoaDon hd, ChiTietSP ctsp, int soLuong, float donGia, float thanhTien) {
        this.hd = hd;
        this.ctsp = ctsp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
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

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

}

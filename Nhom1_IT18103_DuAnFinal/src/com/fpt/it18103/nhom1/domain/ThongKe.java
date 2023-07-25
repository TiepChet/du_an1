/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class ThongKe {

    private HoaDon hd;
    private NhanVien nv;
    private KhachHang kh;
    private HoaDonCT hdct;
    
    public ThongKe() {
    }

    public ThongKe(HoaDon hd, NhanVien nv, KhachHang kh, HoaDonCT hdct) {
        this.hd = hd;
        this.nv = nv;
        this.kh = kh;
        this.hdct = hdct;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public HoaDonCT getHdct() {
        return hdct;
    }

    public void setHdct(HoaDonCT hdct) {
        this.hdct = hdct;
    }

}

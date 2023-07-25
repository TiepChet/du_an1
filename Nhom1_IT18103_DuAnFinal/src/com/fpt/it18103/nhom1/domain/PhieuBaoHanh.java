/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class PhieuBaoHanh {

    private int id;
    private KhachHang kh;
    private ChiTietSP ctsp;
    private String ngayBatDau;
    private String ngayKetThuc;

    public PhieuBaoHanh() {
    }

    public PhieuBaoHanh(int id, KhachHang kh, ChiTietSP ctsp, String ngayBatDau, String ngayKetThuc) {
        this.id = id;
        this.kh = kh;
        this.ctsp = ctsp;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public PhieuBaoHanh(KhachHang kh, ChiTietSP ctsp, String ngayBatDau, String ngayKetThuc) {
        this.kh = kh;
        this.ctsp = ctsp;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public ChiTietSP getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSP ctsp) {
        this.ctsp = ctsp;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

}

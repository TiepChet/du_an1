/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author admin
 */
public class HoaDon {

    private String ID;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHD;
    private String ngayTao;
    private boolean trangThai;
    private String sdt;

    public HoaDon() {
    }

    public HoaDon(String ID, KhachHang khachHang, NhanVien nhanVien, String maHD, String ngayTao, boolean trangThai, String sdt) {
        this.ID = ID;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.sdt = sdt;
    }

    public HoaDon(String maHD, String ngayTao) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
    }

    

    public HoaDon(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}

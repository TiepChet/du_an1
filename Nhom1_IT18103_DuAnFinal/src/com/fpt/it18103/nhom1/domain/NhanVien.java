/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id;
    private String maNV;
    private String tenNV;
    private boolean gioiTinh;
    private String tenCV;
    private String email;
    private String queQuan;
    private String ngaySinh;
    private String taiKhoan;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(int id, String maNV, String tenNV, boolean gioiTinh, String tenCV, String email, String queQuan, String ngaySinh, String taiKhoan, String matKhau) {
        this.id = id;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.tenCV = tenCV;
        this.email = email;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public NhanVien(String maNV, String tenNV, boolean gioiTinh, String tenCV, String email, String queQuan, String ngaySinh, String taiKhoan, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.tenCV = tenCV;
        this.email = email;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public NhanVien(String matKhau) {
        this.matKhau = matKhau;
    }

   
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public  Object[] toDataRow(){
        return new Object[]{maNV,tenNV, gioiTinh==true?"Nam":"Nữ",ngaySinh,tenCV,queQuan,email,taiKhoan,matKhau};
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class GiamGia {

    private int id;
    private String maGiamGia;
    private String tenGiamGia;
    private String ngayBatDau;
    private String ngayKetThuc;
    private float soTienGiam;

    public GiamGia() {
    }

    public GiamGia(int id, String maGiamGia, String tenGiamGia, String ngayBatDau, String ngayKetThuc, float soTienGiam) {
        this.id = id;
        this.maGiamGia = maGiamGia;
        this.tenGiamGia = tenGiamGia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soTienGiam = soTienGiam;
    }

    public GiamGia(String maGiamGia, String tenGiamGia, String ngayBatDau, String ngayKetThuc, float soTienGiam) {
        this.maGiamGia = maGiamGia;
        this.tenGiamGia = tenGiamGia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soTienGiam = soTienGiam;
    }

    public GiamGia(String tenGiamGia) {
        this.tenGiamGia = tenGiamGia;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getTenGiamGia() {
        return tenGiamGia;
    }

    public void setTenGiamGia(String tenGiamGia) {
        this.tenGiamGia = tenGiamGia;
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

    public float getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(float soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

}

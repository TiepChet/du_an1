/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class SanPhamGiamGia {

    private int id;
    private ChiTietSP ctsp;
    private GiamGia giamGia;

    public SanPhamGiamGia() {
    }

    public SanPhamGiamGia(int id, ChiTietSP ctsp, GiamGia giamGia) {
        this.id = id;
        this.ctsp = ctsp;
        this.giamGia = giamGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ChiTietSP getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSP ctsp) {
        this.ctsp = ctsp;
    }

    public GiamGia getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(GiamGia giamGia) {
        this.giamGia = giamGia;
    }

}

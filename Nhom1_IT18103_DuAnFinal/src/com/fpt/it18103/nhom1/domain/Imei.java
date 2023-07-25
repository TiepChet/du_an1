/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class Imei {

    private int id;
    private String maImei;
    private String imei;
    private ChiTietSP ctsp;
    private boolean trangThai;

    public Imei() {
    }

    public Imei(int id, String maImei, String imei, ChiTietSP ctsp, boolean trangThai) {
        this.id = id;
        this.maImei = maImei;
        this.imei = imei;
        this.ctsp = ctsp;
        this.trangThai = trangThai;
    }

    public Imei(String maImei, String imei, ChiTietSP ctsp, boolean trangThai) {
        this.maImei = maImei;
        this.imei = imei;
        this.ctsp = ctsp;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaImei() {
        return maImei;
    }

    public void setMaImei(String maImei) {
        this.maImei = maImei;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public ChiTietSP getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSP ctsp) {
        this.ctsp = ctsp;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}

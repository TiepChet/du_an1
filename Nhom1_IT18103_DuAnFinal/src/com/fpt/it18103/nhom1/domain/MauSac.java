/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class MauSac {
    
    private int id;
    private String maMS;
    private String tenMS;

    public MauSac() {
    }

    public MauSac(int id, String maMS, String tenMS) {
        this.id = id;
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    public MauSac(String maMS, String tenMS) {
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaMS() {
        return maMS;
    }

    public void setMaMS(String maMS) {
        this.maMS = maMS;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class Chip {

    private int id;
    private String maChip;
    private String tenChip;

    public Chip() {
    }

    public Chip(int id, String maChip, String tenChip) {
        this.id = id;
        this.maChip = maChip;
        this.tenChip = tenChip;
    }

    public Chip(String maChip, String tenChip) {
        this.maChip = maChip;
        this.tenChip = tenChip;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaChip() {
        return maChip;
    }

    public void setMaChip(String maChip) {
        this.maChip = maChip;
    }

    public String getTenChip() {
        return tenChip;
    }

    public void setTenChip(String tenChip) {
        this.tenChip = tenChip;
    }

}

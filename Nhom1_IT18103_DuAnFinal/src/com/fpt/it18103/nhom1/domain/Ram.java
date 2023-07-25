/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class Ram {

    private int id;
    private String maRam;
    private String dungLuong;

    public Ram() {
    }

    public Ram(int id, String maRam, String dungLuong) {
        this.id = id;
        this.maRam = maRam;
        this.dungLuong = dungLuong;
    }

    public Ram(String maRam, String dungLuong) {
        this.maRam = maRam;
        this.dungLuong = dungLuong;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaRam() {
        return maRam;
    }

    public void setMaRam(String maRam) {
        this.maRam = maRam;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

}

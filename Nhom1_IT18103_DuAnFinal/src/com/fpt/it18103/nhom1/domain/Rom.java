/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class Rom {
    
     private int id;
    private String maRom;
    private String tenRom; 

    public Rom() {
    }

    public Rom(int id, String maRom, String tenRom) {
        this.id = id;
        this.maRom = maRom;
        this.tenRom = tenRom;
    }

    public Rom(String maRom, String tenRom) {
        this.maRom = maRom;
        this.tenRom = tenRom;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaRom() {
        return maRom;
    }

    public void setMaRom(String maRom) {
        this.maRom = maRom;
    }

    public String getTenRom() {
        return tenRom;
    }

    public void setTenRom(String tenRom) {
        this.tenRom = tenRom;
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class Pin {
     private int id;
    private String maPin;
    private String tenPin; 

    public Pin() {
    }

    public Pin(int id, String maPin, String tenPin) {
        this.id = id;
        this.maPin = maPin;
        this.tenPin = tenPin;
    }

    public Pin(String maPin, String tenPin) {
        this.maPin = maPin;
        this.tenPin = tenPin;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPin() {
        return maPin;
    }

    public void setMaPin(String maPin) {
        this.maPin = maPin;
    }

    public String getTenPin() {
        return tenPin;
    }

    public void setTenPin(String tenPin) {
        this.tenPin = tenPin;
    }
    
    
}

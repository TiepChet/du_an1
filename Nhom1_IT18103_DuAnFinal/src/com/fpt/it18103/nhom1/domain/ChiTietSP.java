/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.domain;

/**
 *
 * @author Admin
 */
public class ChiTietSP {
    private int id;
    private String maSP;
    private String tenSP;
    private float donGia;
    private String moTa;
    private String anhURL;
    private MauSac ms;
    private HangDienThoai hang;
    private Chip chip;
    private Ram ram;
    private Rom rom;
    private Pin pin;
    private int soLuong;

    public ChiTietSP() {
    }

    public ChiTietSP(int id, String maSP, String tenSP, float donGia, String moTa, String anhURL, MauSac ms, HangDienThoai hang, Chip chip, Ram ram, Rom rom, Pin pin, int soLuong) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.moTa = moTa;
        this.anhURL = anhURL;
        this.ms = ms;
        this.hang = hang;
        this.chip = chip;
        this.ram = ram;
        this.rom = rom;
        this.pin = pin;
        this.soLuong = soLuong;
    }

    public ChiTietSP(String maSP, String tenSP, float donGia, String moTa, String anhURL, MauSac ms, HangDienThoai hang, Chip chip, Ram ram, Rom rom, Pin pin, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.moTa = moTa;
        this.anhURL = anhURL;
        this.ms = ms;
        this.hang = hang;
        this.chip = chip;
        this.ram = ram;
        this.rom = rom;
        this.pin = pin;
        this.soLuong = soLuong;
    }

    public ChiTietSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    

    public ChiTietSP(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public ChiTietSP(int id) {
        this.id = id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnhURL() {
        return anhURL;
    }

    public void setAnhURL(String anhURL) {
        this.anhURL = anhURL;
    }

    public MauSac getMs() {
        return ms;
    }

    public void setMs(MauSac ms) {
        this.ms = ms;
    }

    public HangDienThoai getHang() {
        return hang;
    }

    public void setHang(HangDienThoai hang) {
        this.hang = hang;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}

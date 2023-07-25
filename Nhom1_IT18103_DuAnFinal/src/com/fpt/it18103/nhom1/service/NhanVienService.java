/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.NhanVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface NhanVienService {
    
    List<NhanVien> getAll();
    
    List<NhanVien> searchTen(String ten);
    
    String addNhanVien(NhanVien nv);
    
    String deleteNhanVien(String ma);
    
    String updateNhanVien(NhanVien nv, String ma);
    
    NhanVien getOne(String tenNV);
    
    NhanVien getOneTK(String taiKhoan);

    String doiMK(NhanVien nv, String tk);
}


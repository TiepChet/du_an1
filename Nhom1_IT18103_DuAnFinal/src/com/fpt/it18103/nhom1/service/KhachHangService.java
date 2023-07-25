/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.KhachHang;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface KhachHangService {
    List<KhachHang> getAll();
    
     KhachHang getOne(String tenKH);
     
     String add(KhachHang kh);
     
     String delete(String ma);
     
     String update(KhachHang kh, String ma);
     
      List<KhachHang> searchTen(String tenKH);
    
}

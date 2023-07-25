/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ChiTietSanPhamService {

    ChiTietSP getOneTen(String ten);

    List<ChiTietSP> getAll();

    String add(ChiTietSP chiTietSP);

    String update(ChiTietSP chiTietSP, String maSP);

    String delete(String maSP);
    
    List<ChiTietSP> searchTen(String tenSP) ;
    
 
}

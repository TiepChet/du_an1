/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.HangDienThoai;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface HangDienThoaiService {
      List<HangDienThoai> getall();
     
     String add(HangDienThoai hangDienThoai);
     
     String update(HangDienThoai hangDienThoai, String maHang);
     
     String delete(String maHang);
             
     HangDienThoai getOne(String tenHang);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.HoaDon;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface HoaDonService {
     List<HoaDon> getAll() ;
     
     String add(HoaDon vmhd) ;
     
     String updateThanhToan(String ma);
     
     List<HoaDon> daThanhToan();
     
     List<HoaDon> chuaThanhToan();
     
      List<HoaDon> sortASC();
      
      List<HoaDon> sortDESC();
      
      List<HoaDon> timKiemKhoang(String min, String max);
      
      List<HoaDon> searchMa(String maHD);
}

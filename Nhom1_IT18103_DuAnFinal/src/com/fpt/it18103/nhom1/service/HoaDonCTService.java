/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.HoaDonCT;
import com.fpt.it18103.nhom1.viewmodel.ViewModelGioHangThanhToan;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface HoaDonCTService {

    List<HoaDonCT> getAll();

    String add(HoaDonCT hdct);

    List<HoaDonCT> getHDCT(String idHD);

    List<ViewModelGioHangThanhToan> getData();

    List<ViewModelGioHangThanhToan> searchMa(String ma);

}

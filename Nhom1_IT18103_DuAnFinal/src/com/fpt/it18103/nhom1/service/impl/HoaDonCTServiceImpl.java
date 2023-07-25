/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.HoaDonCT;
import com.fpt.it18103.nhom1.repository.HoaDonChiTietRepositon;
import com.fpt.it18103.nhom1.service.HoaDonCTService;
import com.fpt.it18103.nhom1.viewmodel.ViewModelGioHangThanhToan;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonCTServiceImpl implements HoaDonCTService {

    private HoaDonChiTietRepositon hoaDonChiTietRepositona = new HoaDonChiTietRepositon();

    @Override
    public List<HoaDonCT> getAll() {
        return hoaDonChiTietRepositona.getAll();
    }

    @Override
    public String add(HoaDonCT hdct) {
        boolean add = hoaDonChiTietRepositona.add(hdct);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public List<HoaDonCT> getHDCT(String idHD) {
        return hoaDonChiTietRepositona.getHDCT(idHD);
    }

    @Override
    public List<ViewModelGioHangThanhToan> getData() {
        return hoaDonChiTietRepositona.getData();
    }

    @Override
    public List<ViewModelGioHangThanhToan> searchMa(String ma) {
        return hoaDonChiTietRepositona.searchMa(ma);
    }

}

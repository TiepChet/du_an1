/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.HoaDon;
import com.fpt.it18103.nhom1.repository.HoaDonReposition;
import com.fpt.it18103.nhom1.service.HoaDonService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonReposition hoaDonReposition = new HoaDonReposition();

    @Override
    public List<HoaDon> getAll() {
        return hoaDonReposition.getAll();
    }

    @Override
    public String add(HoaDon vmhd) {
        boolean add = hoaDonReposition.add(vmhd);
        if(add){
            return "Tạo Hóa Đơn Thành Công";
        }else{
            return "Tạo Hóa Đơn Thất Bại";
        }
    }

    @Override
    public String updateThanhToan(String ma) {
        boolean update = hoaDonReposition.updateThanhToan(ma);
        if(update){
            return "Thanh Toan Thanh Cong";
        }else{
            return "Thanh Toan That Bai";
        }
    }

    @Override
    public List<HoaDon> daThanhToan() {
        return hoaDonReposition.daThanhToan();
    }

    @Override
    public List<HoaDon> chuaThanhToan() {
        return hoaDonReposition.chuaThanhToan();
    }

    @Override
    public List<HoaDon> sortASC() {
        return hoaDonReposition.sortASC();
    }

    @Override
    public List<HoaDon> sortDESC() {return hoaDonReposition.sortDESC();
    }

    @Override
    public List<HoaDon> timKiemKhoang(String min, String max) {
        return hoaDonReposition.timKiemKhoang(min, max);
    }

    @Override
    public List<HoaDon> searchMa(String maHD) {
        return hoaDonReposition.searchMa(maHD);
    }

}

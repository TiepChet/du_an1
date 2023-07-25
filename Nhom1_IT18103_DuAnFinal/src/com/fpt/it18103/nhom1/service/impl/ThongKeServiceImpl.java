/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.ThongKe;
import com.fpt.it18103.nhom1.repository.ThongKeRepository;
import com.fpt.it18103.nhom1.service.ThongKeService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeServiceImpl implements ThongKeService {

    private ThongKeRepository thongKe = new ThongKeRepository();

    @Override
    public List<ThongKe> getAll() {
        return thongKe.getAll();
    }

    @Override
    public List<ThongKe> sortNgayTao() {
        return thongKe.sortNgayTao();
    }

    @Override
    public List<ThongKe> searchThoiGian(String tuNgay, String denNgay) {
        return thongKe.searchThoiGian(tuNgay, denNgay);
    }

}

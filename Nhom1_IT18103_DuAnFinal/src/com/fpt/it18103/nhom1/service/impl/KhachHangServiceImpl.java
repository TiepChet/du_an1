/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.repository.KhachHangRepository;
import com.fpt.it18103.nhom1.service.KhachHangService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.getAll();
    }

    @Override
    public KhachHang getOne(String tenKH) {
        return khachHangRepository.getOne(tenKH);
    }

    @Override
    public String add(KhachHang kh) {
        boolean add = khachHangRepository.add(kh);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = khachHangRepository.delete(ma);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }

    }

    @Override
    public String update(KhachHang kh, String ma) {
        boolean update = khachHangRepository.update(kh, ma);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public List<KhachHang> searchTen(String tenKH) {
        return khachHangRepository.searchTen(tenKH);
    }
}

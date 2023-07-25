/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.repository.ChiTietSanPhamRepository;
import com.fpt.it18103.nhom1.service.ChiTietSanPhamService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChiTietSPServiceImpl implements ChiTietSanPhamService {

    private ChiTietSanPhamRepository chiTietSanPhamRepository = new ChiTietSanPhamRepository();

    @Override
    public ChiTietSP getOneTen(String ten) {
        return chiTietSanPhamRepository.getOneTen(ten);
    }

    @Override
    public List<ChiTietSP> getAll() {
        return chiTietSanPhamRepository.getAll();
    }

    @Override
    public String add(ChiTietSP chiTietSP) {
        boolean add = chiTietSanPhamRepository.add(chiTietSP);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(ChiTietSP chiTietSP, String maSP) {
        boolean update = chiTietSanPhamRepository.update(chiTietSP, maSP);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maSP) {
        boolean delete = chiTietSanPhamRepository.delete(maSP);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public List<ChiTietSP> searchTen(String tenSP) {
        return chiTietSanPhamRepository.searchTen(tenSP);
    }


}

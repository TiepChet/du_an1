/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.HangDienThoai;
import com.fpt.it18103.nhom1.repository.HangRepository;
import com.fpt.it18103.nhom1.service.HangDienThoaiService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HanDienThoaiServiceImpl implements HangDienThoaiService {

    private HangRepository hangRepository = new HangRepository();

    @Override
    public List<HangDienThoai> getall() {
        return hangRepository.getall();
    }

    @Override
    public String add(HangDienThoai hangDienThoai) {
        boolean add = hangRepository.add(hangDienThoai);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(HangDienThoai hangDienThoai, String maHang) {
        boolean update = hangRepository.update(hangDienThoai, maHang);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maHang) {
        boolean delete = hangRepository.delete(maHang);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public HangDienThoai getOne(String tenHang) {
        return hangRepository.getOne(tenHang);
    }

}

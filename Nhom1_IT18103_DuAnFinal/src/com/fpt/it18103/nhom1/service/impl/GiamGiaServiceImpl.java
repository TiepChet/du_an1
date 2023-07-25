/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.GiamGia;
import com.fpt.it18103.nhom1.repository.GiamGiaRepository;
import com.fpt.it18103.nhom1.service.GiamGiaService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GiamGiaServiceImpl implements GiamGiaService {

    private GiamGiaRepository giamGiaRepository = new GiamGiaRepository();

    @Override
    public List<GiamGia> getall() {
        return giamGiaRepository.getall();
    }

    @Override
    public GiamGia getOne(String tenGiamGia) {
        return giamGiaRepository.getOne(tenGiamGia);
    }

    @Override
    public String add(GiamGia giamGia) {
        boolean add = giamGiaRepository.add(giamGia);
        if (add) {
            return "Tạo phiếu giảm thành công";
        } else {
            return "Thất Bại";
        }
    }

    @Override
    public String update(GiamGia giamGia, String maGiamGia) {
        boolean update = giamGiaRepository.update(giamGia, maGiamGia);
        if (update) {
            return "Thay đổi thông tin phiếu giảm thành công";
        } else {
            return "Thất Bại";
        }
    }

    @Override
    public String delete(String maGiamGia) {
        boolean delete = giamGiaRepository.delete(maGiamGia);
        if (delete) {
            return "Loại bỏ phiếu giảm thành công";
        } else {
            return "Thất Bại";
        }
    }

    @Override
    public GiamGia getMa(String ma) {
        return giamGiaRepository.getMa(ma);
    }

}

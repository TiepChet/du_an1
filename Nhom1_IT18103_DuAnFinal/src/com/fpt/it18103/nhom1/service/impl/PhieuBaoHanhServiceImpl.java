/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.PhieuBaoHanh;
import com.fpt.it18103.nhom1.repository.PhieuBaoHanhRepository;
import java.util.List;
import com.fpt.it18103.nhom1.service.PhieuBaoHanhService;

/**
 *
 * @author Admin
 */
public class PhieuBaoHanhServiceImpl implements PhieuBaoHanhService {

    private PhieuBaoHanhRepository pbhreBaoHanhRepository = new PhieuBaoHanhRepository();

    @Override
    public List<PhieuBaoHanh> getall() {
        return pbhreBaoHanhRepository.getall();
    }

    @Override
    public String add(PhieuBaoHanh pbh) {
        boolean add = pbhreBaoHanhRepository.add(pbh);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(PhieuBaoHanh pbh, int id) {
        boolean update = pbhreBaoHanhRepository.update(pbh, id);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(int id) {
        boolean delete = pbhreBaoHanhRepository.delete(id);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

}

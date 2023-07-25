/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.Ram;
import com.fpt.it18103.nhom1.repository.RamRepository;
import com.fpt.it18103.nhom1.service.RamService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class RamServiceImpl implements RamService {

    private RamRepository ramRepository = new RamRepository();

    @Override
    public List<Ram> getall() {
        return ramRepository.getall();
    }

    @Override
    public String add(Ram ram) {
        boolean add = ramRepository.add(ram);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Ram ram, String maRam) {
        boolean update = ramRepository.update(ram, maRam);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maRam) {
        boolean delete = ramRepository.delete(maRam);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public Ram getOne(String dungLuong) {
        return ramRepository.getOne(dungLuong);
    }

}

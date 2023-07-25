/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.Chip;
import com.fpt.it18103.nhom1.repository.ChipRepository;
import com.fpt.it18103.nhom1.service.ChipService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChipServiceImpl implements ChipService {

    private ChipRepository chipRepository = new ChipRepository();

    @Override
    public List<Chip> getall() {
        return chipRepository.getall();
    }

    @Override
    public String add(Chip chip) {
        boolean add = chipRepository.add(chip);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Chip chip, String maChip) {
        boolean update = chipRepository.update(chip, maChip);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maChip) {
        boolean delete = chipRepository.delete(maChip);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public Chip getOne(String tenChip) {
        return chipRepository.getOne(tenChip);
    }

}

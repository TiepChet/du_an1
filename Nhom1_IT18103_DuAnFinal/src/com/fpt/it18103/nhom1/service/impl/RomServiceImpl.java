/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.Rom;
import com.fpt.it18103.nhom1.repository.RomRepository;
import com.fpt.it18103.nhom1.service.RomService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class RomServiceImpl implements RomService {

    private RomRepository romRepository = new RomRepository();

    @Override
    public List<Rom> getAll() {
        return romRepository.getall();
    }

    @Override
    public String add(Rom rom) {
        boolean add = romRepository.add(rom);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Rom rom, String maRom) {
        boolean update = romRepository.update(rom, maRom);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maRom) {
        boolean delete = romRepository.delete(maRom);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public Rom getOne(String tenRom) {
        return romRepository.getOne(tenRom);
    }

}

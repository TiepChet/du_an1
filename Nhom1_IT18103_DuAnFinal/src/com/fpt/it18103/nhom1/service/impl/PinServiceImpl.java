/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.Pin;
import com.fpt.it18103.nhom1.repository.PinRepository;
import com.fpt.it18103.nhom1.service.PinService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PinServiceImpl implements PinService {

    private PinRepository pinRepository = new PinRepository();

    @Override
    public List<Pin> getAll() {
        return pinRepository.getall();
    }

    @Override
    public String add(Pin pin) {
        boolean add = pinRepository.add(pin);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Pin pin, String maPin) {
        boolean update = pinRepository.update(pin, maPin);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maPin) {
        boolean delete = pinRepository.delete(maPin);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public Pin getOne(String tenPin) {
        return pinRepository.getOne(tenPin);
    }

}

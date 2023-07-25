/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.MauSac;
import com.fpt.it18103.nhom1.repository.MauSacRepository;
import com.fpt.it18103.nhom1.service.MauSacService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MauSacServiceImpl implements MauSacService {

    private MauSacRepository mauSacRepository = new MauSacRepository();

    @Override
    public List<MauSac> getall() {
        return mauSacRepository.getall();
    }

    @Override
    public String add(MauSac ms) {
        boolean add = mauSacRepository.add(ms);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(MauSac ms, String maMS) {
        boolean update = mauSacRepository.update(ms, maMS);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maMS) {
        boolean delete = mauSacRepository.delete(maMS);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public MauSac getOne(String tenMS) {
        return mauSacRepository.getOne(tenMS);
    }

}

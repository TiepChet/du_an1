/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.Imei;
import com.fpt.it18103.nhom1.repository.ImeiRepository;
import com.fpt.it18103.nhom1.service.ImeiService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ImeiServiceImpl implements ImeiService {

    private ImeiRepository imeiRepository = new ImeiRepository();

    @Override
    public List<Imei> getall() {
        return imeiRepository.getall();
    }

    @Override
    public Imei getOne(String soImei) {
        return imeiRepository.getOne(soImei);
    }

    @Override
    public String add(Imei imei) {
        boolean add = imeiRepository.add(imei);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(Imei imei, String maImei) {
        boolean update = imeiRepository.update(imei, maImei);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String maImei) {
        boolean delete = imeiRepository.delete(maImei);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

}

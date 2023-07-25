/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.SanPhamGiamGia;
import com.fpt.it18103.nhom1.repository.SanPhamBanHangRepository;
import com.fpt.it18103.nhom1.repository.SanPhamGiamGiaRepository;
import com.fpt.it18103.nhom1.service.SanPhamGiamGiaService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamGiamGiaServiceImpl implements SanPhamGiamGiaService {

    private SanPhamGiamGiaRepository sp = new SanPhamGiamGiaRepository();

    @Override
    public List<SanPhamGiamGia> getAll() {
        return sp.getAll();
    }

}

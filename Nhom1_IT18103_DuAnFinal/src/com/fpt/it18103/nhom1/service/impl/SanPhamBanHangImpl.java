/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.repository.SanPhamBanHangRepository;
import com.fpt.it18103.nhom1.service.SanPhamBanHang;
import com.fpt.it18103.nhom1.viewmodel.ViewModelSanPham;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamBanHangImpl implements SanPhamBanHang {

    private SanPhamBanHangRepository sprp = new SanPhamBanHangRepository();

    @Override
    public List<ViewModelSanPham> getAll() {
        return sprp.getAll();
    }

    @Override
    public List<ViewModelSanPham> searchMa(String maSP) {
        return sprp.searchMa(maSP);

    }

}

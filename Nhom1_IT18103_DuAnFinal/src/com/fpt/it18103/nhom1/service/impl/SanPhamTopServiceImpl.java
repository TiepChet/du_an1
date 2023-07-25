/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.repository.SanPhamTopRepository;
import com.fpt.it18103.nhom1.service.SanPhamTopService;
import com.fpt.it18103.nhom1.viewmodel.ViewModelSP;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamTopServiceImpl implements SanPhamTopService{

    private SanPhamTopRepository spTop = new SanPhamTopRepository();

    @Override
    public List<ViewModelSP> top3() {
return spTop.top3();    }

    @Override
    public List<ViewModelSP> search(int soLuong) {
return spTop.search(soLuong);    }


}

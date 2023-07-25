/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.viewmodel.ViewModelSP;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface SanPhamTopService {
    List<ViewModelSP> top3();
    
    List<ViewModelSP> search(int soLuong);
}

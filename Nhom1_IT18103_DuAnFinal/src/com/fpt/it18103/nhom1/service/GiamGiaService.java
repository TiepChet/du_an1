/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.GiamGia;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface GiamGiaService {

    List<GiamGia> getall();

    GiamGia getOne(String tenGiamGia);

    String add(GiamGia giamGia);

    String update(GiamGia giamGia, String maGiamGia);

    String delete(String maGiamGia);
    
     GiamGia getMa(String ma);
}

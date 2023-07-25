/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.Imei;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ImeiService {

    List<Imei> getall();

    Imei getOne(String soImei);
    
    String add(Imei imei);
    
    String update(Imei imei, String maImei);
    
    String delete(String maImei);
}

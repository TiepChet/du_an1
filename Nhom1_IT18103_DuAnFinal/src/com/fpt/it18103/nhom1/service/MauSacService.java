/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.MauSac;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MauSacService {
     List<MauSac> getall();
     
     String add(MauSac ms);
     
     String update(MauSac ms, String maMS);
     
     String delete(String maMS);
             
     MauSac getOne(String tenMS);
}

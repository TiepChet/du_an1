/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.Rom;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface RomService {
    
      List<Rom> getAll();

    String add(Rom rom);

    String update(Rom rom, String maRom);

    String delete(String maRom);

    Rom getOne(String tenRom);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.Chip;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ChipService {
    List<Chip> getall();
     
     String add(Chip chip);
     
     String update(Chip chip, String maChip);
     
     String delete(String maChip);
             
     Chip getOne(String tenChip);
}

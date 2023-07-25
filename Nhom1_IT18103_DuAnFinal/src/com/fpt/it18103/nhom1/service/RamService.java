/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.Ram;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface RamService {

    List<Ram> getall();

    String add(Ram ram);

    String update(Ram ram, String maRam);

    String delete(String maRam);

    Ram getOne(String dungLuong);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fpt.it18103.nhom1.service;

import com.fpt.it18103.nhom1.domain.Pin;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PinService {

    List<Pin> getAll();

    String add(Pin pin);

    String update(Pin pin, String maPin);

    String delete(String maPin);

    Pin getOne(String tenPin);
}

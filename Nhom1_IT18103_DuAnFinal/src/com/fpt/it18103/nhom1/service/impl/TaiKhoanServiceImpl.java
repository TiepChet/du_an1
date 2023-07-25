/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.service.TaiKhoanService;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TaiKhoanServiceImpl implements TaiKhoanService{

    @Override
    public String docFile(List<String> lists) {
  String heThong = System.getProperty("user.dir");
        String path = heThong + "\\docghi.txt";
        String result = "";
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "File khong ton tai";
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            String tk = "";
            while (fis.available() > 0) {
                tk = (String) ois.readObject();
                System.out.println(tk);
                lists.add(tk);
            }
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }        }
    
}

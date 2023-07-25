/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.service.impl;

import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.repository.NhanVienRepository;
import com.fpt.it18103.nhom1.service.NhanVienService;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.getAll();
    }

    @Override
    public List<NhanVien> searchTen(String ten) {
        return nhanVienRepository.searchTen(ten);
    }

    @Override
    public String addNhanVien(NhanVien nv) {
        boolean add = nhanVienRepository.addNhanVien(nv);
        if(add){
            return "add thanh cong";
        }else{
            return "add that bai";
        }
    }

    @Override
    public String deleteNhanVien(String ma) {
        boolean delete = nhanVienRepository.deleteNhanVien(ma);
        if(delete){
            return "delete thanh cong";
        }else{
            return"delete that bai";
        }
    }

    @Override
    public String updateNhanVien(NhanVien nv, String ma) {
        boolean update = nhanVienRepository.updateNhanVien(nv, ma);
        if(update){
            return "update thanh cong";
        }else{
            return "update that bai";
        }
    }

    @Override
    public NhanVien getOne(String tenNV) {
        return nhanVienRepository.getOne(tenNV);
            
    }

    @Override
    public NhanVien getOneTK(String taiKhoan) {
        return nhanVienRepository.getOneTK(taiKhoan);
    }

    @Override
    public String doiMK(NhanVien nv, String tk) {
        boolean update = nhanVienRepository.doiMK(nv, tk);
        if(update){
            return "Đổi mật khẩu thành công";
        }else{
            return "Đổi mật khẩu thất bại";
        }
             
    }

}

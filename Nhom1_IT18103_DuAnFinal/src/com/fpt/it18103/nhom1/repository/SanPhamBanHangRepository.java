/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.util.SQLConnection;
import com.fpt.it18103.nhom1.viewmodel.ViewModelSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamBanHangRepository {

    public List<ViewModelSanPham> getAll() {
        String query = "SELECT MaSP, TenSP, SoLuong, DonGia\n"
                + "FROM     dbo.SanPham";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<ViewModelSanPham> listVMSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ViewModelSanPham vmsp = new ViewModelSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
                listVMSP.add(vmsp);
            }
            return listVMSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<ViewModelSanPham> searchMa(String maSP) {
        String query = "SELECT MaSP, TenSP, SoLuong, DonGia\n"
                + "FROM     dbo.SanPham\n"
                + "WHERE MaSP like ?";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<ViewModelSanPham> listVMSP = new ArrayList<>();
            ps.setObject(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ViewModelSanPham vmsp = new ViewModelSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4));
                listVMSP.add(vmsp);
            }
            return listVMSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}

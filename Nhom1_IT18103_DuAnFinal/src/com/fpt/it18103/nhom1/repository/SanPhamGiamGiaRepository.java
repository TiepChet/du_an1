/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.GiamGia;
import com.fpt.it18103.nhom1.domain.SanPhamGiamGia;
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
public class SanPhamGiamGiaRepository {

    public List<SanPhamGiamGia> getAll() {
        String query = "SELECT dbo.SanPhamGiamGia.Id, dbo.SanPham.TenSP, dbo.GiamGia.TenGiamGia\n"
                + "FROM     dbo.GiamGia INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.GiamGia.Id = dbo.SanPham.Id INNER JOIN\n"
                + "                  dbo.SanPhamGiamGia ON dbo.GiamGia.Id = dbo.SanPhamGiamGia.IdGiamGia AND dbo.SanPham.Id = dbo.SanPhamGiamGia.IdSP";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<SanPhamGiamGia> listSanPhamGiamGia = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP(rs.getString(2));
                GiamGia giamGia = new GiamGia(rs.getString(3));
                SanPhamGiamGia sanPhamGiamGia = new SanPhamGiamGia(rs.getInt(1), ctsp, giamGia);
                listSanPhamGiamGia.add(sanPhamGiamGia);
            }
            return listSanPhamGiamGia;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}

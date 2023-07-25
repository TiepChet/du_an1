/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.domain.PhieuBaoHanh;
import com.fpt.it18103.nhom1.util.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuBaoHanhRepository {

    public List<PhieuBaoHanh> getall() {
        String querry = "SELECT dbo.PhieuBaoHanh.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.KhachHang.SDT, dbo.KhachHang.DiaChi, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.PhieuBaoHanh.NgayBatDau, dbo.PhieuBaoHanh.NgayKetThuc\n"
                + "FROM     dbo.KhachHang INNER JOIN\n"
                + "                  dbo.PhieuBaoHanh ON dbo.KhachHang.Id = dbo.PhieuBaoHanh.IdKH INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.PhieuBaoHanh.IdSP = dbo.SanPham.Id";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<PhieuBaoHanh> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                ChiTietSP ctsp = new ChiTietSP(rs.getString(6), rs.getString(7));
                PhieuBaoHanh phieuBaoHanh = new PhieuBaoHanh(rs.getInt(1), kh, ctsp, rs.getString(8), rs.getString(9));
                list.add(phieuBaoHanh);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(PhieuBaoHanh pbh) {
        String query = "INSERT INTO [dbo].[PhieuBaoHanh]\n"
                + "           ([IdKH]\n"
                + "           ,[IdSP]\n"
                + "           ,[NgayBatDau]\n"
                + "           ,[NgayKetThuc])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, pbh.getKh().getId());
            ps.setObject(2, pbh.getCtsp().getId());
            ps.setObject(3, pbh.getNgayBatDau());
            ps.setObject(4, pbh.getNgayKetThuc());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(PhieuBaoHanh pbh, int id) {
        String query = "UPDATE [dbo].[PhieuBaoHanh]\n"
                + "   SET [IdKH] = ?"
                + "      ,[IdSP] = ?"
                + "      ,[NgayBatDau] = ?"
                + "      ,[NgayKetThuc] = ?"
                + " WHERE Id =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, pbh.getKh().getId());
            ps.setObject(2, pbh.getCtsp().getId());
            ps.setObject(3, pbh.getNgayBatDau());
            ps.setObject(4, pbh.getNgayKetThuc());
            ps.setObject(5, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(int id) {
        String query = "DELETE FROM [dbo].[PhieuBaoHanh]\n"
                + "      WHERE Id =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

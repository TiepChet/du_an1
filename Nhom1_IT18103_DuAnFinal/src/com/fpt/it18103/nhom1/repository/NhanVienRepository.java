/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.util.SQLConnection;
import java.security.interfaces.RSAKey;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVienRepository {

    public List<NhanVien> getAll() {
        String query = "SELECT Id, MaNhanVien, HoTen, GioiTinh, TenCV, Email, QueQuan, NgaySinh, TaiKhoan, MatKhau\n"
                + "FROM     dbo.NhanVien";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<NhanVien> listNhanVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                listNhanVien.add(nv);
            }
            return listNhanVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<NhanVien> searchTen(String ten) {
        String query = "SELECT Id, MaNhanVien, HoTen, GioiTinh, TenCV, Email, QueQuan, NgaySinh, TaiKhoan, MatKhau\n"
                + "FROM     dbo.NhanVien WHERE HoTen = ?";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<NhanVien> listNhanVien = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                listNhanVien.add(nv);
            }
            return listNhanVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean addNhanVien(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([MaNhanVien]\n"
                + "           ,[HoTen]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[TenCV]\n"
                + "           ,[Email]\n"
                + "           ,[QueQuan]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[TaiKhoan]\n"
                + "           ,[MatKhau])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTenNV());
            ps.setObject(3, nv.isGioiTinh());
            ps.setObject(4, nv.getTenCV());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getQueQuan());
            ps.setObject(7, nv.getNgaySinh());
            ps.setObject(8, nv.getTaiKhoan());
            ps.setObject(9, nv.getMatKhau());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean deleteNhanVien(String ma) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE MaNhanVien=?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateNhanVien(NhanVien nv, String ma) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [HoTen] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[TenCV] = ?"
                + "      ,[Email] = ?"
                + "      ,[QueQuan] =?"
                + "      ,[NgaySinh] = ?"
                + "      ,[TaiKhoan] = ?"
                + "      ,[MatKhau] = ?"
                + " WHERE MaNhanVien =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, nv.getTenNV());
            ps.setObject(2, nv.isGioiTinh());
            ps.setObject(3, nv.getTenCV());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getQueQuan());
            ps.setObject(6, nv.getNgaySinh());
            ps.setObject(7, nv.getTaiKhoan());
            ps.setObject(8, nv.getMatKhau());
            ps.setObject(9, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public NhanVien getOne(String tenNV) {
        String query = "SELECT Id, MaNhanVien, HoTen, GioiTinh, TenCV, Email, QueQuan, NgaySinh, TaiKhoan, MatKhau\n"
                + "FROM     dbo.NhanVien WHERE HoTen like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenNV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                return nv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    
     public NhanVien getOneTK(String taiKhoan) {
        String query = "SELECT Id, MaNhanVien, HoTen, GioiTinh, TenCV, Email, QueQuan, NgaySinh, TaiKhoan, MatKhau\n"
                + "FROM     dbo.NhanVien WHERE TaiKhoan like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, taiKhoan);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                return nv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
     
       public boolean doiMK(NhanVien nv, String tk) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [MatKhau] = ?"
                + " WHERE TaiKhoan =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, nv.getMatKhau());
            ps.setObject(2, tk);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.KhachHang;
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
public class KhachHangRepository {

    public List<KhachHang> getAll() {
        String query = "SELECT Id, MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi\n"
                + "FROM     dbo.KhachHang";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<KhachHang> listKhachHang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public KhachHang getOne(String tenKH) {
        String query = "SELECT Id, MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi\n"
                + "FROM     dbo.KhachHang WHERE HoTen like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenKH);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(KhachHang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([MaKH]\n"
                + "           ,[HoTen]\n"
                + "           ,[SDT]\n"
                + "           ,[Email]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[DiaChi])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, kh.getMaKH());
            ps.setObject(2, kh.getTenKH());
            ps.setObject(3, kh.getSdt());
            ps.setObject(4, kh.getEmail());
            ps.setObject(5, kh.isGioiTinh());
            ps.setObject(6, kh.getNgaySinh());
            ps.setObject(7, kh.getDiaChi());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE MaKH like ?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(KhachHang kh, String ma) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [HoTen] =?"
                + "      ,[SDT] = ?"
                + "      ,[Email] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[NgaySinh] = ?"
                + "      ,[DiaChi] = ?"
                + " WHERE MaKH like ?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, kh.getTenKH());
            ps.setObject(2, kh.getSdt());
            ps.setObject(3, kh.getEmail());
            ps.setObject(4, kh.isGioiTinh());
            ps.setObject(5, kh.getNgaySinh());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

      public List<KhachHang> searchTen(String tenKH) {
        String query = "SELECT Id, MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi\n"
                + "FROM     dbo.KhachHang WHERE HoTen like ?";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<KhachHang> listKhachHang = new ArrayList<>();
            ps.setObject(1, tenKH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}

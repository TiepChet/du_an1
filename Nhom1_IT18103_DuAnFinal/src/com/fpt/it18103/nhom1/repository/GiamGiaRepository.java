/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.GiamGia;
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
public class GiamGiaRepository {
    
    public List<GiamGia> getall() {
        String querry = "SELECT Id, MaGiamGia, TenGiamGia, NgayBatDau, NgayKetThuc, SoTienGiam\n"
                + "FROM     dbo.GiamGia";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<GiamGia> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiamGia giamGia = new GiamGia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
                list.add(giamGia);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public GiamGia getOne(String tenGiamGia) {
        String query = "SELECT Id, MaGiamGia, TenGiamGia, NgayBatDau, NgayKetThuc, SoTienGiam\n"
                + "FROM     dbo.GiamGia WHERE TenGiamGia like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenGiamGia);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                GiamGia giamGia = new GiamGia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
                return giamGia;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
     public GiamGia getMa(String ma) {
        String query = "SELECT Id, MaGiamGia, TenGiamGia, NgayBatDau, NgayKetThuc, SoTienGiam\n"
                + "FROM     dbo.GiamGia WHERE MaGiamGia = ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                GiamGia giamGia = new GiamGia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6));
                return giamGia;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public boolean add(GiamGia giamGia) {
        String query = "INSERT INTO [dbo].[GiamGia]\n"
                + "           ([MaGiamGia]\n"
                + "           ,[TenGiamGia]\n"
                + "           ,[NgayBatDau]\n"
                + "           ,[NgayKetThuc]\n"
                + "           ,[SoTienGiam])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, giamGia.getMaGiamGia());
            ps.setObject(2, giamGia.getTenGiamGia());
            ps.setObject(3, giamGia.getNgayBatDau());
            ps.setObject(4, giamGia.getNgayKetThuc());
            ps.setObject(5, giamGia.getSoTienGiam());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
        
    }
    
    public boolean update(GiamGia giamGia, String maGiamGia) {
        String query = "UPDATE [dbo].[GiamGia]\n"
                + "   SET [TenGiamGia] = ?"
                + "      ,[NgayBatDau] = ?"
                + "      ,[NgayKetThuc] = ?"
                + "      ,[SoTienGiam] = ?"
                + " WHERE MaGiamGia =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, giamGia.getTenGiamGia());
            ps.setObject(2, giamGia.getNgayBatDau());
            ps.setObject(3, giamGia.getNgayKetThuc());
            ps.setObject(4, giamGia.getSoTienGiam());
            ps.setObject(5, maGiamGia);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
        
    }
    
    public boolean delete(String maGiamGia) {
        String query = "DELETE FROM [dbo].[GiamGia]\n"
                + "      WHERE MaGiamGia =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maGiamGia);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
        
    }
}

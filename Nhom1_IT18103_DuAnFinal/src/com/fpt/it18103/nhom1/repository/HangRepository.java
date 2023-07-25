/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.HangDienThoai;
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
public class HangRepository {

    public List<HangDienThoai> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaHang]\n"
                + "      ,[TenHang]\n"
                + "  FROM [dbo].[HangDienThoai]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<HangDienThoai> listh = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HangDienThoai ms = new HangDienThoai(rs.getInt(1), rs.getString(2), rs.getString(3));
                listh.add(ms);
            }
            return listh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public HangDienThoai getOne(String tenHang) {
        String query = "SELECT [Id]\n"
                + "      ,[MaHang]\n"
                + "      ,[TenHang]\n"
                + "  FROM [dbo].[HangDienThoai]  WHERE TenHang =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HangDienThoai hang = new HangDienThoai(rs.getInt(1), rs.getString(2), rs.getString(3));
                return hang;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HangDienThoai hangDienThoai) {
        String query = "INSERT INTO [dbo].[HangDienThoai]\n"
                + "           ([MaHang]\n"
                + "           ,[TenHang])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, hangDienThoai.getMaHang());
            ps.setObject(2, hangDienThoai.getTenHang());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(HangDienThoai hangDienThoai, String maHang) {
        String query = "UPDATE [dbo].[HangDienThoai]\n"
                + "   SET [TenHang] = ?"
                + " WHERE MaHang =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, hangDienThoai.getTenHang());
            ps.setObject(2, maHang);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maHang) {
        String query = "DELETE FROM [dbo].[HangDienThoai]\n"
                + "      WHERE MaHang =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maHang);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.Imei;
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
public class ImeiRepository {

    public List<Imei> getall() {
        String querry = "SELECT dbo.Imei.Id, dbo.Imei.MaImei, dbo.Imei.Imei, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.Imei.TrangThai\n"
                + "FROM     dbo.Imei INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.Imei.IdSP = dbo.SanPham.Id";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<Imei> listImei = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP(rs.getString(4), rs.getString(5));
                Imei imei = new Imei(rs.getInt(1), rs.getString(2), rs.getString(3), ctsp, rs.getBoolean(6));
                listImei.add(imei);
            }
            return listImei;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Imei getOne(String soImei) {
        String querry = "SELECT dbo.Imei.Id, dbo.Imei.MaImei, dbo.Imei.Imei, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.Imei.TrangThai\n"
                + "FROM     dbo.Imei INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.Imei.IdSP = dbo.SanPham.Id WHERE Imei =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            ps.setObject(1, soImei);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP(rs.getString(4), rs.getString(5));
                Imei imei = new Imei(rs.getInt(1), rs.getString(2), rs.getString(3), ctsp, rs.getBoolean(6));
                return imei;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Imei imei) {
        String query = "INSERT INTO [dbo].[Imei]\n"
                + "           ([MaImei]\n"
                + "           ,[Imei]\n"
                + "           ,[IdSP]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, imei.getMaImei());
            ps.setObject(2, imei.getImei());
            ps.setObject(3, imei.getCtsp().getId());
            ps.setObject(4, imei.isTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(Imei imei, String maImei) {
        String query = "UPDATE [dbo].[Imei]\n"
                + "   SET [Imei] = ?"
                + "      ,[IdSP] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE MaImei =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, imei.getImei());
            ps.setObject(2, imei.getCtsp().getId());
            ps.setObject(3, imei.isTrangThai());
            ps.setObject(4, maImei);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maImei) {
        String query = "DELETE FROM [dbo].[Imei]\n"
                + "      WHERE MaImei =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maImei);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

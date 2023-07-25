/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.MauSac;
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
public class MauSacRepository {

    public List<MauSac> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaMauSac]\n"
                + "      ,[TenMauSac]\n"
                + "  FROM [dbo].[MauSac]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<MauSac> listms = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getInt(1), rs.getString(2), rs.getString(3));
                listms.add(ms);
            }
            return listms;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public MauSac getOne(String tenMS) {
        String query = "SELECT [Id]\n"
                + "      ,[MaMauSac]\n"
                + "      ,[TenMauSac]\n"
                + "  FROM [dbo].[MauSac] where TenMauSac =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenMS);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                MauSac ms = new MauSac(rs.getInt(1), rs.getString(2), rs.getString(3));
                return ms;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([MaMauSac]\n"
                + "           ,[TenMauSac])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, ms.getMaMS());
            ps.setObject(2, ms.getTenMS());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(MauSac ms, String maMS) {
        String query = "UPDATE [dbo].[MauSac]\n"
                + "   SET [TenMauSac] = ?"
                + " WHERE MaMauSac =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, ms.getTenMS());
            ps.setObject(2, maMS);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maMS) {
        String query = "DELETE FROM [dbo].[MauSac]\n"
                + "      WHERE MaMauSac =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maMS);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

}

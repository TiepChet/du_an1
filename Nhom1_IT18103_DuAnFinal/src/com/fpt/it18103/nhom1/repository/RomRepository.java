/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.Rom;
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
public class RomRepository {

    public List<Rom> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaRom]\n"
                + "      ,[TenRom]\n"
                + "  FROM [dbo].[Rom]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<Rom> listRom = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Rom rom = new Rom(rs.getInt(1), rs.getString(2), rs.getString(3));
                listRom.add(rom);
            }
            return listRom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Rom getOne(String tenRom) {
        String query = "SELECT [Id]\n"
                + "      ,[MaRom]\n"
                + "      ,[TenRom]\n"
                + "  FROM [dbo].[Rom] WHERE TenRom =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenRom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Rom rom = new Rom(rs.getInt(1), rs.getString(2), rs.getString(3));
                return rom;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Rom rom) {
        String query = "INSERT INTO [dbo].[Rom]\n"
                + "           ([MaRom]\n"
                + "           ,[TenRom])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, rom.getMaRom());
            ps.setObject(2, rom.getTenRom());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(Rom rom, String maRom) {
        String query = "UPDATE [dbo].[Rom]\n"
                + "   SET [TenRom] = ?"
                + " WHERE MaRom =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, rom.getTenRom());
            ps.setObject(2, maRom);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maRom) {
        String query = "DELETE FROM [dbo].[Rom]\n"
                + "      WHERE MaRom =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maRom);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

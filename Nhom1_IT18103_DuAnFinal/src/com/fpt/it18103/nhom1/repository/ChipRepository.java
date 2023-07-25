/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.Chip;
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
public class ChipRepository {

    public List<Chip> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaChip]\n"
                + "      ,[TenChip]\n"
                + "  FROM [dbo].[Chip]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<Chip> listChip = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Chip chip = new Chip(rs.getInt(1), rs.getString(2), rs.getString(3));
                listChip.add(chip);
            }
            return listChip;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Chip getOne(String tenChip) {
        String query = "SELECT [Id]\n"
                + "      ,[MaChip]\n"
                + "      ,[TenChip]\n"
                + "  FROM [dbo].[Chip]  WHERE TenChip =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenChip);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Chip chip = new Chip(rs.getInt(1), rs.getString(2), rs.getString(3));
                return chip;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Chip chip) {
        String query = "INSERT INTO [dbo].[Chip]\n"
                + "           ([MaChip]\n"
                + "           ,[TenChip])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, chip.getMaChip());
            ps.setObject(2, chip.getTenChip());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(Chip chip, String maChip) {
        String query = "UPDATE [dbo].[Chip]\n"
                + "   SET [TenChip] = ?"
                + " WHERE MaChip =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, chip.getTenChip());
            ps.setObject(2, maChip);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maChip) {
        String query = "DELETE FROM [dbo].[Chip]\n"
                + "      WHERE MaChip =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maChip);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

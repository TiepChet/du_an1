/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.Chip;
import com.fpt.it18103.nhom1.domain.Ram;
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
public class RamRepository {

    public List<Ram> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaRam]\n"
                + "      ,[DungLuong]\n"
                + "  FROM [dbo].[Ram]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<Ram> listRam = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ram ram = new Ram(rs.getInt(1), rs.getString(2), rs.getString(3));
                listRam.add(ram);
            }
            return listRam;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Ram getOne(String dungLuong) {
        String query = "SELECT [Id]\n"
                + "      ,[MaRam]\n"
                + "      ,[DungLuong]\n"
                + "  FROM [dbo].[Ram]  WHERE DungLuong =?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, dungLuong);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ram ram = new Ram(rs.getInt(1), rs.getString(2), rs.getString(3));
                return ram;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Ram ram) {
        String query = "INSERT INTO [dbo].[Ram]\n"
                + "           ([MaRam]\n"
                + "           ,[DungLuong])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, ram.getMaRam());
            ps.setObject(2, ram.getDungLuong());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(Ram ram, String maRam) {
        String query = "UPDATE [dbo].[Ram]\n"
                + "   SET [DungLuong] = ?"
                + " WHERE MaRam =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, ram.getDungLuong());
            ps.setObject(2, maRam);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maRam) {
        String query = "DELETE FROM [dbo].[Ram]\n"
                + "      WHERE MaRam =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maRam);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

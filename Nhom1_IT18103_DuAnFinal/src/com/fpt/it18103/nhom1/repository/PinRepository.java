/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.Pin;
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
public class PinRepository {

    public List<Pin> getall() {
        String querry = "SELECT [Id]\n"
                + "      ,[MaPin]\n"
                + "      ,[TenPin]\n"
                + "  FROM [dbo].[Pin]";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<Pin> listPin = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pin pin = new Pin(rs.getInt(1), rs.getString(2), rs.getString(3));
                listPin.add(pin);
            }
            return listPin;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pin getOne(String tenPin) {
        String query = "SELECT [Id]\n"
                + "      ,[MaPin]\n"
                + "      ,[TenPin]\n"
                + "  FROM [dbo].[Pin] WHERE TenPin=? ";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenPin);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pin pin = new Pin(rs.getInt(1), rs.getString(2), rs.getString(3));
                return pin;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Pin pin) {
        String query = "INSERT INTO [dbo].[Pin]\n"
                + "           ([MaPin]\n"
                + "           ,[TenPin])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, pin.getMaPin());
            ps.setObject(2, pin.getTenPin());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(Pin pin, String maPin) {
        String query = "UPDATE [dbo].[Pin]\n"
                + "   SET [TenPin] = ?"
                + " WHERE MaPin =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, pin.getTenPin());
            ps.setObject(2, maPin);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maPin) {
        String query = "DELETE FROM [dbo].[Pin]\n"
                + "      WHERE maPin =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maPin);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }
}

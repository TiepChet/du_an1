/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.Chip;
import com.fpt.it18103.nhom1.domain.HangDienThoai;
import com.fpt.it18103.nhom1.domain.MauSac;
import com.fpt.it18103.nhom1.domain.Pin;
import com.fpt.it18103.nhom1.domain.Ram;
import com.fpt.it18103.nhom1.domain.Rom;
import com.fpt.it18103.nhom1.util.SQLConnection;
import com.fpt.it18103.nhom1.viewmodel.ViewModelSP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamTopRepository {
    
    public List<ViewModelSP> top3() {
        String query = "	SELECT dbo.SanPham.Id, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.DonGia, dbo.SanPham.Mota, dbo.SanPham.UrlAnh, dbo.MauSac.MaMauSac, dbo.MauSac.TenMauSac, dbo.HangDienThoai.MaHang, dbo.HangDienThoai.TenHang,\n"
                + "               dbo.Chip.MaChip, dbo.Chip.TenChip, dbo.Ram.MaRam, dbo.Ram.DungLuong, dbo.Rom.MaRom, dbo.Rom.TenRom, dbo.Pin.MaPin, dbo.Pin.TenPin, dbo.SanPham.SoLuong\n"
                + "                  FROM     dbo.Chip INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.Chip.Id = dbo.SanPham.IdChip INNER JOIN\n"
                + "                dbo.MauSac ON dbo.SanPham.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "             dbo.Pin ON dbo.SanPham.IdPin = dbo.Pin.Id INNER JOIN\n"
                + "                       dbo.Ram ON dbo.SanPham.IdRam = dbo.Ram.Id INNER JOIN\n"
                + "                   dbo.Rom ON dbo.SanPham.IdRom = dbo.Rom.Id INNER JOIN \n"
                + "                    dbo.HangDienThoai ON dbo.SanPham.IdHang = dbo.HangDienThoai.Id \n";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelSP> listctsp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(7), rs.getString(8));
                HangDienThoai hang = new HangDienThoai(rs.getString(9), rs.getString(10));
                Chip chip = new Chip(rs.getString(11), rs.getString(12));
                Ram ram = new Ram(rs.getString(13), rs.getString(14));
                Rom rom = new Rom(rs.getString(15), rs.getString(16));
                Pin pin = new Pin(rs.getString(17), rs.getString(18));
                ViewModelSP chiTietSP = new ViewModelSP(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), ms, hang, chip, ram, rom, pin, rs.getInt(19));
                listctsp.add(chiTietSP);
            }
            return listctsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    
       public List<ViewModelSP> search(int soLuong) {
        String query = "	SELECT dbo.SanPham.Id, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.DonGia, dbo.SanPham.Mota, dbo.SanPham.UrlAnh, dbo.MauSac.MaMauSac, dbo.MauSac.TenMauSac, dbo.HangDienThoai.MaHang, dbo.HangDienThoai.TenHang,\n"
                + "               dbo.Chip.MaChip, dbo.Chip.TenChip, dbo.Ram.MaRam, dbo.Ram.DungLuong, dbo.Rom.MaRom, dbo.Rom.TenRom, dbo.Pin.MaPin, dbo.Pin.TenPin, dbo.SanPham.SoLuong\n"
                + "                  FROM     dbo.Chip INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.Chip.Id = dbo.SanPham.IdChip INNER JOIN\n"
                + "                dbo.MauSac ON dbo.SanPham.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "             dbo.Pin ON dbo.SanPham.IdPin = dbo.Pin.Id INNER JOIN\n"
                + "                       dbo.Ram ON dbo.SanPham.IdRam = dbo.Ram.Id INNER JOIN\n"
                + "                   dbo.Rom ON dbo.SanPham.IdRom = dbo.Rom.Id INNER JOIN \n"
                + "                    dbo.HangDienThoai ON dbo.SanPham.IdHang = dbo.HangDienThoai.Id \n"
                + "                    WHERE dbo.SanPham.SoLuong <=?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelSP> listctsp = new ArrayList<>();
            ps.setObject(1, soLuong);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(7), rs.getString(8));
                HangDienThoai hang = new HangDienThoai(rs.getString(9), rs.getString(10));
                Chip chip = new Chip(rs.getString(11), rs.getString(12));
                Ram ram = new Ram(rs.getString(13), rs.getString(14));
                Rom rom = new Rom(rs.getString(15), rs.getString(16));
                Pin pin = new Pin(rs.getString(17), rs.getString(18));
                ViewModelSP chiTietSP = new ViewModelSP(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), ms, hang, chip, ram, rom, pin, rs.getInt(19));
                listctsp.add(chiTietSP);
            }
            return listctsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}

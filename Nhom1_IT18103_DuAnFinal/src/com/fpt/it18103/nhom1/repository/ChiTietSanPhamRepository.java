/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.Chip;
import com.fpt.it18103.nhom1.domain.HangDienThoai;
import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.domain.MauSac;
import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.domain.Pin;
import com.fpt.it18103.nhom1.domain.Ram;
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
public class ChiTietSanPhamRepository {

    public ChiTietSP getOneTen(String ten) {
        String query = "SELECT dbo.SanPham.Id, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.DonGia, dbo.SanPham.Mota, dbo.SanPham.UrlAnh, dbo.MauSac.MaMauSac, dbo.MauSac.TenMauSac, dbo.HangDienThoai.MaHang, dbo.HangDienThoai.TenHang,\n"
                + "                  dbo.Chip.MaChip, dbo.Chip.TenChip, dbo.Ram.MaRam, dbo.Ram.DungLuong, dbo.Rom.MaRom, dbo.Rom.TenRom, dbo.Pin.MaPin, dbo.Pin.TenPin, dbo.SanPham.SoLuong\n"
                + "FROM     dbo.Chip INNER JOIN\n"
                + "     dbo.SanPham ON dbo.Chip.Id = dbo.SanPham.IdChip INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.SanPham.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "dbo.Pin ON dbo.SanPham.IdPin = dbo.Pin.Id INNER JOIN\n"
                + "                  dbo.Ram ON dbo.SanPham.IdRam = dbo.Ram.Id INNER JOIN\n"
                + "               dbo.Rom ON dbo.SanPham.IdRom = dbo.Rom.Id INNER JOIN \n"
                + "			   dbo.HangDienThoai ON dbo.SanPham.IdHang = dbo.HangDienThoai.Id WHERE dbo.SanPham.TenSP =? ";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(7), rs.getString(8));
                HangDienThoai hang = new HangDienThoai(rs.getString(9), rs.getString(10));
                Chip chip = new Chip(rs.getString(11), rs.getString(12));
                Ram ram = new Ram(rs.getString(13), rs.getString(14));
                Rom rom = new Rom(rs.getString(15), rs.getString(16));
                Pin pin = new Pin(rs.getString(17), rs.getString(18));
                ChiTietSP chiTietSP = new ChiTietSP(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), ms, hang, chip, ram, rom, pin, rs.getInt(19));
                return chiTietSP;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<ChiTietSP> getAll() {
        String query = "SELECT dbo.SanPham.Id, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.DonGia, dbo.SanPham.Mota, dbo.SanPham.UrlAnh, dbo.MauSac.MaMauSac, dbo.MauSac.TenMauSac, dbo.HangDienThoai.MaHang, dbo.HangDienThoai.TenHang,\n"
                + "                  dbo.Chip.MaChip, dbo.Chip.TenChip, dbo.Ram.MaRam, dbo.Ram.DungLuong, dbo.Rom.MaRom, dbo.Rom.TenRom, dbo.Pin.MaPin, dbo.Pin.TenPin, dbo.SanPham.SoLuong\n"
                + "FROM     dbo.Chip INNER JOIN\n"
                + "     dbo.SanPham ON dbo.Chip.Id = dbo.SanPham.IdChip INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.SanPham.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "dbo.Pin ON dbo.SanPham.IdPin = dbo.Pin.Id INNER JOIN\n"
                + "                  dbo.Ram ON dbo.SanPham.IdRam = dbo.Ram.Id INNER JOIN\n"
                + "               dbo.Rom ON dbo.SanPham.IdRom = dbo.Rom.Id INNER JOIN \n"
                + "			   dbo.HangDienThoai ON dbo.SanPham.IdHang = dbo.HangDienThoai.Id";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSP> listctsp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(7), rs.getString(8));
                HangDienThoai hang = new HangDienThoai(rs.getString(9), rs.getString(10));
                Chip chip = new Chip(rs.getString(11), rs.getString(12));
                Ram ram = new Ram(rs.getString(13), rs.getString(14));
                Rom rom = new Rom(rs.getString(15), rs.getString(16));
                Pin pin = new Pin(rs.getString(17), rs.getString(18));
                ChiTietSP chiTietSP = new ChiTietSP(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), ms, hang, chip, ram, rom, pin, rs.getInt(19));
                listctsp.add(chiTietSP);
            }
            return listctsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(ChiTietSP chiTietSP) {
        String query = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([MaSP]\n"
                + "           ,[TenSP]\n"
                + "           ,[DonGia]\n"
                + "           ,[Mota]\n"
                + "           ,[UrlAnh]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdHang]\n"
                + "           ,[IdChip]\n"
                + "           ,[IdRam]\n"
                + "           ,[IdRom]\n"
                + "           ,[IdPin]\n"
                + "           ,[SoLuong])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, chiTietSP.getMaSP());
            ps.setObject(2, chiTietSP.getTenSP());
            ps.setObject(3, chiTietSP.getDonGia());
            ps.setObject(4, chiTietSP.getMoTa());
            ps.setObject(5, chiTietSP.getAnhURL());
            ps.setObject(6, chiTietSP.getMs().getId());
            ps.setObject(7, chiTietSP.getHang().getId());
            ps.setObject(8, chiTietSP.getChip().getId());
            ps.setObject(9, chiTietSP.getRam().getId());
            ps.setObject(10, chiTietSP.getRom().getId());
            ps.setObject(11, chiTietSP.getPin().getId());
            ps.setObject(12, chiTietSP.getSoLuong());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update(ChiTietSP chiTietSP, String maSP) {
        String query = "UPDATE [dbo].[SanPham]\n"
                + "   SET [TenSP] = ?"
                + "      ,[DonGia] = ?"
                + "      ,[Mota] = ?"
                + "      ,[UrlAnh] = ?"
                + "      ,[IdMauSac] = ?"
                + "      ,[IdHang] = ?"
                + "      ,[IdChip] = ?"
                + "      ,[IdRam] = ?"
                + "      ,[IdRom] = ?"
                + "      ,[IdPin] = ?"
                + "      ,[SoLuong] = ?"
                + " WHERE MaSP =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, chiTietSP.getTenSP());
            ps.setObject(2, chiTietSP.getDonGia());
            ps.setObject(3, chiTietSP.getMoTa());
            ps.setObject(4, chiTietSP.getAnhURL());
            ps.setObject(5, chiTietSP.getMs().getId());
            ps.setObject(6, chiTietSP.getHang().getId());
            ps.setObject(7, chiTietSP.getChip().getId());
            ps.setObject(8, chiTietSP.getRam().getId());
            ps.setObject(9, chiTietSP.getRom().getId());
            ps.setObject(10, chiTietSP.getPin().getId());
            ps.setObject(11, chiTietSP.getSoLuong());
            ps.setObject(12, maSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maSP) {
        String query = "DELETE FROM [dbo].[SanPham]\n"
                + "      WHERE MaSP =?";
        int check = 0;
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {

            ps.setObject(1, maSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<ChiTietSP> searchTen(String tenSP) {
        String query = "SELECT dbo.SanPham.Id, dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.DonGia, dbo.SanPham.Mota, dbo.SanPham.UrlAnh, dbo.MauSac.MaMauSac, dbo.MauSac.TenMauSac, dbo.HangDienThoai.MaHang, dbo.HangDienThoai.TenHang,\n"
                + "                  dbo.Chip.MaChip, dbo.Chip.TenChip, dbo.Ram.MaRam, dbo.Ram.DungLuong, dbo.Rom.MaRom, dbo.Rom.TenRom, dbo.Pin.MaPin, dbo.Pin.TenPin, dbo.SanPham.SoLuong\n"
                + "FROM     dbo.Chip INNER JOIN\n"
                + "     dbo.SanPham ON dbo.Chip.Id = dbo.SanPham.IdChip INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.SanPham.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "dbo.Pin ON dbo.SanPham.IdPin = dbo.Pin.Id INNER JOIN\n"
                + "                  dbo.Ram ON dbo.SanPham.IdRam = dbo.Ram.Id INNER JOIN\n"
                + "               dbo.Rom ON dbo.SanPham.IdRom = dbo.Rom.Id INNER JOIN \n"
                + "			   dbo.HangDienThoai ON dbo.SanPham.IdHang = dbo.HangDienThoai.Id WHERE dbo.SanPham.TenSP like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<ChiTietSP> listctsp = new ArrayList<>();
            ps.setObject(1, "%" + tenSP + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(7), rs.getString(8));
                HangDienThoai hang = new HangDienThoai(rs.getString(9), rs.getString(10));
                Chip chip = new Chip(rs.getString(11), rs.getString(12));
                Ram ram = new Ram(rs.getString(13), rs.getString(14));
                Rom rom = new Rom(rs.getString(15), rs.getString(16));
                Pin pin = new Pin(rs.getString(17), rs.getString(18));
                ChiTietSP chiTietSP = new ChiTietSP(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), ms, hang, chip, ram, rom, pin, rs.getInt(19));
                listctsp.add(chiTietSP);
            }
            return listctsp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

  
}

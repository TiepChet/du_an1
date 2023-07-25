/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.HoaDon;
import com.fpt.it18103.nhom1.domain.HoaDonCT;
import com.fpt.it18103.nhom1.util.SQLConnection;
import com.fpt.it18103.nhom1.viewmodel.ViewModelGioHangThanhToan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class HoaDonChiTietRepositon {

    public List<HoaDonCT> getAll() {
        String query = "SELECT dbo.HoaDon.Id, dbo.SanPham.Id AS Expr1, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.HoaDonChiTiet.IdSP = dbo.SanPham.Id";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            List<HoaDonCT> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1));
                ChiTietSP ctsp = new ChiTietSP(rs.getInt(2));
                HoaDonCT vmhdct = new HoaDonCT(hd, ctsp, rs.getInt(3), rs.getFloat(4));
                list.add(vmhdct);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDonCT hdct) {
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([IdHD]\n"
                + "           ,[IdSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hdct.getHd().getID());
            ps.setObject(2, hdct.getCtsp().getId());
            ps.setObject(3, hdct.getSoLuong());
            ps.setObject(4, hdct.getDonGia());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<HoaDonCT> getHDCT(String idHD) {
        String query = "SELECT dbo.HoaDon.Id, dbo.SanPham.Id AS Expr1, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.HoaDonChiTiet.IdSP = dbo.SanPham.Id\n"
                + "				  WHERE dbo.HoaDon.Id like ?";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idHD);
            ResultSet rs = ps.executeQuery();
            List<HoaDonCT> list = new ArrayList<>();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1));
                ChiTietSP ctsp = new ChiTietSP(rs.getInt(2));
                HoaDonCT vmhdct = new HoaDonCT(hd, ctsp, rs.getInt(3), rs.getFloat(4));
                list.add(vmhdct);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<ViewModelGioHangThanhToan> getData() {
        String query = "SELECT dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao,dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, (dbo.HoaDonChiTiet.SoLuong * dbo.HoaDonChiTiet.DonGia) as'ThanhTien'\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.HoaDonChiTiet.IdSP = dbo.SanPham.Id";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<ViewModelGioHangThanhToan> list = new ArrayList<>();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2));
                ChiTietSP ctsp = new ChiTietSP(rs.getString(3), rs.getString(4));
                ViewModelGioHangThanhToan vmghtt = new ViewModelGioHangThanhToan(hd, ctsp, rs.getInt(5), rs.getFloat(6), rs.getFloat(7));
                list.add(vmghtt);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<ViewModelGioHangThanhToan> searchMa(String ma) {
        String query = "SELECT dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao,dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, (dbo.HoaDonChiTiet.SoLuong * dbo.HoaDonChiTiet.DonGia) as'ThanhTien'\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.HoaDonChiTiet.IdSP = dbo.SanPham.Id  WHERE dbo.HoaDon.MaHD =?";
        try (Connection conn = SQLConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            List<ViewModelGioHangThanhToan> list = new ArrayList<>();
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2));
                ChiTietSP ctsp = new ChiTietSP(rs.getString(3), rs.getString(4));
                ViewModelGioHangThanhToan vmghtt = new ViewModelGioHangThanhToan(hd, ctsp, rs.getInt(5), rs.getFloat(6), rs.getFloat(7));
                list.add(vmghtt);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}

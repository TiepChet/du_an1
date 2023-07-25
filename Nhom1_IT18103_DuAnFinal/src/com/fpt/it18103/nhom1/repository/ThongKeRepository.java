/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.HoaDon;
import com.fpt.it18103.nhom1.domain.HoaDonCT;
import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.domain.ThongKe;
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
public class ThongKeRepository {

    public List<ThongKe> getAll() {
        String querry = "SELECT dbo.HoaDon.MaHD,dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen, dbo.KhachHang.HoTen AS Expr1, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao,(HoaDonChiTiet.SoLuong * HoaDonChiTiet.DonGia)as'thanh iten'\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<ThongKe> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(7));
                NhanVien nv = new NhanVien(rs.getString(2), rs.getString(3));
                KhachHang kh = new KhachHang(rs.getString(4));
                HoaDonCT hdct = new HoaDonCT(rs.getInt(5), rs.getFloat(6));
                ThongKe tk = new ThongKe(hd, nv, kh, hdct);
                list.add(tk);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    public List<ThongKe> sortNgayTao() {
        String querry = "SELECT dbo.HoaDon.MaHD,dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen, dbo.KhachHang.HoTen AS Expr1, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao,(HoaDonChiTiet.SoLuong * HoaDonChiTiet.DonGia)as'thanh iten'\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id order by  dbo.HoaDon.NgayTao desc ";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<ThongKe> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(7));
                NhanVien nv = new NhanVien(rs.getString(2), rs.getString(3));
                KhachHang kh = new KhachHang(rs.getString(4));
                HoaDonCT hdct = new HoaDonCT(rs.getInt(5), rs.getFloat(6));
                ThongKe tk = new ThongKe(hd, nv, kh, hdct);
                list.add(tk);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public List<ThongKe> searchThoiGian(String tuNgay, String denNgay) {
        String querry = "SELECT dbo.HoaDon.MaHD,dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen, dbo.KhachHang.HoTen AS Expr1, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao,(HoaDonChiTiet.SoLuong * HoaDonChiTiet.DonGia)as'thanh iten'\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id where dbo.HoaDon.NgayTao between ? and ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(querry)) {
            List<ThongKe> list = new ArrayList<>();
            ps.setObject(1, tuNgay);
            ps.setObject(2, denNgay);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(7));
                NhanVien nv = new NhanVien(rs.getString(2), rs.getString(3));
                KhachHang kh = new KhachHang(rs.getString(4));
                HoaDonCT hdct = new HoaDonCT(rs.getInt(5), rs.getFloat(6));
                ThongKe tk = new ThongKe(hd, nv, kh, hdct);
                list.add(tk);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

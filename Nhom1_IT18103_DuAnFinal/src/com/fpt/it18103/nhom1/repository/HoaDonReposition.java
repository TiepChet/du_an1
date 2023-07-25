/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.it18103.nhom1.repository;

import com.fpt.it18103.nhom1.domain.HoaDon;
import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.util.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class HoaDonReposition {

    public List<HoaDon> getAll() {
        String query = "SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDon vmhd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([Id]\n"
                + "           ,[IdKH]\n"
                + "           ,[IdNV]\n"
                + "           ,[MaHD]\n"
                + "           ,[NgayTao]\n"
                + "           ,[TrangThai]\n"
                + "           ,[Sdt])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, vmhd.getID());
            ps.setObject(2, vmhd.getKhachHang().getId());
            ps.setObject(3, vmhd.getNhanVien().getId());
            ps.setObject(4, vmhd.getMaHD());
            ps.setObject(5, vmhd.getNgayTao());
            ps.setObject(6, vmhd.isTrangThai());
            ps.setObject(7, vmhd.getSdt());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateThanhToan(String ma) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TrangThai] = 1"
                + " WHERE MaHD like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<HoaDon> daThanhToan() {
        String query = "SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id WHERE dbo.HoaDon.TrangThai =1 ";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> chuaThanhToan() {
        String query = "SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id WHERE dbo.HoaDon.TrangThai =0 ";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> sortASC() {
        String query = "  SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "              FROM     dbo.HoaDon INNER JOIN\n"
                + "             dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "          dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id order by dbo.HoaDon.NgayTao ASC";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> sortDESC() {
        String query = "  SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "              FROM     dbo.HoaDon INNER JOIN\n"
                + "             dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "          dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id order by dbo.HoaDon.NgayTao DESC";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> timKiemKhoang(String min, String max) {
        String query = "  SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "              FROM     dbo.HoaDon INNER JOIN\n"
                + "             dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "          dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id WHERE NgayTao between ? and ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> searchMa(String maHD) {
        String query = "SELECT dbo.HoaDon.Id, dbo.KhachHang.MaKH, dbo.KhachHang.HoTen, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen AS Expr1, dbo.HoaDon.MaHD, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai, dbo.HoaDon.Sdt\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id WHERE dbo.HoaDon.MaHD like ?";
        try (Connection con = SQLConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDon> listHD = new ArrayList<>();
            ps.setObject(1, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hd = new HoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}

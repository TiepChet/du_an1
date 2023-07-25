/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fpt.it18103.nhom1.view;

import com.fpt.it18103.nhom1.domain.ChiTietSP;
import com.fpt.it18103.nhom1.domain.Chip;
import com.fpt.it18103.nhom1.domain.GiamGia;
import com.fpt.it18103.nhom1.domain.HangDienThoai;
import com.fpt.it18103.nhom1.domain.HoaDon;
import com.fpt.it18103.nhom1.domain.HoaDonCT;
import com.fpt.it18103.nhom1.domain.Imei;
import com.fpt.it18103.nhom1.domain.KhachHang;
import com.fpt.it18103.nhom1.domain.MauSac;
import com.fpt.it18103.nhom1.domain.NhanVien;
import com.fpt.it18103.nhom1.domain.PhieuBaoHanh;
import com.fpt.it18103.nhom1.domain.Pin;
import com.fpt.it18103.nhom1.domain.Ram;
import com.fpt.it18103.nhom1.domain.Rom;
import com.fpt.it18103.nhom1.domain.SanPhamGiamGia;
import com.fpt.it18103.nhom1.domain.ThongKe;
import com.fpt.it18103.nhom1.service.ChiTietSanPhamService;
import com.fpt.it18103.nhom1.service.ChipService;
import com.fpt.it18103.nhom1.service.GiamGiaService;
import com.fpt.it18103.nhom1.service.HangDienThoaiService;
import com.fpt.it18103.nhom1.service.HoaDonCTService;
import com.fpt.it18103.nhom1.service.HoaDonService;
import com.fpt.it18103.nhom1.service.ImeiService;

import com.fpt.it18103.nhom1.service.KhachHangService;
import com.fpt.it18103.nhom1.service.MauSacService;
import com.fpt.it18103.nhom1.service.NhanVienService;
import com.fpt.it18103.nhom1.service.PhieuBaoHanhService;
import com.fpt.it18103.nhom1.service.PinService;
import com.fpt.it18103.nhom1.service.RamService;
import com.fpt.it18103.nhom1.service.RomService;
import com.fpt.it18103.nhom1.service.SanPhamBanHang;
import com.fpt.it18103.nhom1.service.SanPhamGiamGiaService;
import com.fpt.it18103.nhom1.service.SanPhamTopService;
import com.fpt.it18103.nhom1.service.TaiKhoanService;
import com.fpt.it18103.nhom1.service.ThongKeService;
import com.fpt.it18103.nhom1.service.impl.ChiTietSPServiceImpl;
import com.fpt.it18103.nhom1.service.impl.ChipServiceImpl;
import com.fpt.it18103.nhom1.service.impl.GiamGiaServiceImpl;
import com.fpt.it18103.nhom1.service.impl.HanDienThoaiServiceImpl;
import com.fpt.it18103.nhom1.service.impl.HoaDonCTServiceImpl;
import com.fpt.it18103.nhom1.service.impl.HoaDonServiceImpl;
import com.fpt.it18103.nhom1.service.impl.ImeiServiceImpl;

import com.fpt.it18103.nhom1.service.impl.KhachHangServiceImpl;
import com.fpt.it18103.nhom1.service.impl.MauSacServiceImpl;
import com.fpt.it18103.nhom1.service.impl.NhanVienServiceImpl;
import com.fpt.it18103.nhom1.service.impl.PhieuBaoHanhServiceImpl;
import com.fpt.it18103.nhom1.service.impl.PinServiceImpl;
import com.fpt.it18103.nhom1.service.impl.RamServiceImpl;
import com.fpt.it18103.nhom1.service.impl.RomServiceImpl;
import com.fpt.it18103.nhom1.service.impl.SanPhamBanHangImpl;
import com.fpt.it18103.nhom1.service.impl.SanPhamGiamGiaServiceImpl;
import com.fpt.it18103.nhom1.service.impl.SanPhamTopServiceImpl;
import com.fpt.it18103.nhom1.service.impl.TaiKhoanServiceImpl;
import com.fpt.it18103.nhom1.service.impl.ThongKeServiceImpl;
import com.fpt.it18103.nhom1.viewmodel.ViewModelGioHang;
import com.fpt.it18103.nhom1.viewmodel.ViewModelGioHangThanhToan;
import com.fpt.it18103.nhom1.viewmodel.ViewModelSP;

import com.fpt.it18103.nhom1.viewmodel.ViewModelSanPham;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.lowagie.text.pdf.PdfName;
import com.sun.mail.imap.protocol.BODY;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.security.auth.x500.X500Principal;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.poifs.crypt.CipherAlgorithm;

/**
 *
 * @author Admin
 */
public class ViewSanPham extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private int page = 0;
    private int totalRow = 0;
    private int totalPage = 0;
    private int itemPerPage = 2;
    private int start = 0;

    Color bgColo = new Color(0, 0, 102);

    private DefaultTableModel dtm = new DefaultTableModel();
    private List<NhanVien> listNhanVien = new ArrayList<>();
    private NhanVienService nhanVienService = new NhanVienServiceImpl();

    private DefaultTableModel dtmSPBH = new DefaultTableModel();
    private List<ViewModelSanPham> listVMSP = new ArrayList<>();
    private SanPhamBanHang spbh = new SanPhamBanHangImpl();

    private DefaultTableModel dtmGH = new DefaultTableModel();
    private List<ViewModelGioHang> listVMGH = new ArrayList<>();

    private List<String> taiKhoan = new ArrayList<>();
    private TaiKhoanService tks = new TaiKhoanServiceImpl();

    private List<KhachHang> listKhachHang = new ArrayList<>();
    private KhachHangService khachHangService = new KhachHangServiceImpl();

    private ChiTietSanPhamService chiTietSanPhamService = new ChiTietSPServiceImpl();

    private DefaultTableModel dtmHD = new DefaultTableModel();
    private List<HoaDon> listVMHD = new ArrayList<>();
    private HoaDonService hdsi = new HoaDonServiceImpl();

    private DefaultComboBoxModel dcdmNhanVien = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcdmKhachHang = new DefaultComboBoxModel();

    private Webcam webcam = null;
    private WebcamPanel panel = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);

    DefaultTableModel dtmHD2 = new DefaultTableModel();
    DefaultTableModel dtmSP2 = new DefaultTableModel();

    DefaultTableModel dtmKH = new DefaultTableModel();
    private String data;

    private String maNV;
    private KhachHang kh = new KhachHang();
    private NhanVien nv = new NhanVien();

    private DefaultTableModel dtmCTSP = new DefaultTableModel();
    private List<ChiTietSP> listCTSP = new ArrayList<>();
    private DefaultComboBoxModel dcbmChip = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmRam = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmRom = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmMauSac = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmHang = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmPin = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmDSImei = new DefaultComboBoxModel();

    private List<Chip> listChip = new ArrayList<>();
    private ChipService chipService = new ChipServiceImpl();

    private List<HangDienThoai> listHang = new ArrayList<>();
    private HangDienThoaiService hangDienThoaiService = new HanDienThoaiServiceImpl();

    private ImeiService imeiService = new ImeiServiceImpl();
    private List<Imei> listImei = new ArrayList<>();

    private List<MauSac> listMauSac = new ArrayList<>();
    private MauSacService mauSacService = new MauSacServiceImpl();

    private List<Pin> listPin = new ArrayList<>();
    private PinService pinService = new PinServiceImpl();

    private List<Ram> listRam = new ArrayList<>();
    private RamService ramService = new RamServiceImpl();

    private List<Rom> listRom = new ArrayList<>();
    private RomService romService = new RomServiceImpl();

    private HoaDonCTService hdctS = new HoaDonCTServiceImpl();
    private List<ViewModelGioHangThanhToan> listVMGHTT = new ArrayList<>();

    private DefaultTableModel dtmGiamGia = new DefaultTableModel();
    private List<GiamGia> listGiamGia = new ArrayList<>();
    private GiamGiaService ggs = new GiamGiaServiceImpl();

    private DefaultTableModel dtmSPGiamGia = new DefaultTableModel();
    private List<SanPhamGiamGia> listSPGG = new ArrayList<>();
    private SanPhamGiamGiaService sanPhamGiamGiaService = new SanPhamGiamGiaServiceImpl();

    private DefaultTableModel dtmPBH = new DefaultTableModel();
    private List<PhieuBaoHanh> listPhieuBaoHanh = new ArrayList<>();
    private PhieuBaoHanhService baoHanhService = new PhieuBaoHanhServiceImpl();

    private DefaultComboBoxModel dcdmTenKHBH = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmTenSPBH = new DefaultComboBoxModel();

    private List<HoaDonCT> listHDCT = new ArrayList<>();
    private HoaDonCTService hdcts = new HoaDonCTServiceImpl();

    private List<ThongKe> listThongKe = new ArrayList<>();
    private ThongKeService thongKeService = new ThongKeServiceImpl();
    DefaultTableModel dtmTK = new DefaultTableModel();

    private List<ViewModelSP> listTop3 = new ArrayList<>();
    private SanPhamTopService sanPhamTopService = new SanPhamTopServiceImpl();
    private DefaultTableModel dtmTop3 = new DefaultTableModel();

//    ẢNh 
    String filename = null;
    byte[] person_image = null;
    private String duongDanAnh = "D:\\Nhom1_IT18103_DuAnFinal\\picture";

    /**
     * Creates new form ViewSanPham
     */
    public ViewSanPham(String data) {

        initComponents();
        initWebcam();

        cbbChip.setModel(dcbmChip);
        cbbHang.setModel(dcbmHang);
        cbbMauSac.setModel(dcbmMauSac);
        cbbPin.setModel(dcbmPin);
        cbbRam.setModel(dcbmRam);
        cbbRom.setModel(dcbmRom);
        this.data = data;

        nv = nhanVienService.getOneTK(data);

        maNV = nv.getMaNV();
        txtTenDayDu.setText(nv.getTenNV());
        txtChucVuNhanVien.setText(nv.getTenCV());
        txtTenNVBanHang.setText(nv.getTenNV());

        txtMaNhanVien.setText(nv.getMaNV());
        txtHoTenNV.setText(nv.getTenNV());
        txtGioiTinhNhanVien.setText(String.valueOf(nv.isGioiTinh() == true ? "Nam" : "Nữ"));
        txtChucVuNV.setText(nv.getTenCV());
        txtEmailNV.setText(nv.getEmail());
        txtQueQuanNV.setText(nv.getQueQuan());
        txtNgaySinhNV.setText(nv.getNgaySinh());
        txtTaiKhoanNV.setText(nv.getTaiKhoan());
        txtMatKhauNV.setText(nv.getMatKhau());

        cbbKhachHang.setModel(dcdmKhachHang);
        tblNhanVien.setModel(dtm);
        String[] header = {"Ma", "Ten", "Gioi Tinh", "Ngay Sinh", "Chuc Vu", "Que Quan", "Email", "Tai Khoan", "Mat Khau"};
        dtm.setColumnIdentifiers(header);
        listNhanVien = nhanVienService.getAll();

        tblSanPhamBanHang.setModel(dtmSPBH);
        String[] headerSPBH = {"STT", "MaSP", "TenSP", "So Luong", "Don Gia"};
        dtmSPBH.setColumnIdentifiers(headerSPBH);
        listVMSP = spbh.getAll();

        tblGioHang.setModel(dtmGH);
        String[] headerGH = {"STT", "Mã SP", "Tên SP", "So Luong", "Don Gia", "Thanh Tien"};
        dtmGH.setColumnIdentifiers(headerGH);

        tblHoaDonBanHang.setModel(dtmHD);
        String headerHD[] = {"STT", "Mã HĐ", "Ngày Tạo", "Tên NV", "Ten KH", "Tình Trạng"};
        dtmHD.setColumnIdentifiers(headerHD);

        tbHoaDon.setModel(dtmHD2);
        String[] headerHD2 = {"Mã HĐ", "Mã NV", "Mã KH", "Tên NV", "Tên KH", "SĐT", "Trạng Thái", "Ngày Tạo"};
        dtmHD2.setColumnIdentifiers(headerHD2);

        //SP Đã bán
        tbSanPham.setModel(dtmSP2);
        String[] headerSP2 = {"MaHD", "Ngay Tao", "MaSP", "Ten SP", "So Luong", "Don Gia", "Thành Tiền"};
        dtmSP2.setColumnIdentifiers(headerSP2);
//        listVMSP = spbh.getAll();
        listVMGHTT = hdctS.getData();

        tblKhachHang.setModel(dtmKH);
        String[] headerKH = {"Mã KH", "Tên KH", "SĐT", "Email", "Gioi Tinh", "Ngày Sinh", "Địa Chỉ"};
        dtmKH.setColumnIdentifiers(headerKH);

//        SanPham
        tblChiTietSP.setModel(dtmCTSP);
        String[] headerCTSP = {"Tên SP", "Hãng ĐT", "Chip", "Ram", "Rom", "Pin", "Mau Sac", "So Luong", "Don Gia"};
        dtmCTSP.setColumnIdentifiers(headerCTSP);

        listCTSP = chiTietSanPhamService.getAll();
        listChip = chipService.getall();
        listMauSac = mauSacService.getall();
        listRam = ramService.getall();
        listRom = romService.getAll();
        listHang = hangDienThoaiService.getall();
        listPin = pinService.getAll();
        listImei = imeiService.getall();
        listKhachHang = khachHangService.getAll();

        listVMHD = hdsi.getAll();

        tblGiamGia.setModel(dtmGiamGia);
        String[] headerGiamGia = {"Mã Giảm Giá", "Tên Tên Chương Trình", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Số Tiền Giảm"};
        dtmGiamGia.setColumnIdentifiers(headerGiamGia);
        listGiamGia = ggs.getall();

        tbSanPhamGiamGia.setModel(dtmSPGiamGia);
        String[] headerSPGG = {"Tên Sản Phẩm", "Tên Chương Trình"};
        dtmSPGiamGia.setColumnIdentifiers(headerSPGG);
        listSPGG = sanPhamGiamGiaService.getAll();

        tbSanPhamTK.setModel(dtmTK);
        String[] headerTK = {"Ma HD", "Ten NV", "Ten KH", "So Luong", "Don Gia", "Ngay Tao", "Thanh Tien"};
        dtmTK.setColumnIdentifiers(headerTK);
        listThongKe = thongKeService.getAll();

        tbTop3SP.setModel(dtmTop3);
        String[] headerTop = {"Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng"};
        dtmTop3.setColumnIdentifiers(headerTop);
        listTop3 = sanPhamTopService.top3();

        for (Chip chip : listChip) {
            dcbmChip.addElement(chip.getTenChip());
        }

        for (Ram ram : listRam) {
            dcbmRam.addElement(ram.getDungLuong());
        }

        for (Rom rom : listRom) {
            dcbmRom.addElement(rom.getTenRom());
        }

        for (MauSac ms : listMauSac) {
            dcbmMauSac.addElement(ms.getTenMS());
        }

        for (HangDienThoai h : listHang) {
            dcbmHang.addElement(h.getTenHang());
        }

        for (Pin pin : listPin) {
            dcbmPin.addElement(pin.getTenPin());
        }

        for (Imei i : listImei) {
            dcbmDSImei.addElement(i.getImei());
        }

        for (KhachHang kh : listKhachHang) {
            dcdmTenKHBH.addElement(kh.getTenKH());
        }

        for (ChiTietSP ctsp : listCTSP) {
            dcbmTenSPBH.addElement(ctsp.getTenSP());
        }
        showThongKe(listThongKe);
        Tong();
        showDataTable(listNhanVien);
        showSanPhamBH(listVMSP);
        showDataTableHD(listVMHD);
        showDataTableHD2(listVMHD);
        showKhachHang(listKhachHang);
        showDataCTSP(listCTSP);
        showDataGioHangThanhToan(listVMGHTT);
        showGiamGia(listGiamGia);
        showSPGG(listSPGG);
        showPhieuBaoHanh(listPhieuBaoHanh);
    }

    private void showSanPhamTop(List<ViewModelSP> list) {
        dtmTop3.setRowCount(0);
        for (ViewModelSP vmsp : list) {
            dtmTop3.addRow(new Object[]{vmsp.getMaSP(), vmsp.getTenSP(), vmsp.getSoLuong()});
        }
    }

    private void Tong() {
        DecimalFormat x = new DecimalFormat("###,###,###");
        float tong = 0;
        for (int i = 0; i < tbSanPhamTK.getRowCount(); i++) {
            tong += Float.parseFloat(tbSanPhamTK.getValueAt(i, 6).toString());
        }
        tongDoanhThu.setText(x.format(tong) + " " + "VND");
        listThongKe = thongKeService.getAll();
        showThongKe(listThongKe);
    }

    private void showThongKe(List<ThongKe> list) {
        dtmTK.setRowCount(0);
        for (ThongKe tk : list) {
            dtmTK.addRow(new Object[]{tk.getHd().getMaHD(), tk.getNv().getTenNV(), tk.getKh().getTenKH(), tk.getHdct().getSoLuong(), tk.getHdct().getDonGia(), tk.getHd().getNgayTao(), tk.getHdct().getSoLuong() * tk.getHdct().getDonGia()});
        }
    }

    private void showPhieuBaoHanh(List<PhieuBaoHanh> list) {
        dtmPBH.setRowCount(0);
        for (PhieuBaoHanh pbh : list) {
            dtmPBH.addRow(new Object[]{pbh.getKh().getMaKH(), pbh.getCtsp().getMaSP(), pbh.getCtsp().getTenSP(), pbh.getKh().getTenKH(), pbh.getKh().getDiaChi(), pbh.getKh().getSdt(), pbh.getNgayBatDau(), pbh.getNgayKetThuc()});
        }
    }

    private void showKhachHang(List<KhachHang> list) {
        dtmKH.setRowCount(0);
        for (KhachHang kh : list) {
            dtmKH.addRow(new Object[]{kh.getMaKH(), kh.getTenKH(), kh.getSdt(), kh.getEmail(), kh.isGioiTinh() == true ? "Nam" : "Nữ", kh.getNgaySinh(), kh.getDiaChi()});

        }

    }

    private void showSPGG(List<SanPhamGiamGia> list) {
        dtmSPGiamGia.setRowCount(0);
        for (SanPhamGiamGia sp : list) {
            dtmSPGiamGia.addRow(new Object[]{sp.getCtsp().getTenSP(), sp.getGiamGia().getTenGiamGia()});
        }
    }

    private void showGiamGia(List<GiamGia> list) {
        dtmGiamGia.setRowCount(0);
        for (GiamGia gg : list) {
            dtmGiamGia.addRow(new Object[]{gg.getMaGiamGia(), gg.getTenGiamGia(), gg.getNgayBatDau(), gg.getNgayKetThuc(), gg.getSoTienGiam()});
        }
    }

    private void showDataGioHangThanhToan(List<ViewModelGioHangThanhToan> list) {
        dtmSP2.setRowCount(0);
        for (ViewModelGioHangThanhToan vmghtt : list) {
            String.format("%,.2f", vmghtt.getDonGia());
            String.format("%,.2f", vmghtt.getThanhTien());
            dtmSP2.addRow(new Object[]{vmghtt.getHd().getMaHD(), vmghtt.getHd().getNgayTao(), vmghtt.getCtsp().getMaSP(), vmghtt.getCtsp().getTenSP(), vmghtt.getSoLuong(), vmghtt.getDonGia(), vmghtt.getThanhTien()});
        }
    }

    private void showDataTableHD2(List<HoaDon> list) {
        int STT = 1;
        dtmHD2.setRowCount(0);
        for (HoaDon vmhd : list) {
            dtmHD2.addRow(new Object[]{vmhd.getMaHD(), vmhd.getNhanVien().getMaNV(), vmhd.getKhachHang().getMaKH(), vmhd.getNhanVien().getTenNV(), vmhd.getKhachHang().getTenKH(), vmhd.getSdt(), vmhd.isTrangThai() == true ? "Đã Thanh Toán" : "Chưa Thanh Toán", vmhd.getNgayTao()});
        }
    }

    private void showDataTable(List<NhanVien> list) {
        dtm.setRowCount(0);
        for (NhanVien gv : list) {
            dtm.addRow(gv.toDataRow());
        }
    }

    private void showSanPhamBH(List<ViewModelSanPham> list) {
        int STT = 1;
        dtmSPBH.setRowCount(0);
        for (ViewModelSanPham sp : list) {
            String.format("%,.2f", sp.getDonGia());
            dtmSPBH.addRow(new Object[]{STT++, sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getDonGia()});
        }
    }

    private void showDataTableHD(List<HoaDon> list) {
        int STT = 1;
        dtmHD.setRowCount(0);
        for (HoaDon vmhd : list) {
            dtmHD.addRow(new Object[]{STT++, vmhd.getMaHD(), vmhd.getNgayTao(), vmhd.getNhanVien().getTenNV(), vmhd.getKhachHang().getTenKH(), vmhd.isTrangThai() == true ? "Đã Thanh Toán" : "Chưa Thanh Toán"});
        }
    }

    private void showGH(List<ViewModelGioHang> list) {
        int STT = 1;
        dtmGH.setRowCount(0);
        for (ViewModelGioHang gh : list) {
            String.format("%,.2f", gh.getDonGia());
            String.format("%,.2f", gh.getThanhTien());
            dtmGH.addRow(new Object[]{STT++, gh.getMaSP(), gh.getTenSP(), gh.getSoLuong(), gh.getDonGia(), gh.thanhTien()});
        }
    }

    private void showDataCTSP(List<ChiTietSP> list) {
        dtmCTSP.setRowCount(0);
        for (ChiTietSP ctsp : list) {
            dtmCTSP.addRow(new Object[]{ctsp.getTenSP(), ctsp.getHang().getTenHang(),
                ctsp.getChip().getTenChip(), ctsp.getRam().getDungLuong(),
                ctsp.getRom().getTenRom(), ctsp.getPin().getTenPin(),
                ctsp.getMs().getTenMS(), ctsp.getSoLuong(), ctsp.getDonGia(), ctsp.getAnhURL()});
        }
    }

    private void fillDataGiamGia(int index) {
        GiamGia giamGia = listGiamGia.get(index);
        txtMaGiamGia.setText(giamGia.getMaGiamGia());
        txtTenGiamGia.setText(giamGia.getTenGiamGia());
        txtNgayMua.setText(giamGia.getNgayBatDau());
        txtNgayKT.setText(giamGia.getNgayKetThuc());
        txtSoTienGiam.setText(String.valueOf(giamGia.getSoTienGiam()));
    }

    private void fillData(int index) {
        NhanVien nv = listNhanVien.get(index);
        txtMa.setText(nv.getMaNV());
        txtTen.setText(nv.getTenNV());
        if (nv.isGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(nv.getNgaySinh());
        txtTenCV.setText(nv.getTenCV());
        txtQueQuan.setText(nv.getQueQuan());
        txtEmail.setText(nv.getEmail());
        txtTaiKhoan.setText(nv.getTaiKhoan());
        txtMatKhau.setText(nv.getMatKhau());
    }

    private void fillDataKH(int index) {
        KhachHang kh = listKhachHang.get(index);
        txtMakh.setText(kh.getMaKH());
        txtTenkh.setText(kh.getTenKH());
        txtsdtKH.setText(kh.getSdt());
        txtEmailKH.setText(kh.getEmail());

        if (kh.isGioiTinh() == true) {
            rdoNamKH.setSelected(true);
        } else {
            rdoNuKH.setSelected(true);
        }
        txtNgaySinhKH.setText(kh.getNgaySinh());

        txtDiaChiKH.setText(kh.getDiaChi());
    }

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);

        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        jPanel40.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 226, 126));

        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                //No result...
            }

            if (result != null) {
                txtMaTimKiem.setText(result.getText());
            }
        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

//    anh
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void fillDataCTSP(int index) {
        ChiTietSP ctsp = listCTSP.get(index);
        txtMaCTSP.setText(ctsp.getMaSP());
        txtTenSP.setText(ctsp.getTenSP());
        lbl_img.setIcon(ResizeImage(String.valueOf(listCTSP.get(index).getAnhURL())));
        txtSoLuong.setText(String.valueOf(ctsp.getSoLuong()));
        txtDonGia.setText(String.format("%,.2f", Float.valueOf(ctsp.getDonGia())));
        txtMoTa.setText(ctsp.getMoTa());
        cbbChip.setSelectedItem(ctsp.getChip().getTenChip());
        cbbRam.setSelectedItem(ctsp.getRam().getDungLuong());
        cbbRom.setSelectedItem(ctsp.getRom().getTenRom());
        cbbMauSac.setSelectedItem(ctsp.getMs().getTenMS());
        cbbHang.setSelectedItem(ctsp.getHang().getTenHang());
        cbbPin.setSelectedItem(ctsp.getPin().getTenPin());
    }

    private void addChiTietSP() {
        MauSac ms = mauSacService.getOne((String) cbbMauSac.getSelectedItem());
        HangDienThoai hdt = hangDienThoaiService.getOne((String) cbbHang.getSelectedItem());
        Chip chip = chipService.getOne((String) cbbChip.getSelectedItem());
        Ram ram = ramService.getOne((String) cbbRam.getSelectedItem());
        Rom rom = romService.getOne((String) cbbRom.getSelectedItem());
        Pin pin = pinService.getOne((String) cbbPin.getSelectedItem());
        ChiTietSP ctsp = new ChiTietSP();

        Random rd = new Random();
        String maSP = "MSP" + rd.nextInt(999);
        ctsp.setMaSP(maSP);
        ctsp.setTenSP(txtTenSP.getText());
        ctsp.setDonGia(Float.valueOf(txtDonGia.getText()));
        ctsp.setMoTa(txtMoTa.getText());
        ctsp.setAnhURL(duongDanAnh);
        ctsp.setMs(ms);
        ctsp.setHang(hdt);
        ctsp.setChip(chip);
        ctsp.setRam(ram);
        ctsp.setRom(rom);
        ctsp.setPin(pin);
        ctsp.setSoLuong(Integer.valueOf(txtSoLuong.getText()));
        JOptionPane.showMessageDialog(this, chiTietSanPhamService.add(ctsp));
    }

    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenDayDu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtChucVuNhanVien = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        menudetai = new javax.swing.JPanel();
        lb_Tendetai = new javax.swing.JLabel();
        HeThong = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietSP = new javax.swing.JTable();
        txtSanPham = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cbbChip = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cbbRam = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        cbbRom = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cbbMauSac = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cbbHang = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cbbPin = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtMaCTSP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSImei = new javax.swing.JTable();
        BanHang = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblHoaDonBanHang = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jButton28 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblSanPhamBanHang = new javax.swing.JTable();
        txtMaTimKiem = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChuaThanhToan = new javax.swing.JRadioButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtTienKhachDua = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNVBanHang = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel40 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        cbbKhachHang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        txtEmailDen = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        HoaDon = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnTimMa = new javax.swing.JButton();
        txtTimMa = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        txtMaHDBan = new javax.swing.JTextField();
        btnTimMa1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        btnExcelHD = new javax.swing.JButton();
        btnPDFHD = new javax.swing.JButton();
        btnSortDesc = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        NhanVien = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        txtTenCV = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        deleteNV = new javax.swing.JButton();
        btnAddNV = new javax.swing.JButton();
        btnUpdateNV = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        KhachHang = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        txtTenkh = new javax.swing.JTextField();
        txtsdtKH = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtEmailKH = new javax.swing.JTextField();
        txtNgaySinhKH = new javax.swing.JTextField();
        rdoNamKH = new javax.swing.JRadioButton();
        rdoNuKH = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDiaChiKH = new javax.swing.JTextArea();
        btnAddKH = new javax.swing.JButton();
        btnDeleteKH = new javax.swing.JButton();
        btnUpdateKH = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        btnTimKiemKH = new javax.swing.JButton();
        txtTimTenKH = new javax.swing.JTextField();
        KhuyenMai = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblGiamGia = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        txtTenGiamGia = new javax.swing.JTextField();
        txtMaGiamGia = new javax.swing.JTextField();
        txtNgayMua = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        txtSoTienGiam = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbSanPhamGiamGia = new javax.swing.JTable();
        ThongTin = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtHoTenNV = new javax.swing.JTextField();
        txtGioiTinhNhanVien = new javax.swing.JTextField();
        txtChucVuNV = new javax.swing.JTextField();
        txtEmailNV = new javax.swing.JTextField();
        txtQueQuanNV = new javax.swing.JTextField();
        txtNgaySinhNV = new javax.swing.JTextField();
        txtTaiKhoanNV = new javax.swing.JTextField();
        txtMatKhauNV = new javax.swing.JTextField();
        ThongKe = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbTop3SP = new javax.swing.JTable();
        jLabel60 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbSanPhamTK = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        txtTuNgay = new com.toedter.calendar.JDateChooser();
        txtDenNgay = new com.toedter.calendar.JDateChooser();
        jPanel23 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        tongDoanhThu = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu.setBackground(new java.awt.Color(0, 0, 102));
        menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/application.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/home.png"))); // NOI18N
        jLabel7.setText("Trang Chủ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/smartphone.png"))); // NOI18N
        jLabel8.setText("Sản Phẩm");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/shopping-cart.png"))); // NOI18N
        jLabel9.setText("Bán Hàng");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/invoice.png"))); // NOI18N
        jLabel10.setText("Hóa Đơn");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/discount.png"))); // NOI18N
        jLabel11.setText("Giảm Giá");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/staff.png"))); // NOI18N
        jLabel12.setText("Nhân Viên");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/user.png"))); // NOI18N
        jLabel15.setText("Thông Tin");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/log-out.png"))); // NOI18N
        jLabel17.setText("Đăng Xuất");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Họ Tên");

        txtTenDayDu.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        txtTenDayDu.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDayDu.setText("Ten Day Du");

        jLabel19.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Chức Vụ");

        txtChucVuNhanVien.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        txtChucVuNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtChucVuNhanVien.setText("Chuc Vu");

        jLabel47.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/customer.png"))); // NOI18N
        jLabel47.setText("Khách Hàng");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel47MousePressed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/trend.png"))); // NOI18N
        jLabel61.setText("Thống Kê");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        jLabel61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel61KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenDayDu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChucVuNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTenDayDu))
                .addGap(10, 10, 10)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtChucVuNhanVien))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel61)
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menudetai.setBackground(new java.awt.Color(0, 0, 102));

        lb_Tendetai.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lb_Tendetai.setForeground(new java.awt.Color(255, 255, 255));
        lb_Tendetai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Tendetai.setText("NHÓM 1: PHẦN MỀM BÁN ĐIỆN THOẠI");

        javax.swing.GroupLayout menudetaiLayout = new javax.swing.GroupLayout(menudetai);
        menudetai.setLayout(menudetaiLayout);
        menudetaiLayout.setHorizontalGroup(
            menudetaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menudetaiLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(lb_Tendetai, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menudetaiLayout.setVerticalGroup(
            menudetaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_Tendetai, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        HeThong.setLayout(new java.awt.CardLayout());

        TrangChu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/image/webcom.jpg"))); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(1190, 727));
        jLabel18.setMinimumSize(new java.awt.Dimension(1190, 727));
        jLabel18.setPreferredSize(new java.awt.Dimension(1190, 727));

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HeThong.add(TrangChu, "card2");

        SanPham.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1002, 694));
        jPanel3.setMinimumSize(new java.awt.Dimension(1002, 694));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(1002, 694));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblChiTietSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Hãng", "Chip", "Ram", "Rom", "Pin", "Màu Sắc", "Số Lượng", "Đơn giá"
            }
        ));
        tblChiTietSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTietSP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel23.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("Chip");

        cbbChip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton9.setBackground(new java.awt.Color(0, 0, 102));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jLabel24.setText("Ram");

        cbbRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbRamActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 102));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Rom");

        cbbRom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton11.setBackground(new java.awt.Color(0, 0, 102));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("Màu Sắc");

        cbbMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton12.setBackground(new java.awt.Color(0, 0, 102));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText("Hãng");

        cbbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton13.setBackground(new java.awt.Color(0, 0, 102));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("Pin");

        cbbPin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton14.setBackground(new java.awt.Color(0, 0, 102));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbMauSac, 0, 167, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbChip, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbHang, 0, 169, Short.MAX_VALUE)
                                .addComponent(cbbRam, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbRom, 0, 157, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbPin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbRom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Tên SP");

        jLabel13.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Số Lượng");

        jLabel20.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("DS Imei");

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Đơn Giá");

        jLabel22.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Mô Tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane3.setViewportView(txtMoTa);

        jButton5.setBackground(new java.awt.Color(0, 0, 102));
        jButton5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/add.png"))); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 102));
        jButton6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/update.png"))); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/delete.png"))); // NOI18N
        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/reset.png"))); // NOI18N
        jButton8.setText("RESET");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Mã SP");

        tblDSImei.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imei"
            }
        ));
        jScrollPane1.setViewportView(tblDSImei);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMaCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel20))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(366, 366, 366)
                            .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(30, 30, 30)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sản Phẩm", jPanel3);

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        HeThong.add(SanPham, "card3");

        BanHang.setBackground(new java.awt.Color(255, 255, 255));
        BanHang.setMaximumSize(new java.awt.Dimension(1002, 694));
        BanHang.setMinimumSize(new java.awt.Dimension(1002, 694));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblHoaDonBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HĐ", "Tên NV", "Tên KH", "Trạng Thái"
            }
        ));
        tblHoaDonBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonBanHangMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblHoaDonBanHang);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá ", "Thành Tiền"
            }
        ));
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tblGioHang);

        jButton28.setBackground(new java.awt.Color(0, 0, 102));
        jButton28.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/delete.png"))); // NOI18N
        jButton28.setText("Xóa Giỏ Hàng");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton28)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblSanPhamBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng ", "Đơn Giá"
            }
        ));
        tblSanPhamBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamBanHangMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblSanPhamBanHang);

        txtMaTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaTimKiemKeyReleased(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 102));
        jButton17.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Tìm Kiếm");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 0, 102));
        jButton21.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Reset Data");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(txtMaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton17)
                .addGap(43, 43, 43)
                .addComponent(jButton21)
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup4.add(rdoDaThanhToan);
        rdoDaThanhToan.setText("Đã Thanh Toán");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });

        buttonGroup4.add(rdoChuaThanhToan);
        rdoChuaThanhToan.setText("Chưa Thanh Toán");
        rdoChuaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuaThanhToanActionPerformed(evt);
            }
        });

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel89.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 102));
        jLabel89.setText("Mã HĐ");

        jLabel91.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 102));
        jLabel91.setText("Tên NV");

        jLabel92.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 102));
        jLabel92.setText("Tổng Tiền Hóa Đơn");

        jLabel93.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 102));
        jLabel93.setText("Tiền Khách Đưa");

        jLabel94.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 102));
        jLabel94.setText("Tiền Thừa");

        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyReleased(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 102));
        jButton18.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/template.png"))); // NOI18N
        jButton18.setText("Tạo Hóa Đơn");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 0, 102));
        jButton19.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/pay.png"))); // NOI18N
        jButton19.setText("Thanh Toán");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Ngày Tạo");

        jButton29.setBackground(new java.awt.Color(0, 0, 102));
        jButton29.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/reset.png"))); // NOI18N
        jButton29.setText("Clear information");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 102));
        jButton30.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/invoice.png"))); // NOI18N
        jButton30.setText("Thông Tin Hóa Đơn");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTenNVBanHang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTienKhachDua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtTenNVBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(126, 167, 206));
        jPanel38.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 470, 10));

        jPanel40.setBackground(new java.awt.Color(250, 250, 250));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 130));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        cbbKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Tên KH");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("SĐT ");

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/edit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 102));
        jLabel62.setText("Email :");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmailDen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbKhachHang, javax.swing.GroupLayout.Alignment.LEADING, 0, 182, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtEmailDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buttonGroup4.add(jRadioButton1);
        jRadioButton1.setText("Tất Cả");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanHangLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rdoDaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(rdoChuaThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BanHangLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(BanHangLayout.createSequentialGroup()
                        .addGroup(BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BanHangLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDaThanhToan)
                    .addComponent(rdoChuaThanhToan)
                    .addComponent(jRadioButton1))
                .addGroup(BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BanHangLayout.createSequentialGroup()
                        .addGroup(BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BanHangLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BanHangLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BanHangLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BanHangLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        HeThong.add(BanHang, "card4");

        HoaDon.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        btnTimMa.setBackground(new java.awt.Color(0, 0, 102));
        btnTimMa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimMa.setForeground(new java.awt.Color(255, 255, 255));
        btnTimMa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        btnTimMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimMaActionPerformed(evt);
            }
        });

        txtTimMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimMaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimMa, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTimMa)
                    .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel29.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("Từ Ngày (dd-mm-yyyy) ");

        jLabel30.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setText("Đến Ngày (dd-mm-yyyy)");

        jButton16.setBackground(new java.awt.Color(0, 0, 102));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        txtNgayBatDau.setBackground(new java.awt.Color(255, 255, 255));

        txtNgayKetThuc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton16)
                            .addComponent(jLabel29)
                            .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã NV", "Mã KH", "Tên NV", "Tên KH", "SĐT", "Trạng Thái", "Tổng Tiền", "Ngày Tạo"
            }
        ));
        jScrollPane4.setViewportView(tbHoaDon);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Giá Bán", "Số Lượng", "Thành Tiền"
            }
        ));
        jScrollPane5.setViewportView(tbSanPham);

        txtMaHDBan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaHDBanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaHDBanKeyReleased(evt);
            }
        });

        btnTimMa1.setBackground(new java.awt.Color(0, 0, 102));
        btnTimMa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimMa1.setForeground(new java.awt.Color(255, 255, 255));
        btnTimMa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        btnTimMa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimMa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaHDBan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimMa1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaHDBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimMa1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jButton22.setBackground(new java.awt.Color(0, 0, 102));
        jButton22.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/ascendantMini.png"))); // NOI18N
        jButton22.setText("Sort Asc");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        btnExcelHD.setBackground(new java.awt.Color(0, 0, 102));
        btnExcelHD.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnExcelHD.setForeground(new java.awt.Color(255, 255, 255));
        btnExcelHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/excel.png"))); // NOI18N
        btnExcelHD.setText("Excel");
        btnExcelHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelHDActionPerformed(evt);
            }
        });

        btnPDFHD.setBackground(new java.awt.Color(0, 0, 102));
        btnPDFHD.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnPDFHD.setForeground(new java.awt.Color(255, 255, 255));
        btnPDFHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/template.png"))); // NOI18N
        btnPDFHD.setText("PDF");
        btnPDFHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFHDActionPerformed(evt);
            }
        });

        btnSortDesc.setBackground(new java.awt.Color(0, 0, 102));
        btnSortDesc.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnSortDesc.setForeground(new java.awt.Color(255, 255, 255));
        btnSortDesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/decreasingMini.png"))); // NOI18N
        btnSortDesc.setText("Sort Desc");
        btnSortDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDescActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 102));
        jButton15.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/reset.png"))); // NOI18N
        jButton15.setText("Reset Data");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSortDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcelHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPDFHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnExcelHD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnPDFHD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoaDonLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoaDonLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoaDonLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoaDonLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.getAccessibleContext().setAccessibleName("Sản  Phẩm Được Thanh Toán");

        HeThong.add(HoaDon, "card5");

        NhanVien.setBackground(new java.awt.Color(255, 255, 255));
        NhanVien.setMaximumSize(new java.awt.Dimension(1002, 694));
        NhanVien.setMinimumSize(new java.awt.Dimension(1002, 694));
        NhanVien.setPreferredSize(new java.awt.Dimension(1002, 694));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setText("Mã");

        jLabel32.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setText("Tên");

        jLabel33.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setText("Quê Quán");

        jLabel34.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 102));
        jLabel34.setText("Ngày Sinh");

        jLabel35.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 102));
        jLabel35.setText("Email");

        jLabel36.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 102));
        jLabel36.setText("Tài Khoản");

        jLabel37.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 102));
        jLabel37.setText("Mật Khẩu");

        jLabel38.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 102));
        jLabel38.setText("Giới Tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel39.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 102));
        jLabel39.setText("Tên Chức Vụ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMa)
                    .addComponent(txtTen)
                    .addComponent(txtQueQuan)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtTaiKhoan)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39)
                        .addComponent(txtTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(30, 30, 30))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma", "Ten", "Gioi Tinh", "Ngay Sinh", "Chuc Vu", "Que Quan", "Email", "Tai Khoan", "Mat Khau"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(8).setResizable(false);
        }

        jButton20.setBackground(new java.awt.Color(0, 0, 102));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        deleteNV.setBackground(new java.awt.Color(0, 0, 102));
        deleteNV.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        deleteNV.setForeground(new java.awt.Color(255, 255, 255));
        deleteNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/delete.png"))); // NOI18N
        deleteNV.setText("DELETE");
        deleteNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNVActionPerformed(evt);
            }
        });

        btnAddNV.setBackground(new java.awt.Color(0, 0, 102));
        btnAddNV.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnAddNV.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/add.png"))); // NOI18N
        btnAddNV.setText("ADD");
        btnAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNVActionPerformed(evt);
            }
        });

        btnUpdateNV.setBackground(new java.awt.Color(0, 0, 102));
        btnUpdateNV.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnUpdateNV.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/update.png"))); // NOI18N
        btnUpdateNV.setText("UPDATE");
        btnUpdateNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNVActionPerformed(evt);
            }
        });

        btnExcel.setBackground(new java.awt.Color(0, 0, 102));
        btnExcel.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/excel.png"))); // NOI18N
        btnExcel.setText("Export Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnPDF.setBackground(new java.awt.Color(0, 0, 102));
        btnPDF.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/template.png"))); // NOI18N
        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnUpdateNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnAddNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(deleteNV)
                .addGap(18, 18, 18)
                .addComponent(btnAddNV)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateNV)
                .addGap(18, 18, 18)
                .addComponent(btnExcel)
                .addGap(18, 18, 18)
                .addComponent(btnPDF)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NhanVienLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addGroup(NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NhanVienLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NhanVienLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        HeThong.add(NhanVien, "card6");

        KhachHang.setMaximumSize(new java.awt.Dimension(1002, 694));
        KhachHang.setMinimumSize(new java.awt.Dimension(1002, 694));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel40.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 102));
        jLabel40.setText("Mã");

        jLabel41.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("Tên");

        jLabel42.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 102));
        jLabel42.setText("SĐT");

        jLabel43.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("Email");

        jLabel44.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 102));
        jLabel44.setText("Ngày Sinh");

        jLabel45.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 102));
        jLabel45.setText("Giới Tính");

        buttonGroup2.add(rdoNamKH);
        rdoNamKH.setText("Nam");

        buttonGroup2.add(rdoNuKH);
        rdoNuKH.setText("Nữ");

        jLabel46.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 102));
        jLabel46.setText("Địa Chỉ");

        txtDiaChiKH.setColumns(20);
        txtDiaChiKH.setRows(5);
        jScrollPane8.setViewportView(txtDiaChiKH);

        btnAddKH.setBackground(new java.awt.Color(0, 0, 102));
        btnAddKH.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnAddKH.setForeground(new java.awt.Color(255, 255, 255));
        btnAddKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/add.png"))); // NOI18N
        btnAddKH.setText("ADD");
        btnAddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKHActionPerformed(evt);
            }
        });

        btnDeleteKH.setBackground(new java.awt.Color(0, 0, 102));
        btnDeleteKH.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnDeleteKH.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/delete.png"))); // NOI18N
        btnDeleteKH.setText("DELETE");
        btnDeleteKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKHActionPerformed(evt);
            }
        });

        btnUpdateKH.setBackground(new java.awt.Color(0, 0, 102));
        btnUpdateKH.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnUpdateKH.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/update.png"))); // NOI18N
        btnUpdateKH.setText("UPDATE");
        btnUpdateKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMakh)
                            .addComponent(txtTenkh, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsdtKH, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addGap(97, 97, 97)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rdoNamKH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoNuKH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmailKH)
                    .addComponent(txtNgaySinhKH))
                .addGap(83, 83, 83)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnAddKH)
                        .addGap(59, 59, 59)
                        .addComponent(btnDeleteKH)
                        .addGap(61, 61, 61)
                        .addComponent(btnUpdateKH)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(txtEmailKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtsdtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(rdoNamKH)
                            .addComponent(rdoNuKH)
                            .addComponent(btnAddKH)
                            .addComponent(btnDeleteKH)
                            .addComponent(btnUpdateKH))
                        .addGap(61, 61, 61))))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "SĐT", "Email", "Ngày Sinh", "Giới Tính", "Địa Chỉ"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblKhachHang);

        btnTimKiemKH.setBackground(new java.awt.Color(0, 0, 102));
        btnTimKiemKH.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnTimKiemKH.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        btnTimKiemKH.setText("Tìm Kiếm");
        btnTimKiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtTimTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemKH))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiemKH)
                    .addComponent(txtTimTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Khách Hàng", jPanel14);

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        HeThong.add(KhachHang, "card7");

        KhuyenMai.setBackground(new java.awt.Color(255, 255, 255));
        KhuyenMai.setPreferredSize(new java.awt.Dimension(1628, 749));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setPreferredSize(new java.awt.Dimension(1628, 749));

        tblGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma ", "Ten ", "Ngay Bat Dau", "Ngay Ket Thuc", "So Tien Giam"
            }
        ));
        tblGiamGia.setGridColor(new java.awt.Color(255, 255, 255));
        tblGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGiamGiaMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblGiamGia);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel84.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 102));
        jLabel84.setText("Tên Chương Trình");

        jLabel85.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 102));
        jLabel85.setText("Mã Giảm Giá");

        jLabel86.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 102));
        jLabel86.setText("Từ Ngày");

        jLabel87.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 102));
        jLabel87.setText("Đến Ngày");

        jLabel88.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 102));
        jLabel88.setText("Số Tiền Giảm");

        jButton39.setBackground(new java.awt.Color(0, 0, 102));
        jButton39.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/add.png"))); // NOI18N
        jButton39.setText("Tạo Khuyến Mãi");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(0, 0, 102));
        jButton40.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/update.png"))); // NOI18N
        jButton40.setText("UPDATE");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(0, 0, 102));
        jButton41.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/delete.png"))); // NOI18N
        jButton41.setText("DELETE");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton39))
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton40)
                        .addGap(35, 35, 35)
                        .addComponent(jButton41)
                        .addGap(15, 15, 15))))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(txtTenGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtSoTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton39)
                    .addComponent(jButton40)
                    .addComponent(jButton41))
                .addGap(0, 0, 0))
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tbSanPhamGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khuyến Mãi", "Tên Sản Phẩm"
            }
        ));
        tbSanPhamGiamGia.setGridColor(new java.awt.Color(255, 255, 255));
        tbSanPhamGiamGia.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane14.setViewportView(tbSanPhamGiamGia);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Đang Hoạt Động", jPanel30);

        javax.swing.GroupLayout KhuyenMaiLayout = new javax.swing.GroupLayout(KhuyenMai);
        KhuyenMai.setLayout(KhuyenMaiLayout);
        KhuyenMaiLayout.setHorizontalGroup(
            KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        KhuyenMaiLayout.setVerticalGroup(
            KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );

        HeThong.add(KhuyenMai, "card12");

        ThongTin.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel48.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 102));
        jLabel48.setText("Họ Tên ");

        jLabel49.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 102));
        jLabel49.setText("Giới Tính");

        jLabel50.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 102));
        jLabel50.setText("Tên Chức Vụ");

        jLabel51.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 102));
        jLabel51.setText("Email");

        jLabel52.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 102));
        jLabel52.setText("Tài Khoản");

        jLabel53.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 102));
        jLabel53.setText("Ngày Sinh");

        jLabel54.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 102));
        jLabel54.setText("Quê Quán");

        jLabel56.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 102));
        jLabel56.setText("Mã Nhân Viên");

        jLabel58.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 102));
        jLabel58.setText("Mật Khẩu");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(txtEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGioiTinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 18, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQueQuanNV)
                            .addComponent(txtTaiKhoanNV)
                            .addComponent(txtMatKhauNV, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(txtNgaySinhNV))
                        .addGap(15, 15, 15))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(txtQueQuanNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel53)
                    .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtGioiTinhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(txtTaiKhoanNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel58)
                    .addComponent(txtChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThongTinLayout = new javax.swing.GroupLayout(ThongTin);
        ThongTin.setLayout(ThongTinLayout);
        ThongTinLayout.setHorizontalGroup(
            ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 319, Short.MAX_VALUE))
        );
        ThongTinLayout.setVerticalGroup(
            ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HeThong.add(ThongTin, "card10");

        ThongKe.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/image/doanhthu.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tbTop3SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tbTop3SP);

        jLabel60.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel60.setText("Danh Sách Sản Phẩm Sắp Hết Hàng <");

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });
        txtSL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSLKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        tbSanPhamTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(tbSanPhamTK);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel55.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 102));
        jLabel55.setText("Từ Ngày (dd-mm-yyyy) ");

        jLabel57.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 102));
        jLabel57.setText("Đến Ngày (dd-mm-yyyy)");

        jButton23.setBackground(new java.awt.Color(0, 0, 102));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fpt/it18103/nhom1/icon/search.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        txtTuNgay.setBackground(new java.awt.Color(255, 255, 255));

        txtDenNgay.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton23)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(jLabel57)
                        .addComponent(txtTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(0, 0, 102));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
        jPanel23.setForeground(new java.awt.Color(255, 255, 51));

        jLabel59.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("TỔNG DOANH THU ");

        tongDoanhThu.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        tongDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        tongDoanhThu.setText("jLabel60");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(tongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(tongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jButton24.setBackground(new java.awt.Color(0, 0, 102));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Excel");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(0, 0, 102));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Sort");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 0, 102));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Reset Data");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 0, 102));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Gửi Báo Cáo");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25)
                .addGap(10, 10, 10)
                .addComponent(jButton26)
                .addGap(10, 10, 10)
                .addComponent(jButton24)
                .addContainerGap())
        );

        javax.swing.GroupLayout ThongKeLayout = new javax.swing.GroupLayout(ThongKe);
        ThongKe.setLayout(ThongKeLayout);
        ThongKeLayout.setHorizontalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongKeLayout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124))
                    .addGroup(ThongKeLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ThongKeLayout.setVerticalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeLayout.createSequentialGroup()
                .addGroup(ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThongKeLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ThongKeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        HeThong.add(ThongKe, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeThong, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
                    .addComponent(menudetai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menudetai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HeThong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(SanPham);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if (txtChucVuNhanVien.getText().equals("Quản lý")) {
            HeThong.removeAll();
            HeThong.add(NhanVien);
            HeThong.repaint();
            HeThong.revalidate();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn cần cấp quyền quản lý để có thể thực hiện chức năng nhân viên");
        }

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        listChip = chipService.getall();
        new ViewChip().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:  
        new ViewRam().setVisible(true);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new ViewRom().setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        new ViewMauSac().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        new ViewHang().setVisible(true);

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        new ViewPin().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(TrangChu);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel7MousePressed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String ngayBatDau = new java.sql.Date(txtNgayBatDau.getDate().getTime()).toString();
        String ngayKetThuc = new java.sql.Date(txtNgayKetThuc.getDate().getTime()).toString();
        listVMHD = hdsi.timKiemKhoang(ngayBatDau, ngayKetThuc);
        showDataTableHD2(listVMHD);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(HoaDon);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(ThongTin);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(KhuyenMai);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel11MousePressed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        int index = tblNhanVien.getSelectedRow();
        fillData(index);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        String ten = txtTimKiem.getText();
        listNhanVien = nhanVienService.searchTen(ten);
        showDataTable(listNhanVien);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void txtTimKiemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMousePressed
        // TODO add your handling code here:ư
        String ten = txtTimKiem.getText();
        listNhanVien = nhanVienService.searchTen(ten);
        showDataTable(listNhanVien);
    }//GEN-LAST:event_txtTimKiemMousePressed

    private void deleteNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNVActionPerformed
        // TODO add your handling code here:
        String maNV = txtMa.getText();
        String remove = nhanVienService.deleteNhanVien(maNV);
        JOptionPane.showMessageDialog(this, remove);
        listNhanVien = nhanVienService.getAll();
        showDataTable(listNhanVien);

    }//GEN-LAST:event_deleteNVActionPerformed

    private void btnAddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNVActionPerformed
        // TODO add your handling code here:
        Random rd = new Random();
        String ma = "MNV" + rd.nextInt(999);
        String ten = txtTen.getText();
        boolean gioiTinh = rdoNam.isSelected();
        String tenCV = txtTenCV.getText();
        String emai = txtEmail.getText();
        String queQuan = txtQueQuan.getText();
        String ngaySinh = txtNgaySinh.getText();
        String taiKhoan = txtTaiKhoan.getText();
        String matKhau = txtMatKhau.getText();

        NhanVien nv = new NhanVien(ma, ten, gioiTinh, tenCV, emai, queQuan, ngaySinh, taiKhoan, matKhau);
        JOptionPane.showMessageDialog(this, nhanVienService.addNhanVien(nv));
        listNhanVien = nhanVienService.getAll();
        showDataTable(listNhanVien);
    }//GEN-LAST:event_btnAddNVActionPerformed

    private void btnUpdateNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNVActionPerformed
        // TODO add your handling code here:
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        boolean gioiTinh = rdoNam.isSelected();
        String tenCV = txtTenCV.getText();
        String emai = txtEmail.getText();
        String queQuan = txtQueQuan.getText();
        String ngaySinh = txtNgaySinh.getText();
        String taiKhoan = txtTaiKhoan.getText();
        String matKhau = txtMatKhau.getText();
        NhanVien nv = new NhanVien(ma, ten, gioiTinh, tenCV, emai, queQuan, ngaySinh, taiKhoan, matKhau);
        JOptionPane.showMessageDialog(this, nhanVienService.updateNhanVien(nv, ma));
        listNhanVien = nhanVienService.getAll();
        showDataTable(listNhanVien);
    }//GEN-LAST:event_btnUpdateNVActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("danhsach");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(2);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SACH");

            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Ma");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ten");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Gioi Tinh");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngay Sinh");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Chuc Vu");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Que Quan");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Email");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Tai Khoan");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Mat Khau");

            for (int i = 0; i < listNhanVien.size(); i++) {
                //Modelbook book =arr.get(i);
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue(i + 1);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getMaNV());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getTenNV());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).isGioiTinh());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getNgaySinh());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getTenCV());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getQueQuan());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getEmail());

                cell = row.createCell(8, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getTaiKhoan());

                cell = row.createCell(9, CellType.STRING);
                cell.setCellValue(listNhanVien.get(i).getMatKhau());
            }

            File f = new File("D://DANHSACHNHANVIEN.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Danh Sach Nhan Vien");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "DANHSACHNHANVIEN.pdf"));
            doc.open();
            PdfPTable tbl = new PdfPTable(9);
            tbl.addCell("Ma");
            tbl.addCell("Ten");
            tbl.addCell("Gioi Tinh");
            tbl.addCell("Ngay Sinh");
            tbl.addCell("Chuc Vu");
            tbl.addCell("Que Quan");
            tbl.addCell("Email");
            tbl.addCell("Tai Khoan");
            tbl.addCell("Mat Khau");

            for (int i = 0; i < tblNhanVien.getRowCount(); i++) {
                String ma = tblNhanVien.getValueAt(i, 0).toString();
                String ten = tblNhanVien.getValueAt(i, 1).toString();
                String gioiTinh = tblNhanVien.getValueAt(i, 2).toString();
                String ngaySinh = tblNhanVien.getValueAt(i, 3).toString();
                String chucVu = tblNhanVien.getValueAt(i, 4).toString();
                String queQuan = tblNhanVien.getValueAt(i, 5).toString();
                String email = tblNhanVien.getValueAt(i, 6).toString();
                String taiKhoan = tblNhanVien.getValueAt(i, 7).toString();
                String matKhau = tblNhanVien.getValueAt(i, 8).toString();

                tbl.addCell(ma);
                tbl.addCell(ten);
                tbl.addCell(gioiTinh);
                tbl.addCell(ngaySinh);
                tbl.addCell(chucVu);
                tbl.addCell(queQuan);
                tbl.addCell(email);
                tbl.addCell(taiKhoan);
                tbl.addCell(matKhau);

            }

            doc.add(tbl);

            JOptionPane.showMessageDialog(null, "Download PDF File", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
        } catch (FileNotFoundException ex) {
        } catch (DocumentException ex) {
        }
        doc.close();
    }//GEN-LAST:event_btnPDFActionPerformed

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(BanHang);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if (txtTienThua.getText().isEmpty() || txtTienThua.getText() == null) {
            JOptionPane.showMessageDialog(this, "Không thể thanh toán");
        } else {
            int row = tblHoaDonBanHang.getSelectedRow();
            HoaDon hoaDonViewModel = hdsi.getAll().get(row);
            JOptionPane.showMessageDialog(this, hdsi.updateThanhToan(hoaDonViewModel.getMaHD()));
            showDataTableHD(hdsi.getAll());
            listVMGH.clear();
            listVMGH.removeAll(listVMGH);
            showGH(listVMGH);
        }

    }//GEN-LAST:event_jButton19ActionPerformed

    private void tblSanPhamBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamBanHangMouseClicked
        // TODO add your handling code here:

        ViewModelGioHang chiTietHoaDonViewModel = new ViewModelGioHang();
        JOptionPane frame = new JOptionPane();
        String textNhap = JOptionPane.showInputDialog(frame, "Xin mời nhập số lượng", 1);
        if (textNhap == null) {
            frame.setVisible(false);
        } else if (textNhap.matches("\"[a-z A-Z]+\"") == true) {
            JOptionPane.showMessageDialog(this, "Sai định dạng số lượng");
        } else if (textNhap.isEmpty() == false && textNhap.matches("\\d+") == true) {
            int soLuongNhap = Integer.valueOf(textNhap);
            int row = tblSanPhamBanHang.getSelectedRow();
            int soLuong = (int) tblSanPhamBanHang.getValueAt(row, 3);
            if (soLuongNhap > soLuong) {
                JOptionPane.showMessageDialog(rootPane, "Vượt quá số lượng tồn");
            } else {
                ViewModelSanPham sanPhamBanHang = listVMSP.get(row);
                sanPhamBanHang.setSoLuong(soLuong - soLuongNhap);
                showSanPhamBH(listVMSP);
                String maSP = sanPhamBanHang.getMaSP();
                String tenSP = sanPhamBanHang.getTenSP();
                float donGia = (float) dtmSPBH.getValueAt(row, 4);
                ViewModelGioHang gioHang = new ViewModelGioHang(maSP, tenSP, soLuongNhap, donGia, (float) soLuongNhap * donGia);
                listVMGH.add(gioHang);
                showGH(listVMGH);
                tblGioHang.clearSelection();

            }
        }
    }//GEN-LAST:event_tblSanPhamBanHangMouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        String sdt = txtSDT.getText();

        String regex = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";

        if (sdt.isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Nhap SDT Khach Hang");
        } else if (sdt.matches("[a-z A-Z]+")) {
            JOptionPane.showConfirmDialog(this, "Khong dung dinh dang");

        } else if (!sdt.matches(regex)) {
            JOptionPane.showConfirmDialog(this, "So dien thoai khong hop le");

        } else {
            String idHD = String.valueOf(UUID.randomUUID());
            String ngayTao = String.valueOf(java.time.LocalDate.now());
//        NhanVien nv = nhanVienService.getOne((String) cbbNhanVien.getSelectedItem());
            KhachHang kh = khachHangService.getOne((String) cbbKhachHang.getSelectedItem());
            nv = nhanVienService.getOneTK(data);
            Random rd = new Random();
            String maHD = "MHD" + rd.nextInt(999);
            HoaDon vmhd = new HoaDon(idHD, kh, nv, maHD, ngayTao, false, sdt);
            JOptionPane.showMessageDialog(this, hdsi.add(vmhd));
            for (ViewModelGioHang gioHang : listVMGH) {
                ChiTietSP ctsp = chiTietSanPhamService.getOneTen(gioHang.getTenSP());
                HoaDonCT hdct = new HoaDonCT(vmhd, ctsp, gioHang.getSoLuong(), gioHang.getDonGia());
                hdctS.add(hdct);
            }
            showDataTableHD(hdsi.getAll());
            dtmGH.getDataVector().removeAllElements();
            dtmGH.fireTableDataChanged();
            listVMGH.clear();
            listVMGH.removeAll(listVMGH);
        }


    }//GEN-LAST:event_jButton18ActionPerformed

    private void txtTienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyReleased
        // TODO add your handling code here:
        if (txtTienKhachDua.getText().isEmpty() == false) {
            float tienKhachDua = Float.valueOf(txtTienKhachDua.getText());
            float tongTien = Float.valueOf(txtTongTien.getText());
            if (tienKhachDua < tongTien) {
                lbError.setText("*Tiền không đủ");
            } else {
                txtTongTien.setText(String.format("%,.2f", tongTien));
                txtTienKhachDua.setText(String.format("%,.2f", tienKhachDua));
                txtTienThua.setText(String.format("%,.2f", tienKhachDua - tongTien));
                lbError.setText(" ");

            }

        }
    }//GEN-LAST:event_txtTienKhachDuaKeyReleased

    private void tblHoaDonBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonBanHangMouseClicked
        // TODO add your handling code here:4
        int row = tblHoaDonBanHang.getSelectedRow();
        HoaDon hoaDon = hdsi.getAll().get(row);
        txtMaHD.setText(hoaDon.getMaHD());
        txtNgayTao.setText(hoaDon.getNgayTao());
        txtTenNVBanHang.setText(hoaDon.getNhanVien().getTenNV());
        cbbKhachHang.setSelectedItem(hoaDon.getKhachHang().getTenKH());
        float tongTien = 0;
        for (HoaDonCT hdct : hdctS.getHDCT(hoaDon.getID())) {
            tongTien += hdct.getDonGia() * hdct.getSoLuong();
        }
        txtTongTien.setText(String.valueOf(tongTien));
        txtSDT.setText(hoaDon.getSdt());


    }//GEN-LAST:event_tblHoaDonBanHangMouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        String ma = txtMaTimKiem.getText();
        listVMSP = spbh.searchMa(ma);
        showSanPhamBH(listVMSP);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.daThanhToan();
        showDataTableHD(listVMHD);

    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoChuaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuaThanhToanActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.chuaThanhToan();
        showDataTableHD(listVMHD);
    }//GEN-LAST:event_rdoChuaThanhToanActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void btnSortDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDescActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.sortDESC();
        showDataTableHD2(listVMHD);
    }//GEN-LAST:event_btnSortDescActionPerformed

    private void btnExcelHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelHDActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("danhsach");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(2);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SACH");

            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã Hóa Đơn");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Ngày Tạo");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số Lượng");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Đơn Giá");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Thành Tiền");

            for (int i = 0; i < listVMGHTT.size(); i++) {
                //Modelbook book =arr.get(i);
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getHd().getMaHD());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getHd().getNgayTao());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getCtsp().getMaSP());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getCtsp().getTenSP());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getSoLuong());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getDonGia());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(listVMGHTT.get(i).getThanhTien());

            }

            File f = new File("D://DANHSACHSANPHAM.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Danh Sach San Pham Da Ban");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_btnExcelHDActionPerformed

    private void btnPDFHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFHDActionPerformed
        // TODO add your handling code here:
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "DANHSACHSANPHAMDATHANHTOAN.pdf"));
            doc.open();
            PdfPTable tbl = new PdfPTable(7);
            tbl.addCell("Ma HĐ");
            tbl.addCell("Ngay Tao");
            tbl.addCell("Ma SP");
            tbl.addCell("Ten SP");
            tbl.addCell("So Luong");
            tbl.addCell("Don Gia");
            tbl.addCell("Thanh Tien");

            for (int i = 0; i < tbSanPham.getRowCount(); i++) {
                String maHD = tbSanPham.getValueAt(i, 0).toString();
                String ngayTao = tbSanPham.getValueAt(i, 1).toString();
                String maSP = tbSanPham.getValueAt(i, 2).toString();
                String tenSP = tbSanPham.getValueAt(i, 3).toString();
                String soLuong = tbSanPham.getValueAt(i, 4).toString();
                String donGia = tbSanPham.getValueAt(i, 5).toString();
                String thanhTien = tbSanPham.getValueAt(i, 6).toString();

                tbl.addCell(maHD);
                tbl.addCell(ngayTao);
                tbl.addCell(maSP);
                tbl.addCell(tenSP);
                tbl.addCell(soLuong);
                tbl.addCell(donGia);
                tbl.addCell(thanhTien);
            }

            doc.add(tbl);

            JOptionPane.showMessageDialog(null, "Download PDF File", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
        } catch (FileNotFoundException ex) {
        } catch (DocumentException ex) {
        }
        doc.close();
    }//GEN-LAST:event_btnPDFHDActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.sortASC();
        showDataTableHD2(listVMHD);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void btnAddKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKHActionPerformed
        // TODO add your handling code here:
        if (txtMakh.getText().equals(kh.getMaKH())) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng đã tồn tại");
        } else {
            Random rd = new Random();
            String ma = "MKH" + rd.nextInt(999);
            String tenKH = txtTenkh.getText();
            String sdt = txtsdtKH.getText();
            String email = txtEmailKH.getText();
            boolean gioiTinh = rdoNamKH.isSelected();
            String ngaySinh = txtNgaySinhKH.getText();
            String diaChi = txtDiaChiKH.getText();

            KhachHang kh = new KhachHang(ma, tenKH, sdt, email, gioiTinh, ngaySinh, diaChi);
            JOptionPane.showMessageDialog(this, khachHangService.add(kh));
            listKhachHang = khachHangService.getAll();
            showKhachHang(listKhachHang);
        }
    }//GEN-LAST:event_btnAddKHActionPerformed

    private void btnDeleteKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKHActionPerformed
        // TODO add your handling code here:
        String maKH = txtMakh.getText();
        String remove = khachHangService.delete(maKH);
        JOptionPane.showMessageDialog(this, remove);
        listKhachHang = khachHangService.getAll();
        showKhachHang(listKhachHang);
    }//GEN-LAST:event_btnDeleteKHActionPerformed

    private void btnUpdateKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateKHActionPerformed
        // TODO add your handling code here:
        String maKH = txtMakh.getText();
        String tenKH = txtTenkh.getText();
        String sdt = txtsdtKH.getText();
        String email = txtEmailKH.getText();
        boolean gioiTinh = rdoNamKH.isSelected();
        String ngaySinh = txtNgaySinhKH.getText();
        String diaChi = txtDiaChiKH.getText();

        KhachHang kh = new KhachHang(maKH, tenKH, sdt, email, gioiTinh, ngaySinh, diaChi);
        JOptionPane.showMessageDialog(this, khachHangService.update(kh, maKH));
        listKhachHang = khachHangService.getAll();
        showKhachHang(listKhachHang);
    }//GEN-LAST:event_btnUpdateKHActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        int row = tblKhachHang.getSelectedRow();
        fillDataKH(row);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnTimKiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemKHActionPerformed
        // TODO add your handling code here:
        String tenKH = txtTimTenKH.getText();
        listKhachHang = khachHangService.searchTen(tenKH);
        showKhachHang(listKhachHang);
    }//GEN-LAST:event_btnTimKiemKHActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.getAll();
        showDataTableHD(listVMHD);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        // TODO add your handling code here:
        tblGioHang.clearSelection();
        tblGioHang.removeEditor();
    }//GEN-LAST:event_tblGioHangMouseClicked

    private void txtMaTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaTimKiemKeyReleased
        // TODO add your handling code here:
        String ma = txtMaTimKiem.getText();
        listVMSP = spbh.searchMa(ma);
        showSanPhamBH(listVMSP);
    }//GEN-LAST:event_txtMaTimKiemKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDSImei.getModel();
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null;
        String defaultCurrentDirectoryPath = "D:\\";
        JFileChooser excelFileChooser = new JFileChooser(defaultCurrentDirectoryPath);
        excelFileChooser.setDialogTitle("Select Excel File");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showOpenDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
//                jExcelFilePath.setText(excelFile.toString());
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportToJTable = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);

                for (int row = 1; row < excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);
                    XSSFCell imei = excelRow.getCell(0);
                    model.addRow(new Object[]{imei});
                }
                JOptionPane.showMessageDialog(null, "Imported Successfully !!.....");
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            } finally {
                try {
                    if (excelFIS != null) {
                        excelFIS.close();
                    }
                    if (excelBIS != null) {
                        excelBIS.close();
                    }
                    if (excelImportToJTable != null) {
                        excelImportToJTable.close();
                    }
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, iOException.getMessage());
                }
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        listVMHD = hdsi.getAll();
        showDataTableHD2(listVMHD);

        listVMGHTT = hdctS.getData();
        showDataGioHangThanhToan(listVMGHTT);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void cbbRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbRamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            JFileChooser f = new JFileChooser("D:\\Nhom1_IT18103_DuAnFinal\\picture");
            f.setDialogTitle("Mo file");
            f.showOpenDialog(null);
            File ftenanh = f.getSelectedFile();
            duongDanAnh = ftenanh.getAbsolutePath();
            if (duongDanAnh != null) {
                lbl_img.setIcon(ResizeImage(String.valueOf(duongDanAnh)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblChiTietSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietSPMouseClicked
        // TODO add your handling code here:
        int row = tblChiTietSP.getSelectedRow();
        fillDataCTSP(row);
    }//GEN-LAST:event_tblChiTietSPMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String maCTSP = txtMaCTSP.getText();
        String tenCTSP = txtTenSP.getText();
        float donGia = Float.valueOf(txtDonGia.getText());
        String.format("%,.2f", donGia);

        String moTa = txtMoTa.getText();
        MauSac ms = mauSacService.getOne((String) cbbMauSac.getSelectedItem());
        HangDienThoai hdt = hangDienThoaiService.getOne((String) cbbHang.getSelectedItem());
        Chip chip = chipService.getOne((String) cbbChip.getSelectedItem());
        Ram ram = ramService.getOne((String) cbbRam.getSelectedItem());
        Rom rom = romService.getOne((String) cbbRom.getSelectedItem());
        Pin pin = pinService.getOne((String) cbbPin.getSelectedItem());
        int soLuong = Integer.valueOf(txtSoLuong.getText());
        ChiTietSP chiTietSP = new ChiTietSP(maCTSP, tenCTSP, donGia, moTa, duongDanAnh, ms, hdt, chip, ram, rom, pin, soLuong);
        JOptionPane.showMessageDialog(this, chiTietSanPhamService.update(chiTietSP, maCTSP));
        listCTSP = chiTietSanPhamService.getAll();
        showDataCTSP(listCTSP);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        listVMSP = spbh.getAll();
        showSanPhamBH(listVMSP);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        addChiTietSP();
        listCTSP = chiTietSanPhamService.getAll();
        showDataCTSP(listCTSP);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String ma = txtMaCTSP.getText();
        JOptionPane.showMessageDialog(this, chiTietSanPhamService.delete(ma));
        listCTSP = chiTietSanPhamService.getAll();
        showDataCTSP(listCTSP);
        txtMaCTSP.setText("");
        txtTenSP.setText(" ");
        txtSoLuong.setText(" ");
        tblDSImei.removeAll();
        txtDonGia.setText(" ");
        txtMoTa.setText(" ");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String search = txtSanPham.getText();
        listCTSP = chiTietSanPhamService.searchTen(search);
        showDataCTSP(listCTSP);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        Random rd = new Random();
        String ma = "MGG" + rd.nextInt(999);
        String ten = txtTenGiamGia.getText();

        String ngayMua = String.valueOf(java.time.LocalDate.now());
        String ngayKT = txtNgayKT.getText();
        float soTien = Float.valueOf(txtSoTienGiam.getText());
        GiamGia gg = new GiamGia(ma, ten, ngayMua, ngayKT, soTien);
        JOptionPane.showMessageDialog(this, ggs.add(gg));
        listGiamGia = ggs.getall();
        showGiamGia(listGiamGia);

    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        String ma = txtMaGiamGia.getText();
        String ten = txtTenGiamGia.getText();

        String ngayMua = String.valueOf(java.time.LocalDate.now());
        String ngayKT = txtNgayKT.getText();
        float soTien = Float.valueOf(txtSoTienGiam.getText());
        GiamGia gg = new GiamGia(ma, ten, ngayMua, ngayKT, soTien);
        JOptionPane.showMessageDialog(this, ggs.update(gg, ma));
        listGiamGia = ggs.getall();
        showGiamGia(listGiamGia);        // TODO add your handling code here:

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:4
        String ma = txtMaGiamGia.getText();
        JOptionPane.showMessageDialog(this, ggs.delete(ma));
        listGiamGia = ggs.getall();
        showGiamGia(listGiamGia);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void tblGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGiamGiaMouseClicked
        // TODO add your handling code here:
        int row = tblGiamGia.getSelectedRow();
        fillDataGiamGia(row);
    }//GEN-LAST:event_tblGiamGiaMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        for (KhachHang kh : listKhachHang) {
            dcdmKhachHang.addElement(kh.getTenKH());
        }
        showKhachHang(listKhachHang);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MousePressed
        // TODO add your handling code here:
        HeThong.removeAll();
        HeThong.add(KhachHang);
        HeThong.repaint();
        HeThong.revalidate();
    }//GEN-LAST:event_jLabel47MousePressed

    private void txtMaHDBanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHDBanKeyReleased
        // TODO add your handling code here:
        String ma = txtMaHDBan.getText();
        listVMGHTT = hdctS.searchMa(ma);
        showDataGioHangThanhToan(listVMGHTT);
    }//GEN-LAST:event_txtMaHDBanKeyReleased

    private void txtMaHDBanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaHDBanKeyPressed
        // TODO add your handling code here:
        String ma = txtMaHDBan.getText();
        listVMGHTT = hdctS.searchMa(ma);
        showDataGioHangThanhToan(listVMGHTT);
    }//GEN-LAST:event_txtMaHDBanKeyPressed

    private void txtTimMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimMaKeyReleased
        // TODO add your handling code here:
        String ma = txtTimMa.getText();
        listVMHD = hdsi.searchMa(ma);
        showDataTableHD2(listVMHD);
    }//GEN-LAST:event_txtTimMaKeyReleased

    private void btnTimMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimMaActionPerformed
        // TODO add your handling code here:
        String ma = txtTimMa.getText();
        listVMHD = hdsi.searchMa(ma);
        showDataTableHD2(listVMHD);
    }//GEN-LAST:event_btnTimMaActionPerformed

    private void btnTimMa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimMa1ActionPerformed
        // TODO add your handling code here:
        String ma = txtMaHDBan.getText();
        listVMGHTT = hdctS.searchMa(ma);
        showDataGioHangThanhToan(listVMGHTT);
    }//GEN-LAST:event_btnTimMa1ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        String tuNgay = new java.sql.Date(txtTuNgay.getDate().getTime()).toString();
        String denNgay = new java.sql.Date(txtDenNgay.getDate().getTime()).toString();
        listThongKe = thongKeService.searchThoiGian(tuNgay, denNgay);
        showThongKe(listThongKe);

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jLabel61KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel61KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel61KeyPressed

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        // TODO add your handling code here:

        if (txtChucVuNhanVien.getText().equals("Quản lý")) {
            HeThong.removeAll();
            HeThong.add(ThongKe);
            HeThong.repaint();
            HeThong.revalidate();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn cần cấp quyền quản lý để có thể thực hiện chức năng thống kê");
        }
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        listThongKe = thongKeService.getAll();
        showThongKe(listThongKe);
        Tong();
        listTop3 = sanPhamTopService.top3();
        showSanPhamTop(listTop3);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("danhsach");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(2);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SACH SẢN PHẨM ĐÃ BÁN TRONG NĂM");

            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã Hóa Đơn");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên Nhân Viên");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Tên Khách Hàng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số Lượng");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Đơn Giá");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Ngày Tạo");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Thành Tiền");

            for (int i = 0; i < listThongKe.size(); i++) {
                //Modelbook book =arr.get(i);
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getHd().getMaHD());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getNv().getTenNV());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getKh().getTenKH());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getHdct().getSoLuong());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getHdct().getDonGia());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getHd().getNgayTao());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(listThongKe.get(i).getHdct().getDonGia() * listThongKe.get(i).getHdct().getSoLuong());

            }

            File f = new File("D://DANHSACHSANPHAMDABANTRONGNAM.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Danh Sach San Pham Da Ban");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        listThongKe = thongKeService.sortNgayTao();
        showThongKe(listThongKe);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txtMaCTSP.setText("");
        txtTenSP.setText(" ");
        txtSoLuong.setText(" ");
        tblDSImei.setModel(new DefaultTableModel(null, new String[]{"Imei"}));
        txtDonGia.setText(" ");
        txtMoTa.setText(" ");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLActionPerformed

    private void txtSLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLKeyReleased
        // TODO add your handling code here:
        int soLuong = Integer.parseInt(txtSL.getText());
        listTop3 = sanPhamTopService.search(soLuong);
        showSanPhamTop(listTop3);

    }//GEN-LAST:event_txtSLKeyReleased

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        String tuNgay = new java.sql.Date(txtTuNgay.getDate().getTime()).toString();
        String denNgay = new java.sql.Date(txtDenNgay.getDate().getTime()).toString();
        final String username = "tiepnmph25816@fpt.edu.vn";
        final String password = "tiepthinh@";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tiepnmph25816@fpt.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("doitruongtiep@gmail.com")
            );

            message.setSubject("THONG BAO DOANH THU: NHOM 1 BAN DIEN THOAI  [ " + tuNgay + " DEN " + denNgay + " ]");
            String baocao = "TONG DOANH THU " + "[ " + tuNgay + " DEN " + denNgay + " ]" + "\n"
                    + "--------------------------------------------------------------------------\n"
                    + "TONG DOANH THU                           : " + tongDoanhThu.getText() + "\n";
            message.setText(baocao);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Gửi Báo Cáo Thành Công");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        listVMGH.clear();
        listVMGH.removeAll(listVMGH);
        showGH(listVMGH);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        txtTenNVBanHang.setText(" ");
        txtSDT.setText("");
        txtMaHD.setText(" ");
        txtTongTien.setText(" ");
        txtTienKhachDua.setText("");
        txtNgayTao.setText("");
        txtTienThua.setText("");
        txtEmailDen.setText(" ");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:

        final String username = "tiepnmph25816@fpt.edu.vn";
        final String password = "tiepthinh@";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tiepnmph25816@fpt.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(txtEmailDen.getText())
            );
            message.setSubject("Ban Da Thanh Toan Hoa Don Thanh Cong");
            String baocao
                    = "Ngay Tao                              :" + txtNgayTao.getText() + "\n"
                    + "Ma Hoa Don                            :" + txtMaHD.getText() + "\n"
                    + "Ten Nhan Vien                         :" + txtTenNVBanHang.getText() + "\n"
                    + "Ten Khach Hang                        :" + cbbKhachHang.getSelectedItem() + "\n"
                    + "So Dien Thoai                         :" + txtSDT.getText() + "\n"
                    + "Tong Tien Hoa Don                     :" + txtTongTien.getText() + "\n"
                    + "Tien Khach Dua                        :" + txtTienKhachDua.getText() + "\n"
                    + "--------------------------------------------------------------------------\n"
                    + "Tien Thua                             :" + txtTienThua.getText() + "\n";
            message.setText(baocao);

            Transport.send(message);
            JOptionPane.showConfirmDialog(this, "Gửi Thông Tin Hóa Đơn Thành Công");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanHang;
    private javax.swing.JPanel HeThong;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel KhachHang;
    private javax.swing.JPanel KhuyenMai;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JPanel ThongTin;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnDeleteKH;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnExcelHD;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPDFHD;
    private javax.swing.JButton btnSortDesc;
    private javax.swing.JButton btnTimKiemKH;
    private javax.swing.JButton btnTimMa;
    private javax.swing.JButton btnTimMa1;
    private javax.swing.JButton btnUpdateKH;
    private javax.swing.JButton btnUpdateNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbbChip;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JComboBox<String> cbbKhachHang;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbPin;
    private javax.swing.JComboBox<String> cbbRam;
    private javax.swing.JComboBox<String> cbbRom;
    private javax.swing.JButton deleteNV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lb_Tendetai;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menudetai;
    private javax.swing.JRadioButton rdoChuaThanhToan;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNamKH;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoNuKH;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTable tbSanPhamGiamGia;
    private javax.swing.JTable tbSanPhamTK;
    private javax.swing.JTable tbTop3SP;
    private javax.swing.JTable tblChiTietSP;
    private javax.swing.JTable tblDSImei;
    private javax.swing.JTable tblGiamGia;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDonBanHang;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblSanPhamBanHang;
    private javax.swing.JLabel tongDoanhThu;
    private javax.swing.JTextField txtChucVuNV;
    private javax.swing.JLabel txtChucVuNhanVien;
    private com.toedter.calendar.JDateChooser txtDenNgay;
    private javax.swing.JTextArea txtDiaChiKH;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailDen;
    private javax.swing.JTextField txtEmailKH;
    private javax.swing.JTextField txtEmailNV;
    private javax.swing.JTextField txtGioiTinhNhanVien;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCTSP;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaHDBan;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaTimKiem;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtMatKhauNV;
    private javax.swing.JTextArea txtMoTa;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private javax.swing.JTextField txtNgayKT;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgaySinhKH;
    private javax.swing.JTextField txtNgaySinhNV;
    private javax.swing.JLabel txtNgayTao;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtQueQuanNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtSanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoTienGiam;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTaiKhoanNV;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenCV;
    private javax.swing.JLabel txtTenDayDu;
    private javax.swing.JTextField txtTenGiamGia;
    private javax.swing.JTextField txtTenNVBanHang;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenkh;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimMa;
    private javax.swing.JTextField txtTimTenKH;
    private javax.swing.JTextField txtTongTien;
    private com.toedter.calendar.JDateChooser txtTuNgay;
    private javax.swing.JTextField txtsdtKH;
    // End of variables declaration//GEN-END:variables

}

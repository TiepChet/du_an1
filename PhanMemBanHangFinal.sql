CREATE DATABASE BANHANGDIENTHOAI
go
USE BANHANGDIENTHOAI
GO

--22-03-2023
CREATE TABLE NhanVien(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaNhanVien nvarchar(50) NOT NULL,
	HoTen nvarchar(150) null,
	GioiTinh bit NULL,
	TenCV nvarchar(50)  NULL,
	Email varchar(50) NULL,
	QueQuan nvarchar(max)  NULL,
	NgaySinh date  NULL,
	TaiKhoan varchar(50)  NULL,
	MatKhau varchar(50) NULL,

)



CREATE TABLE Chip(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaChip nvarchar(50) NOT NULL,
	TenChip nvarchar(max) NULL,
)


CREATE TABLE HangDienThoai(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaHang nvarchar(50) NOT NULL,
	TenHang nvarchar(50) NULL,
)

CREATE TABLE MauSac(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaMauSac nvarchar(50) NOT NULL,
	TenMauSac nvarchar(50) NULL,
)

CREATE TABLE Pin(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaPin nvarchar(50) NOT NULL,
	TenPin varchar(max) NULL,

 )

CREATE TABLE Ram(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaRam nvarchar(50) NOT NULL,
	DungLuong varchar(max) NULL,

)

CREATE TABLE Rom(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaRom nvarchar(50) NOT NULL,
	TenRom varchar(max) NULL,

)



CREATE TABLE SanPham(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaSP nvarchar(50) NOT NULL,
	TenSP nvarchar(50)  NULL,
	DonGia float  NULL,
	Mota nvarchar(max) NULL,
	UrlAnh nvarchar(max) NULL,
	IdMauSac int NOT NULL,
	IdHang int NOT NULL,
	IdChip int NOT NULL,
	IdRam int  NOT NULL,
	IdRom int  NOT NULL,
	IdPin int  NOT NULL,
	SoLuong int NOT NULL,

)

 CREATE TABLE Imei(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaImei nvarchar(50) NOT NULL,
	Imei varchar(max) NULL,
	IdSP int NOT NULL,
	TrangThai BIT,

)

CREATE TABLE HoaDon(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH int,
IdNV int,
MaHD VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
TrangThai bit,
Sdt VARCHAR(30) DEFAULT NULL,
)

CREATE TABLE HoaDonChiTiet(
IdHD UNIQUEIDENTIFIER,
IdSP int,
SoLuong INT,
DonGia FLOAT,
CONSTRAINT FK1_hoadon FOREIGN KEY(IdHD) REFERENCES HoaDon(Id),
CONSTRAINT FK2_sanphamhd FOREIGN KEY(IdSP) REFERENCES SanPham(Id),
)

CREATE TABLE KhachHang(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaKH nvarchar(50) NOT NULL,
	HoTen NVARCHAR(50) NULL,
	SDT VARCHAR(20) NULL,
	Email VARCHAR(50) NULL,
	GioiTinh BIT NULL,
	NgaySinh Date NULL,
	DiaChi NVARCHAR(MAX) NULL,

)

CREATE TABLE GiamGia(
	Id int IDENTITY(1,1) PRIMARY KEY,
	MaGiamGia nvarchar(50) NOT NULL,
	TenGiamGia nvarchar(50)  NULL,
	NgayBatDau datetime NOT NULL,
	NgayKetThuc datetime NOT NULL,
	SoTienGiam float NULL,

)


CREATE TABLE SanPhamGiamGia(
	Id int IDENTITY(1,1) PRIMARY KEY,
	IdSP int NOT NULL,
	IdGiamGia int NOT NULL,
	CONSTRAINT FK1_giamGiaSP FOREIGN KEY(IdSP) REFERENCES SanPham(Id),
	CONSTRAINT FK2_giaGiaKM FOREIGN KEY(IdGiamGia) REFERENCES GiamGia(Id),
)



--lien ket
--
--ALTER TABLE DoiTra ADD FOREIGN KEY (IdHD) REFERENCES HoaDon(Id)
--
ALTER TABLE Imei ADD FOREIGN KEY (IdSP) REFERENCES SanPham(Id)
--
--
ALTER TABLE HoaDon ADD FOREIGN KEY (IdNV) REFERENCES NhanVien(Id)
--
--ALTER TABLE SanPham ADD FOREIGN KEY (IdAnh) REFERENCES Anh(Id)
--
ALTER TABLE SanPham ADD FOREIGN KEY (IdRom) REFERENCES Rom(Id)
--
ALTER TABLE SanPham ADD FOREIGN KEY (IdPin) REFERENCES Pin(Id)
--
ALTER TABLE SanPham ADD FOREIGN KEY (IdRam) REFERENCES Ram(Id)
--
ALTER TABLE SanPham ADD FOREIGN KEY (IdChip) REFERENCES Chip(Id)
--
ALTER TABLE  SanPham  ADD FOREIGN KEY (IdHang) REFERENCES HangDienThoai(Id)
--
ALTER TABLE SanPham  ADD FOREIGN KEY (IdMauSac) REFERENCES MauSac(Id)


--
ALTER TABLE HoaDon ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(Id)


	INSERT INTO NhanVien (MaNhanVien,HoTen,GioiTinh,TenCV,Email,QueQuan,NgaySinh,TaiKhoan,MatKhau)
			VALUES(N'MNV001',N'Ninh Viet Thanh',1,N'Quản lý',N'thanhnvph25817@fpt.edu.vn',N'Thái Bình','2003-10-16',N'thanh123',123);
	INSERT INTO NhanVien (MaNhanVien,HoTen,GioiTinh,TenCV,Email,QueQuan,NgaySinh,TaiKhoan,MatKhau)
			VALUES(N'MNV002',N'Nguyen Manh Tiep',1,N'Quản lý',N'tiepnmph25816@fpt.edu.vn',N'Thái Bình','2003-10-15',N'tiep123',123);
	INSERT INTO NhanVien (MaNhanVien,HoTen,GioiTinh,TenCV,Email,QueQuan,NgaySinh,TaiKhoan,MatKhau)
			VALUES(N'MNV003',N'Tran Xuan Hung',1,N'Nhân viên',N'hxtph20411@fpt.edu.vn',N'Thái Bình','2003-12-12',N'hung123',123);
	INSERT INTO NhanVien (MaNhanVien,HoTen,GioiTinh,TenCV,Email,QueQuan,NgaySinh,TaiKhoan,MatKhau)
			VALUES(N'MNV004',N'Phan Nguyen Minh Quan',1,N'Nhân viên',N'qmnpph23011@fpt.edu.vn',N'Thái Bình','2003-12-11',N'quan123',123);
	INSERT INTO NhanVien (MaNhanVien,HoTen,GioiTinh,TenCV,Email,QueQuan,NgaySinh,TaiKhoan,MatKhau)
			VALUES(N'MNV005',N'Pham Quang Duong',1,N'Nhân viên',N'duongqpph22571@fpt.edu.vn',N'Thái Bình','2003-12-25',N'duong123',123);



	INSERT INTO KhachHang (MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi)
			VALUES('MKH001', N'ADAM', '0976597747', 'kh1@fpt.edu.vn', 1,'2003-01-01', N'Hà Nội');
	INSERT INTO KhachHang (MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi)
			VALUES('MKH002', N'ALEX', '0399517718', 'kh2@fpt.edu.vn' , 1, '2003-01-01', N'Hà Nội');
	INSERT INTO KhachHang (MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi)
			VALUES('MKH003', N'MIN', '03935338659', 'kh3@fpt.edu.vn',1, '2003-01-01', N'Hà Nội');
	INSERT INTO KhachHang (MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi)
			VALUES('MKH004', N'JACK', '0912614418', 'kh4@fpt.edu.vn',1, '2003-01-01', N'Hà Nội');
	INSERT INTO KhachHang (MaKH, HoTen, SDT, Email, GioiTinh, NgaySinh, DiaChi)
			VALUES('MKH005', N'HELLEN', '0278965444', 'kh5@fpt.edu.vn',1, '2003-01-01', N'Hà Nội');



		INSERT INTO Chip(MaChip,TenChip)
			VALUES('MC001',N'Chip Snapdragon');
		INSERT INTO Chip(MaChip,TenChip)
			VALUES('MC002',N'Chip Chipset');
		INSERT INTO Chip(MaChip,TenChip) 
			VALUES('MC003',N'Chip Apple');
		INSERT INTO Chip(MaChip,TenChip)
			VALUES('MC004',N' Chip Exynos');
		INSERT INTO Chip(MaChip,TenChip)
			VALUES('MC005',N'Chip MediaTek');


		

		
			INSERT INTO HangDienThoai(MaHang,TenHang)
				VALUES('MH001','iphone');
			INSERT INTO HangDienThoai(MaHang,TenHang)
				VALUES('MH002','samsum');
			INSERT INTO HangDienThoai(MaHang,TenHang)
				VALUES('MH003','nokia');
			INSERT INTO HangDienThoai(MaHang,TenHang)
				VALUES('MH004','remi');
			INSERT INTO HangDienThoai(MaHang,TenHang)
				VALUES('MH005','oppo');


	

		INSERT INTO GiamGia(MaGiamGia,TenGiamGia,NgayBatDau,NgayKetThuc,SoTienGiam)
				VALUES('GG001','giam gia','2023-03-28','2023-04-30','10000');
		INSERT INTO GiamGia(MaGiamGia,TenGiamGia,NgayBatDau,NgayKetThuc,SoTienGiam)
				VALUES('GG002','giam gia','2023-03-28','2023-04-30','20000');
		INSERT INTO GiamGia(MaGiamGia,TenGiamGia,NgayBatDau,NgayKetThuc,SoTienGiam)
				VALUES('GG003','giam gia','2023-03-28','2023-04-30','30000');
		INSERT INTO GiamGia(MaGiamGia,TenGiamGia,NgayBatDau,NgayKetThuc,SoTienGiam)
				VALUES('GG004','giam gia','2023-03-28','2023-04-30','40000');
		INSERT INTO GiamGia(MaGiamGia,TenGiamGia,NgayBatDau,NgayKetThuc,SoTienGiam)
				VALUES('GG005','giam gia','2023-03-28','2023-04-30','50000');


		INSERT INTO MauSac(MaMauSac,TenMauSac)
				VALUES('MS001','Red');
		INSERT INTO MauSac(MaMauSac,TenMauSac)
				VALUES('MS002','Blue');
		INSERT INTO MauSac(MaMauSac,TenMauSac)
				VALUES('MS003','Pink');
		INSERT INTO MauSac(MaMauSac,TenMauSac)
				VALUES('MS004','While');
		INSERT INTO MauSac(MaMauSac,TenMauSac)
				VALUES('MS005','Black');



		INSERT INTO Pin(MaPin,TenPin)
				VALUES('MP001','lipo');
		INSERT INTO Pin(MaPin,TenPin)
				VALUES('MP002','liion');
		INSERT INTO Pin(MaPin,TenPin)
				VALUES('MP003','lithium');
		INSERT INTO Pin(MaPin,TenPin)
				VALUES('MP004','Pisen');
		INSERT INTO Pin(MaPin,TenPin)
				VALUES('MP005','pin 3 cell');



		INSERT INTO Ram(MaRam,DungLuong)
				VALUES('MR001','12 GB');
		INSERT INTO Ram(MaRam,DungLuong)
				VALUES('MR002','6 GB');
		INSERT INTO Ram(MaRam,DungLuong)
				VALUES('MR003','8 GB');
		INSERT INTO Ram(MaRam,DungLuong)
				VALUES('MR004','2 GB');
		INSERT INTO Ram(MaRam,DungLuong)
				VALUES('MR005','1 GB');
		


		INSERT INTO Rom(MaRom,TenRom)
				VALUES('MR001','8 GB')
		INSERT INTO Rom(MaRom,TenRom)
				VALUES('MR002','16 GB')
		INSERT INTO Rom(MaRom,TenRom)
				VALUES('MR003','32 GB')
		INSERT INTO Rom(MaRom,TenRom)
				VALUES('MR004','64 GB')
		INSERT INTO Rom(MaRom,TenRom)
				VALUES('MR005','128 GB')





		INSERT INTO SanPham(MaSP,TenSP,DonGia,Mota,UrlAnh,IdMauSac,IdHang,IdChip,IdRam,IdRom,IdPin,SoLuong)
				VALUES('MSP001','iphone',1000000,'hang moi ve','anh1',1,1,1,1,1,1,3);
		INSERT INTO SanPham(MaSP,TenSP,DonGia,Mota,UrlAnh,IdMauSac,IdHang,IdChip,IdRam,IdRom,IdPin,SoLuong)
				VALUES('MSP002','samsum',2000000,'dien thoai cu','anh2',2,2,2,2,2,2,5);
		INSERT INTO SanPham(MaSP,TenSP,DonGia,Mota,UrlAnh,IdMauSac,IdHang,IdChip,IdRam,IdRom,IdPin,SoLuong)
				VALUES('MSP003','nokia',500000,'nokia tàu','anh3',3,3,3,3,3,3,7);
		INSERT INTO SanPham(MaSP,TenSP,DonGia,Mota,UrlAnh,IdMauSac,IdHang,IdChip,IdRam,IdRom,IdPin,SoLuong)
				VALUES('MSP004','remi',1500000,'hang cu','anh4',4,4,4,4,4,4,2);
		INSERT INTO SanPham(MaSP,TenSP,DonGia,Mota,UrlAnh,IdMauSac,IdHang,IdChip,IdRam,IdRom,IdPin,SoLuong)
				VALUES('MSP005','oppo',200000,'moi nhap ben tàu','anh5',5,5,5,5,5,5,4);



		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI001',861516041689532,1,0);
		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI002',861516041689532,2,0);
		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI003',861516041689467,3,0);
		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI004',861516041689469,4,0);
		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI005',861516041689468,5,0);
		INSERT INTO Imei(MaImei,Imei,IdSP,TrangThai)
				VALUES('MI006',861516041689461,5,0);



		INSERT INTO SanPhamGiamGia(IdSP,IdGiamGia)
				VALUES(1,1);
		INSERT INTO SanPhamGiamGia(IdSP,IdGiamGia)
				VALUES(2,2);
		INSERT INTO SanPhamGiamGia(IdSP,IdGiamGia)
				VALUES(3,3);
		INSERT INTO SanPhamGiamGia(IdSP,IdGiamGia)
				VALUES(4,4);
		INSERT INTO SanPhamGiamGia(IdSP,IdGiamGia)
				VALUES(5,5);
	 
	 	INSERT INTO HoaDon
		VALUES('AE89E2F0-9184-4163-8F70-5CA12FD15C0A',1,1,'MHD001','2023-01-01',1,0389473847);
		INSERT INTO HoaDon 
		VALUES('FDB99408-4607-49FC-83D4-7C0F5D97920A',2,2,'MHD002','2023-01-01',1,0389473847)
		INSERT INTO HoaDon
		VALUES('2F5765E9-6850-42D6-898C-9EC4163E7BD6',3,3,'MHD003','2023-01-01',1,0389473847)
		INSERT INTO HoaDon
		VALUES('03772FCC-8074-477D-A7D0-F3830FAD775C',4,4,'MHD004','2023-01-01',1,0389473847)
		INSERT INTO HoaDon
		VALUES('3E9858D4-46CD-4591-A26F-957340008981',5,5,'MHD005','2023-01-01',1,0389473847)


		INSERT INTO HoaDonChiTiet 
		VALUES ('AE89E2F0-9184-4163-8F70-5CA12FD15C0A',1,2,1000);
		INSERT INTO HoaDonChiTiet 
		VALUES ('FDB99408-4607-49FC-83D4-7C0F5D97920A',2,22,1000);
		INSERT INTO HoaDonChiTiet 
		VALUES ('3E9858D4-46CD-4591-A26F-957340008981',3,5,1000);
		INSERT INTO HoaDonChiTiet 
		VALUES ('03772FCC-8074-477D-A7D0-F3830FAD775C',4,10,1000);

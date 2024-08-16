CREATE DATABASE CONGTY;

ALTER DATABASE CONGTY
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

use congty;
SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE NHANVIEN(
HONV nvarchar(15),
TENLOT nvarchar(15),
TENNV nvarchar(15),
MANV varchar(9) PRIMARY KEY,
NGSINH date,
DCHI nvarchar(30),
PHAI nvarchar(3),
LUONG decimal (15,2),
MA_NQL varchar (9) ,
PHG int
);

CREATE TABLE THANNHAN (
MA_NVIEN varchar(9),
TENTN nvarchar(15),
PHAI nvarchar (3),
NGSINH date,
QUANHE nvarchar (15),
PRIMARY KEY(MA_NVIEN, TENTN )
);

CREATE TABLE PHONGBAN(
 TENPHG varchar(15),
 MAPHG int PRIMARY KEY,
 TRPHG varchar(9),
 NG_NHANCHUC date
);

CREATE TABLE DIADIEM_PHG(
MAPHG int,
DIADIEM varchar(15),
PRIMARY KEY(MAPHG , DIADIEM)
);

CREATE TABLE DEAN(
TENDA varchar(15), 
MADA int PRIMARY KEY,
DDIEM_DA varchar(15),
PHONG int
);

CREATE TABLE CONGVIEC (
MADA int,
STT int ,
TEN_CONG_VIEC varchar(50),
PRIMARY KEY (MADA, STT)
);

CREATE TABLE PHANCONG(
MA_NVIEN varchar(9),
MADA int, 
STT int, 
THOIGIAN decimal,
PRIMARY KEY(MA_NVIEN, MADA, STT)
);

ALTER TABLE THANNHAN ADD CONSTRAINT FK_THANNHAN_MANV FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV);
ALTER TABLE PHANCONG ADD CONSTRAINT FK_PHANCONG_MANV FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV);

ALTER TABLE DEAN ADD CONSTRAINT FK_DEAN_MAPHG FOREIGN KEY (PHONG) REFERENCES PHONGBAN(MAPHG);
ALTER TABLE DIADIEM_PHG ADD CONSTRAINT FK_DIADIEM_PHG_MAPHG FOREIGN KEY (MAPHG) REFERENCES PHONGBAN(MAPHG);
ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_PHG FOREIGN KEY (PHG) REFERENCES PHONGBAN(MAPHG);

ALTER TABLE CONGVIEC ADD CONSTRAINT FK_CONGVIEC_MADA FOREIGN KEY (MADA) REFERENCES DEAN(MADA);

ALTER TABLE PHONGBAN ADD CONSTRAINT FK_PHONGBAN_TRPHG FOREIGN KEY (TRPHG) REFERENCES NHANVIEN(MANV);
ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_QL FOREIGN KEY (MA_NQL) REFERENCES NHANVIEN(MANV);

ALTER TABLE PHANCONG ADD CONSTRAINT FK_PHANCONG_CONGVIEC FOREIGN KEY (MADA,STT) REFERENCES CONGVIEC(MADA, STT);



INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Đinh', 'Bá', 'Tiên', '009', '1960-02-11', '119 Cống Quỳnh, Tp HCM', 'Nam', 30000, '005', '5');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Nguyễn', 'Thanh', 'Tùng', '005', '1962-08-20', '222 Nguyễn Văn Cừ, Tp HCM', 'Nam', 40000, '006', '5');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Bùi', 'Ngọc', 'Hằng', '007', '1954-03-11', '332 Nguyễn Thái Học, Tp HCM', 'Nam', 25000, '001', '4');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Lê', 'Quỳnh', 'Như', '001', '1967-02-01', '291 Hồ Văn Huê, Tp HCM', 'Nữ', 43000, '006', '4');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Nguyễn', 'Mạnh', 'Hùng', '004', '1967-03-04', '95 Bà Rịa, Vũng Tàu', 'Nam', 38000, '005', '5');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Trần', 'Thanh', 'Tâm', '003', '1957-05-04', '34 Mai Thị Lự, Tp HCM', 'Nam', 25000, '005', '5');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Trần', 'Hồng', 'Quang', '008', '1967-09-01', '80 Lê Hồng Phong, Tp HCM', 'Nam', 25000, '001', '4');
INSERT INTO NHANVIEN (HONV, TENLOT, TENNV, MANV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG) VALUES
('Phạm', 'Văn', 'Vinh', '006', '1965-01-01', '45 Trưng Vương, Hà Nội', 'Nữ', 55000, '001', '4');

insert into THANNHAN values('005','Trinh','Nữ','1976-04-05','Con gái');
insert into THANNHAN values('005','Khang','Nam','1973-10-25','Con trai');
insert into THANNHAN values('005','Phương','Nữ','1948-05-03','Vợ chồng');
insert into THANNHAN values('001','Minh','Nam','1932-02-29','Vợ chồng');
insert into THANNHAN values('009','Tiến','Nam','1978-01-01','Con trai');
insert into THANNHAN values('009','Châu','Nữ','1978-12-30','Con gái');
insert into THANNHAN values('009','Phương','Nữ','1957-05-05','Vợ chồng');

select * from DEAN;
insert into DEAN values ('Sản phẩm X','1','Vũng Tàu','5');
insert into DEAN values ('Sản phẩm Y','2','Nha Trang','5');
insert into DEAN values ('Sản phẩm Z','3','TP HCM','5');
insert into DEAN values ('Tin học hoá','10','Hà Nội','4');
insert into DEAN values ('Cáp quang','20','TP HCM','1');
insert into DEAN values ('Đào tạo','30','Hà Nội','4');

select *from DIADIEM_PHG;
insert into DIADIEM_PHG values ('1','TP HCM');
insert into DIADIEM_PHG values ('4','Hà Nội');
insert into DIADIEM_PHG values ('5','TAU');
insert into DIADIEM_PHG values ('5','NHA TRANG');
insert into DIADIEM_PHG values ('5','TP HCM');

select *from PHANCONG;
insert into PHANCONG values ('009','1','1','32');
insert into PHANCONG values ('009','2','2','8');
insert into PHANCONG values ('004','3','1','40');
insert into PHANCONG values ('003','1','2','20.0');
insert into PHANCONG values ('003','2','1','20.0');
insert into PHANCONG values ('008','10','1','35');
insert into PHANCONG values ('008','30','2','5');
insert into PHANCONG values ('001','30','1','20');
insert into PHANCONG values ('001','20','1','15');
insert into PHANCONG values ('006','20','1','30');
insert into PHANCONG values ('005','3','1','10');
insert into PHANCONG values ('005','10','2','10');
insert into PHANCONG values ('005','20','1','10');
insert into PHANCONG values ('007','30','2','30');
insert into PHANCONG values ('007','10','2','10');

select * from CONGVIEC;
insert into CONGVIEC values ('1','1','Thiết kế sản phẩm X');
insert into CONGVIEC values ('1','2','Thử nghiệm sản phẩm X');
insert into CONGVIEC values ('2','1','Sản xuất sản phẩm Y');
insert into CONGVIEC values ('2','2','Quảng cáo sản phẩm Y');
insert into CONGVIEC values ('3','1','Khuyến mãi sản phẩm Z');
insert into CONGVIEC values ('10','1','Tin học hoá phòng nhân sự');
insert into CONGVIEC values ('10','2','Tin học hoá phòng kinh doanh');
insert into CONGVIEC values ('20','1','Lắp đặt cáp quang');
insert into CONGVIEC values ('30 ','1','Đào tạo nhân viên Marketing');
insert into CONGVIEC values ('30 ','2','Đào tạo chuyên viên thiết kế');

INSERT INTO PHONGBAN (TENPHG, MAPHG, TRPHG, NG_NHANCHUC) VALUES
('Nghiên cứu', '5', '005', '1978-05-22');
INSERT INTO PHONGBAN (TENPHG, MAPHG, TRPHG, NG_NHANCHUC) VALUES
('Điều hành', '4', '008', '1985-01-01');
INSERT INTO PHONGBAN (TENPHG, MAPHG, TRPHG, NG_NHANCHUC) VALUES
('Quản lý', '1', '006', '1971-06-19');

-- 2.1.1 Truy vấn đơn giản
-- 1. Tìm các nhân viên làm việc ở phòng số 4
-- 2. Tìm các nhân viên có mức lương trên 30000
-- 3. Tìm các nhân viên có mức lương trên 25,000 ở phòng 4 hoặc các nhân
-- viên có mức lương trên 30,000 ở phòng 5
-- 4. Cho biết họ tên đầy đủ của các nhân viên ở TP HCM
-- 5. Cho biết họ tên đầy đủ của các nhân viên có họ bắt đầu bằng ký tự 'N'
-- 6. Cho biết ngày sinh và địa chỉ của nhân viên Dinh Ba Tien
-- 7. Cho biết các nhân viên có năm sinh trong khoảng 1960 đến 1965
-- 8. Cho biết các nhân viên và năm sinh của nhân viên
-- 9. Cho biết các nhân viên và tuổi của nhân viên
-- 2.1.2 Truy vấn có sử dụng phép kết
-- 10. Với mỗi phòng ban, cho biết tên phòng ban và địa điểm phòng
-- 11. Tìm tên những người trưởng phòng của từng phòng ban
-- 12. Tìm tên và địa chỉ của tất cả các nhân viên của phòng "Nghiên cứu".
-- 13. Với mỗi đề án ở Hà Nội, cho biết tên đề án, tên phòng ban, họ tên và
-- ngày nhận chức của trưởng phòng của phòng ban chủ trì đề án đó.
-- 14. Tìm tên những nữ nhân viên và tên người thân của họ
-- 15. Với mỗi nhân viên, cho biết họ tên nhân viên và họ tên người quản lý
-- trực tiếp của nhân viên đó
-- 16. Với mỗi nhân viên, cho biết họ tên của nhân viên đó, họ tên người
-- trưởng phòng và họ tên người quản lý trực tiếp của nhân viên đó.
-- 17. Tên những nhân viên phòng số 5 có tham gia vào đề án "Sản phẩm X"
-- và nhân viên này do "Nguyễn Thanh Tùng" quản lý trực tiếp.
-- 18. Cho biết tên các đề án mà nhân viên Đinh Bá Tiến đã tham gia.

-- 2.2 GOM NHÓM
-- 19. Cho biết số lượng đề án của công ty
		select count(*)
		from dean
-- 20. Cho biết số lượng đề án do phòng 'Nghiên Cứu' chủ trì
		select count(*)
		from dean d,phongban p
       where d.phong = p.maphg 
       and tenphg = 'Nghiên cứu'
-- 21. Cho biết lương trung bình của các nữ nhân viên
		select avg(luong) 
        from nhanvien
        where phai = 'nữ'
-- 22. Cho biết số thân nhân của nhân viên 'Đinh Bá Tiến' 
		select count(*)
        from nhanvien n, thannhan t 
        where n.manv = t.ma_nvien
        and concat(HONV,' ',TENLOT,' ',TENNV ) = 'Đinh Bá Tiên'
-- 23. Với mỗi đề án, liệt kê tên đề án và tổng số giờ làm việc một tuần của
-- tất cả các nhân viên tham dự đề án đó.
	select
-- 24. Với mỗi đề án, cho biết có bao nhiêu nhân viên tham gia đề án đó
-- 25. Với mỗi nhân viên, cho biết họ và tên nhân viên và số lượng thân nhân
-- của nhân viên đó.
-- 26. Với mỗi nhân viên, cho biết họ tên của nhân viên và số lượng đề án mà
-- nhân viên đó đã tham gia.
-- 27. Với mỗi nhân viên, cho biết số lượng nhân viên mà nhân viên đó quản
-- lý trực tiếp.
		SELECT nql.MANV AS Ma_Nguoi_Quan_Ly, 
       COUNT(nv.MANV) AS So_Luong_Nhan_Vien_Quan_Ly
		FROM NHANVIEN nql
		LEFT JOIN NHANVIEN nv ON nql.MANV = nv.MA_NQL
		GROUP BY nql.MANV;
-- 28. Với mỗi phòng ban, liệt kê tên phòng ban và lương trung bình của
-- những nhân viên làm việc cho phòng ban đó.
	select phg, tenphg , avg(luong)
    from nhanvien nv, phongban pb
    where nv.phg = pb.maphg
    group by phg, tenphg;
-- 29. Với các phòng ban có mức lương trung bình trên 30,000, liệt kê tên
-- phòng ban và số lượng nhân viên của phòng ban đó.
	select tenphg , count(manv) 
    from phongban p , nhanvien nv
    where p.maphg = nv.phg 
    group by phg
    having avg(luong) >= 30000;
-- 30. Với mỗi phòng ban, cho biết tên phòng ban và số lượng đề án mà
-- phòng ban đó chủ trì
	
-- 31. Với mỗi phòng ban, cho biết tên phòng ban, họ tên người trưởng
-- phòng và số lượng đề án mà phòng ban đó chủ trì
-- 32. Với mỗi phòng ban có mức lương trung bình lớn hơn 40,000, cho biết
-- tên phòng ban và số lượng đề án mà phòng ban đó chủ trì.
-- 33. Cho biết số đề án diễn ra tại từng địa điểm
-- 34. Với mỗi đề án, cho biết tên đề án và số lượng công việc của đề án
-- này.

-- 35. Với mỗi công việc trong đề án có mã đề án là 30, cho biết số lượng
-- nhân viên được phân công .
-- 36. Với mỗi công việc trong đề án có mã đề án là 'Dao Tao', cho biết số
-- lượng nhân viên được phân công.
-- 2.3 TRUY VẤN LỒNG + GOM NHÓM
-- 37. Cho biết danh sách các đề án (MADA) có: nhân công với họ (HONV) là
-- 'Đinh' hoặc có người trưởng phòng chủ trì đề án với họ (HONV) là
-- 'Đinh'.
-- 38. Danh sách những nhân viên (HONV, TENLOT, TENNV) có trên 2 thân
-- nhân.
-- 39. Danh sách những nhân viên (HONV, TENLOT, TENNV) không có thân
-- nhân nào.
-- 40. Danh sách những trưởng phòng (HONV, TENLOT, TENNV) có tối thiểu
-- một thân nhân.
-- 41. Tìm họ (HONV) của những trưởng phòng chưa có gia đình.
-- 42. Cho biết họ tên nhân viên (HONV, TENLOT, TENNV) có mức lương trên
-- mức lương trung bình của phòng "Nghiên cứu"
-- 43. Cho biết tên phòng ban và họ tên trưởng phòng của phòng ban có
-- đông nhân viên nhất.
-- 44. Cho biết danh sách các mã đề án mà nhân viên có mã là 009 chưa làm.
-- 45. Cho biết danh sách các công việc (tên công việc) trong đề án 'Sản
-- phẩm X' mà nhân viên có mã là 009 chưa làm.
-- 46. Tìm họ tên (HONV, TENLOT, TENNV) và địa chỉ (DCHI) của những
-- nhân viên làm việc cho một đề án ở 'TP HCM' nhưng phòng ban mà họ
-- trực thuộc lại không tọa lạc ở thành phố 'TP HCM' .

-- 47. Tổng quát câu 16, tìm họ tên và địa chỉ của các nhân viên làm việc cho
-- một đề án ở một thành phố nhưng phòng ban mà họ trực thuộc lại
-- không toạ lạc ở thành phố đó.

-- 2.4 PHÉP CHIA
-- 48. Danh sách những nhân viên (HONV, TENLOT, TENNV) làm việc trong
-- mọi đề án của công ty
-- 49. Danh sách những nhân viên (HONV, TENLOT, TENNV) được phân công
-- tất cả đề án do phòng số 4 chủ trì.
-- 50. Tìm những nhân viên (HONV, TENLOT, TENNV) được phân công tất cả
-- đề án mà nhân viên 'Đinh Bá Tiến' làm việc
-- 51. Cho biết những nhân được phân công cho tất cả các công việc trong đề
-- án 'Sản phẩm X'
-- 52. Cho biết danh sách nhân viên tham gia vào tất cả các đề án ở TP HCM
-- 53. Cho biết phòng ban chủ trì tất cả các đề án ở TP HCM
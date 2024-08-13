Create database shop;

use shop;

CREATE TABLE KHACHHANG(
 MAKH char(4) ,
 HOTEN varchar(40),
 DCHI  varchar(50),
SODT  varchar(20),
NGSINH  date,
DOANHSO decimal (19,2),
NGDK date
);

-- //đổi hàng trong bảng
alter table KHACHHANG
modify NGDK date after DOANHSO;

CREATE TABLE NHANVIEN(
MANV  char(4) ,
HOTEN  varchar(40),
SODT  varchar(20),
NGVL  date
);

CREATE TABLE SANPHAM(
MASP char(4),
TENSP  varchar(40),
DVT  varchar(20),
NUOCSX  varchar(40),
GIA decimal(15,2)
);

CREATE TABLE HOADON (
SOHD int ,
NGHD date,
MAKH char(4),
MANV char(4),
TRIGIA decimal(19,2)
);

CREATE TABLE CTHD (
SOHD int,
MASP char(4),
SL int
);


INSERT INTO KHACHHANG VALUES ('KH01','NGUYEN VAN  A','731 TRAN HUNG DAO ,Q5,TPHCM','08823451','1960-10-22',13060000,'2006-06-22');
INSERT INTO KHACHHANG VALUES ('KH02','TRAN NGOC HAN','23/5 NGUYEN TRAI ,Q5,TPHCM','0908256478','1974/04/03',280000,'2006/07/30');
INSERT INTO KHACHHANG VALUES ('KH03','TRAN NGOC LINH','45 NGUYEN CANH CHAN ,Q1,TPHCM','0938776266','1980/06/12',3860000,'2006/08/05');
INSERT INTO KHACHHANG VALUES ('KH04','TRAN MINH LONG','50/34 LE DAI HANH,Q10,TPHCM','0917325476','1965/03/09',250000,'2006/10/02');
INSERT INTO KHACHHANG VALUES ('KH05','LE NHAT MINH','34 TRUONG DINH,Q3,TPHCM','08246108','1950/03/10',21000,'2006/10/28');
INSERT INTO KHACHHANG VALUES ('KH06','LE HOAI THUONG','227 NGUYEN VAN CU,Q5,TPHCM','08631738','1981/12/31',915000,'2006/11/24');
INSERT INTO KHACHHANG VALUES ('KH07','NGUYEN VAN  TAM','32/3 TRAN BINH TRONG,Q5,TPHCM','0916783565','1971/04/06',12500,'2006/12/01');
INSERT INTO KHACHHANG VALUES ('KH08','PHAN THI THANH','45/2 AN DUONG VUONG,Q5,TPHCM','093843756','1971/01/10',365000,'2006/12/13');
INSERT INTO KHACHHANG VALUES ('KH09','LE HA VINH','873 LE HONG PHONG,Q5,TPHCM','08654763','1979/09/03',70000,'2007/01/14');
INSERT INTO KHACHHANG VALUES ('KH10','HA DUY LAP','34/34B NGUYEN TRAI,Q1,TPHCM','08768904','1983/05/02',67500,'2007/01/16');


insert into  NhanVien values ('NV01','Nguyen Nhu Nhut','0927345678','2006/4/13');
insert into  NhanVien values ('NV02','Le Thi Phi Yen','0987567390','2006/4/21');
insert into  NhanVien values ('NV03','Nguyen Van B','0997047382','2006/4/27');
insert into  NhanVien values ('NV04','Ngo Thanh Tuan','0913758498','2006/6/24');
insert into  NhanVien values ('NV05','Nguyen Thi Truc Thanh','0918590387','2006/7/20');

insert into SanPham values ('BC01','But chi','cay','Singapore',3000);
insert into SanPham values ('BC02','But chi','cay','Singapore',5000);
insert into SanPham values ('BC03','But chi','cay','Viet Nam',3500);
insert into SanPham values ('BC04','But chi','hop','Viet Nam',30000);
insert into SanPham values ('BB01','But bi','cay','Viet Nam',5000);
insert into SanPham values ('BB02','But bi','cay','Trung Quoc',7000);
insert into SanPham values ('BB03','But bi','hop','Thai Lan',100000);
insert into SanPham values ('TV01','Tap 100 giay mong','quyen','Trung Quoc',2500);
insert into SanPham values ('TV02','Tap 200 giay mong','quyen','Trung Quoc',4500);
insert into SanPham values ('TV03','Tap 100 giay tot','quyen','Viet Nam',3000);
insert into SanPham values ('TV04','Tap 200 giay tot','quyen','Viet Nam',5500);
insert into SanPham values ('TV05','Tap 100 trang','chuc','Viet Nam',23000);
insert into SanPham values ('TV06','Tap 200 trang','chuc','Viet Nam',53000);
insert into SanPham values ('TV07','Tap 100 trang','chuc','Trung Quoc',34000);
insert into SanPham values ('ST01','So tay 500 trang','quyen','Trung Quoc',40000);
insert into SanPham values ('ST02','So tay loai 1','quyen','Viet Nam',55000);
insert into SanPham values ('ST03','So tay loai 2','quyen','Viet Nam',51000);
insert into SanPham values ('ST04','So tay','quyen','Thai Lan',55000);
insert into SanPham values ('ST05','So tay mong','quyen','Thai Lan',20000);
insert into SanPham values ('ST06','Phan viet bang','hop','Viet Nam',5000);
insert into SanPham values ('ST07','Phan khong bui','hop','Viet Nam',7000);
insert into SanPham values ('ST08','Bong bang','cai','Viet Nam',1000);
insert into SanPham values ('ST09','But long','cay','Viet Nam',5000);
insert into SanPham values ('ST10','But long','cay','Trung Quoc',7000);

insert into HoaDon values (1001,'2006/07/23','KH01','NV01',320000);
insert into HoaDon values (1002,'2006/08/12','KH01','NV02',840000);
insert into HoaDon values (1003,'2006/08/23','KH02','NV01',100000);
insert into HoaDon values (1004,'2006/09/01','KH02','NV01',180000);
insert into HoaDon values (1005,'2006/10/20','KH01','NV02',3800000);
insert into HoaDon values (1006,'2006/10/16','KH01','NV03',2430000);
insert into HoaDon values (1007,'2006/10/28','KH03','NV03',510000);
insert into HoaDon values (1008,'2006/10/28','KH01','NV03',440000); 
insert into HoaDon values (1009,'2006/10/28','KH03','NV04',200000);
insert into HoaDon values (1010,'2006/11/01','KH01','NV01',5200000);
insert into HoaDon values (1011,'2006/11/04','KH04','NV03',250000);
insert into HoaDon values (1012,'2006/11/30','KH05','NV03',21000);
insert into HoaDon values (1013,'2006/12/12','KH06','NV01',5000);
insert into HoaDon values (1014,'2006/12/31','KH03','NV02',3150000);
insert into HoaDon values (1015,'2007/01/01','KH06','NV01',910000);
insert into HoaDon values (1016,'2007/01/01','KH07','NV02',12500);
insert into HoaDon values (1017,'2007/01/02','KH08','NV03',35000);
insert into HoaDon values (1018,'2007/01/13','KH08','NV03',330000);
insert into HoaDon values (1019,'2007/01/13','KH01','NV03',30000);
insert into HoaDon values (1020,'2007/01/14','KH09','NV04',70000);
insert into HoaDon values (1021,'2007/01/16','KH10','NV03',67500);
insert into HoaDon values (1022,'2007/01/16',Null,'NV03',7000);
insert into HoaDon values (1023,'2007/01/17',Null,'NV01',330000);


insert into CTHD values (1001,'TV02',10);
insert into CTHD values (1001,'ST01',5);
insert into CTHD values (1001,'BC01',5);
insert into CTHD values (1001,'BC02',10);
insert into CTHD values (1001,'ST08',10);
insert into CTHD values (1002,'BC04',20);
insert into CTHD values (1002,'BB01',20);
insert into CTHD values (1002,'BB02',20);
insert into CTHD values (1003,'BB03',10);
insert into CTHD values (1004,'TV01',20);
insert into CTHD values (1004,'TV02',10);
insert into CTHD values (1004,'TV03',10);
insert into CTHD values (1004,'TV04',10);
insert into CTHD values (1005,'TV05',50);
insert into CTHD values (1005,'TV06',50);
insert into CTHD values (1006,'TV07',20);
insert into CTHD values (1006,'ST01',30);
insert into CTHD values (1006,'ST02',10);
insert into CTHD values (1007,'ST03',10);
insert into CTHD values (1008,'ST04',8);
insert into CTHD values (1009,'ST05',10);
insert into CTHD values (1010,'TV07',50);
insert into CTHD values (1010,'ST07',50);
insert into CTHD values (1010,'ST08',100);
insert into CTHD values (1010,'ST04',50);
insert into CTHD values (1010,'TV03',100);
insert into CTHD values (1011,'ST06',50);
insert into CTHD values (1012,'ST07',3);
insert into CTHD values (1013,'ST08',5);
insert into CTHD values (1014,'BC02',80);
insert into CTHD values (1014,'BB02',100);
insert into CTHD values (1014,'BC04',60);
insert into CTHD values (1014,'BB01',50);
insert into CTHD values (1015,'BB02',30);
insert into CTHD values (1015,'BB03',7);
insert into CTHD values (1016,'TV01',5);
insert into CTHD values (1017,'TV02',1);
insert into CTHD values (1017,'TV03',1);
insert into CTHD values (1017,'TV04',5);
insert into CTHD values (1018,'ST04',6);
insert into CTHD values (1019,'ST05',1);
insert into CTHD values (1019,'ST06',2);
insert into CTHD values (1020,'ST07',10);
insert into CTHD values (1021,'ST08',5);
insert into CTHD values (1021,'TV01',7);
insert into CTHD values (1021,'TV02',10);
insert into CTHD values (1022,'ST07',1);
insert into CTHD values (1023,'ST04',6);

-- 1. Tạo các quan hệ và khai báo các khóa chính, khóa ngoại của quan hệ.
	-- KHÁCH HÀNG
    alter table KHACHHANG
	add primary key(MAKH);
    --  NHÂN VIÊN
    alter table NHANVIEN
    add primary key(MANV);
    -- Sản phẩm
    alter table SANPHAM
    add primary key(MASP);
    -- hóa đơn
	alter table HOADON
    add primary key(SOHD);
    alter table HOADON add constraint foreign key (MAKH) references KHACHHANG(MAKH);
    alter table HOADON add constraint foreign key (MANV) references NHANVIEN(MANV);
    
    -- Chi tiết hóa đơn
    alter table CTHD add constraint FK_CTHD_HOADON foreign key(SOHD) references HOADON(SOHD);
    alter table CTHD add constraint FK_CTHD_SANPHAM foreign key(MASP) references SANPHAM(MASP);
    
-- 2. Thêm vào thuộc tính GHICHU có kiểu dữ liệu varchar(20) cho quan hệ SANPHAM.
	alter table SANPHAM add column GHICHU varchar(20);
    
-- 3. Thêm vào thuộc tính LOAIKH có kiểu dữ liệu là tinyint cho quan hệ KHACHHANG.
	alter table KHACHHANG add column LOAIKH tinyint;
-- 4. Sửa kiểu dữ liệu của thuộc tính GHICHU trong quan hệ SANPHAM thành varchar(100).
	alter table SANPHAM modify column GHICHU varchar(100);
-- 5. Xóa thuộc tính GHICHU trong quan hệ SANPHAM.
	alter table SANPHAM drop column GHICHU;
-- 6. Làm thế nào để thuộc tính LOAIKH trong quan hệ KHACHHANG có thể lưu các giá trị là: “Vang
-- lai”, “Thuong xuyen”, “Vip”, ...
	alter table KHACHHANG modify column LOAIKH varchar(20);
	update KHACHHANG
    set LOAIKH = 'Vang lai'
	where MAKH = 'KH101'
-- 7. Đơn vị tính của sản phẩm chỉ có thể là (“cay”,”hop”,”cai”,”quyen”,”chuc”)
-- 8. Giá bán của sản phẩm từ 500 đồng trở lên.
-- 9. Mỗi lần mua hàng, khách hàng phải mua ít nhất 1 sản phẩm.
-- 10. Ngày khách hàng đăng ký là khách hàng thành viên phải lớn hơn ngày sinh của người đó.
-- 11. Ngày mua hàng (NGHD) của một khách hàng thành viên sẽ lớn hơn hoặc bằng ngày khách hàng đó
-- đăng ký thành viên (NGDK).
-- 12. Ngày bán hàng (NGHD) của một nhân viên phải lớn hơn hoặc bằng ngày nhân viên đó vào làm.
-- 13. Mỗi một hóa đơn phải có ít nhất một chi tiết hóa đơn.
-- 14. Trị giá của một hóa đơn là tổng thành tiền (số lượng*đơn giá) của các chi tiết thuộc hóa đơn đó.
-- 15. Doanh số của một khách hàng là tổng trị giá các hóa đơn mà khách hàng thành viên đó đã mua.
-- II. Ngôn ngữ thao tác dữ liệu (Data Manipulation Language):
-- 1. Nhập dữ liệu cho các quan hệ trên.
-- 2. Tạo quan hệ SANPHAM1 chứa toàn bộ dữ liệu của quan hệ SANPHAM. Tạo quan hệ
-- KHACHHANG1 chứa toàn bộ dữ liệu của quan hệ KHACHHANG.
-- 3. Cập nhật giá tăng 5% đối với những sản phẩm do “Thai Lan” sản xuất (cho quan hệ SANPHAM1)
-- 4. Cập nhật giá giảm 5% đối với những sản phẩm do “Trung Quoc” sản xuất có giá từ 10.000 trở xuống
-- (cho quan hệ SANPHAM1).
-- 5. Cập nhật giá trị LOAIKH là “Vip” đối với những khách hàng đăng ký thành viên trước ngày
-- 1/1/2007 có doanh số từ 10.000.000 trở lên hoặc khách hàng đăng ký thành viên từ 1/1/2007 trở về
-- sau có doanh số từ 2.000.000 trở lên (cho quan hệ KHACHHANG1).
-- III. Ngôn ngữ truy vấn dữ liệu có cấu trúc:
-- 1. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quoc” sản xuất.
-- 2. In ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cay”, ”quyen”.
-- 3. In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”.
-- 4. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 30.000 đến
-- 40.000.
-- 5. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quoc” hoặc “Thai Lan” sản xuất có giá từ
-- 30.000 đến 40.000.
-- 6. In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007.
-- 7. In ra các số hóa đơn, trị giá hóa đơn trong tháng 1/2007, sắp xếp theo ngày (tăng dần) và trị giá của
-- hóa đơn (giảm dần).
-- 8. In ra danh sách các khách hàng (MAKH, HOTEN) đã mua hàng trong ngày 1/1/2007.
-- 9. In ra số hóa đơn, trị giá các hóa đơn do nhân viên có tên “Nguyen Van B” lập trong ngày
-- 28/10/2006.
-- 10. In ra danh sách các sản phẩm (MASP,TENSP) được khách hàng có tên “Nguyen Van A” mua trong
-- tháng 10/2006.
-- 11. Tìm các số hóa đơn đã mua sản phẩm có mã số “BB01” hoặc “BB02”.
-- 12. Tìm các số hóa đơn đã mua sản phẩm có mã số “BB01” hoặc “BB02”, mỗi sản phẩm mua với số
-- lượng từ 10 đến 20.
-- 13. Tìm các số hóa đơn mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”, mỗi sản phẩm mua với
-- số lượng từ 10 đến 20.
-- 14. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quoc” sản xuất hoặc các sản phẩm được
-- bán ra trong ngày 1/1/2007.
-- 15. In ra danh sách các sản phẩm (MASP,TENSP) không bán được.
-- 16. In ra danh sách các sản phẩm (MASP,TENSP) không bán được trong năm 2006.
-- 17. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quoc” sản xuất không bán được trong
-- năm 2006.
-- 18. Tìm số hóa đơn đã mua tất cả các sản phẩm do Singapore sản xuất.
-- 19. Tìm số hóa đơn trong năm 2006 đã mua ít nhất tất cả các sản phẩm do Singapore sản xuất.
-- 20. Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua?
-- 21. Có bao nhiêu sản phẩm khác nhau được bán ra trong năm 2006.
-- 22. Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ?
-- 23. Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?
-- 24. Tính doanh thu bán hàng trong năm 2006.
-- 25. Tìm số hóa đơn có trị giá cao nhất trong năm 2006.
-- 26. Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.
-- 27. In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất.
-- 28. In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất.
-- 29. In ra danh sách các sản phẩm (MASP, TENSP) do “Thai Lan” sản xuất có giá bằng 1 trong 3 mức
-- giá cao nhất (của tất cả các sản phẩm).
-- 30. In ra danh sách các sản phẩm (MASP, TENSP) do “Trung Quoc” sản xuất có giá bằng 1 trong 3 mức
-- giá cao nhất (của sản phẩm do “Trung Quoc” sản xuất).
-- 31. * In ra danh sách 3 khách hàng có doanh số cao nhất (sắp xếp theo kiểu xếp hạng).
-- 32. Tính tổng số sản phẩm do “Trung Quoc” sản xuất.
-- 33. Tính tổng số sản phẩm của từng nước sản xuất.
-- 34. Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.
-- 35. Tính doanh thu bán hàng mỗi ngày.
-- 36. Tính tổng số lượng của từng sản phẩm bán ra trong tháng 10/2006.
-- 37. Tính doanh thu bán hàng của từng tháng trong năm 2006.
-- 38. Tìm hóa đơn có mua ít nhất 4 sản phẩm khác nhau.
-- 39. Tìm hóa đơn có mua 3 sản phẩm do “Viet Nam” sản xuất (3 sản phẩm khác nhau).
-- 40. Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất.
-- 41. Tháng mấy trong năm 2006, doanh số bán hàng cao nhất ?
-- 42. Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006.
-- 43. *Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất.
-- 44. Tìm nước sản xuất sản xuất ít nhất 3 sản phẩm có giá bán khác nhau.
-- 45. *Trong 10 khách hàng có doanh số cao nhất, tìm khách hàng có số lần mua hàng nhiều nhất.
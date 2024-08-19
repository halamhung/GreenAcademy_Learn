CREATE DATABASE QLPHANHOI;
USE QLPHANHOI;

ALTER DATABASE QLPHANHOI
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE NHAPT(
MANPT varchar (5),
TENNPT varchar(20),
NGDK date,
SOUD varchar (3),
PRIMARY KEY(MANPT)
);

CREATE TABLE NGUOIDUNG(
MAND varchar (5),
TENND varchar (30),
NGDKTV date,
GIOITINH varchar (3),
NGSINH date,
PRIMARY KEY(MAND)
);

CREATE TABLE UNGDUNG (
	MAUD varchar(5),
    TENUD varchar (20),
    MANPT varchar(5),
    NGPH date, 
    DLUONG double,
    LOAIUD varchar (10),
    PRIMARY KEY (MAUD)
);

CREATE TABLE GHINHAN(
MAUD varchar(5),
MAND varchar(5),
DANHGIA int ,
DANGSD int ,
PRIMARY KEY (MAUD, MAND)
);

ALTER TABLE UNGDUNG ADD CONSTRAINT FK_NPT_GHINHAN FOREIGN KEY (MANPT) REFERENCES NHAPT(MANPT);

ALTER TABLE GHINHAN ADD CONSTRAINT FK_UNGDUNG_GHINHAN FOREIGN KEY (MAUD) REFERENCES UNGDUNG(MAUD);
ALTER TABLE GHINHAN ADD CONSTRAINT FK_NGUOIDUNG_GHINHAN FOREIGN KEY (MAND) REFERENCES NGUOIDUNG(MAND);

INSERT INTO NHAPT (MANPT, TENNPT, NGDK, SOUD) VALUES ('N001', 'Gameloft', '2006-06-20', 100);
INSERT INTO NHAPT (MANPT, TENNPT, NGDK, SOUD) VALUES ('N002', 'Ketchapp', '2010-07-18', 20);
INSERT INTO NHAPT (MANPT, TENNPT, NGDK, SOUD) VALUES ('N003', 'Facebook', '2006-02-27', 20);

INSERT INTO NGUOIDUNG (MAND, TENND, NGDKTV, GIOITINH, NGSINH) VALUES ('ND001', 'Huynh Cong Khanh', '2009-06-17', 'Nam', '1994-05-25');
INSERT INTO NGUOIDUNG (MAND, TENND, NGDKTV, GIOITINH, NGSINH) VALUES ('ND002', 'Nguyen Minh Dat', '2010-06-19', 'Nam', '1993-03-22');
INSERT INTO NGUOIDUNG (MAND, TENND, NGDKTV, GIOITINH, NGSINH) VALUES ('ND003', 'Ho Quy Han', '2012-10-15', 'Nu', '1994-02-14');

INSERT INTO UNGDUNG (MAUD, TENUD, MANPT, NGPH, DLUONG, LOAIUD) VALUES ('UD001', 'Messenger', 'N003', '2007-02-01', 6.5, 'Chat');
INSERT INTO UNGDUNG (MAUD, TENUD, MANPT, NGPH, DLUONG, LOAIUD) VALUES ('UD002', 'Stack', 'N002', '2017-06-02', 42, 'Game');
INSERT INTO UNGDUNG (MAUD, TENUD, MANPT, NGPH, DLUONG, LOAIUD) VALUES ('UD003', 'Asphalt 8', 'N001', '2018-08-12', 1700, 'Game');

INSERT INTO GHINHAN (MAUD, MAND, DANHGIA, DANGSD) VALUES ('UD001', 'ND001', 5, 1);
INSERT INTO GHINHAN (MAUD, MAND, DANHGIA, DANGSD) VALUES  ('UD002', 'ND002', 4, 1);
INSERT INTO GHINHAN (MAUD, MAND, DANHGIA, DANGSD) VALUES  ('UD003', 'ND003', 4, 1);

-- Câu 3: Hiện thực rằng buộc toàn vẹn sau: đánh giá của người dùng là một số nguyên từ 1 -> 5.
ALTER TABLE GHINHAN
ADD CONSTRAINT check_danhgia
CHECK (DANHGIA >=1 AND DANHGIA <= 5);

-- Câu 4 : Hiện thực rằng buộc toàn vẹn sau: số lượng ứng dụng hiện có của nhà phát triển phải bằng tổng số lượng ứng dụng của nhà phát triển đó trên quan hệ ứng dụng
SELECT MANPT, COUNT(*) AS SoLuongUngDung
FROM UNGDUNG
GROUP BY MANPT
HAVING COUNT(*) != (SELECT COUNT(*) FROM UNGDUNG WHERE MANPT = UNGDUNG.MANPT);
-- câu 5. Tìm tất cả các ứng dụng (MAUD, TENUD) của nhà phát triển Gameloft phát hành trong năm 2018, sắp xếp theo dung lượng giảm dần (DLUONG).
select MAUD,TENUD , TENNPT
FROM UNGDUNG ud, NHAPT pt
WHERE ud.MANPT = pt.MANPT and pt.TENNPT = 'Gameloft' AND YEAR(NGPH) = 2018
ORDER BY DLUONG DESC;
-- Câu 6: Tìm người dùng (MAND, TENND) đang không sử dụng bất kì ứng dụng game nào (các ứng dụng loại khác vẫn đang sử dụng)
SELECT nd.MAND, nd.TENND
FROM NGUOIDUNG nd
WHERE nd.MAND NOT IN (
    SELECT gh.MAND
    FROM GHINHAN gh
    JOIN UNGDUNG ud ON gh.MAUD = ud.MAUD
     WHERE ud.LOAIUD = 'Game'
);

-- Câu 7: Tìm ứng dụng (MAUD, TENUD) phát hành năm 2017 có lượt đánh giá là 1 nhiều nhất
 select MAUD , TENUD 
 FROM UNGDUNG 
 WHERE GHINHAN.MAUD = 
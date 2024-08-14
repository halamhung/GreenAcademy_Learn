-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: shop
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MAKH` char(4) NOT NULL,
  `HOTEN` varchar(40) DEFAULT NULL,
  `DCHI` varchar(50) DEFAULT NULL,
  `SODT` varchar(20) DEFAULT NULL,
  `NGSINH` date DEFAULT NULL,
  `DOANHSO` decimal(19,2) DEFAULT NULL,
  `NGDK` date DEFAULT NULL,
  `LOAIKH` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MAKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('KH01','NGUYEN VAN  A','731 TRAN HUNG DAO ,Q5,TPHCM','08823451','1960-10-22',13060000.00,'2006-06-22',NULL),('KH02','TRAN NGOC HAN','23/5 NGUYEN TRAI ,Q5,TPHCM','0908256478','1974-04-03',280000.00,'2006-07-30',NULL),('KH03','TRAN NGOC LINH','45 NGUYEN CANH CHAN ,Q1,TPHCM','0938776266','1980-06-12',3860000.00,'2006-08-05',NULL),('KH04','TRAN MINH LONG','50/34 LE DAI HANH,Q10,TPHCM','0917325476','1965-03-09',250000.00,'2006-10-02',NULL),('KH05','LE NHAT MINH','34 TRUONG DINH,Q3,TPHCM','08246108','1950-03-10',21000.00,'2006-10-28','VIP'),('KH06','LE HOAI THUONG','227 NGUYEN VAN CU,Q5,TPHCM','08631738','1981-12-31',915000.00,'2006-11-24',NULL),('KH07','NGUYEN VAN  TAM','32/3 TRAN BINH TRONG,Q5,TPHCM','0916783565','1971-04-06',12500.00,'2006-12-01',NULL),('KH08','PHAN THI THANH','45/2 AN DUONG VUONG,Q5,TPHCM','093843756','1971-01-10',365000.00,'2006-12-13',NULL),('KH09','LE HA VINH','873 LE HONG PHONG,Q5,TPHCM','08654763','1979-09-03',70000.00,'2007-01-14',NULL),('KH10','HA DUY LAP','34/34B NGUYEN TRAI,Q1,TPHCM','08768904','1983-05-02',67500.00,'2007-01-16','Vang lai');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-14 16:59:54

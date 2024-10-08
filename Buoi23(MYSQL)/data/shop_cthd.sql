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
-- Table structure for table `cthd`
--

DROP TABLE IF EXISTS `cthd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cthd` (
  `SOHD` int DEFAULT NULL,
  `MASP` char(4) DEFAULT NULL,
  `SL` int DEFAULT NULL,
  KEY `FK_CTHD_HOADON` (`SOHD`),
  KEY `FK_CTHD_SANPHAM` (`MASP`),
  CONSTRAINT `FK_CTHD_HOADON` FOREIGN KEY (`SOHD`) REFERENCES `hoadon` (`SOHD`),
  CONSTRAINT `FK_CTHD_SANPHAM` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cthd`
--

LOCK TABLES `cthd` WRITE;
/*!40000 ALTER TABLE `cthd` DISABLE KEYS */;
INSERT INTO `cthd` VALUES (1001,'TV02',10),(1001,'ST01',5),(1001,'BC01',5),(1001,'BC02',10),(1001,'ST08',10),(1002,'BC04',20),(1002,'BB01',20),(1002,'BB02',20),(1003,'BB03',10),(1004,'TV01',20),(1004,'TV02',10),(1004,'TV03',10),(1004,'TV04',10),(1005,'TV05',50),(1005,'TV06',50),(1006,'TV07',20),(1006,'ST01',30),(1006,'ST02',10),(1007,'ST03',10),(1008,'ST04',8),(1009,'ST05',10),(1010,'TV07',50),(1010,'ST07',50),(1010,'ST08',100),(1010,'ST04',50),(1010,'TV03',100),(1011,'ST06',50),(1012,'ST07',3),(1013,'ST08',5),(1014,'BC02',80),(1014,'BB02',100),(1014,'BC04',60),(1014,'BB01',50),(1015,'BB02',30),(1015,'BB03',7),(1016,'TV01',5),(1017,'TV02',1),(1017,'TV03',1),(1017,'TV04',5),(1018,'ST04',6),(1019,'ST05',1),(1019,'ST06',2),(1020,'ST07',10),(1021,'ST08',5),(1021,'TV01',7),(1021,'TV02',10),(1022,'ST07',1),(1023,'ST04',6);
/*!40000 ALTER TABLE `cthd` ENABLE KEYS */;
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

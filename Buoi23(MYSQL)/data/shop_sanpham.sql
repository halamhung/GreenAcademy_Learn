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
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MASP` char(4) NOT NULL,
  `TENSP` varchar(40) DEFAULT NULL,
  `DVT` varchar(20) DEFAULT NULL,
  `NUOCSX` varchar(40) DEFAULT NULL,
  `GIA` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`MASP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES ('BB01','But bi','cay','Viet Nam',5000.00),('BB02','But bi','cay','Trung Quoc',100000.00),('BB03','But bi','hop','Thai Lan',100000.00),('BC01','But chi','cay','Singapore',3000.00),('BC02','But chi','cay','Singapore',5000.00),('BC03','But chi','cay','Viet Nam',3500.00),('BC04','But chi','hop','Viet Nam',30000.00),('ST01','So tay 500 trang','quyen','Trung Quoc',40000.00),('ST02','So tay loai 1','quyen','Viet Nam',55000.00),('ST03','So tay loai 2','quyen','Viet Nam',51000.00),('ST04','So tay','quyen','Thai Lan',55000.00),('ST05','So tay mong','quyen','Thai Lan',20000.00),('ST06','Phan viet bang','hop','Viet Nam',5000.00),('ST07','Phan khong bui','hop','Viet Nam',7000.00),('ST08','Bong bang','cai','Viet Nam',1000.00),('ST09','But long','cay','Viet Nam',5000.00),('ST10','But long','cay','Trung Quoc',7000.00),('TV01','Tap 100 giay mong','quyen','Trung Quoc',2500.00),('TV02','Tap 200 giay mong','quyen','Trung Quoc',4500.00),('TV03','Tap 100 giay tot','quyen','Viet Nam',3000.00),('TV04','Tap 200 giay tot','quyen','Viet Nam',5500.00),('TV05','Tap 100 trang','chuc','Viet Nam',23000.00),('TV06','Tap 200 trang','chuc','Viet Nam',53000.00),('TV07','Tap 100 trang','chuc','Trung Quoc',34000.00);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
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

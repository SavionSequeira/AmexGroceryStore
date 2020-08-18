-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: amex
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `cartid` int NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `custphone` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `timestamp` time DEFAULT NULL,
  `otp` int DEFAULT NULL,
  `payment_option` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `total_payment` float DEFAULT NULL,
  `ShopID` int DEFAULT NULL,
  `KioskID` int DEFAULT NULL,
  `email_id` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cartid`),
  KEY `ShopID` (`ShopID`),
  KEY `KioskID` (`KioskID`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`ShopID`) REFERENCES `shop` (`ShopID`),
  CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`KioskID`) REFERENCES `kiosk` (`kioskid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart_item`
--

DROP TABLE IF EXISTS `cart_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_item` (
  `CartId` int NOT NULL,
  `ItemId` int NOT NULL,
  `quantity_p` int DEFAULT NULL,
  PRIMARY KEY (`CartId`,`ItemId`),
  KEY `Cart_itemId` (`ItemId`),
  CONSTRAINT `Cart_itemId` FOREIGN KEY (`ItemId`) REFERENCES `item` (`item_no`),
  CONSTRAINT `Cartid_item` FOREIGN KEY (`CartId`) REFERENCES `cart` (`cartid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_item`
--

LOCK TABLES `cart_item` WRITE;
/*!40000 ALTER TABLE `cart_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `item_no` int NOT NULL,
  `item_name` varchar(32) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`item_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'CocaCola',40),(2,'Lays',20),(3,'Cadbury',100),(4,'Tropicana',20),(5,'Heinz',45),(6,'Maggi',35),(7,'Oreo',70),(8,'Kellogs',100),(9,'QuakerOats',70),(10,'Pringles',100),(11,'Cavins',30),(12,'KwalityWalls',20),(13,'CupNoodles',50),(14,'Sprite',25),(15,'Hide&Seek',40),(16,'Bread',40),(17,'Milk',25),(18,'Snickers',45),(19,'JimJam',25),(20,'Pasta',40),(21,'RedBull',100),(22,'AmericanGarden',200),(23,'Oil',250),(24,'Kurkure',20),(25,'Hersheys',35),(26,'JollyRancher',10),(27,'Monster',100),(28,'Nestle',50),(29,'Cake',25),(30,'Bounty',30);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kiosk`
--

DROP TABLE IF EXISTS `kiosk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kiosk` (
  `kioskid` int NOT NULL,
  PRIMARY KEY (`kioskid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kiosk`
--

LOCK TABLES `kiosk` WRITE;
/*!40000 ALTER TABLE `kiosk` DISABLE KEYS */;
INSERT INTO `kiosk` VALUES (2),(4);
/*!40000 ALTER TABLE `kiosk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `ShopID` int NOT NULL,
  `ShopName` varchar(32) DEFAULT NULL,
  `PhoneNo` varchar(10) DEFAULT NULL,
  `OpenTime` time DEFAULT NULL,
  `CloseTime` time DEFAULT NULL,
  PRIMARY KEY (`ShopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (0,'MK Retail','6473849328','06:00:00','21:00:00'),(1,'Aishwarya','7584758394','05:00:00','20:00:00'),(3,'Reliance Mart','8839485738','06:00:00','22:00:00'),(5,'More','3849384758','05:00:00','23:00:00'),(6,'KwikEMart','8849382739','05:00:00','23:00:00'),(7,'ClassicGrocers','9928374657','05:00:00','23:00:00');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_item`
--

DROP TABLE IF EXISTS `shop_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop_item` (
  `ShopID` int NOT NULL,
  `item_no` int NOT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`ShopID`,`item_no`),
  KEY `ITEM_ID` (`item_no`),
  CONSTRAINT `ITEM_ID` FOREIGN KEY (`item_no`) REFERENCES `item` (`item_no`),
  CONSTRAINT `SHOP_ID` FOREIGN KEY (`ShopID`) REFERENCES `shop` (`ShopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_item`
--

LOCK TABLES `shop_item` WRITE;
/*!40000 ALTER TABLE `shop_item` DISABLE KEYS */;
INSERT INTO `shop_item` VALUES (0,2,7),(0,5,3),(0,7,103),(0,9,17),(0,11,25),(0,13,5),(0,15,4),(0,21,20),(0,23,10),(0,29,40),(1,1,45),(1,2,23),(1,3,77),(1,4,11),(1,5,55),(1,22,5),(1,24,9),(1,26,19),(3,2,34),(3,4,25),(3,17,67),(3,19,89),(3,20,12),(3,26,40),(3,27,25),(3,30,40),(5,1,32),(5,5,34),(5,6,64),(5,7,88),(5,8,20),(5,9,100),(5,11,6),(5,12,44),(5,13,11),(5,21,9),(5,22,11),(5,23,10),(6,2,50),(6,3,58),(6,4,15),(6,7,11),(6,9,64),(6,10,10),(6,11,25),(6,24,35),(6,27,10),(6,29,15),(7,5,3),(7,7,13),(7,9,93),(7,10,10),(7,14,12),(7,18,17),(7,20,16),(7,21,3),(7,28,17),(7,30,40);
/*!40000 ALTER TABLE `shop_item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-18 14:50:11

-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: comuex
-- ------------------------------------------------------
-- Server version	8.4.2

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
-- Table structure for table `posts`
--

DROP TABLE IF EXISTS `posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `posts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `content` text NOT NULL,
  `author` varchar(100) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posts`
--

LOCK TABLES `posts` WRITE;
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
INSERT INTO `posts` VALUES (1,'Title 1','Content for post 1','Author 1','2024-10-02 08:39:09'),(2,'Title 2','Content for post 2','Author 2','2024-10-02 08:39:09'),(3,'Title 3','Content for post 3','Author 3','2024-10-02 08:39:09'),(4,'Title 4','Content for post 4','Author 4','2024-10-02 08:39:09'),(5,'Title 5','Content for post 5','Author 5','2024-10-02 08:39:09'),(6,'Title 6','Content for post 6','Author 6','2024-10-02 08:39:09'),(7,'Title 7','Content for post 7','Author 7','2024-10-02 08:39:09'),(8,'Title 8','Content for post 8','Author 8','2024-10-02 08:39:09'),(9,'Title 9','Content for post 9','Author 9','2024-10-02 08:39:09'),(10,'Title 10','Content for post 10','Author 10','2024-10-02 08:39:09'),(11,'Title 11','Content for post 11','Author 11','2024-10-02 08:39:09'),(12,'Title 12','Content for post 12','Author 12','2024-10-02 08:39:09'),(13,'Title 13','Content for post 13','Author 13','2024-10-02 08:39:09'),(14,'Title 14','Content for post 14','Author 14','2024-10-02 08:39:09'),(15,'Title 15','Content for post 15','Author 15','2024-10-02 08:39:09'),(16,'Title 16','Content for post 16','Author 16','2024-10-02 08:39:09'),(17,'Title 17','Content for post 17','Author 17','2024-10-02 08:39:09'),(18,'Title 18','Content for post 18','Author 18','2024-10-02 08:39:09'),(19,'Title 19','Content for post 19','Author 19','2024-10-02 08:39:09'),(20,'Title 20','Content for post 20','Author 20','2024-10-02 08:39:09'),(21,'Title 21','Content for post 21','Author 21','2024-10-02 08:39:09'),(22,'Title 22','Content for post 22','Author 22','2024-10-02 08:39:09'),(23,'Title 23','Content for post 23','Author 23','2024-10-02 08:39:09'),(24,'Title 24','Content for post 24','Author 24','2024-10-02 08:39:09'),(25,'Title 25','Content for post 25','Author 25','2024-10-02 08:39:09'),(26,'Title 26','Content for post 26','Author 26','2024-10-02 08:39:09'),(27,'Title 27','Content for post 27','Author 27','2024-10-02 08:39:09'),(28,'Title 28','Content for post 28','Author 28','2024-10-02 08:39:09'),(29,'Title 29','Content for post 29','Author 29','2024-10-02 08:39:09'),(30,'Title 30','Content for post 30','Author 30','2024-10-02 08:39:09'),(31,'Title 31','Content for post 31','Author 31','2024-10-02 08:39:09'),(32,'Title 32','Content for post 32','Author 32','2024-10-02 08:39:09'),(33,'Title 33','Content for post 33','Author 33','2024-10-02 08:39:09'),(34,'Title 34','Content for post 34','Author 34','2024-10-02 08:39:09'),(35,'Title 35','Content for post 35','Author 35','2024-10-02 08:39:09'),(36,'Title 36','Content for post 36','Author 36','2024-10-02 08:39:09'),(37,'Title 37','Content for post 37','Author 37','2024-10-02 08:39:09'),(38,'Title 38','Content for post 38','Author 38','2024-10-02 08:39:09'),(39,'Title 39','Content for post 39','Author 39','2024-10-02 08:39:09'),(40,'Title 40','Content for post 40','Author 40','2024-10-02 08:39:09'),(41,'Title 41','Content for post 41','Author 41','2024-10-02 08:39:09'),(42,'Title 42','Content for post 42','Author 42','2024-10-02 08:39:09'),(43,'Title 43','Content for post 43','Author 43','2024-10-02 08:39:09'),(44,'Title 44','Content for post 44','Author 44','2024-10-02 08:39:09'),(45,'Title 45','Content for post 45','Author 45','2024-10-02 08:39:09'),(46,'Title 46','Content for post 46','Author 46','2024-10-02 08:39:09'),(47,'Title 47','Content for post 47','Author 47','2024-10-02 08:39:09'),(48,'Title 48','Content for post 48','Author 48','2024-10-02 08:39:09'),(49,'Title 49','Content for post 49','Author 49','2024-10-02 08:39:09'),(50,'Title 50','Content for post 50','Author 50','2024-10-02 08:39:09'),(51,'Title 51','Content for post 51','Author 51','2024-10-02 08:39:09'),(52,'Title 52','Content for post 52','Author 52','2024-10-02 08:39:09'),(53,'Title 53','Content for post 53','Author 53','2024-10-02 08:39:09'),(54,'Title 54','Content for post 54','Author 54','2024-10-02 08:39:09'),(55,'Title 55','Content for post 55','Author 55','2024-10-02 08:39:09'),(56,'Title 56','Content for post 56','Author 56','2024-10-02 08:39:09'),(57,'Title 57','Content for post 57','Author 57','2024-10-02 08:39:09'),(58,'Title 58','Content for post 58','Author 58','2024-10-02 08:39:09'),(59,'Title 59','Content for post 59','Author 59','2024-10-02 08:39:09'),(60,'Title 60','Content for post 60','Author 60','2024-10-02 08:39:09'),(61,'Title 61','Content for post 61','Author 61','2024-10-02 08:39:09'),(62,'Title 62','Content for post 62','Author 62','2024-10-02 08:39:09'),(63,'Title 63','Content for post 63','Author 63','2024-10-02 08:39:09'),(64,'Title 64','Content for post 64','Author 64','2024-10-02 08:39:09'),(65,'Title 65','Content for post 65','Author 65','2024-10-02 08:39:09'),(66,'Title 66','Content for post 66','Author 66','2024-10-02 08:39:09'),(67,'Title 67','Content for post 67','Author 67','2024-10-02 08:39:09'),(68,'Title 68','Content for post 68','Author 68','2024-10-02 08:39:09'),(69,'Title 69','Content for post 69','Author 69','2024-10-02 08:39:09'),(70,'Title 70','Content for post 70','Author 70','2024-10-02 08:39:09'),(71,'Title 71','Content for post 71','Author 71','2024-10-02 08:39:09'),(72,'Title 72','Content for post 72','Author 72','2024-10-02 08:39:09'),(73,'Title 73','Content for post 73','Author 73','2024-10-02 08:39:09'),(74,'Title 74','Content for post 74','Author 74','2024-10-02 08:39:09'),(75,'Title 75','Content for post 75','Author 75','2024-10-02 08:39:09'),(76,'Title 76','Content for post 76','Author 76','2024-10-02 08:39:09'),(77,'Title 77','Content for post 77','Author 77','2024-10-02 08:39:09'),(78,'Title 78','Content for post 78','Author 78','2024-10-02 08:39:09'),(79,'Title 79','Content for post 79','Author 79','2024-10-02 08:39:09'),(80,'Title 80','Content for post 80','Author 80','2024-10-02 08:39:09'),(81,'Title 81','Content for post 81','Author 81','2024-10-02 08:39:09'),(82,'Title 82','Content for post 82','Author 82','2024-10-02 08:39:09'),(83,'Title 83','Content for post 83','Author 83','2024-10-02 08:39:09'),(84,'Title 84','Content for post 84','Author 84','2024-10-02 08:39:09'),(85,'Title 85','Content for post 85','Author 85','2024-10-02 08:39:09'),(86,'Title 86','Content for post 86','Author 86','2024-10-02 08:39:09'),(87,'Title 87','Content for post 87','Author 87','2024-10-02 08:39:09'),(88,'Title 88','Content for post 88','Author 88','2024-10-02 08:39:09'),(89,'Title 89','Content for post 89','Author 89','2024-10-02 08:39:09'),(90,'Title 90','Content for post 90','Author 90','2024-10-02 08:39:09'),(91,'Title 91','Content for post 91','Author 91','2024-10-02 08:39:09'),(92,'Title 92','Content for post 92','Author 92','2024-10-02 08:39:09'),(93,'Title 93','Content for post 93','Author 93','2024-10-02 08:39:09'),(94,'Title 94','Content for post 94','Author 94','2024-10-02 08:39:09'),(95,'Title 95','Content for post 95','Author 95','2024-10-02 08:39:09'),(96,'Title 96','Content for post 96','Author 96','2024-10-02 08:39:09'),(97,'Title 97','Content for post 97','Author 97','2024-10-02 08:39:09'),(98,'Title 98','Content for post 98','Author 98','2024-10-02 08:39:09'),(99,'Title 99','Content for post 99','Author 99','2024-10-02 08:39:09'),(100,'Title 100','Content for post 100','Author 100','2024-10-02 08:39:09');
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-02 17:51:05

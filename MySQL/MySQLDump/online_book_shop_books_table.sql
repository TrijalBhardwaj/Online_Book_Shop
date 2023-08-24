-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: online_book_shop
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `books_table`
--

DROP TABLE IF EXISTS `books_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books_table` (
  `book_id` varchar(100) COLLATE utf8mb3_bin NOT NULL,
  `book_name` varchar(100) COLLATE utf8mb3_bin NOT NULL,
  `author_name` varchar(100) COLLATE utf8mb3_bin NOT NULL,
  `book_description` varchar(1000) COLLATE utf8mb3_bin NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books_table`
--

LOCK TABLES `books_table` WRITE;
/*!40000 ALTER TABLE `books_table` DISABLE KEYS */;
INSERT INTO `books_table` VALUES ('B001','The Great Gatsby','F. Scott Fitzgerald','Classic novel'),('B002','To Kill a Mockingbird','Harper Lee','American literature'),('B003','1984','George Orwell','Dystopian fiction'),('B004','Brave New World','Aldous Huxley','Dystopian fiction'),('B005','The Catcher in the Rye','J.D. Salinger','Coming-of-age novel'),('B006','Lord of the Flies','William Golding','Allegorical novel'),('B007','Moby-Dick','Herman Melville','Adventure fiction'),('B008','Pride and Prejudice','Jane Austen','Romantic novel'),('B009','Frankenstein','Mary Shelley','Gothic novel'),('B010','The Hobbit','J.R.R. Tolkien','Fantasy'),('B011','To the Lighthouse','Virginia Woolf','Modernist novel'),('B012','One Hundred Years of Solitude','Gabriel García Márquez','Magical realism'),('B013','The Grapes of Wrath','John Steinbeck','Realist novel'),('B014','Crime and Punishment','Fyodor Dostoevsky','Psychological fiction'),('B015','The Odyssey','Homer','Epic poem'),('B016','The Picture of Dorian Gray','Oscar Wilde','Gothic fiction'),('B017','Alice\'s Adventures in Wonderland','Lewis Carroll','Fantasy'),('B018','The War of the Worlds','H.G. Wells','Science fiction'),('B019','The Lord of the Rings','J.R.R. Tolkien','Fantasy'),('B020','Dracula','Bram Stoker','Gothic horror');
/*!40000 ALTER TABLE `books_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-24  8:56:25

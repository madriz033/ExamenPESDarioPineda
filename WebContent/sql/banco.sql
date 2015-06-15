-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Volcando estructura para tabla banco.tarjetacredito
DROP TABLE IF EXISTS `tarjetacredito`;
CREATE TABLE IF NOT EXISTS `tarjetacredito` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` char(12) NOT NULL,
  `cupoMaximo` int(5) NOT NULL DEFAULT '500',
  `saldoDisponible` int(5) NOT NULL,
  `tipo` char(10) NOT NULL,
  `numComprobacion` int(7) NOT NULL,
  `contrasenha` char(4) NOT NULL,
  `bloqueada` binary(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.tarjetacredito: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tarjetacredito` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarjetacredito` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

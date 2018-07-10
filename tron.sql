-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 10 juil. 2018 à 20:58
-- Version du serveur :  5.7.19
-- Version de PHP :  5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `tron`
--

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `ChooseLevel`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `ChooseLevel` (IN `id` INT(11))  NO SQL
SELECT * FROM map WHERE id = map_id$$

DROP PROCEDURE IF EXISTS `RecordPartie`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `RecordPartie` (IN `win` TEXT, IN `lose` TEXT, IN `Temps` INT(10))  NO SQL
INSERT INTO StatsPartie (winner, loser, time) VALUES ( win, Lose, Temps )$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `map`
--

DROP TABLE IF EXISTS `map`;
CREATE TABLE IF NOT EXISTS `map` (
  `map_id` int(5) NOT NULL AUTO_INCREMENT,
  `text` text NOT NULL,
  PRIMARY KEY (`map_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `map`
--

INSERT INTO `map` (`map_id`, `text`) VALUES
(1, '22222222222222222222\r\n1                  1\r\n1                  1\r\n1                  1\r\n1                  1\r\n1                  1\r\n1   4        3     1\r\n1                  1\r\n1                  1\r\n1                  1\r\n1                  1\r\n22222222222222222222\r\n');

-- --------------------------------------------------------

--
-- Structure de la table `statspartie`
--

DROP TABLE IF EXISTS `statspartie`;
CREATE TABLE IF NOT EXISTS `statspartie` (
  `partie_id` int(11) NOT NULL AUTO_INCREMENT,
  `winner` text NOT NULL,
  `loser` text NOT NULL,
  `time` int(11) NOT NULL,
  PRIMARY KEY (`partie_id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `statspartie`
--

INSERT INTO `statspartie` (`partie_id`, `winner`, `loser`, `time`) VALUES
(1, 'red', 'Blue', 100),
(2, 'red', 'Blue', 100),
(3, 'Blue', 'Red', 100),
(4, 'red', 'Blue', 100),
(5, 'Blue', 'Red', 100),
(6, 'Blue', 'Red', 100),
(7, 'red', 'Blue', 100),
(8, 'Blue', 'Red', 100),
(9, 'Blue', 'Red', 100),
(10, 'Null', 'Null', 100),
(11, 'red', 'Blue', 100),
(12, 'Blue', 'Red', 100),
(13, 'Blue', 'Red', 100),
(14, 'red', 'Blue', 100);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

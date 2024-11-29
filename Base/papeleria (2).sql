-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2024 a las 23:32:39
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `papeleria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ctestatus`
--

CREATE TABLE `ctestatus` (
  `IdEstatus` int(11) NOT NULL,
  `Estatus` varchar(300) NOT NULL,
  `FechaIns` datetime NOT NULL,
  `IdUsuarioIns` int(11) NOT NULL,
  `FechaUp` datetime NOT NULL,
  `IdUsuarioUp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbhistoricoproducto`
--

CREATE TABLE `tbhistoricoproducto` (
  `IdHistorico` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `Piezas` int(11) NOT NULL,
  `PrecioTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbproductos`
--

CREATE TABLE `tbproductos` (
  `IdProducto` int(11) NOT NULL,
  `ProductoDescripcion` text NOT NULL,
  `Precio` decimal(10,0) NOT NULL,
  `QrUrl` text NOT NULL,
  `Estatus` int(11) NOT NULL,
  `Stock` int(11) NOT NULL,
  `FechaIns` datetime NOT NULL,
  `IdUsuarioIns` int(11) NOT NULL,
  `FechaUp` int(11) NOT NULL,
  `IdUsuarioUp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbusuarios`
--

CREATE TABLE `tbusuarios` (
  `IdUsuario` int(11) NOT NULL,
  `Usuario` varchar(500) NOT NULL,
  `Contrasena` text NOT NULL,
  `NombreCompleto` text NOT NULL,
  `Estatus` int(11) NOT NULL,
  `UrlFotografia` text NOT NULL,
  `FechaIns` datetime NOT NULL,
  `IdUsuarioIns` int(11) NOT NULL,
  `FechaUp` int(11) DEFAULT NULL,
  `IdUsuarioUp` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbproductos`
--
ALTER TABLE `tbproductos`
  ADD PRIMARY KEY (`IdProducto`);

--
-- Indices de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  ADD PRIMARY KEY (`IdUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbproductos`
--
ALTER TABLE `tbproductos`
  MODIFY `IdProducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  MODIFY `IdUsuario` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2022 a las 20:41:26
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `contactoAlternativo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `direccion`, `telefono`, `contactoAlternativo`) VALUES
(1, 37505013, 'Jose', 'Armando', 'Montes 123', 123465, 'Josefa'),
(2, 34956878, 'Melinda', 'Cotia', 'Colon 21', 789465, 'Monica'),
(3, 12345678, 'Jorge', 'De La Selva', 'Amazonas 456', 12345, 'Tarzan'),
(4, 74561559, 'Daniel', 'Barros', 'Torre Alfa 163', 12345, 'Alfonsina'),
(5, 15926378, 'Maximiliano', 'Ardilla', 'San Luis 789', 12345, 'La señora ardilla'),
(6, 123, 'Nicolas', 'Requelme', 'Peron 23', 789, 'Micaela'),
(7, 563, 'Micaela', 'Viu', 'calle 7', 123, 'Nicolas'),
(8, 512, 'Juan', 'Lopez', 'Suipacha 12', 123, 'Antonia'),
(9, 982, 'Luciano', 'Riquelme', 'Brasil 130', 123, 'Marita'),
(10, 124, 'Pablo', 'Funes', 'Sucre 901', 5687, 'Carolina'),
(12, 12389, 'Juan', 'Perez', 'Call100', 0, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE `consulta` (
  `idConsulta` int(11) NOT NULL,
  `precio` double NOT NULL,
  `fecha` date NOT NULL,
  `pesoMedido` double NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`idConsulta`, `precio`, `fecha`, `pesoMedido`, `idMascota`, `idTratamiento`) VALUES
(1, 2000, '2022-05-15', 10, 1, 1),
(2, 2000, '2022-05-15', 0, 8, 1),
(3, 2500, '2022-05-30', 0, 6, 2),
(4, 2500, '2022-03-01', 0, 2, 3),
(5, 1800, '2022-10-02', 13, 1, 4),
(6, 3000, '2022-08-03', 15, 1, 5),
(7, 5000, '2022-04-08', 0, 4, 6),
(8, 2000, '1990-09-02', 0, 5, 3),
(9, 1800, '2022-06-01', 55.2, 3, 4),
(10, 2000, '2022-06-10', 56.48, 7, 4),
(11, 2000, '2022-06-20', 58.54, 10, 4),
(12, 2000, '2022-06-30', 48, 3, 4),
(13, 1800, '2022-06-01', 55.2, 3, 3),
(14, 2000, '2022-06-10', 56.48, 3, 3),
(15, 2000, '2022-06-20', 58.54, 3, 3),
(16, 2000, '2022-06-30', 57.15, 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `raza` varchar(50) DEFAULT NULL,
  `colorPelaje` varchar(50) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  `activo` tinyint(1) NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelaje`, `fechaNac`, `activo`, `idCliente`) VALUES
(1, 'Luna', 'hembra', 'perro', 'callejera', 'marron', '2010-08-02', 0, 1),
(2, 'Piky', 'hembra', 'perro', 'caniche', 'blanco', '2012-10-19', 1, 2),
(3, 'Furia', 'macho', 'perro', 'rottwailer', 'oscuro', '2015-08-24', 1, 3),
(4, 'Roco', 'macho', 'perro', 'caniche', 'marron', '2005-09-01', 1, 4),
(5, 'Mico', 'macho', 'pajaro', 'loro', 'verdoso', '2008-02-23', 0, 6),
(6, 'Mini', 'hembra', 'gato', '', '', '1968-07-01', 1, 5),
(7, 'Flopi', 'hembra', 'rata', 'hamster', 'blanquecino', '1993-05-29', 1, 3),
(8, 'Gori', 'macho', 'tortuga', 'pequeña', 'verdoso', '1993-05-29', 1, 3),
(9, 'Monki', 'macho', 'mono', 'salvaje', 'negro', '1993-05-29', 1, 3),
(10, 'Gallo', 'macho', 'pajaro', 'gallina', 'blanquecino', '1993-05-29', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `medicamento` varchar(100) DEFAULT NULL,
  `importe` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `tipo`, `descripcion`, `medicamento`, `importe`, `activo`) VALUES
(1, 'vacunacion', 'desparacitar', '', 2000, 1),
(2, 'enfermedad', '', '', 1500, 1),
(3, 'curaciones', ' ', '', 2500, 1),
(4, 'baño y corte de pelo', ' ', '', 1800, 0),
(5, 'castracion', ' ', '', 3000, 1),
(6, 'cirugia ', ' ', ' ', 5000, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`idConsulta`),
  ADD KEY `idMascota` (`idMascota`,`idTratamiento`),
  ADD KEY `fk_consulta_tratamiento_idTratamiento` (`idTratamiento`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `consulta`
--
ALTER TABLE `consulta`
  MODIFY `idConsulta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `fk_consulta_mascota_idMascota` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  ADD CONSTRAINT `fk_consulta_tratamiento_idTratamiento` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `fk_mascota_cliente_idCliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `fk_tratamiento_consulta_idTratamiento` FOREIGN KEY (`idTratamiento`) REFERENCES `consulta` (`idTratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

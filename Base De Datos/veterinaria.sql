-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2022 a las 22:05:01
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
-- Base de datos: `veterinaria2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `documento` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `telefono` int(15) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `personaAlternativa` varchar(45) DEFAULT NULL,
  `activo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`documento`, `nombre`, `apellido`, `telefono`, `direccion`, `personaAlternativa`, `activo`) VALUES
(3, 'jorge', 'de la selva', 123, 'Av jungla', 'tarzan', 1),
(96, 'pepe', 'argento', 123, ' Aldolfo Alsina 2256', ' monica', 1),
(97, 'Federico', 'ordoñez', 1, ' ', ' ', 1),
(98, 'Federico', 'ordoñez', 1, ' ', ' ', 1),
(99, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(100, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(101, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(102, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(103, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(104, 'Federica', 'ordoñez', 1, ' ', ' ', 1),
(7200332, 'Tadeo', 'Sanchez', 123433, 'Uruguay 12', 'Carlos', 0),
(11032123, 'Carlos', 'Gimenez', 3123212, 'Av España', 'Susana', 0),
(12032123, 'Olga', 'Gimenez', 312321, 'Av Libertador', 'Pedro', 0),
(16200332, 'Geronimo', 'Maldonado', 567431, '25 de Mayo', 'Liliana', 0),
(19200332, 'Julio', 'Veliz', 4423433, 'Gral Roca', 'Sabrina', 0),
(20200332, 'Lucas', 'Salasa', 683641, 'Sargento Cabral', 'Santiago', 0),
(21233454, 'Daniela', 'Nuñezx', 23212342, 'La Rotonda', 'Carlos', 0),
(23124567, 'Santigo', 'Perez', 3544231, 'San Martin', 'Eduardo', 0),
(38920123, 'Roque', 'Barros', 3544231, 'San Martin', 'Julieta', 0),
(40200332, 'Nicolas', 'Salas', 980641, '25 de Mayo', 'Rosa', 0),
(47497200, 'Daniel', 'Barros', 3444232, 'San Martin', 'Matias', 0),
(49200332, 'Jose', 'Messi', 312321, 'Belgrano 219', 'Lionel', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `codigo` int(11) NOT NULL,
  `alias` varchar(45) DEFAULT NULL,
  `sexo` varchar(1) NOT NULL,
  `especie` varchar(45) NOT NULL,
  `raza` varchar(45) DEFAULT NULL,
  `color` varchar(45) NOT NULL,
  `nacimiento` date DEFAULT NULL,
  `documentoCliente` int(11) NOT NULL,
  `activo` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`codigo`, `alias`, `sexo`, `especie`, `raza`, `color`, `nacimiento`, `documentoCliente`, `activo`) VALUES
(2, 'sandia', 'M', 'Perro', 'dalmata', 'blanco y negro', '2022-06-01', 7200332, 1),
(3, 'Roque', 'M', 'Perro', 'Beagle', 'Tricolor', '2021-06-05', 16200332, 1),
(4, 'Black', 'M', 'Perro', 'Doberman', 'Negro', '2020-06-19', 20200332, 1),
(5, 'Oli', 'H', 'Perro', 'Nose', 'Negro', '2021-06-12', 12032123, 1),
(6, 'Flaca', 'H', 'gato', '', 'Blanco', '2019-06-08', 49200332, 0),
(7, 'Cejas', 'M', 'Perro', 'Pitbull', 'Gris', '2020-06-19', 19200332, 1),
(8, 'Roco', 'M', 'Perro', 'Caniche', 'Gris', '2021-06-05', 23124567, 1),
(9, 'Gorda', 'H', 'Perro', 'Chihuahua', 'Marron', '2011-06-01', 47497200, 1),
(10, 'Floki', 'M', 'Perro', 'Batato', 'Tricolor', '2017-06-16', 16200332, 1),
(11, 'Torora', 'M', 'Hamster', 'pequeña', 'Marron clariso', '2021-10-12', 12032123, 1),
(12, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 100, 1),
(13, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 101, 1),
(14, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 102, 1),
(15, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 102, 1),
(16, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 102, 1),
(17, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 103, 1),
(18, 'cucharita', 'H', 'Perro', ' ', ' ', '2022-06-10', 104, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `medicamento` varchar(45) DEFAULT NULL,
  `importe` double NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`id`, `tipo`, `descripcion`, `medicamento`, `importe`, `activo`) VALUES
(1, 'curacion', ' asd', 'asdf ', 1548, 1),
(2, 'cardiologia', ' asd', 'asdf ', 2000, 1),
(3, 'chekeo', ' ', ' ', 2000, 1),
(4, 'desparacitacion', ' ', ' ', 6000, 1),
(5, 'cirugia', ' ', ' ', 16000, 1),
(6, 'castracion', ' ', ' ', 2000, 0),
(7, 'enfermedad', ' ', ' ', 1500, 1),
(8, 'dopaje', ' ', ' ', 1500, 1),
(9, 'vacunacion', ' ', ' ', 1500, 1),
(10, 'analisis', ' ', ' ', 1500, 1),
(11, 'enfermedad', ' ', ' ', 1500, 1),
(12, 'enfermedad', ' ', ' ', 1500, 1),
(13, 'curacion', ' asd', 'asdf ', 1548, 1),
(14, 'cardiologia', ' asd', 'asdf ', 2000, 1),
(15, 'cardiologia', ' asd', 'asdf ', 2000, 1),
(16, 'curacion', ' asd', 'asdf ', 1548, 1),
(17, 'curacion', ' asd', 'asdf ', 1548, 1),
(18, 'curacion', ' asd', 'asdf ', 1548, 1),
(19, 'curacion', ' asd', 'asdf ', 1548, 1),
(20, 'curacion', ' asd', 'asdf ', 1548, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `detalle` varchar(45) DEFAULT NULL,
  `pesoMedido` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idVisita`, `idMascota`, `idTratamiento`, `fecha`, `detalle`, `pesoMedido`) VALUES
(8, 10, 8, '2022-06-10', 'aumento de peso', 8.5),
(9, 11, 8, '2022-06-10', 'se siente mejor', 15.2),
(10, 2, 2, '2022-05-05', ' ', 12.3),
(11, 2, 2, '2022-05-08', ' ', 11.5),
(12, 2, 2, '2022-05-13', '', 11.2),
(13, 2, 2, '2022-05-17', ' ', 11.8),
(14, 2, 2, '2022-05-05', ' ', 12.3),
(15, 2, 2, '2022-05-08', ' ', 11.5),
(16, 2, 2, '2022-05-13', '', 11.2),
(17, 2, 2, '2022-05-17', ' ', 11.8),
(18, 2, 2, '2022-05-22', ' ', 12.1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`documento`),
  ADD UNIQUE KEY `documento_UNIQUE` (`documento`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  ADD KEY `idCliente_idx` (`documentoCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `mascota_idx` (`idMascota`),
  ADD KEY `tratamiento_idx` (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `cliente` FOREIGN KEY (`documentoCliente`) REFERENCES `cliente` (`documento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `idMascota` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTratamiento` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

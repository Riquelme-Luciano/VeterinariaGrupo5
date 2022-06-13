-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2022 a las 00:53:28
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

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
(7200332, 'Tadeo', 'Sanchez', 123433, 'Uruguay 12', 'Carlos', 1),
(11032123, 'Carlos', 'Gimenez', 3123212, 'Av España', 'Susana', 0),
(12032123, 'Olga', 'Gimenez', 312321, 'Av Libertador', 'Pedro', 1),
(16200332, 'Geronimo', 'Maldonado', 567431, '25 de Mayo', 'Liliana', 0),
(19200332, 'Julio', 'Veliz', 4423433, 'Gral Roca', 'Sabrina', 1),
(20200332, 'Lucas', 'Salasa', 683641, 'Sargento Cabral', 'Santiago', 0),
(21233454, 'Daniela', 'Nuñezx', 23212342, 'La Rotonda', 'Carlos', 1),
(23124567, 'Santigo', 'Perez', 3544231, 'San Martin', 'Eduardo', 1),
(38920123, 'Roque', 'Barros', 3544231, 'San Martin', 'Julieta', 1),
(40200332, 'Nicolas', 'Salas', 980641, '25 de Mayo', 'Rosa', 1),
(47497200, 'Daniel', 'Barros', 3444232, 'San Martin', 'Matias', 1),
(49200332, 'Jose', 'Messi', 312321, 'Belgrano 219', 'Lionel', 1);

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
(2, 'sad', 'M', 'Perro', 'dsads', 'dsa', '2022-06-01', 7200332, 0),
(3, 'Roque', 'M', 'Perro', 'Beagle', 'Tricolor', '2021-06-05', 16200332, 0),
(4, 'Black', 'M', 'Perro', 'Doberman', 'Negro', '2020-06-19', 20200332, 0),
(5, 'Oli', 'H', 'Perro', 'Nose', 'Negro', '2021-06-12', 12032123, 1),
(6, 'Flaca', 'H', 'Perro', '', 'Blanco', '2019-06-08', 49200332, 0),
(7, 'Cejas', 'M', 'Perro', 'Pitbull', 'Gris', '2020-06-19', 19200332, 1),
(8, 'Roco', 'M', 'Perro', 'Caniche', 'Gris', '2021-06-05', 23124567, 1),
(9, 'Gorda', 'H', 'Perro', 'Chihuahua', 'Marron', '2011-06-01', 47497200, 1),
(10, 'Floki', 'M', 'Perro', 'Batato', 'Tricolor', '2017-06-16', 16200332, 0),
(11, 'Locona', 'H', 'Loro', 'Cotorra', 'Negro', '2019-06-15', 11032123, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `medicamento` varchar(45) DEFAULT NULL,
  `importe` double NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`id`, `tipo`, `descripcion`, `medicamento`, `importe`, `activo`) VALUES
(1, 'Vacunación', 'Vacunacion para CAN con vac-20PB12', 'vac-20PB12', 2000, 1),
(2, 'Vacunación', 'Otra vacunacion mas', 'dasdde', 3000, 0),
(3, 'Vacunación', 'Otro para borrar', 'vac-20PB12', 2500, 0),
(4, 'Desparacitacion', 'Desaparacitacion con medicamento especializado', 'VAC-99PRANTI', 5000, 1),
(5, 'Operacion', 'Operacion de una pata', 'Analgesico 221321', 7000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `detalle` varchar(45) NOT NULL,
  `pesoMedido` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT;

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

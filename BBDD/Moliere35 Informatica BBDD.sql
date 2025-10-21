CREATE TABLE `clientes` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255),
  `primer_apellido` varchar(255),
  `segundo_apellido` varchar(255),
  `email` varchar(255) UNIQUE,
  `telefono` varchar(255)
);

CREATE TABLE `tecnicos` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255),
  `email` varchar(255) UNIQUE,
  `telefono` varchar(255),
  `contraseña` varchar(255)
);

CREATE TABLE `estado_reparacion` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255),
  `mensaje_cliente` text
);

CREATE TABLE `reparaciones` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `cliente_id` int,
  `tecnico_id` int,
  `estado_id` int,
  `descripcion` text,
  `observaciones` text,
  `fecha_creacion` date,
  `contraseña_acceso` varchar(255)
);

CREATE TABLE `roles` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(255) UNIQUE
);

ALTER TABLE `reparaciones` ADD FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`);

ALTER TABLE `reparaciones` ADD FOREIGN KEY (`tecnico_id`) REFERENCES `tecnicos` (`id`);

ALTER TABLE `reparaciones` ADD FOREIGN KEY (`estado_id`) REFERENCES `estado_reparacion` (`id`);

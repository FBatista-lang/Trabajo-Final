##create database pfinal;
##use pfinal;
##drop database pfinal;

CREATE TABLE `pfinal`.`productos` (
  `idproductos` INT NOT NULL,
  `nombreproductos` VARCHAR(45) NOT NULL,
  `marcaproductos` VARCHAR(45) NOT NULL,
  `categoriaproductos` VARCHAR(45) NOT NULL,
  `precioproductos` INT NOT NULL,
  `cantidadproductos` INT NOT NULL,
  PRIMARY KEY (`idproductos`));

CREATE TABLE `pfinal`.`usuarios` (
  `idusuarios` INT NOT NULL,
  `nickusuarios` VARCHAR(45) NOT NULL,
  `nombreusuarios` VARCHAR(45) NOT NULL,
  `apellidousuarios` VARCHAR(45) NOT NULL,
  `telefonousuariosc` VARCHAR(45) NOT NULL,
  `emailusuarios` VARCHAR(45) NOT NULL,
  `passwordusuarios` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idusuarios`));

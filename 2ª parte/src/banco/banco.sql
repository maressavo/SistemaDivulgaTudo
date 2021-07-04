CREATE SCHEMA IF NOT EXISTS `divulgatudo` DEFAULT CHARACTER SET utf8 ;
USE `divulgatudo` ;

-- -----------------------------------------------------
-- Table `divulgatudo`.`anuncio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `divulgatudo`.`anuncio` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeanuncio` VARCHAR(100) NOT NULL,
  `nomecliente` VARCHAR(100) NOT NULL,
  `datainicio` DATE NOT NULL,
  `datafinal` DATE NOT NULL,
  `investimentodia` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
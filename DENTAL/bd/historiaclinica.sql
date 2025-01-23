# DBTools DBMYSQL - MySQL Database Dump
#

CREATE DATABASE `historiaclinica`;
USE `historiaclinica`;

SET FOREIGN_KEY_CHECKS=0;

# Dumping Table Structure for afecciones

#
CREATE TABLE `afecciones` (
  `id_afe` int(4) NOT NULL auto_increment,
  `nom_afe` varchar(50) NOT NULL,
  `contraindicaciones` varchar(250) default NULL,
  PRIMARY KEY  (`id_afe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for afecciones
#
# Dumping Table Structure for anamnesis

#
CREATE TABLE `anamnesis` (
  `id_ana` int(4) NOT NULL auto_increment,
  `id_pac` int(4) NOT NULL,
  `tra_med` varchar(50) NOT NULL,
  `obs_tra` varchar(200) NOT NULL,
  `ing_med` varchar(50) NOT NULL,
  `obs_ing` varchar(200) NOT NULL,
  `rea_ale` varchar(50) NOT NULL,
  `obs_rea` varchar(200) NOT NULL,
  `hemo` varchar(50) NOT NULL,
  `obs_hem` varchar(200) NOT NULL,
  `irrad` varchar(50) NOT NULL,
  `obs_irr` varchar(200) NOT NULL,
  `sinu` varchar(50) NOT NULL,
  `obs_sin` varchar(200) NOT NULL,
  `enf_res` varchar(50) NOT NULL,
  `obs_enf` varchar(200) NOT NULL,
  `card` varchar(50) NOT NULL,
  `obs_car` varchar(200) NOT NULL,
  `diab` varchar(50) NOT NULL,
  `obs_dia` varchar(200) NOT NULL,
  `fie_reu` varchar(50) NOT NULL,
  `obs_fie` varchar(200) NOT NULL,
  `hepa` varchar(50) NOT NULL,
  `obs_hep` varchar(200) NOT NULL,
  `hiper` varchar(50) NOT NULL,
  `obs_hip` varchar(200) NOT NULL,
  `otras` varchar(250) NOT NULL,
  `cepillado` varchar(50) NOT NULL,
  `obs_cep` varchar(200) NOT NULL,
  `seda` varchar(50) NOT NULL,
  `obs_sed` varchar(200) NOT NULL,
  PRIMARY KEY  (`id_ana`),
  KEY `FK_anamnesis_pacientes` (`id_pac`),
  CONSTRAINT `FK_anamnesis_pacientes` FOREIGN KEY (`id_pac`) REFERENCES `pacientes` (`id_pac`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
#
# Dumping Data for anamnesis
#
# Dumping Table Structure for citas

#
CREATE TABLE `citas` (
  `id_cit` int(4) NOT NULL auto_increment,
  `id_pac` int(4) NOT NULL,
  `fec_cit` varchar(50) NOT NULL,
  `mot_cit` varchar(300) default NULL,
  `cau_cit` varchar(300) default NULL,
  PRIMARY KEY  (`id_cit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for citas
#
# Dumping Table Structure for detalleafeccionespac

#
CREATE TABLE `detalleafeccionespac` (
  `id_det` int(4) NOT NULL auto_increment,
  `id_pac` int(4) NOT NULL,
  `id_afe` int(4) NOT NULL,
  PRIMARY KEY  (`id_det`),
  KEY `FK_detalleafeccionespac_pacientes` (`id_pac`),
  KEY `FK_detalleafeccionespac_afecciones` (`id_afe`),
  CONSTRAINT `FK_detalleafeccionespac_afecciones` FOREIGN KEY (`id_afe`) REFERENCES `afecciones` (`id_afe`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_detalleafeccionespac_pacientes` FOREIGN KEY (`id_pac`) REFERENCES `pacientes` (`id_pac`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for detalleafeccionespac
#
# Dumping Table Structure for detallecitas

#
CREATE TABLE `detallecitas` (
  `id_det` int(4) NOT NULL auto_increment,
  `id_cit` int(4) NOT NULL,
  `tra_det` varchar(50) NOT NULL,
  `pie_det` varchar(50) NOT NULL,
  `car_det` varchar(50) NOT NULL,
  `obs_det` varchar(300) default NULL,
  PRIMARY KEY  (`id_det`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
#
# Dumping Data for detallecitas
#
# Dumping Table Structure for detallediagnostico

#
CREATE TABLE `detallediagnostico` (
  `id_det_dia` int(4) NOT NULL auto_increment,
  `id_dia` int(4) NOT NULL,
  `id_dx` int(4) NOT NULL,
  PRIMARY KEY  (`id_det_dia`),
  KEY `FK_detallediagnostico_diagnostico` (`id_dia`),
  KEY `FK_detallediagnostico_DX` (`id_dx`),
  CONSTRAINT `FK_detallediagnostico_diagnostico` FOREIGN KEY (`id_dia`) REFERENCES `diagnosticos` (`id_dia`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_detallediagnostico_DX` FOREIGN KEY (`id_dx`) REFERENCES `dx` (`id_dx`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
#
# Dumping Data for detallediagnostico
#
# Dumping Table Structure for detalletratamientos

#
CREATE TABLE `detalletratamientos` (
  `id_det_tra` int(4) NOT NULL auto_increment,
  `id_tra` int(4) NOT NULL,
  `id_prod` int(4) NOT NULL,
  `nom_prod` varchar(50) NOT NULL,
  PRIMARY KEY  (`id_det_tra`),
  KEY `FK_detalletratamientos_tra` (`id_tra`),
  KEY `FK_detalletratamientos_prod` (`id_prod`),
  CONSTRAINT `FK_detalletratamientos_prod` FOREIGN KEY (`id_prod`) REFERENCES `productos` (`id_prod`),
  CONSTRAINT `FK_detalletratamientos_tra` FOREIGN KEY (`id_tra`) REFERENCES `tratamientos` (`id_tra`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for detalletratamientos
#
# Dumping Table Structure for diagnosticos

#
CREATE TABLE `diagnosticos` (
  `id_dia` int(4) NOT NULL auto_increment,
  `id_pac` int(4) NOT NULL,
  `sup_num` varchar(4) NOT NULL,
  `abr_exad` varchar(4) NOT NULL,
  `man_exad` varchar(4) NOT NULL,
  `pat_pul` varchar(4) NOT NULL,
  `pla_bla` varchar(4) NOT NULL,
  `pla_cal` varchar(4) NOT NULL,
  `flu_den` varchar(10) NOT NULL,
  `otr_exad` varchar(300) NOT NULL,
  `obs_exad` varchar(300) NOT NULL,
  `cau_ext` varchar(50) NOT NULL,
  `fin_con` varchar(50) NOT NULL,
  `dia` varchar(300) NOT NULL,
  `pro` varchar(300) NOT NULL,
  `ope_tra` varchar(4) NOT NULL,
  `end_tra` varchar(4) NOT NULL,
  `per_tra` varchar(4) NOT NULL,
  `pro_tra` varchar(4) NOT NULL,
  `cir_tra` varchar(4) NOT NULL,
  `ort_tra` varchar(4) NOT NULL,
  `exo_tra` varchar(4) NOT NULL,
  `med_ora` varchar(4) NOT NULL,
  `otra_tra` varchar(250) default NULL,
  `pul_tra` varchar(4) NOT NULL,
  `pulpe_tra` varchar(4) NOT NULL,
  `exosim_tra` varchar(4) NOT NULL,
  PRIMARY KEY  (`id_dia`),
  KEY `FK_diagnosticos_pacientes` (`id_pac`),
  CONSTRAINT `FK_diagnosticos_pacientes` FOREIGN KEY (`id_pac`) REFERENCES `pacientes` (`id_pac`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
#
# Dumping Data for diagnosticos
#
# Dumping Table Structure for dx

#
CREATE TABLE `dx` (
  `id_dx` int(4) NOT NULL auto_increment,
  `dx` varchar(50) NOT NULL,
  PRIMARY KEY  (`id_dx`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
#
# Dumping Data for dx
#
INSERT INTO `dx` (id_dx, dx) VALUES (1, 'CARIE DENTINA');
INSERT INTO `dx` (id_dx, dx) VALUES (2, 'CARIE CRECIMIENTO');
INSERT INTO `dx` (id_dx, dx) VALUES (3, 'CARIE DETENIDA');
INSERT INTO `dx` (id_dx, dx) VALUES (4, 'CARIE LIMITADA AL ESMALTE');
INSERT INTO `dx` (id_dx, dx) VALUES (5, 'FRACTURA DENTAL');
INSERT INTO `dx` (id_dx, dx) VALUES (6, 'RETRACCION GINGIVIAL');
INSERT INTO `dx` (id_dx, dx) VALUES (7, 'CARIE DE PRIMERA INFANCIA');
INSERT INTO `dx` (id_dx, dx) VALUES (8, 'FRACTURA RADICULAR');
INSERT INTO `dx` (id_dx, dx) VALUES (9, 'ABSESO PERIAPICAL AGUDO');
INSERT INTO `dx` (id_dx, dx) VALUES (10, 'ABSESO PERIAPICAL CRONICO');
INSERT INTO `dx` (id_dx, dx) VALUES (11, 'PULPITIS AGUDA');
INSERT INTO `dx` (id_dx, dx) VALUES (12, 'PULPITIS CRONICA');
INSERT INTO `dx` (id_dx, dx) VALUES (13, 'ESTOMATITIS');
INSERT INTO `dx` (id_dx, dx) VALUES (14, 'GINGIVITIS');
INSERT INTO `dx` (id_dx, dx) VALUES (15, 'ENFERMEDAD PERIODONTAL');
INSERT INTO `dx` (id_dx, dx) VALUES (16, 'APIÑAMIENTO DENTAL');
INSERT INTO `dx` (id_dx, dx) VALUES (17, 'HIPOPLACIA DE ESMALTE');
# Dumping Table Structure for exaestomatologicos

#
CREATE TABLE `exaestomatologicos` (
  `id_exa` int(4) NOT NULL auto_increment,
  `id_pac` int(4) NOT NULL,
  `tem_exa` varchar(50) NOT NULL,
  `pul_exa` varchar(50) NOT NULL,
  `ten_exa` varchar(50) NOT NULL,
  `res_exa` varchar(50) NOT NULL,
  `art_exa` varchar(50) NOT NULL,
  `lab_exa` varchar(50) NOT NULL,
  `len_exa` varchar(50) NOT NULL,
  `pal_exa` varchar(50) NOT NULL,
  `pis_exa` varchar(50) NOT NULL,
  `car_exa` varchar(50) NOT NULL,
  `gla_exa` varchar(50) NOT NULL,
  `max_exa` varchar(50) NOT NULL,
  `sen_exa` varchar(50) NOT NULL,
  `mus_exa` varchar(50) NOT NULL,
  `sis_ner` varchar(50) NOT NULL,
  `sis_vas` varchar(50) NOT NULL,
  `lin_exa` varchar(50) NOT NULL,
  `fun_exa` varchar(50) NOT NULL,
  `obs_exa` varchar(250) default NULL,
  PRIMARY KEY  (`id_exa`),
  KEY `FK_exaestomatologicos_paciente` (`id_pac`),
  CONSTRAINT `FK_exaestomatologicos_paciente` FOREIGN KEY (`id_pac`) REFERENCES `pacientes` (`id_pac`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
#
# Dumping Data for exaestomatologicos
#
# Dumping Table Structure for imagencita

#
CREATE TABLE `imagencita` (
  `id_ima` int(4) NOT NULL auto_increment,
  `id_cit` int(4) NOT NULL,
  `rut_ima` varchar(200) NOT NULL,
  `des_cit` varchar(250) NOT NULL,
  `ima_cit` longblob NOT NULL,
  `tip_cit` varchar(50) NOT NULL,
  PRIMARY KEY  (`id_ima`),
  KEY `FK_imagencita_cita` (`id_cit`),
  CONSTRAINT `FK_imagencita_cita` FOREIGN KEY (`id_cit`) REFERENCES `citas` (`id_cit`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for imagencita
#
# Dumping Table Structure for odontoactuales

#
CREATE TABLE `odontoactuales` (
  `id_odo` int(4) NOT NULL,
  `id_pac` int(4) NOT NULL,
  `d1_izq` varchar(50) NOT NULL default '0',
  `d1_sup` varchar(50) NOT NULL default '0',
  `d1_cen` varchar(50) NOT NULL default '0',
  `d1_der` varchar(50) NOT NULL default '0',
  `d1_inf` varchar(50) NOT NULL default '0',
  `d2_izq` varchar(50) NOT NULL default '0',
  `d2_sup` varchar(50) NOT NULL default '0',
  `d2_cen` varchar(50) NOT NULL default '0',
  `d2_der` varchar(50) NOT NULL default '0',
  `d2_inf` varchar(50) NOT NULL default '0',
  `d3_izq` varchar(50) NOT NULL default '0',
  `d3_sup` varchar(50) NOT NULL default '0',
  `d3_cen` varchar(50) NOT NULL default '0',
  `d3_der` varchar(50) NOT NULL default '0',
  `d3_inf` varchar(50) NOT NULL default '0',
  `d4_izq` varchar(50) NOT NULL default '0',
  `d4_sup` varchar(50) NOT NULL default '0',
  `d4_cen` varchar(50) NOT NULL default '0',
  `d4_der` varchar(50) NOT NULL default '0',
  `d4_inf` varchar(50) NOT NULL default '0',
  `d5_izq` varchar(50) NOT NULL default '0',
  `d5_sup` varchar(50) NOT NULL default '0',
  `d5_cen` varchar(50) NOT NULL default '0',
  `d5_der` varchar(50) NOT NULL default '0',
  `d5_inf` varchar(50) NOT NULL default '0',
  `d6_izq` varchar(50) NOT NULL default '0',
  `d6_sup` varchar(50) NOT NULL default '0',
  `d6_cen` varchar(50) NOT NULL default '0',
  `d6_der` varchar(50) NOT NULL default '0',
  `d6_inf` varchar(50) NOT NULL default '0',
  `d7_izq` varchar(50) NOT NULL default '0',
  `d7_sup` varchar(50) NOT NULL default '0',
  `d7_cen` varchar(50) NOT NULL default '0',
  `d7_der` varchar(50) NOT NULL default '0',
  `d7_inf` varchar(50) NOT NULL default '0',
  `d8_izq` varchar(50) NOT NULL default '0',
  `d8_sup` varchar(50) NOT NULL default '0',
  `d8_cen` varchar(50) NOT NULL default '0',
  `d8_der` varchar(50) NOT NULL default '0',
  `d8_inf` varchar(50) NOT NULL default '0',
  `d9_izq` varchar(50) NOT NULL default '0',
  `d9_sup` varchar(50) NOT NULL default '0',
  `d9_cen` varchar(50) NOT NULL default '0',
  `d9_der` varchar(50) NOT NULL default '0',
  `d9_inf` varchar(50) NOT NULL default '0',
  `d10_izq` varchar(50) NOT NULL default '0',
  `d10_sup` varchar(50) NOT NULL default '0',
  `d10_cen` varchar(50) NOT NULL default '0',
  `d10_der` varchar(50) NOT NULL default '0',
  `d10_inf` varchar(50) NOT NULL default '0',
  `d11_izq` varchar(50) NOT NULL default '0',
  `d11_sup` varchar(50) NOT NULL default '0',
  `d11_cen` varchar(50) NOT NULL default '0',
  `d11_der` varchar(50) NOT NULL default '0',
  `d11_inf` varchar(50) NOT NULL default '0',
  `d12_izq` varchar(50) NOT NULL default '0',
  `d12_sup` varchar(50) NOT NULL default '0',
  `d12_cen` varchar(50) NOT NULL default '0',
  `d12_der` varchar(50) NOT NULL default '0',
  `d12_inf` varchar(50) NOT NULL default '0',
  `d13_izq` varchar(50) NOT NULL default '0',
  `d13_sup` varchar(50) NOT NULL default '0',
  `d13_cen` varchar(50) NOT NULL default '0',
  `d13_der` varchar(50) NOT NULL default '0',
  `d13_inf` varchar(50) NOT NULL default '0',
  `d14_izq` varchar(50) NOT NULL default '0',
  `d14_sup` varchar(50) NOT NULL default '0',
  `d14_cen` varchar(50) NOT NULL default '0',
  `d14_der` varchar(50) NOT NULL default '0',
  `d14_inf` varchar(50) NOT NULL default '0',
  `d15_izq` varchar(50) NOT NULL default '0',
  `d15_sup` varchar(50) NOT NULL default '0',
  `d15_cen` varchar(50) NOT NULL default '0',
  `d15_der` varchar(50) NOT NULL default '0',
  `d15_inf` varchar(50) NOT NULL default '0',
  `d16_izq` varchar(50) NOT NULL default '0',
  `d16_sup` varchar(50) NOT NULL default '0',
  `d16_cen` varchar(50) NOT NULL default '0',
  `d16_der` varchar(50) NOT NULL default '0',
  `d16_inf` varchar(50) NOT NULL default '0',
  PRIMARY KEY  (`id_odo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for odontoactuales
#
# Dumping Table Structure for odontogramas

#
CREATE TABLE `odontogramas` (
  `id_odo` int(4) NOT NULL,
  `id_pac` int(4) NOT NULL,
  `d1_izq` varchar(50) NOT NULL default '0',
  `d1_sup` varchar(50) NOT NULL default '0',
  `d1_cen` varchar(50) NOT NULL default '0',
  `d1_der` varchar(50) NOT NULL default '0',
  `d1_inf` varchar(50) NOT NULL default '0',
  `d2_izq` varchar(50) NOT NULL default '0',
  `d2_sup` varchar(50) NOT NULL default '0',
  `d2_cen` varchar(50) NOT NULL default '0',
  `d2_der` varchar(50) NOT NULL default '0',
  `d2_inf` varchar(50) NOT NULL default '0',
  `d3_izq` varchar(50) NOT NULL default '0',
  `d3_sup` varchar(50) NOT NULL default '0',
  `d3_cen` varchar(50) NOT NULL default '0',
  `d3_der` varchar(50) NOT NULL default '0',
  `d3_inf` varchar(50) NOT NULL default '0',
  `d4_izq` varchar(50) NOT NULL default '0',
  `d4_sup` varchar(50) NOT NULL default '0',
  `d4_cen` varchar(50) NOT NULL default '0',
  `d4_der` varchar(50) NOT NULL default '0',
  `d4_inf` varchar(50) NOT NULL default '0',
  `d5_izq` varchar(50) NOT NULL default '0',
  `d5_sup` varchar(50) NOT NULL default '0',
  `d5_cen` varchar(50) NOT NULL default '0',
  `d5_der` varchar(50) NOT NULL default '0',
  `d5_inf` varchar(50) NOT NULL default '0',
  `d6_izq` varchar(50) NOT NULL default '0',
  `d6_sup` varchar(50) NOT NULL default '0',
  `d6_cen` varchar(50) NOT NULL default '0',
  `d6_der` varchar(50) NOT NULL default '0',
  `d6_inf` varchar(50) NOT NULL default '0',
  `d7_izq` varchar(50) NOT NULL default '0',
  `d7_sup` varchar(50) NOT NULL default '0',
  `d7_cen` varchar(50) NOT NULL default '0',
  `d7_der` varchar(50) NOT NULL default '0',
  `d7_inf` varchar(50) NOT NULL default '0',
  `d8_izq` varchar(50) NOT NULL default '0',
  `d8_sup` varchar(50) NOT NULL default '0',
  `d8_cen` varchar(50) NOT NULL default '0',
  `d8_der` varchar(50) NOT NULL default '0',
  `d8_inf` varchar(50) NOT NULL default '0',
  `d9_izq` varchar(50) NOT NULL default '0',
  `d9_sup` varchar(50) NOT NULL default '0',
  `d9_cen` varchar(50) NOT NULL default '0',
  `d9_der` varchar(50) NOT NULL default '0',
  `d9_inf` varchar(50) NOT NULL default '0',
  `d10_izq` varchar(50) NOT NULL default '0',
  `d10_sup` varchar(50) NOT NULL default '0',
  `d10_cen` varchar(50) NOT NULL default '0',
  `d10_der` varchar(50) NOT NULL default '0',
  `d10_inf` varchar(50) NOT NULL default '0',
  `d11_izq` varchar(50) NOT NULL default '0',
  `d11_sup` varchar(50) NOT NULL default '0',
  `d11_cen` varchar(50) NOT NULL default '0',
  `d11_der` varchar(50) NOT NULL default '0',
  `d11_inf` varchar(50) NOT NULL default '0',
  `d12_izq` varchar(50) NOT NULL default '0',
  `d12_sup` varchar(50) NOT NULL default '0',
  `d12_cen` varchar(50) NOT NULL default '0',
  `d12_der` varchar(50) NOT NULL default '0',
  `d12_inf` varchar(50) NOT NULL default '0',
  `d13_izq` varchar(50) NOT NULL default '0',
  `d13_sup` varchar(50) NOT NULL default '0',
  `d13_cen` varchar(50) NOT NULL default '0',
  `d13_der` varchar(50) NOT NULL default '0',
  `d13_inf` varchar(50) NOT NULL default '0',
  `d14_izq` varchar(50) NOT NULL default '0',
  `d14_sup` varchar(50) NOT NULL default '0',
  `d14_cen` varchar(50) NOT NULL default '0',
  `d14_der` varchar(50) NOT NULL default '0',
  `d14_inf` varchar(50) NOT NULL default '0',
  `d15_izq` varchar(50) NOT NULL default '0',
  `d15_sup` varchar(50) NOT NULL default '0',
  `d15_cen` varchar(50) NOT NULL default '0',
  `d15_der` varchar(50) NOT NULL default '0',
  `d15_inf` varchar(50) NOT NULL default '0',
  `d16_izq` varchar(50) NOT NULL default '0',
  `d16_sup` varchar(50) NOT NULL default '0',
  `d16_cen` varchar(50) NOT NULL default '0',
  `d16_der` varchar(50) NOT NULL default '0',
  `d16_inf` varchar(50) NOT NULL default '0',
  PRIMARY KEY  (`id_odo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for odontogramas
#
# Dumping Table Structure for odontomaxinf

#
CREATE TABLE `odontomaxinf` (
  `id_odo` int(4) NOT NULL,
  `id_pac` int(4) NOT NULL,
  `d1_izq` varchar(50) NOT NULL default '0',
  `d1_sup` varchar(50) NOT NULL default '0',
  `d1_cen` varchar(50) NOT NULL default '0',
  `d1_der` varchar(50) NOT NULL default '0',
  `d1_inf` varchar(50) NOT NULL default '0',
  `d2_izq` varchar(50) NOT NULL default '0',
  `d2_sup` varchar(50) NOT NULL default '0',
  `d2_cen` varchar(50) NOT NULL default '0',
  `d2_der` varchar(50) NOT NULL default '0',
  `d2_inf` varchar(50) NOT NULL default '0',
  `d3_izq` varchar(50) NOT NULL default '0',
  `d3_sup` varchar(50) NOT NULL default '0',
  `d3_cen` varchar(50) NOT NULL default '0',
  `d3_der` varchar(50) NOT NULL default '0',
  `d3_inf` varchar(50) NOT NULL default '0',
  `d4_izq` varchar(50) NOT NULL default '0',
  `d4_sup` varchar(50) NOT NULL default '0',
  `d4_cen` varchar(50) NOT NULL default '0',
  `d4_der` varchar(50) NOT NULL default '0',
  `d4_inf` varchar(50) NOT NULL default '0',
  `d5_izq` varchar(50) NOT NULL default '0',
  `d5_sup` varchar(50) NOT NULL default '0',
  `d5_cen` varchar(50) NOT NULL default '0',
  `d5_der` varchar(50) NOT NULL default '0',
  `d5_inf` varchar(50) NOT NULL default '0',
  `d6_izq` varchar(50) NOT NULL default '0',
  `d6_sup` varchar(50) NOT NULL default '0',
  `d6_cen` varchar(50) NOT NULL default '0',
  `d6_der` varchar(50) NOT NULL default '0',
  `d6_inf` varchar(50) NOT NULL default '0',
  `d7_izq` varchar(50) NOT NULL default '0',
  `d7_sup` varchar(50) NOT NULL default '0',
  `d7_cen` varchar(50) NOT NULL default '0',
  `d7_der` varchar(50) NOT NULL default '0',
  `d7_inf` varchar(50) NOT NULL default '0',
  `d8_izq` varchar(50) NOT NULL default '0',
  `d8_sup` varchar(50) NOT NULL default '0',
  `d8_cen` varchar(50) NOT NULL default '0',
  `d8_der` varchar(50) NOT NULL default '0',
  `d8_inf` varchar(50) NOT NULL default '0',
  `d9_izq` varchar(50) NOT NULL default '0',
  `d9_sup` varchar(50) NOT NULL default '0',
  `d9_cen` varchar(50) NOT NULL default '0',
  `d9_der` varchar(50) NOT NULL default '0',
  `d9_inf` varchar(50) NOT NULL default '0',
  `d10_izq` varchar(50) NOT NULL default '0',
  `d10_sup` varchar(50) NOT NULL default '0',
  `d10_cen` varchar(50) NOT NULL default '0',
  `d10_der` varchar(50) NOT NULL default '0',
  `d10_inf` varchar(50) NOT NULL default '0',
  `d11_izq` varchar(50) NOT NULL default '0',
  `d11_sup` varchar(50) NOT NULL default '0',
  `d11_cen` varchar(50) NOT NULL default '0',
  `d11_der` varchar(50) NOT NULL default '0',
  `d11_inf` varchar(50) NOT NULL default '0',
  `d12_izq` varchar(50) NOT NULL default '0',
  `d12_sup` varchar(50) NOT NULL default '0',
  `d12_cen` varchar(50) NOT NULL default '0',
  `d12_der` varchar(50) NOT NULL default '0',
  `d12_inf` varchar(50) NOT NULL default '0',
  `d13_izq` varchar(50) NOT NULL default '0',
  `d13_sup` varchar(50) NOT NULL default '0',
  `d13_cen` varchar(50) NOT NULL default '0',
  `d13_der` varchar(50) NOT NULL default '0',
  `d13_inf` varchar(50) NOT NULL default '0',
  `d14_izq` varchar(50) NOT NULL default '0',
  `d14_sup` varchar(50) NOT NULL default '0',
  `d14_cen` varchar(50) NOT NULL default '0',
  `d14_der` varchar(50) NOT NULL default '0',
  `d14_inf` varchar(50) NOT NULL default '0',
  `d15_izq` varchar(50) NOT NULL default '0',
  `d15_sup` varchar(50) NOT NULL default '0',
  `d15_cen` varchar(50) NOT NULL default '0',
  `d15_der` varchar(50) NOT NULL default '0',
  `d15_inf` varchar(50) NOT NULL default '0',
  `d16_izq` varchar(50) NOT NULL default '0',
  `d16_sup` varchar(50) NOT NULL default '0',
  `d16_cen` varchar(50) NOT NULL default '0',
  `d16_der` varchar(50) NOT NULL default '0',
  `d16_inf` varchar(50) NOT NULL default '0',
  PRIMARY KEY  (`id_odo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for odontomaxinf
#
# Dumping Table Structure for odontomaxinfactuales

#
CREATE TABLE `odontomaxinfactuales` (
  `id_odo` int(4) NOT NULL,
  `id_pac` int(4) NOT NULL,
  `d1_izq` varchar(50) NOT NULL default '0',
  `d1_sup` varchar(50) NOT NULL default '0',
  `d1_cen` varchar(50) NOT NULL default '0',
  `d1_der` varchar(50) NOT NULL default '0',
  `d1_inf` varchar(50) NOT NULL default '0',
  `d2_izq` varchar(50) NOT NULL default '0',
  `d2_sup` varchar(50) NOT NULL default '0',
  `d2_cen` varchar(50) NOT NULL default '0',
  `d2_der` varchar(50) NOT NULL default '0',
  `d2_inf` varchar(50) NOT NULL default '0',
  `d3_izq` varchar(50) NOT NULL default '0',
  `d3_sup` varchar(50) NOT NULL default '0',
  `d3_cen` varchar(50) NOT NULL default '0',
  `d3_der` varchar(50) NOT NULL default '0',
  `d3_inf` varchar(50) NOT NULL default '0',
  `d4_izq` varchar(50) NOT NULL default '0',
  `d4_sup` varchar(50) NOT NULL default '0',
  `d4_cen` varchar(50) NOT NULL default '0',
  `d4_der` varchar(50) NOT NULL default '0',
  `d4_inf` varchar(50) NOT NULL default '0',
  `d5_izq` varchar(50) NOT NULL default '0',
  `d5_sup` varchar(50) NOT NULL default '0',
  `d5_cen` varchar(50) NOT NULL default '0',
  `d5_der` varchar(50) NOT NULL default '0',
  `d5_inf` varchar(50) NOT NULL default '0',
  `d6_izq` varchar(50) NOT NULL default '0',
  `d6_sup` varchar(50) NOT NULL default '0',
  `d6_cen` varchar(50) NOT NULL default '0',
  `d6_der` varchar(50) NOT NULL default '0',
  `d6_inf` varchar(50) NOT NULL default '0',
  `d7_izq` varchar(50) NOT NULL default '0',
  `d7_sup` varchar(50) NOT NULL default '0',
  `d7_cen` varchar(50) NOT NULL default '0',
  `d7_der` varchar(50) NOT NULL default '0',
  `d7_inf` varchar(50) NOT NULL default '0',
  `d8_izq` varchar(50) NOT NULL default '0',
  `d8_sup` varchar(50) NOT NULL default '0',
  `d8_cen` varchar(50) NOT NULL default '0',
  `d8_der` varchar(50) NOT NULL default '0',
  `d8_inf` varchar(50) NOT NULL default '0',
  `d9_izq` varchar(50) NOT NULL default '0',
  `d9_sup` varchar(50) NOT NULL default '0',
  `d9_cen` varchar(50) NOT NULL default '0',
  `d9_der` varchar(50) NOT NULL default '0',
  `d9_inf` varchar(50) NOT NULL default '0',
  `d10_izq` varchar(50) NOT NULL default '0',
  `d10_sup` varchar(50) NOT NULL default '0',
  `d10_cen` varchar(50) NOT NULL default '0',
  `d10_der` varchar(50) NOT NULL default '0',
  `d10_inf` varchar(50) NOT NULL default '0',
  `d11_izq` varchar(50) NOT NULL default '0',
  `d11_sup` varchar(50) NOT NULL default '0',
  `d11_cen` varchar(50) NOT NULL default '0',
  `d11_der` varchar(50) NOT NULL default '0',
  `d11_inf` varchar(50) NOT NULL default '0',
  `d12_izq` varchar(50) NOT NULL default '0',
  `d12_sup` varchar(50) NOT NULL default '0',
  `d12_cen` varchar(50) NOT NULL default '0',
  `d12_der` varchar(50) NOT NULL default '0',
  `d12_inf` varchar(50) NOT NULL default '0',
  `d13_izq` varchar(50) NOT NULL default '0',
  `d13_sup` varchar(50) NOT NULL default '0',
  `d13_cen` varchar(50) NOT NULL default '0',
  `d13_der` varchar(50) NOT NULL default '0',
  `d13_inf` varchar(50) NOT NULL default '0',
  `d14_izq` varchar(50) NOT NULL default '0',
  `d14_sup` varchar(50) NOT NULL default '0',
  `d14_cen` varchar(50) NOT NULL default '0',
  `d14_der` varchar(50) NOT NULL default '0',
  `d14_inf` varchar(50) NOT NULL default '0',
  `d15_izq` varchar(50) NOT NULL default '0',
  `d15_sup` varchar(50) NOT NULL default '0',
  `d15_cen` varchar(50) NOT NULL default '0',
  `d15_der` varchar(50) NOT NULL default '0',
  `d15_inf` varchar(50) NOT NULL default '0',
  `d16_izq` varchar(50) NOT NULL default '0',
  `d16_sup` varchar(50) NOT NULL default '0',
  `d16_cen` varchar(50) NOT NULL default '0',
  `d16_der` varchar(50) NOT NULL default '0',
  `d16_inf` varchar(50) NOT NULL default '0',
  PRIMARY KEY  (`id_odo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for odontomaxinfactuales
#
# Dumping Table Structure for pacientes

#
CREATE TABLE `pacientes` (
  `id_pac` int(4) NOT NULL auto_increment,
  `id_per` int(4) NOT NULL,
  PRIMARY KEY  (`id_pac`),
  KEY `FK_pacientes_personas` (`id_per`),
  CONSTRAINT `FK_pacientes_personas` FOREIGN KEY (`id_per`) REFERENCES `personas` (`id_per`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
#
# Dumping Data for pacientes
#
# Dumping Table Structure for personas

#
CREATE TABLE `personas` (
  `id_per` int(4) NOT NULL auto_increment,
  `ced_per` varchar(15) NOT NULL,
  `nom_per` varchar(50) NOT NULL,
  `ape_per` varchar(50) NOT NULL,
  `fec_nac` varchar(50) character set latin1 collate latin1_bin NOT NULL,
  `edad_per` int(4) NOT NULL,
  `tel_per` varchar(20) NOT NULL,
  `dir_per` varchar(200) NOT NULL,
  `sex_per` int(4) NOT NULL,
  `est_civ` int(4) NOT NULL,
  `mail_per` varchar(50) default NULL,
  `rep_per` varchar(50) default NULL,
  `fec_ing` varchar(50) NOT NULL,
  `rut_ima` varchar(200) default NULL,
  `imagen` longblob,
  PRIMARY KEY  (`id_per`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
#
# Dumping Data for personas
#
# Dumping Table Structure for productos

#
CREATE TABLE `productos` (
  `id_prod` int(4) NOT NULL auto_increment,
  `cod_prod` varchar(50) NOT NULL,
  `nom_prod` varchar(100) NOT NULL,
  `pre_pro_prod` decimal(13,2) NOT NULL,
  `pre_cli_prod` decimal(13,2) default NULL,
  `stok_prod` int(4) NOT NULL,
  PRIMARY KEY  (`id_prod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for productos
#
# Dumping Table Structure for tratamientos

#
CREATE TABLE `tratamientos` (
  `id_tra` int(4) NOT NULL auto_increment,
  `nom_tra` varchar(100) NOT NULL,
  `pre` decimal(13,2) NOT NULL,
  PRIMARY KEY  (`id_tra`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for tratamientos
#
# Dumping Table Structure for usuarios

#
CREATE TABLE `usuarios` (
  `id_usu` int(4) NOT NULL auto_increment,
  `nom_usu` varchar(50) default NULL,
  `psw_usu` varchar(50) NOT NULL,
  `id_per` int(4) NOT NULL,
  `pri_usu` varchar(50) NOT NULL,
  PRIMARY KEY  (`id_usu`),
  KEY `FK_usuarios_personas` (`id_per`),
  CONSTRAINT `FK_usuarios_personas` FOREIGN KEY (`id_per`) REFERENCES `personas` (`id_per`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
#
# Dumping Data for usuarios
#
# Dumping Table Structure for vistacita

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistacita` AS select `citas`.`id_cit` AS `id_cit`,`citas`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`citas`.`fec_cit` AS `fec_cit`,`citas`.`mot_cit` AS `mot_cit`,`citas`.`cau_cit` AS `cau_cit`,`detallecitas`.`id_det` AS `id_det`,`detallecitas`.`tra_det` AS `tra_det`,`detallecitas`.`pie_det` AS `pie_det`,`detallecitas`.`car_det` AS `car_det`,`detallecitas`.`obs_det` AS `obs_det` from (((`citas` join `pacientes`) join `personas`) join `detallecitas`) where (`pacientes`.`id_per` = `personas`.`id_per`);
#
# Dumping Data for vistacita
#
# Dumping Table Structure for vistacitas

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistacitas` AS select `citas`.`id_cit` AS `id_cit`,`citas`.`fec_cit` AS `fec_cit`,`citas`.`mot_cit` AS `mot_cit`,`citas`.`cau_cit` AS `cau_cit`,`citas`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`fec_nac` AS `fec_nac` from ((`citas` join `pacientes`) join `personas`) where (`pacientes`.`id_per` = `personas`.`id_per`);
#
# Dumping Data for vistacitas
#
# Dumping Table Structure for vistadetdiagnostico

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistadetdiagnostico` AS select `diagnosticos`.`id_dia` AS `id_dia`,`diagnosticos`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`edad_per` AS `edad_per`,`diagnosticos`.`sup_num` AS `sup_num`,`diagnosticos`.`abr_exad` AS `abr_exad`,`diagnosticos`.`man_exad` AS `man_exad`,`diagnosticos`.`pat_pul` AS `pat_pul`,`diagnosticos`.`pla_bla` AS `pla_bla`,`diagnosticos`.`pla_cal` AS `pla_cal`,`diagnosticos`.`flu_den` AS `flu_den`,`diagnosticos`.`otr_exad` AS `otr_exad`,`diagnosticos`.`obs_exad` AS `obs_exad`,`diagnosticos`.`cau_ext` AS `cau_ext`,`diagnosticos`.`fin_con` AS `fin_con`,`diagnosticos`.`dia` AS `dia`,`diagnosticos`.`pro` AS `pro`,`diagnosticos`.`ope_tra` AS `ope_tra`,`diagnosticos`.`end_tra` AS `end_tra`,`diagnosticos`.`per_tra` AS `per_tra`,`diagnosticos`.`pro_tra` AS `pro_tra`,`diagnosticos`.`cir_tra` AS `cir_tra`,`diagnosticos`.`ort_tra` AS `ort_tra`,`diagnosticos`.`exo_tra` AS `exo_tra`,`diagnosticos`.`med_ora` AS `med_ora`,`diagnosticos`.`otra_tra` AS `otra_tra`,`diagnosticos`.`pul_tra` AS `pul_tra`,`diagnosticos`.`pulpe_tra` AS `pulpe_tra`,`diagnosticos`.`exosim_tra` AS `exosim_tra`,`detallediagnostico`.`id_dx` AS `id_dx`,`dx`.`dx` AS `dx` from ((((`diagnosticos` join `pacientes`) join `personas`) join `detallediagnostico`) join `dx`) where ((`detallediagnostico`.`id_dia` = `diagnosticos`.`id_dia`) and (`diagnosticos`.`id_pac` = `pacientes`.`id_pac`) and (`pacientes`.`id_per` = `personas`.`id_per`) and (`detallediagnostico`.`id_dx` = `dx`.`id_dx`));
#
# Dumping Data for vistadetdiagnostico
#
# Dumping Table Structure for vistahc

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistahc` AS select `pacientes`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`fec_nac` AS `fec_nac`,`personas`.`edad_per` AS `edad_per`,`personas`.`tel_per` AS `tel_per`,`personas`.`dir_per` AS `dir_per`,`personas`.`sex_per` AS `sex_per`,`personas`.`est_civ` AS `est_civ`,`personas`.`mail_per` AS `mail_per`,`personas`.`rep_per` AS `rep_per`,`personas`.`fec_ing` AS `fec_ing`,`anamnesis`.`id_ana` AS `id_ana`,`anamnesis`.`tra_med` AS `tra_med`,`anamnesis`.`obs_tra` AS `obs_tra`,`anamnesis`.`ing_med` AS `ing_med`,`anamnesis`.`obs_ing` AS `obs_ing`,`anamnesis`.`rea_ale` AS `rea_ale`,`anamnesis`.`obs_rea` AS `obs_rea`,`anamnesis`.`hemo` AS `hemo`,`anamnesis`.`obs_hem` AS `obs_hem`,`anamnesis`.`irrad` AS `irrad`,`anamnesis`.`obs_irr` AS `obs_irr`,`anamnesis`.`sinu` AS `sinu`,`anamnesis`.`obs_sin` AS `obs_sin`,`anamnesis`.`enf_res` AS `enf_res`,`anamnesis`.`obs_enf` AS `obs_enf`,`anamnesis`.`card` AS `card`,`anamnesis`.`obs_car` AS `obs_car`,`anamnesis`.`diab` AS `diab`,`anamnesis`.`obs_dia` AS `obs_dia`,`anamnesis`.`fie_reu` AS `fie_reu`,`anamnesis`.`obs_fie` AS `obs_fie`,`anamnesis`.`hepa` AS `hepa`,`anamnesis`.`obs_hep` AS `obs_hep`,`anamnesis`.`hiper` AS `hiper`,`anamnesis`.`obs_hip` AS `obs_hip`,`anamnesis`.`otras` AS `otras`,`anamnesis`.`cepillado` AS `cepillado`,`anamnesis`.`obs_cep` AS `obs_cep`,`anamnesis`.`seda` AS `seda`,`anamnesis`.`obs_sed` AS `obs_sed`,`exaestomatologicos`.`id_exa` AS `id_exa`,`exaestomatologicos`.`tem_exa` AS `tem_exa`,`exaestomatologicos`.`pul_exa` AS `pul_exa`,`exaestomatologicos`.`ten_exa` AS `ten_exa`,`exaestomatologicos`.`res_exa` AS `res_exa`,`exaestomatologicos`.`art_exa` AS `art_exa`,`exaestomatologicos`.`lab_exa` AS `lab_exa`,`exaestomatologicos`.`len_exa` AS `len_exa`,`exaestomatologicos`.`pal_exa` AS `pal_exa`,`exaestomatologicos`.`pis_exa` AS `pis_exa`,`exaestomatologicos`.`car_exa` AS `car_exa`,`exaestomatologicos`.`gla_exa` AS `gla_exa`,`exaestomatologicos`.`max_exa` AS `max_exa`,`exaestomatologicos`.`sen_exa` AS `sen_exa`,`exaestomatologicos`.`mus_exa` AS `mus_exa`,`exaestomatologicos`.`sis_ner` AS `sis_ner`,`exaestomatologicos`.`sis_vas` AS `sis_vas`,`exaestomatologicos`.`lin_exa` AS `lin_exa`,`exaestomatologicos`.`fun_exa` AS `fun_exa`,`exaestomatologicos`.`obs_exa` AS `obs_exa`,`diagnosticos`.`id_dia` AS `id_dia`,`diagnosticos`.`sup_num` AS `sup_num`,`diagnosticos`.`abr_exad` AS `abr_exad`,`diagnosticos`.`man_exad` AS `man_exad`,`diagnosticos`.`pat_pul` AS `pat_pul`,`diagnosticos`.`pla_bla` AS `pla_bla`,`diagnosticos`.`pla_cal` AS `pla_cal`,`diagnosticos`.`flu_den` AS `flu_den`,`diagnosticos`.`otr_exad` AS `otr_exad`,`diagnosticos`.`obs_exad` AS `obs_exad`,`diagnosticos`.`cau_ext` AS `cau_ext`,`diagnosticos`.`fin_con` AS `fin_con`,`diagnosticos`.`dia` AS `dia`,`diagnosticos`.`pro` AS `pro`,`diagnosticos`.`ope_tra` AS `ope_tra`,`diagnosticos`.`end_tra` AS `end_tra`,`diagnosticos`.`per_tra` AS `per_tra`,`diagnosticos`.`pro_tra` AS `pro_tra`,`diagnosticos`.`cir_tra` AS `cir_tra`,`diagnosticos`.`ort_tra` AS `ort_tra`,`diagnosticos`.`exo_tra` AS `exo_tra`,`diagnosticos`.`med_ora` AS `med_ora`,`diagnosticos`.`otra_tra` AS `otra_tra`,`diagnosticos`.`pul_tra` AS `pul_tra`,`diagnosticos`.`pulpe_tra` AS `pulpe_tra`,`diagnosticos`.`exosim_tra` AS `exosim_tra`,`detallediagnostico`.`id_det_dia` AS `id_det_dia`,`detallediagnostico`.`id_dx` AS `id_dx`,`dx`.`dx` AS `dx` from ((((((`pacientes` join `personas`) join `anamnesis`) join `exaestomatologicos`) join `diagnosticos`) join `detallediagnostico`) join `dx`) where ((`pacientes`.`id_per` = `personas`.`id_per`) and (`anamnesis`.`id_pac` = `pacientes`.`id_pac`) and (`exaestomatologicos`.`id_pac` = `pacientes`.`id_pac`) and (`diagnosticos`.`id_pac` = `pacientes`.`id_pac`) and (`detallediagnostico`.`id_dia` = `diagnosticos`.`id_dia`) and (`detallediagnostico`.`id_dx` = `dx`.`id_dx`));
#
# Dumping Data for vistahc
#
# Dumping Table Structure for vistahistoriaclin

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistahistoriaclin` AS select `pacientes`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`fec_nac` AS `fec_nac`,`personas`.`edad_per` AS `edad_per`,`personas`.`tel_per` AS `tel_per`,`personas`.`dir_per` AS `dir_per`,`personas`.`sex_per` AS `sex_per`,`personas`.`est_civ` AS `est_civ`,`personas`.`mail_per` AS `mail_per`,`personas`.`rep_per` AS `rep_per`,`personas`.`fec_ing` AS `fec_ing`,`anamnesis`.`tra_med` AS `tra_med`,`anamnesis`.`obs_tra` AS `obs_tra`,`anamnesis`.`ing_med` AS `ing_med`,`anamnesis`.`obs_ing` AS `obs_ing`,`anamnesis`.`rea_ale` AS `rea_ale`,`anamnesis`.`obs_rea` AS `obs_rea`,`anamnesis`.`hemo` AS `hemo`,`anamnesis`.`obs_hem` AS `obs_hem`,`anamnesis`.`irrad` AS `irrad`,`anamnesis`.`obs_irr` AS `obs_irr`,`anamnesis`.`sinu` AS `sinu`,`anamnesis`.`obs_sin` AS `obs_sin`,`anamnesis`.`enf_res` AS `enf_res`,`anamnesis`.`obs_enf` AS `obs_enf`,`anamnesis`.`card` AS `card`,`anamnesis`.`obs_car` AS `obs_car`,`anamnesis`.`diab` AS `diab`,`anamnesis`.`obs_dia` AS `obs_dia`,`anamnesis`.`fie_reu` AS `fie_reu`,`anamnesis`.`obs_fie` AS `obs_fie`,`anamnesis`.`hepa` AS `hepa`,`anamnesis`.`obs_hep` AS `obs_hep`,`anamnesis`.`hiper` AS `hiper`,`anamnesis`.`obs_hip` AS `obs_hip`,`anamnesis`.`otras` AS `otras`,`anamnesis`.`cepillado` AS `cepillado`,`anamnesis`.`obs_cep` AS `obs_cep`,`anamnesis`.`seda` AS `seda`,`anamnesis`.`obs_sed` AS `obs_sed`,`exaestomatologicos`.`tem_exa` AS `tem_exa`,`exaestomatologicos`.`pul_exa` AS `pul_exa`,`exaestomatologicos`.`ten_exa` AS `ten_exa`,`exaestomatologicos`.`res_exa` AS `res_exa`,`exaestomatologicos`.`art_exa` AS `art_exa`,`exaestomatologicos`.`lab_exa` AS `lab_exa`,`exaestomatologicos`.`len_exa` AS `len_exa`,`exaestomatologicos`.`pal_exa` AS `pal_exa`,`exaestomatologicos`.`pis_exa` AS `pis_exa`,`exaestomatologicos`.`car_exa` AS `car_exa`,`exaestomatologicos`.`gla_exa` AS `gla_exa`,`exaestomatologicos`.`max_exa` AS `max_exa`,`exaestomatologicos`.`sen_exa` AS `sen_exa`,`exaestomatologicos`.`mus_exa` AS `mus_exa`,`exaestomatologicos`.`sis_ner` AS `sis_ner`,`exaestomatologicos`.`sis_vas` AS `sis_vas`,`exaestomatologicos`.`obs_exa` AS `obs_exa` from (((`pacientes` join `personas`) join `anamnesis`) join `exaestomatologicos`) where ((`pacientes`.`id_per` = `personas`.`id_per`) and (`anamnesis`.`id_pac` = `pacientes`.`id_pac`) and (`exaestomatologicos`.`id_pac` = `pacientes`.`id_pac`));
#
# Dumping Data for vistahistoriaclin
#
# Dumping Table Structure for vistahistoriaclinica

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistahistoriaclinica` AS select `pacientes`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`fec_nac` AS `fec_nac`,`personas`.`edad_per` AS `edad_per`,`personas`.`tel_per` AS `tel_per`,`personas`.`dir_per` AS `dir_per`,`personas`.`sex_per` AS `sex_per`,`personas`.`est_civ` AS `est_civ`,`personas`.`mail_per` AS `mail_per`,`personas`.`rep_per` AS `rep_per`,`personas`.`fec_ing` AS `fec_ing`,`anamnesis`.`tra_med` AS `tra_med`,`anamnesis`.`obs_tra` AS `obs_tra`,`anamnesis`.`ing_med` AS `ing_med`,`anamnesis`.`obs_ing` AS `obs_ing`,`anamnesis`.`rea_ale` AS `rea_ale`,`anamnesis`.`obs_rea` AS `obs_rea`,`anamnesis`.`hemo` AS `hemo`,`anamnesis`.`obs_hem` AS `obs_hem`,`anamnesis`.`irrad` AS `irrad`,`anamnesis`.`obs_irr` AS `obs_irr`,`anamnesis`.`sinu` AS `sinu`,`anamnesis`.`obs_sin` AS `obs_sin`,`anamnesis`.`enf_res` AS `enf_res`,`anamnesis`.`obs_enf` AS `obs_enf`,`anamnesis`.`card` AS `card`,`anamnesis`.`obs_car` AS `obs_car`,`anamnesis`.`diab` AS `diab`,`anamnesis`.`obs_dia` AS `obs_dia`,`anamnesis`.`fie_reu` AS `fie_reu`,`anamnesis`.`obs_fie` AS `obs_fie`,`anamnesis`.`hepa` AS `hepa`,`anamnesis`.`obs_hep` AS `obs_hep`,`anamnesis`.`hiper` AS `hiper`,`anamnesis`.`obs_hip` AS `obs_hip`,`anamnesis`.`otras` AS `otras`,`anamnesis`.`cepillado` AS `cepillado`,`anamnesis`.`obs_cep` AS `obs_cep`,`anamnesis`.`seda` AS `seda`,`anamnesis`.`obs_sed` AS `obs_sed`,`exaestomatologicos`.`tem_exa` AS `tem_exa`,`exaestomatologicos`.`pul_exa` AS `pul_exa`,`exaestomatologicos`.`ten_exa` AS `ten_exa`,`exaestomatologicos`.`res_exa` AS `res_exa`,`exaestomatologicos`.`art_exa` AS `art_exa`,`exaestomatologicos`.`lab_exa` AS `lab_exa`,`exaestomatologicos`.`len_exa` AS `len_exa`,`exaestomatologicos`.`pal_exa` AS `pal_exa`,`exaestomatologicos`.`pis_exa` AS `pis_exa`,`exaestomatologicos`.`car_exa` AS `car_exa`,`exaestomatologicos`.`gla_exa` AS `gla_exa`,`exaestomatologicos`.`max_exa` AS `max_exa`,`exaestomatologicos`.`sen_exa` AS `sen_exa`,`exaestomatologicos`.`mus_exa` AS `mus_exa`,`exaestomatologicos`.`sis_ner` AS `sis_ner`,`exaestomatologicos`.`sis_vas` AS `sis_vas`,`exaestomatologicos`.`obs_exa` AS `obs_exa`,`diagnosticos`.`sup_num` AS `sup_num`,`diagnosticos`.`abr_exad` AS `abr_exad`,`diagnosticos`.`man_exad` AS `man_exad`,`diagnosticos`.`pat_pul` AS `pat_pul`,`diagnosticos`.`pla_bla` AS `pla_bla`,`diagnosticos`.`pla_cal` AS `pla_cal`,`diagnosticos`.`flu_den` AS `flu_den`,`diagnosticos`.`otr_exad` AS `otr_exad`,`diagnosticos`.`obs_exad` AS `obs_exad`,`diagnosticos`.`cau_ext` AS `cau_ext`,`diagnosticos`.`fin_con` AS `fin_con`,`diagnosticos`.`dia` AS `dia`,`diagnosticos`.`pro` AS `pro`,`diagnosticos`.`ope_tra` AS `ope_tra`,`diagnosticos`.`end_tra` AS `end_tra`,`diagnosticos`.`per_tra` AS `per_tra`,`diagnosticos`.`pro_tra` AS `pro_tra`,`diagnosticos`.`cir_tra` AS `cir_tra`,`diagnosticos`.`ort_tra` AS `ort_tra`,`diagnosticos`.`exo_tra` AS `exo_tra`,`diagnosticos`.`med_ora` AS `med_ora`,`diagnosticos`.`otra_tra` AS `otra_tra` from ((((`pacientes` join `personas`) join `anamnesis`) join `exaestomatologicos`) join `diagnosticos`) where ((`pacientes`.`id_per` = `personas`.`id_per`) and (`anamnesis`.`id_pac` = `pacientes`.`id_pac`) and (`exaestomatologicos`.`id_pac` = `pacientes`.`id_pac`) and (`diagnosticos`.`id_pac` = `pacientes`.`id_pac`));
#
# Dumping Data for vistahistoriaclinica
#
# Dumping Table Structure for vistapacientes

#
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistapacientes` AS select `pacientes`.`id_pac` AS `id_pac`,`pacientes`.`id_per` AS `id_per`,`personas`.`ced_per` AS `ced_per`,`personas`.`nom_per` AS `nom_per`,`personas`.`ape_per` AS `ape_per`,`personas`.`fec_nac` AS `fec_nac`,`personas`.`edad_per` AS `edad_per`,`personas`.`tel_per` AS `tel_per`,`personas`.`dir_per` AS `dir_per`,`personas`.`sex_per` AS `sex_per`,`personas`.`est_civ` AS `est_civ`,`personas`.`mail_per` AS `mail_per`,`personas`.`rep_per` AS `rep_per`,`personas`.`fec_ing` AS `fec_ing`,`personas`.`rut_ima` AS `rut_ima`,`personas`.`imagen` AS `imagen` from (`pacientes` join `personas`) where (`pacientes`.`id_per` = `personas`.`id_per`);
#
# Dumping Data for vistapacientes
#
SET FOREIGN_KEY_CHECKS=1


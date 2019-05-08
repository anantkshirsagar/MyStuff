create database storeobjectdb;

use storeobjectdb;

CREATE TABLE `employee` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `empobj` longblob,
  PRIMARY KEY (`id`)
);

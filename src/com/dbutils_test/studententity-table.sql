create database storeobjectdb;
use storeobjectdb;

CREATE TABLE `studententity` (
  `id` int(10) unsigned NOT NULL,
  `name` varchar(100),
  `percentage` float,
  PRIMARY KEY (`id`)
);

CREATE DATABASE imsI;
 USE imsI;
 
 CREATE TABLE IF NOT EXISTS `cart` (
  `cartid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `Bar_code` varchar(50) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `Unit_Price` varchar(20) NOT NULL,
  `Total_Price` varchar(20) NOT NULL,
  PRIMARY KEY (`cartid`)
) ;

CREATE TABLE IF NOT EXISTS `customer` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  PRIMARY KEY (`cid`)
) ;

CREATE TABLE IF NOT EXISTS `employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  PRIMARY KEY (`eid`)
);


CREATE TABLE IF NOT EXISTS `extra` (
  `exid` int(11) NOT NULL AUTO_INCREMENT,
  `val` varchar(10) NOT NULL,
  PRIMARY KEY (`exid`)
);

CREATE TABLE IF NOT EXISTS `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(50) NOT NULL,
  `Bar_code` varchar(20) NOT NULL,
  `Price` varchar(10) NOT NULL,
  `Qty` varchar(10) NOT NULL,
  `Sid` int(11) NOT NULL,
  PRIMARY KEY (`pid`)
);


CREATE TABLE IF NOT EXISTS `sales` (
  `saleid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `Cid` int(11) NOT NULL,
  `Customer_Name` varchar(50) NOT NULL,
  `Total_Qty` varchar(10) NOT NULL,
  `Total_Bill` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Balance` varchar(10) NOT NULL,
  PRIMARY KEY (`saleid`)
)  ;


CREATE TABLE IF NOT EXISTS `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_Name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  PRIMARY KEY (`sid`)
)  ;


/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  shahd
 * Created: Dec 23, 2023
 */
CREATE TABLE mobile (`ID` INT NOT NULL, `Brand` VARCHAR(255), `Model` VARCHAR(255), `storageCapacityGB` INT, `operatongSystem` VARCHAR(255), `ScreenSize` DOUBLE, `batteryCapacity` INT, PRIMARY KEY (`ID`));
INSERT INTO electonicstore.mobile (`ID`, `Brand`, `Model`, `storageCapacityGB`, `operatongSystem`, `ScreenSize`, `batteryCapacity`) 
	VALUES (1, 'Samsung', 'A32 samsung', 256, 'android', 6.5, NULL);
INSERT INTO electonicstore.mobile (`ID`, `Brand`, `Model`, `storageCapacityGB`, `operatongSystem`, `ScreenSize`, `batteryCapacity`) 
	VALUES (456, 'sony', 'xpeia1iii', 128, 'android', 5.0, NULL);
INSERT INTO electonicstore.mobile (`ID`, `Brand`, `Model`, `storageCapacityGB`, `operatongSystem`, `ScreenSize`, `batteryCapacity`) 
	VALUES (678, 'Apple', 'IPhone11 pro max', 256, 'apple', 6.5, 3969);



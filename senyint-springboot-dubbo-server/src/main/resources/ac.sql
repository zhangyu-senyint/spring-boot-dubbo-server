/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : senyint_pay

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-08-31 13:43:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` varchar(50) NOT NULL,
  `create_time` datetime NOT NULL,
  `edit_time` datetime DEFAULT NULL,
  `version` bigint(20) NOT NULL,
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `account_no` varchar(50) NOT NULL COMMENT '账号',
  `balance` decimal(20,6) NOT NULL,
  `unbalance` decimal(20,6) NOT NULL,
  `security_money` decimal(20,6) NOT NULL,
  `status` varchar(36) NOT NULL COMMENT '状态',
  `total_income` decimal(20,6) NOT NULL COMMENT '总收入',
  `total_expend` decimal(20,6) NOT NULL COMMENT '总支出',
  `today_income` decimal(20,6) NOT NULL,
  `today_expend` decimal(20,6) NOT NULL,
  `account_type` varchar(50) NOT NULL,
  `sett_amount` decimal(20,6) NOT NULL,
  `user_no` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资金账户表';

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1ac32c9134e24aeb827c63b41e71706e', '2017-08-07 13:43:39', '2017-08-07 13:43:39', '0', null, '99992017080710000001', '0.000000', '0.000000', '0.000000', 'ACTIVE', '0.000000', '0.000000', '0.000000', '0.000000', '01', '0.000000', '88882017080710001114');
INSERT INTO `account` VALUES ('84248854de3045cebfd5e99d9493c39c', '2017-08-15 15:43:41', '2017-08-15 15:43:41', '0', null, '99992017081510000002', '0.000000', '0.000000', '0.000000', 'ACTIVE', '0.000000', '0.000000', '0.000000', '0.000000', '02', '0.000000', '88882017081510001115');
INSERT INTO `account` VALUES ('930bdca655de498d845c561ab87bf506', '2017-08-16 10:39:32', '2017-08-16 10:39:32', '0', null, '99992017081610000004', '0.000000', '0.000000', '0.000000', 'ACTIVE', '0.000000', '0.000000', '0.000000', '0.000000', '03', '0.000000', '88882017081610001117');
INSERT INTO `account` VALUES ('b941ca3fe66b4522ac4231a107df128a', '2017-08-16 10:22:17', '2017-08-16 10:22:17', '0', null, '99992017081610000003', '0.000000', '0.000000', '0.000000', 'ACTIVE', '0.000000', '0.000000', '0.000000', '0.000000', '04', '0.000000', '88882017081610001116');

/*
MySQL Data Transfer
Source Host: 192.168.200.53
Source Database: springcloudproduct
Target Host: 192.168.200.53
Target Database: springcloudproduct
Date: 2018/4/24 18:03:14
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL,
  `available` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `resource_type` enum('menu','button') DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL,
  `available` bit(1) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
CREATE TABLE `sys_role_permission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  KEY `FKomxrs8a388bknvhjokh440waq` (`permission_id`),
  KEY `FK9q28ewrhntqeipl1t04kh1be7` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
CREATE TABLE `sys_user_role` (
  `role_id` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  KEY `FKgkmyslkrfeyn9ukmolvek8b8f` (`uid`),
  KEY `FKhh52n8vd4ny9ff4x9fb8v65qx` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_count
-- ----------------------------
CREATE TABLE `t_order_count` (
  `ID` varchar(50) NOT NULL,
  `c_product_pic_list_id` varchar(50) DEFAULT NULL,
  `c_product_pic_url` varchar(300) DEFAULT NULL,
  `产品购买次数` char(10) DEFAULT NULL,
  `预留1` char(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_count2
-- ----------------------------
CREATE TABLE `t_order_count2` (
  `ID` varchar(50) NOT NULL,
  `c_product_pic_list_id` varchar(50) DEFAULT NULL,
  `c_product_pic_url` varchar(300) DEFAULT NULL,
  `c_product_count` int(11) DEFAULT NULL,
  `预留1` varchar(50) DEFAULT NULL,
  `预留2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_Mes
-- ----------------------------
CREATE TABLE `t_order_Mes` (
  `ID` varchar(50) NOT NULL,
  `c_order_state` varchar(20) DEFAULT NULL,
  `c_order_user_id` varchar(50) DEFAULT NULL,
  `c_order_product_Id` varchar(50) DEFAULT NULL,
  `c_order_date` date DEFAULT NULL,
  `c_order_type` varchar(20) DEFAULT NULL,
  `c_order_price` varchar(20) DEFAULT NULL,
  `c_order_text1` varchar(50) DEFAULT NULL,
  `c_order_text2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_order_Mes2
-- ----------------------------
CREATE TABLE `t_order_Mes2` (
  `ID` varchar(50) NOT NULL,
  `c_order_state` varchar(20) DEFAULT NULL,
  `c_order_user_id` varchar(50) DEFAULT NULL,
  `c_order_money` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_pic_list
-- ----------------------------
CREATE TABLE `t_pic_list` (
  `ID` varchar(50) NOT NULL,
  `c_product_pic_list_id` varchar(50) DEFAULT NULL,
  `c_product_pic_url` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_product_mes
-- ----------------------------
CREATE TABLE `t_product_mes` (
  `ID` varchar(50) NOT NULL,
  `c_product_parent_id` varchar(50) DEFAULT NULL,
  `c_product_parent_name` varchar(300) DEFAULT NULL,
  `c_text1` varchar(50) DEFAULT NULL,
  `c_text2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_product_owner
-- ----------------------------
CREATE TABLE `t_product_owner` (
  `c_ower_Id` varchar(50) DEFAULT NULL,
  `c_ower_name` varchar(50) DEFAULT NULL,
  `c_ower_descri` varchar(500) DEFAULT NULL,
  `c_ower_sex` varchar(50) DEFAULT NULL,
  `c_ower_tel` char(10) DEFAULT NULL,
  `c_ower_address` char(10) DEFAULT NULL,
  `c_ower_mail` char(10) DEFAULT NULL,
  `c_text1` varchar(50) DEFAULT NULL,
  `c_text2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_product_rel
-- ----------------------------
CREATE TABLE `t_product_rel` (
  `ID` varchar(50) NOT NULL,
  `c_product_id` varchar(50) DEFAULT NULL,
  `c_product_name` varchar(50) DEFAULT NULL,
  `c_product_parent_id` varchar(50) DEFAULT NULL,
  `c_product_isfree` varchar(10) DEFAULT NULL,
  `c_product_ntroduction` varchar(50) DEFAULT NULL,
  `c_product_owner_id` varchar(50) DEFAULT NULL,
  `c_produc_type_id` varchar(50) DEFAULT NULL,
  `c_produc_creat_time` date DEFAULT NULL,
  `c_produc_creater` varchar(50) DEFAULT NULL,
  `c_product_top_pic_list_id` varchar(50) DEFAULT NULL,
  `c_product_middle_pic_list_id` varchar(50) DEFAULT NULL,
  `c_product_details_page` varchar(50) DEFAULT NULL,
  `c_product_num` varchar(50) DEFAULT NULL,
  `c_product_sale_price` varchar(50) DEFAULT NULL,
  `c_product_price` varchar(50) DEFAULT NULL,
  `c_text1` varchar(50) DEFAULT NULL,
  `c_text2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_product_type
-- ----------------------------
CREATE TABLE `t_product_type` (
  `ID` varchar(50) NOT NULL,
  `c_product_type_id` varchar(50) DEFAULT NULL,
  `c_product_type_name` varchar(50) DEFAULT NULL,
  `c_product_type_parent_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user_mes
-- ----------------------------
CREATE TABLE `t_user_mes` (
  `ID` varchar(50) NOT NULL,
  `c_user_ID` varchar(50) DEFAULT NULL,
  `c_user_name` varchar(300) DEFAULT NULL,
  `c_user_pwd` varchar(50) DEFAULT NULL,
  `c_user_nick_name` varchar(50) DEFAULT NULL,
  `c_user_phone` varchar(20) DEFAULT NULL,
  `c_user_mail` varchar(50) DEFAULT NULL,
  `c_user_type_id` varchar(10) DEFAULT NULL,
  `c_user_reg_time` date DEFAULT NULL,
  `c_user_age` int(11) DEFAULT NULL,
  `c_user_sex` varchar(10) DEFAULT NULL,
  `c_user_text1` varchar(50) DEFAULT NULL,
  `c_user_text2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
CREATE TABLE `user_info` (
  `uid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `state` tinyint(4) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `UK_f2ksd6h8hsjtd57ipfq9myr64` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `sys_permission` VALUES ('1', '', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList');
INSERT INTO `sys_permission` VALUES ('2', '', '用户添加', '1', '0/1', 'userInfo:add', 'button', 'userInfo/userAdd');
INSERT INTO `sys_permission` VALUES ('3', '', '用户删除', '1', '0/1', 'userInfo:del', 'button', 'userInfo/userDel');
INSERT INTO `sys_permission` VALUES ('4', '', '增加图片链接', null, '', 'productPic:add', '', 'addPicList');
INSERT INTO `sys_role` VALUES ('1', '', '管理员', 'admin');
INSERT INTO `sys_role` VALUES ('2', '', 'VIP会员', 'vip');
INSERT INTO `sys_role` VALUES ('3', '', 'test', 'test');
INSERT INTO `sys_role_permission` VALUES ('1', '1');
INSERT INTO `sys_role_permission` VALUES ('1', '2');
INSERT INTO `sys_role_permission` VALUES ('1', '3');
INSERT INTO `sys_role_permission` VALUES ('1', '4');
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `t_pic_list` VALUES ('1', '2', '3');
INSERT INTO `t_pic_list` VALUES ('32222', '2', '3');
INSERT INTO `t_pic_list` VALUES ('323222', '2', '3');
INSERT INTO `t_pic_list` VALUES ('3232の322', '2', '3');
INSERT INTO `t_pic_list` VALUES ('5', '2', '3');
INSERT INTO `t_pic_list` VALUES ('6', '2', '3');
INSERT INTO `t_product_mes` VALUES ('1', '1', 'name', 'i am a 1', 'i am a 2');
INSERT INTO `t_product_mes` VALUES ('2', '1', 'name', 'i am a 1', 'i am a 2');
INSERT INTO `user_info` VALUES ('1', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0', 'admin');

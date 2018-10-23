-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE personalwebdb;
-- 使用数据库
use personalwebdb;

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `moodlog`
-- ----------------------------
DROP TABLE IF EXISTS `moodlog`;
CREATE TABLE `moodlog` (
  `id` int(11) unsigned zerofill NOT NULL auto_increment,
  `userId` int(8) NOT NULL,
  `moodText` longtext NOT NULL,
  `publishTime` datetime NOT NULL,
  `isDelete` int(2) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of moodlog
-- ----------------------------
INSERT INTO `MoodLog` VALUES ('00000000002', '123', '李梦然18767137693401103554@qq.com', '2018-10-23 20:10:24', '0');
INSERT INTO `MoodLog` VALUES ('00000000003', '123', '李梦然18767137693401103554@qq.com', '2018-10-23 20:10:38', '0');
INSERT INTO `MoodLog` VALUES ('00000000004', '123', 'Navicat for MySQL Enterprise Edition 8注册码(已验证)：\nNAVJ-W56S-3YUU-MVHV\nNAVE-WAGB-ZLF4-T23K\n', '2018-10-23 20:12:47', '0');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(8) NOT NULL,
  `name` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------

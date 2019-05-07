DROP TABLE IF EXISTS `tb_sys_user`;
DROP TABLE IF EXISTS `tb_sys_dept`;
DROP TABLE IF EXISTS `tb_sys_role`;
DROP TABLE IF EXISTS `tb_sys_func`;
DROP TABLE IF EXISTS `tb_sys_func_role`;
DROP TABLE IF EXISTS `tb_sys_user_role`;

CREATE TABLE `tb_sys_user` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `NAME` TINYTEXT NOT NULL COMMENT 'Name',
  `USERNAME` TINYTEXT NOT NULL COMMENT 'User Name',
  `EMAIL` TINYTEXT NOT NULL COMMENT 'E-MAIL',
  `PHONE` TINYTEXT COMMENT 'Register Phone NO',
  `PASSWORD` TINYTEXT NOT NULL COMMENT 'PASSWORD',
  `ROLE_ID` BIGINT(10) NOT NULL COMMENT 'Role ID',
  `DEPT_ID` BIGINT(10) COMMENT 'Role ID',
  `STATUS` INT NOT NULL DEFAULT 0 COMMENT 'User Status, 0:new , 1:active, 2:locked, 3:disabled',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_sys_dept` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `NAME` TINYTEXT NOT NULL COMMENT 'Department Name',
  `UNIT_ID` BIGINT(10) NOT NULL COMMENT 'Unit ID',
  `STATUS` INT NOT NULL DEFAULT 0 COMMENT 'Department Status, 0:disable , 1:enable',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_sys_role` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `NAME` TINYTEXT NOT NULL COMMENT 'Role Name',
  `STATUS` INT NOT NULL DEFAULT 0 COMMENT 'Role Status, 0:disable , 1:enable',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_sys_func` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `CODE` TINYTEXT NOT NULL COMMENT 'Function Code',
  `NAME` TINYTEXT NOT NULL COMMENT 'Role Name',
  `STATUS` INT NOT NULL DEFAULT 0 COMMENT 'Function Status, 0:disable , 1:enable',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_sys_func_role` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `FUNC_ID` BIGINT(10) NOT NULL COMMENT 'Function Id ref tb_sys_func.ID',
  `ROLE_ID` BIGINT(10) NOT NULL COMMENT 'Role Id ref tb_sys_role.ID',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_sys_user_role` (
  `ID` BIGINT(10) NOT NULL AUTO_INCREMENT,
  `USER_ID` BIGINT(10) NOT NULL COMMENT 'User Id ref tb_sys_user.ID',
  `ROLE_ID` BIGINT(10) NOT NULL COMMENT 'Role Id ref tb_sys_role.ID',
  `CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
  `CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
  `MODIFY_USER` TINYTEXT COMMENT 'Modify User',
  `MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;


INSERT  INTO `tb_sys_user`(`ID`,`NAME`,`USERNAME`,`EMAIL`,`PHONE`,`PASSWORD`,`ROLE_ID`,`STATUS`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) 
VALUES (11,'Admin','Admin','123456', 'admin@email.com', '13088887777',10,1, 'admin', SYSDATE(), 'admin', SYSDATE());

INSERT  INTO `tb_sys_user`(`ID`,`NAME`,`USERNAME`,`EMAIL`,`PHONE`,`PASSWORD`,`ROLE_ID`,`STATUS`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) 
VALUES (12,'Admin','Fred','123456', 'fred@email.com','13088887777',10,1, 'admin', SYSDATE(), 'admin', SYSDATE());

INSERT  INTO `tb_sys_user`(`ID`,`NAME`,`USERNAME`,`EMAIL`,`PHONE`,`PASSWORD`,`ROLE_ID`,`STATUS`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`)  
VALUES (13,'Admin','Anna','123456', 'anna@email.com','13088887777',10,1, 'admin', SYSDATE(), 'admin', SYSDATE());

INSERT  INTO `tb_sys_user`(`ID`,`NAME`,`USERNAME`,`EMAIL`,`PHONE`,`PASSWORD`,`ROLE_ID`,`STATUS`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`)  
VALUES (14,'Admin','Wendy','123456', 'wendy@email.com','13088887777',10,1, 'admin', SYSDATE(), 'admin', SYSDATE());

INSERT  INTO `tb_sys_user`(`ID`,`NAME`,`USERNAME`,`EMAIL`,`PHONE`,`PASSWORD`,`ROLE_ID`,`STATUS`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) 
VALUES (15,'Admin','James','123456', 'james@email.com','13088887777',10,1, 'admin', SYSDATE(), 'admin', SYSDATE());

COMMIT;

SELECT * FROM TB_SYS_USER;

DROP TABLE TB_SYS_NEWS;
CREATE TABLE `TB_SYS_NEWS` (
	`ID` INT (10),
	`TITLE` VARCHAR (900),
	`CONTENT` TEXT,
	`AUTHOR` VARCHAR (900),
	`TYPE` INT (2),
	`PUBLISH_TIME` DATETIME ,
	`CREATE_USER` TINYTEXT NOT NULL COMMENT 'Create User',
	`CREATE_TIME` TIMESTAMP NOT NULL COMMENT 'Create Time',
	`MODIFY_USER` TINYTEXT COMMENT 'Modify User',
	`MODIFY_TIME` TIMESTAMP COMMENT 'Modify Time',
	PRIMARY KEY (`ID`)
) ENGINE=INNODB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

INSERT INTO `TB_SYS_NEWS` (`ID`, `TITLE`, `CONTENT`, `AUTHOR`, `TYPE`, `PUBLISH_TIME`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) VALUES('1','上将“军老虎”落马，他究竟向谁行贿？','本周，最重要的消息是十九届中央纪委二次全会11日在北京开幕，中共中央总书记、国家主席、中央军委主席习近平发出了新号召，“重整行装再出发，以永远在路上的执着把全面从严治党引向深入，开创全面从严治党新局面。”\n1月12日，广东省委原常委、珠海市委原书记李嘉受贿案公开宣判，李嘉受贿2058万余元，获刑13年，罚金200万元。他是十九大之后第一个获刑的原省部级官员。\n本周最令人震惊的消息莫过于一位重磅“军老虎”的倒下。房峰辉，这位中央军事委员会委员因涉嫌行贿、受贿犯罪，被移送军事检察机关依法处理。军中反腐，大刀阔斧。','幸福西饼',1,'2018-01-13 16:22:46','admin', SYSDATE(), 'admin', SYSDATE());
INSERT INTO `TB_SYS_NEWS` (`ID`, `TITLE`, `CONTENT`, `AUTHOR`, `TYPE`, `PUBLISH_TIME`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) VALUES('2','“夜宿门”后李小璐首现身，与甜馨同行，专注手机，心情大好','李小璐夜宿pgone事件已经过去十多天。随着李小璐的“消失”，贾乃亮的声明，pgone回到老家，该事件的主要角色来了个大换身，成了马苏和黄毅清。而马苏起诉黄毅清，而且还是刑事自诉黄毅清，更是将两人的关系推上了风口浪尖。\n马苏与黄毅清的官司如火如荼，李小璐一家三口则悠然自得，心情大好。黄毅清不愧是贾乃亮的好兄弟，马苏也不愧是李小璐的好姐妹。挡枪眼，最终成为主角。','幸福西饼',2,'2018-01-13 16:25:47','admin', SYSDATE(), 'admin', SYSDATE());
INSERT INTO `TB_SYS_NEWS` (`ID`, `TITLE`, `CONTENT`, `AUTHOR`, `TYPE`, `PUBLISH_TIME`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) VALUES('3','专心治疗不安排训练 邹市明的拳击生涯会就此终结吗','原标题：专心治疗不安排训练，邹市明的拳击生涯会就此终结吗\n“好久不见，我还是我……”昨日，备受关注的奥运冠军、前世界拳王邹市明通过其官方微博发声，透露自己已经离开医院。\n此时，距离他上月21日被曝出因眼疾入院已经过去了23天。\n澎湃新闻记者通过邹市明团队获悉，邹市明在接受了治疗后，病情相对稳定，接下来将在家中静养，但院方还将会诊评估邹市明的病情，并确定下一步治疗方案。\n简而言之，邹市明一段时间内依然会以治疗康复为主，不会有训练和比赛安排。而这是否会就此成为他职业生涯的终结，只能等待邹市明自己的决定。','凤凰新闻',2,'2018-01-13 16:25:48','admin', SYSDATE(), 'admin', SYSDATE());
INSERT INTO `TB_SYS_NEWS` (`ID`, `TITLE`, `CONTENT`, `AUTHOR`, `TYPE`, `PUBLISH_TIME`, `CREATE_USER`, `CREATE_TIME`, `MODIFY_USER`, `MODIFY_TIME`) VALUES('4','捷克选总统可能需要第二轮投票','（原标题：捷克选总统可能需要第二轮投票）\n新华社北京1月13日电（记者沈敏）捷克共和国1月12日至13日直接选举总统，选举可能需要第二轮投票。\n多项选前民意调查显示，9名候选人中，现任总统米洛什·泽曼所获支持率领先，有望在首轮投票中“出线”。\n但是，民意分裂以及民意支持率分散所致，泽曼如果拿不到50%选票，则需要进入第二轮，可能与捷克科学院前院长伊日·德拉霍什对决。','网易新闻',2,'2018-01-13 16:25:48','admin', SYSDATE(), 'admin', SYSDATE());

SELECT TYPE, TITLE FROM TB_SYS_NEWS;





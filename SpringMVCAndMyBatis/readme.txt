这个只是最普通的 SpringMVC+MyBatis 整合 Demo

用到
注解,Dao查询,Mapper接口查询,db.properties数据库配置
对MySql 中的 user 的一次增删改查


user表:
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `filepath` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

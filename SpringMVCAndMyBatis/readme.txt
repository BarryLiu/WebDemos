���ֻ������ͨ�� SpringMVC+MyBatis ���� Demo

�õ�
ע��,Dao��ѯ,Mapper�ӿڲ�ѯ,db.properties���ݿ�����
��MySql �е� user ��һ����ɾ�Ĳ�


user��:
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `filepath` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

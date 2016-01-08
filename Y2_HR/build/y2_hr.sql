-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: hr_db
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bonus`
--

DROP TABLE IF EXISTS `bonus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bonus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `major_kind_id` int(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` int(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称 ',
  `human_id` int(11) DEFAULT NULL COMMENT '人力资源档案编号(外健：Human_file表中human_id)',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `bonus_item` varchar(45) DEFAULT NULL COMMENT '激励项目名称',
  `bonus_worth` double DEFAULT NULL COMMENT '激励价值  ',
  `bonus_degree` int(11) DEFAULT NULL COMMENT '激励等级',
  `remark` varchar(45) DEFAULT NULL COMMENT '备注',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `check_status` int(11) DEFAULT NULL COMMENT '复核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='激励登记表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonus`
--

LOCK TABLES `bonus` WRITE;
/*!40000 ALTER TABLE `bonus` DISABLE KEYS */;
/*!40000 ALTER TABLE `bonus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_file_first_kind`
--

DROP TABLE IF EXISTS `config_file_first_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_file_first_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_kind_id` varchar(20) DEFAULT NULL COMMENT '一级机构编号',
  `first_kind_name` varchar(60) DEFAULT NULL COMMENT '一级机构名称',
  `first_kind_salary_id` varchar(11) DEFAULT NULL COMMENT '一级机构薪酬发放责任人编号',
  `first_kind_sale_id` varchar(11) DEFAULT NULL COMMENT '一级机构销售责任人编号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `first_kind_id_UNIQUE` (`first_kind_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='一级机构设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_file_first_kind`
--

LOCK TABLES `config_file_first_kind` WRITE;
/*!40000 ALTER TABLE `config_file_first_kind` DISABLE KEYS */;
INSERT INTO `config_file_first_kind` VALUES (1,'1',' I 级结构',NULL,NULL),(2,'2','集团',NULL,NULL),(3,'3','总部','1wr','2'),(7,'22','魏汝稳','萨芬阿发','嘎嘎噶');
/*!40000 ALTER TABLE `config_file_first_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_file_second_kind`
--

DROP TABLE IF EXISTS `config_file_second_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_file_second_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_kind_id` varchar(20) DEFAULT NULL COMMENT '一级机构编号',
  `first_kind_name` varchar(60) DEFAULT NULL COMMENT '一级机构名称',
  `second_kind_id` varchar(20) DEFAULT NULL COMMENT '二级机构编号 ',
  `second_kind_name` varchar(60) DEFAULT NULL COMMENT '二级机构名称 ',
  `second_salary_id` varchar(11) DEFAULT NULL COMMENT '二级机构薪酬发放责任人编号',
  `second_sale_id` varchar(11) DEFAULT NULL COMMENT '二级机构销售责任人编号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `second_kind_id_UNIQUE` (`second_kind_id`),
  KEY `first_kind_id_idx` (`first_kind_id`),
  KEY `FK_first_kind_id_idx` (`first_kind_id`),
  CONSTRAINT `FK_first_kind_id` FOREIGN KEY (`first_kind_id`) REFERENCES `config_file_first_kind` (`first_kind_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='二级机构设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_file_second_kind`
--

LOCK TABLES `config_file_second_kind` WRITE;
/*!40000 ALTER TABLE `config_file_second_kind` DISABLE KEYS */;
INSERT INTO `config_file_second_kind` VALUES (1,'1',' I 级结构','1',' II级结构1',NULL,NULL),(2,NULL,'I 级结构','2','II级结构2','ww',''),(3,'1',' I 级结构','3',' II级结构3',NULL,NULL),(4,'1',' I 级结构','4',' II级结构4',NULL,NULL),(5,'1',' I 级结构','5',' II级结构5',NULL,NULL),(6,'2','集团','6','软件公司',NULL,NULL),(7,'2','集团','7','科技公司',NULL,NULL),(8,'3','总部','8','北京分校区',NULL,NULL),(9,'3','总部','9','湖南分校区',NULL,NULL),(10,'3','总部','10','湖北分校区',NULL,NULL);
/*!40000 ALTER TABLE `config_file_second_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_file_third_kind`
--

DROP TABLE IF EXISTS `config_file_third_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_file_third_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_kind_id` varchar(20) DEFAULT NULL COMMENT '一级机构编号',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '一级机构名称',
  `second_kind_id` varchar(20) DEFAULT NULL COMMENT '二级机构编号',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '二级机构名称',
  `third_kind_id` varchar(20) DEFAULT NULL COMMENT '三级机构编号',
  `third_kind_name` varchar(45) DEFAULT NULL COMMENT '三级机构名称',
  `third_kind_sale_id` varchar(11) DEFAULT NULL COMMENT '三级机构销售责任人编号',
  `third_kind_is_retail` varchar(11) DEFAULT NULL COMMENT '三级机构是否为零售店(1:是 2:不是)',
  PRIMARY KEY (`id`),
  KEY `FK_second_kind_id_idx` (`second_kind_id`),
  CONSTRAINT `FK_second_kind_id` FOREIGN KEY (`second_kind_id`) REFERENCES `config_file_second_kind` (`second_kind_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='三级机构设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_file_third_kind`
--

LOCK TABLES `config_file_third_kind` WRITE;
/*!40000 ALTER TABLE `config_file_third_kind` DISABLE KEYS */;
INSERT INTO `config_file_third_kind` VALUES (1,'1',' I 级结构','1',' II级结构1','1','III级机构111','',''),(2,'1',' I 级结构','2',' II级结构2','2','III级机构222','',''),(3,'2','集团','6','软件公司','3','软件股份有限公司','',''),(4,'2','集团','7','科技公司','4','外包公司','',''),(5,'3','总部','8','北京分校区','5','中关村分校区1','',''),(6,'3','总部','8','北京分校区','6','中关村分校区2',NULL,NULL),(7,'3','总部','8','北京分校区','7','中关村分校区3',NULL,NULL),(8,'3','总部','9','湖南分校区','8','长沙分校区1',NULL,NULL),(9,'3','总部','9','湖南分校区','9','长沙分校区2',NULL,NULL),(10,'3','总部','9','湖南分校区','10','长沙分校区3',NULL,NULL),(12,'2','集团','6','软件公司','52','wrw','242','2');
/*!40000 ALTER TABLE `config_file_third_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_major`
--

DROP TABLE IF EXISTS `config_major`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_major` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `major_kind_id` int(11) DEFAULT NULL COMMENT '职位分类编号',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `test_amount` int(11) DEFAULT NULL COMMENT '题套数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='职位设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_major`
--

LOCK TABLES `config_major` WRITE;
/*!40000 ALTER TABLE `config_major` DISABLE KEYS */;
INSERT INTO `config_major` VALUES (1,1,'销售','1','区域经理',10),(2,1,'销售','2','总经理',16),(3,2,'软件开发','3','项目经理',10),(4,2,'软件开发','4','程序员',8),(5,3,'人力资源','5','人事经理',12),(6,3,'人力资源','6','专员',6),(7,4,'生产部','7','主任',15),(8,0,'','22','22',NULL);
/*!40000 ALTER TABLE `config_major` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_major_kind`
--

DROP TABLE IF EXISTS `config_major_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_major_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职分类位名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='9.职位分类设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_major_kind`
--

LOCK TABLES `config_major_kind` WRITE;
/*!40000 ALTER TABLE `config_major_kind` DISABLE KEYS */;
INSERT INTO `config_major_kind` VALUES (2,'2','软件开发'),(3,'3','人力资源'),(4,'4','生产部'),(5,'1','1111'),(6,'22','22');
/*!40000 ALTER TABLE `config_major_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_primary_key`
--

DROP TABLE IF EXISTS `config_primary_key`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_primary_key` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `primary_key_table` varchar(45) DEFAULT NULL COMMENT '关键字所涉及的数据库表名',
  `primary_key` varchar(45) DEFAULT NULL COMMENT '关键字',
  `key_name` varchar(45) DEFAULT NULL COMMENT '中文关键字',
  `primary_key_status` int(11) DEFAULT NULL COMMENT '是否为关键字(1:是 2:不是)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COMMENT='关键字设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_primary_key`
--

LOCK TABLES `config_primary_key` WRITE;
/*!40000 ALTER TABLE `config_primary_key` DISABLE KEYS */;
INSERT INTO `config_primary_key` VALUES (1,'engage_resume','human_name','姓名',1),(2,'engage_resume','engage_type','招聘类型',1),(3,'engage_resume','human_address','地址',2),(4,'engage_resume','human_postcode','邮编',2),(5,'engage_resume','human_major_kind_id','职位分类编号',2),(6,'engage_resume','human_major_kind_name','职位分类名称 ',1),(7,'engage_resume','human_major_id','职位编号',2),(8,'engage_resume','human_major_name','职位名称',1),(9,'engage_resume','human_telephone','电话号码 ',2),(10,'engage_resume','human_homephone','家庭电话',2),(11,'engage_resume','human_picture','照片',2),(12,'engage_resume','human_mobilephone','手机',2),(13,'engage_resume','human_email',' Email ',2),(14,'engage_resume','human_hobby','兴趣爱好',2),(15,'engage_resume','human_specility','特长',1),(16,'engage_resume','human_sex','性别 ',1),(17,'engage_resume','human_religion','宗教信仰',1),(19,'engage_resume','human_party','政治面貌',2),(20,'engage_resume','human_nationality','国籍',1),(21,'engage_resume','human_race','民族',1),(22,'engage_resume','human_birthday','生日',2),(23,'engage_resume','human_age','年龄',2),(24,'engage_resume','human_educated_degree','教育程度',1),(25,'engage_resume','human_educated_years','教育年限',2),(26,'engage_resume','human_educated_major','专业',1),(27,'engage_resume','human_college','毕业院校',1),(28,'engage_resume','human_idcard','身份证号',2),(29,'engage_resume','human_birthplace','出生地',1),(30,'engage_resume','demand_salary_standard','薪酬标准',1),(31,'engage_resume','human_history_records','个人履历',2),(32,'engage_resume','recomandation','推荐意见',1),(33,'engage_resume','human_picture','照片',2),(34,'engage_resume','attachment_name','档案附件',2),(35,'engage_resume','check_status','复核状态',2),(36,'engage_resume','register','登记人',1),(37,'engage_resume','regist_time','登记时间',2),(38,'engage_resume','checker','复核人姓名',1),(39,'engage_resume','check_time','复核时间',2),(40,'engage_resume','interview_status','面试状态',2),(41,'engage_resume','total_points','总分',2),(42,'engage_resume','test_amount','考试次数',2),(43,'engage_resume','test_checker','测试复核人',1),(44,'engage_resume','test_check_time','测试复核时间',2),(45,'engage_resume','pass_check_status','测试复核状态',2),(46,'engage_resume','pass_checkComment','录用申请审核意见',2),(47,'engage_resume','pass_passComment','录用申请审批意见',2);
/*!40000 ALTER TABLE `config_primary_key` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_public_char`
--

DROP TABLE IF EXISTS `config_public_char`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_public_char` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attribute_kind` varchar(45) DEFAULT NULL COMMENT '属性的种类',
  `attribute_name` varchar(45) DEFAULT NULL COMMENT '属性的名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='公共字段设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_public_char`
--

LOCK TABLES `config_public_char` WRITE;
/*!40000 ALTER TABLE `config_public_char` DISABLE KEYS */;
INSERT INTO `config_public_char` VALUES (1,'国籍','中国'),(3,'国籍','英国'),(6,'国籍','韩国'),(7,'民族','汉族'),(8,'民族','苗族'),(9,'薪酬发放方式','三级机构发放方式'),(10,'民族','朝鲜族'),(11,'民族','傣族'),(12,'民族','新疆维吾尔族'),(13,'宗教信仰','佛教'),(14,'宗教信仰','基督教'),(15,'宗教信仰','伊斯兰教'),(16,'政治面貌','无'),(17,'政治面貌','党员'),(18,'政治面貌','群众'),(19,'教育年限','6'),(20,'教育年限','9'),(21,'教育年限','12'),(22,'学历','初中'),(23,'学历','高中'),(24,'学历','大专'),(25,'学历','本科'),(26,'学历','研究生'),(27,'专业','计算机技术'),(28,'专业','物流工程'),(29,'专业','土木建设'),(30,'专业','电子信息技术'),(31,'特长','舞蹈'),(32,'特长','音乐'),(33,'特长','相声'),(34,'特长','美术'),(35,'特长','其他'),(36,'爱好','打球'),(37,'爱好','打游戏'),(38,'爱好','看电影'),(39,'爱好','其他'),(40,'职称','工程师'),(41,'职称','设计师'),(42,'职称','美工'),(44,'薪酬发放方式','一级机构发放');
/*!40000 ALTER TABLE `config_public_char` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_question_first_kind`
--

DROP TABLE IF EXISTS `config_question_first_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_question_first_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '试题一级分类编号',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '试题一级分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试题一级分类设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_question_first_kind`
--

LOCK TABLES `config_question_first_kind` WRITE;
/*!40000 ALTER TABLE `config_question_first_kind` DISABLE KEYS */;
/*!40000 ALTER TABLE `config_question_first_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_question_second_kind`
--

DROP TABLE IF EXISTS `config_question_second_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_question_second_kind` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '试题一级分类编号',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '试题一级分类名称',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '试题二级分类编号',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '试题二级分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试题二级分类设置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_question_second_kind`
--

LOCK TABLES `config_question_second_kind` WRITE;
/*!40000 ALTER TABLE `config_question_second_kind` DISABLE KEYS */;
/*!40000 ALTER TABLE `config_question_second_kind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_answer`
--

DROP TABLE IF EXISTS `engage_answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_answer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `answer_number` varchar(45) DEFAULT NULL COMMENT '答案编号',
  `exam_number` varchar(45) DEFAULT NULL COMMENT '试卷编号(外健：Engage_exam表中exam_number)',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历编号(外健：engage_resume表中res_id)',
  `interview_id` int(11) DEFAULT NULL COMMENT '面试编号(外健：engage_interview表中ein_id)',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `human_idcard` varchar(45) DEFAULT NULL COMMENT '身份证号',
  `major_kind_id` int(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `test_time` date DEFAULT NULL COMMENT '测试时间',
  `use_time` varchar(45) DEFAULT NULL COMMENT '使用时间',
  `total_point` double DEFAULT NULL COMMENT '总分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试答题登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_answer`
--

LOCK TABLES `engage_answer` WRITE;
/*!40000 ALTER TABLE `engage_answer` DISABLE KEYS */;
/*!40000 ALTER TABLE `engage_answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_answer_details`
--

DROP TABLE IF EXISTS `engage_answer_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_answer_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `answer_number` varchar(45) DEFAULT NULL COMMENT '答案编号（外健：Engage_answer表中answer_number）',
  `subject_id` varchar(45) DEFAULT NULL COMMENT '试卷编号 (外健：Engage_exam_details表中exam_numbe',
  `answer` varchar(45) DEFAULT NULL COMMENT '答题者答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试答题详细信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_answer_details`
--

LOCK TABLES `engage_answer_details` WRITE;
/*!40000 ALTER TABLE `engage_answer_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `engage_answer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_exam`
--

DROP TABLE IF EXISTS `engage_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `exam_number` varchar(45) DEFAULT NULL COMMENT '试卷编号 (外健：Engage_exam_details表中exam_number)',
  `major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人 ',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `limite_time` varchar(45) DEFAULT NULL COMMENT '答题限时',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_exam`
--

LOCK TABLES `engage_exam` WRITE;
/*!40000 ALTER TABLE `engage_exam` DISABLE KEYS */;
/*!40000 ALTER TABLE `engage_exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_exam_details`
--

DROP TABLE IF EXISTS `engage_exam_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_exam_details` (
  `id` int(11) NOT NULL COMMENT '主键',
  `exam_number` varchar(45) DEFAULT NULL COMMENT '试卷编号',
  `first_kind_id` varchar(45) DEFAULT NULL COMMENT '试题一级分类编号',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '试题一级分类名称',
  `second_kind_id` varchar(45) DEFAULT NULL COMMENT '试题二级分类编号',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '试题二级分类名称',
  `question_amount` int(11) DEFAULT NULL COMMENT '出题数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷详细信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_exam_details`
--

LOCK TABLES `engage_exam_details` WRITE;
/*!40000 ALTER TABLE `engage_exam_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `engage_exam_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_interview`
--

DROP TABLE IF EXISTS `engage_interview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_interview` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `interview_amount` int(11) DEFAULT NULL COMMENT '面试次数',
  `human_major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `human_major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `human_major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `human_major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `image_degree` varchar(11) DEFAULT NULL COMMENT '形象等级',
  `native_language_degree` varchar(11) DEFAULT NULL COMMENT '口才等级',
  `foreign_language_degree` varchar(11) DEFAULT NULL COMMENT '外语水平等级',
  `response_speed_degree` varchar(11) DEFAULT NULL COMMENT '应变能力',
  `EQ_degree` varchar(11) DEFAULT NULL COMMENT 'EQ等级',
  `IQ_degree` varchar(11) DEFAULT NULL COMMENT 'IQ_等级',
  `multi_quality_degree` varchar(45) DEFAULT NULL COMMENT '综合素质 ',
  `register` varchar(45) DEFAULT NULL COMMENT '面试人',
  `checker` varchar(45) DEFAULT NULL COMMENT '筛选人  ',
  `registe_time` date DEFAULT NULL COMMENT '面试时间',
  `check_time` date DEFAULT NULL COMMENT '筛选时间',
  `resume_id` int(11) DEFAULT NULL COMMENT '简历编号(外健：engage_resume表中res_id)',
  `result` varchar(45) DEFAULT NULL COMMENT '面试结果',
  `interview_comment` varchar(45) DEFAULT NULL COMMENT '面试评价',
  `check_comment` varchar(45) DEFAULT NULL COMMENT '筛选评价',
  `interview_status` int(11) DEFAULT NULL COMMENT '面试状态',
  `check_status` int(11) DEFAULT NULL COMMENT '筛选状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='面试';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_interview`
--

LOCK TABLES `engage_interview` WRITE;
/*!40000 ALTER TABLE `engage_interview` DISABLE KEYS */;
INSERT INTO `engage_interview` VALUES (1,'sfa',1,'2','软件开发','4','程序员','A','A','A','A','A','A','A','张三','sfa','2015-10-01',NULL,7,'完成','哎呦！ 不错哦！',NULL,1,NULL),(3,'sfs',3,'1','销售','2','总经理','A','A','A','A','A','A','A','张三','sfs','2015-11-03','2015-11-10',6,'完成','是否是大啊','建议录用',1,2),(6,'barry',3,'2','软件开发','4','程序员','A','A','A','A','A','A','A','张三','barry','2015-11-02',NULL,16,'完成','第三次登记了','',1,1),(7,'sfs',2,'1','销售','2','总经理','A','A','A','B','A','A','A','张三','sfs','2015-11-02','2015-11-09',4,'完成','第二次面试了','建议录用',1,2),(8,'jack',1,'2','软件开发','4','程序员','A','A','A','A','A','A','A','张三','jack','2015-11-03',NULL,17,'完成','登记','',1,1),(9,'请问日期',1,'1','销售','2','总经理','A','A','A','A','B','A','A','张三','请问日期','2015-11-02',NULL,2,'完成','可以','',1,0),(10,'请问日期',1,'1','销售','2','总经理','A','A','A','B','B','A','A','张三','请问日期','2015-11-27',NULL,3,'完成','适当放松放松法v','',1,1);
/*!40000 ALTER TABLE `engage_interview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_major_release`
--

DROP TABLE IF EXISTS `engage_major_release`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_major_release` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '一级机构名称 ',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '二级机构编号(外健：Config_file_second_kind表中的second_kind_id)',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '二级机构名称',
  `third_kind_id` varchar(11) DEFAULT NULL COMMENT '三级机构编号(外健：Config_file_third_kind表中的third_kind_id)',
  `third_kind_name` varchar(45) DEFAULT NULL COMMENT '三级机构名称',
  `major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `human_amount` int(11) DEFAULT NULL COMMENT '招聘人数',
  `engage_type` varchar(45) DEFAULT NULL COMMENT '招聘类型',
  `deadline` date DEFAULT NULL COMMENT '截至日期',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `changer` varchar(45) DEFAULT NULL COMMENT '变更人 ',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `change_time` date DEFAULT NULL COMMENT '变更时间',
  `major_describe` varchar(45) DEFAULT NULL COMMENT '职位描述 ',
  `engage_required` varchar(45) DEFAULT NULL COMMENT '招聘要求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='职位发表登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_major_release`
--

LOCK TABLES `engage_major_release` WRITE;
/*!40000 ALTER TABLE `engage_major_release` DISABLE KEYS */;
INSERT INTO `engage_major_release` VALUES (2,'1','I 级结构','2','II级结构2','0','','1','销售','1','区域经理',12,'校园招聘','2015-10-29','张三','tom','2015-10-21','2015-10-29','aaaaaaaaa','bbbbbbbbbbbbbbbb'),(3,'2','集团','7','科技公司','2','III级机构222','2','软件开发','3','项目经理',122,'社会招聘',NULL,'张三','a','2015-10-22',NULL,'发发发','说法啊'),(4,'3','总部','8','北京分校区','0','III级机构111','2','软件开发','3','项目经理',1,'校园招聘','2015-08-22','张三',NULL,'2015-10-22',NULL,'aaaaaaaaaad','kkkkkk'),(5,'1','I 级结构','2','II级结构2','1','III级机构111','2','软件开发','4','程序员',12,'校园招聘','2015-07-22','张三',NULL,'2015-10-22',NULL,'sfaf','safafa'),(6,'1','I 级结构','2','II级结构2','0','','2','软件开发','4','程序员',2,'社会招聘','2015-10-31','jack',NULL,'2015-10-28',NULL,'软件测试','工作认真负责'),(7,'1','I 级结构','1','II级结构1','1','III级机构111','2','软件开发','4','程序员',2,'社会招聘','2015-10-29','jack',NULL,'2015-10-28',NULL,'软件测试','工作认真负责'),(8,'1','I 级结构','1','II级结构1','1','III级机构111','1','销售','1','区域经理',2,'校园招聘','2015-10-30','jack',NULL,'2015-10-28',NULL,'认真','负责'),(9,'1','I 级结构','2','II级结构2','2','III级机构222','1','销售','1','区域经理',2,'校园招聘',NULL,'',NULL,NULL,NULL,'',''),(11,'2','集团','6','软件公司','3','软件股份有限公司','3','人力资源','6','专员',3,'校园招聘','2015-02-10','张三','张三','2015-11-10','2015-11-10','sdfsdsdfdsfafdasfdaf','sfsfasssss');
/*!40000 ALTER TABLE `engage_major_release` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_resume`
--

DROP TABLE IF EXISTS `engage_resume`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_resume` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `engage_type` varchar(45) DEFAULT NULL COMMENT '招聘类型',
  `human_address` varchar(45) DEFAULT NULL COMMENT '地址',
  `human_postcode` varchar(11) DEFAULT NULL COMMENT '邮编',
  `human_major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `human_major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `human_major_id` varchar(11) DEFAULT NULL COMMENT '职位名称',
  `human_major_name` varchar(45) DEFAULT NULL COMMENT '职位名称 ',
  `human_telephone` varchar(45) DEFAULT NULL COMMENT '电话号码',
  `human_homephone` varchar(45) DEFAULT NULL COMMENT '家庭电话',
  `human_mobilephone` varchar(45) DEFAULT NULL COMMENT '手机',
  `human_email` varchar(45) DEFAULT NULL COMMENT 'Email',
  `human_hobby` varchar(45) DEFAULT NULL COMMENT '兴趣爱好',
  `human_specility` varchar(45) DEFAULT NULL COMMENT '特长',
  `human_sex` char(1) DEFAULT NULL COMMENT '性别',
  `human_religion` varchar(45) DEFAULT NULL COMMENT '宗教信仰 ',
  `human_party` varchar(45) DEFAULT NULL COMMENT '政治面貌',
  `human_nationality` varchar(45) DEFAULT NULL COMMENT '国籍',
  `human_race` varchar(45) DEFAULT NULL COMMENT '民族',
  `human_birthday` varchar(45) DEFAULT NULL COMMENT '生日',
  `human_age` int(11) DEFAULT NULL COMMENT '年龄 ',
  `human_educated_degree` varchar(45) DEFAULT NULL COMMENT '教育程度 ',
  `human_educated_years` double DEFAULT NULL COMMENT '教育年限',
  `human_educated_major` varchar(45) DEFAULT NULL COMMENT '专业',
  `human_college` varchar(45) DEFAULT NULL COMMENT '毕业院校',
  `human_idcard` varchar(45) DEFAULT NULL COMMENT '身份证号',
  `human_birthplace` varchar(45) DEFAULT NULL COMMENT '出生地',
  `demand_salary_standard` varchar(45) DEFAULT NULL COMMENT '薪酬标准',
  `human_history_records` varchar(45) DEFAULT NULL COMMENT '个人履历 ',
  `remark` varchar(45) DEFAULT NULL COMMENT '备注',
  `recomandation` varchar(45) DEFAULT NULL COMMENT '推荐意见',
  `human_picture` varchar(45) DEFAULT NULL COMMENT '照片',
  `attachment_name` varchar(45) DEFAULT NULL COMMENT '档案附件',
  `check_status` int(11) DEFAULT NULL COMMENT '复核状态',
  `register` varchar(45) DEFAULT NULL COMMENT ' 登记人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人姓名',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `interview_status` int(11) DEFAULT NULL COMMENT '面试状态',
  `total_points` double DEFAULT NULL COMMENT '总分',
  `test_amount` int(11) DEFAULT NULL COMMENT '考试次数',
  `test_checker` varchar(45) DEFAULT NULL COMMENT '测试复核人 ',
  `test_check_time` date DEFAULT NULL COMMENT '测试复核时间',
  `pass_register` varchar(45) DEFAULT NULL COMMENT '通过登记人姓名',
  `pass_regist_time` date DEFAULT NULL COMMENT '通过登记时间 ',
  `pass_checker` varchar(45) DEFAULT NULL COMMENT '通过复核人姓名',
  `pass_check_time` date DEFAULT NULL COMMENT '通过复核时间 ',
  `pass_check_status` int(11) DEFAULT NULL COMMENT '通过的复核状态',
  `pass_checkComment` varchar(45) DEFAULT NULL COMMENT '录用申请审核意见',
  `pass_passComment` varchar(45) DEFAULT NULL COMMENT '录用申请审批意见 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='简历管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_resume`
--

LOCK TABLES `engage_resume` WRITE;
/*!40000 ALTER TABLE `engage_resume` DISABLE KEYS */;
INSERT INTO `engage_resume` VALUES (2,'请问日期','社会招聘','我确认为其人情味qq','','1','销售','2','总经理','3243242424','5151141241','','','','','男','佛教','','英国','土家族','',NULL,'',6,'生物工程','吉大','23432432424242','万千柔情','','认真','工作认真','推荐。。。',NULL,NULL,2,NULL,'2015-10-23',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'','2015-11-06',NULL,'建议面试','不通过'),(3,'请问日期','社会招聘','我确认为其人情味qq','','1','销售','2','总经理','3243242424','5151141241','','','','','男','佛教','','英国','土家族','',NULL,'',6,'生物工程','吉大','23432432424242','万千柔情','','认真','工作认真','',NULL,NULL,2,NULL,'2015-10-23',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-09',NULL,'不通过','不通过'),(4,'sfs','学校招聘','werqw','','1','销售','2','总经理','24324234','24242','','adsfasdfs@qq.com','篮球','html','男','无','','英国','土家族','',23,'大专',9,'生物工程','吉大','23522','','242','认真','工作认真','推荐通过',NULL,NULL,2,NULL,'2015-10-25',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-09',3,'通过','不通过'),(5,'sfs','社会招聘','sfasfasfa','','1','销售','1','区域经理','23432','243242342','234234232','adsfasdfs@qq.com','','','女','伊斯兰教','','英国','','',24324242,'',9,'化学工程','吉大','32423423432','','','safasf','asfasfa','推荐',NULL,NULL,2,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-09',NULL,'不通过','不通过'),(6,'sfs','学校招聘','sfasfasfa','','1','销售','2','总经理','242342','41241','1414141','adsfasdfs@qq.com','','','女','佛教','','中国','土家族','2012-10-25',NULL,'本科',9,'化学工程','吉大','2432','sfs242','242','sfasfaf','fafasfa','sd是的佛isfdsf',NULL,NULL,2,NULL,'2015-10-25',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-10',3,'通过','通过'),(7,'sfa','社会招聘','','','2','软件开发','4','程序员','2342342','','','','','','男','无','','中国','苗族','',NULL,'',9,'电力工程','吉大','2324242','','','','','推荐',NULL,NULL,2,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-09',NULL,'不通过','不通过'),(8,'sfa','社会招聘','','','3','人力资源','5','人事经理','2342342','','','','','','男','无','','中国','苗族','',NULL,'',9,'电力工程','吉大','2324242','','','','',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(9,'sfa','社会招聘','','','2','软件开发','3','项目经理','424234','424234242','','','','','女','无','','英国','土家族','',NULL,'',6,'电力工程','吉大','2234234234','','','','',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(10,'sfa','社会招聘','safasfafafa','','4','生产部','7','主任','424234','424234242','2424','adsfasdfs@qq.com','足球','c#','女','基督教','','英国','土家族','',22,'研究生',12,'电力工程','吉大','2234234234','asfasfafa','234','23432424','2424242',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(11,'sf','社会招聘','','','1','销售','1','','132324','22423424','','','','','男','无','','中国','汉族','',NULL,'',9,'电力工程','吉大','242342342342','长沙','','','',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(12,'sf','社会招聘','长沙中电','232423','1','销售','2','总经理','234242242','1251151515','15151515','234234@qq.com','打游戏','相声','男','佛教','','美国','苗族','2015-09-29',22,'高中',9,'物流工程','哈佛','243223423','长沙','4500','认真','工作认真',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(13,'sf','社会招聘','长沙中电','2432','2','软件开发','4','程序员','2342342','243243242','2432','234234@qq.com','打球','舞蹈','男','佛教','','中国','汉族','',23432,'初中',6,'物流工程','哈佛','23423','长沙','4500+','2222','3333',NULL,NULL,NULL,1,NULL,'2015-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,12,'化学工程',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'barry','学校招聘','中。。。。。','','2','软件开发','4','程序员','1222222','124141','13214141','1122222@qq.com','打游戏','相声','男','佛教','党员','中国','苗族','',1515151,'高中',6,'物流工程','高中','2342432423423','长沙','6000+','个人。。。','备注。。。','我推荐。。。',NULL,NULL,2,NULL,'2015-11-06',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-06',3,'通过','通过'),(17,'jack','社会招聘','SSF','234242','2','软件开发','4','程序员','224234234','34242442422','4242342423','22222@qq.com','打游戏','音乐','男','佛教','党员','中国','苗族','2015-11-06',NULL,'高中',12,'土木建设','LS','2342342','232423','5000','GRJL','BZ','我推荐',NULL,NULL,2,NULL,'2015-11-06',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,'张三','2015-11-06',NULL,'不通过','不通过'),(18,'ggugu','学校招聘','uufkkugkugfuf','686868','2','软件开发','3','项目经理','78876868886','768696986','8585857857','1232432@qq.com','看电影','音乐','男','基督教','群众','中国','苗族','2015-11-09',76,'大专',9,'物流工程','hih','6464676445647463','uuua','2000','xoisdjofjs','ofjsofa',NULL,NULL,NULL,1,NULL,'2015-11-09',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过'),(19,'ggugu','社会招聘','1241242141414','25115','1','1111','1','区域经理','2342343432','23512515','324132412','1232432@qq.com','','','男','佛教','党员','中国','苗族','',NULL,'高中',9,'物流工程','hih','241412','1515151','2000','34erwtwtew','wqrqwqwrewqrq',NULL,NULL,NULL,1,NULL,'2015-11-10',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'不通过','不通过');
/*!40000 ALTER TABLE `engage_resume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engage_subjects`
--

DROP TABLE IF EXISTS `engage_subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engage_subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '试题I级分类编号(外健：Engage_exam_details表中first_kind_id)',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '试题I级分类名称',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '试题II级分类编号 (外健：Engage_exam_details表中second_kind_id)',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '试题II级分类名称',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `derivation` varchar(45) DEFAULT NULL COMMENT '试题出处',
  `content` varchar(45) DEFAULT NULL COMMENT '题干',
  `key_a` varchar(45) DEFAULT NULL COMMENT '答案a',
  `key_b` varchar(45) DEFAULT NULL COMMENT '答案b',
  `key_c` varchar(45) DEFAULT NULL COMMENT '答案c',
  `key_d` varchar(45) DEFAULT NULL COMMENT '答案d',
  `key_e` varchar(45) DEFAULT NULL COMMENT '答案e',
  `correct_key` varchar(45) DEFAULT NULL COMMENT '正确答案',
  `changer` varchar(45) DEFAULT NULL COMMENT '变更人',
  `change_time` date DEFAULT NULL COMMENT '变更时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试题题库登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engage_subjects`
--

LOCK TABLES `engage_subjects` WRITE;
/*!40000 ALTER TABLE `engage_subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `engage_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `human_file`
--

DROP TABLE IF EXISTS `human_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `human_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `human_id` varchar(11) DEFAULT NULL,
  `first_kind_id` varchar(11) DEFAULT NULL,
  `first_kind_name` varchar(45) DEFAULT NULL,
  `second_kind_id` varchar(11) DEFAULT NULL,
  `second_kind_name` varchar(45) DEFAULT NULL,
  `third_kind_id` varchar(11) DEFAULT NULL,
  `third_kind_name` varchar(45) DEFAULT NULL,
  `human_name` varchar(45) DEFAULT NULL,
  `human_address` varchar(45) DEFAULT NULL,
  `human_postcode` varchar(11) DEFAULT NULL,
  `human_pro_designation` varchar(45) DEFAULT NULL,
  `human_major_kind_id` varchar(11) DEFAULT NULL,
  `human_major_kind_name` varchar(45) DEFAULT NULL,
  `human_major_id` varchar(11) DEFAULT NULL,
  `hunma_major_name` varchar(45) DEFAULT NULL,
  `human_telephone` varchar(12) DEFAULT NULL,
  `human_mobilephone` varchar(11) DEFAULT NULL,
  `human_bank` varchar(45) DEFAULT NULL,
  `human_account` varchar(45) DEFAULT NULL,
  `human_qq` varchar(11) DEFAULT NULL,
  `human_email` varchar(45) DEFAULT NULL,
  `human_hobby` varchar(45) DEFAULT NULL,
  `human_speciality` varchar(45) DEFAULT NULL,
  `human_sex` char(1) DEFAULT NULL,
  `human_religion` varchar(45) DEFAULT NULL,
  `human_party` varchar(45) DEFAULT NULL,
  `human_nationality` varchar(45) DEFAULT NULL,
  `human_race` varchar(45) DEFAULT NULL,
  `human_birthday` date DEFAULT NULL,
  `human_birthplace` varchar(45) DEFAULT NULL,
  `human_age` int(3) DEFAULT NULL,
  `human_educated_degree` varchar(45) DEFAULT NULL,
  `human_educated_years` double DEFAULT NULL,
  `human_educated_major` varchar(45) DEFAULT NULL,
  `human_society_security_id` varchar(11) DEFAULT NULL,
  `human_id_card` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `salary_standard_id` varchar(11) DEFAULT NULL,
  `salary_standard_name` varchar(45) DEFAULT NULL,
  `salary_sum` double DEFAULT NULL,
  `demand_salaray_sum` double DEFAULT NULL,
  `paid_salary_sum` double DEFAULT NULL,
  `major_change_amount` int(11) DEFAULT NULL,
  `bonus_amount` int(11) DEFAULT NULL,
  `training_amount` int(11) DEFAULT NULL,
  `file_chang_amount` int(11) DEFAULT NULL,
  `human_histroy_records` varchar(45) DEFAULT NULL,
  `human_family_membership` varchar(45) DEFAULT NULL,
  `human_picture` varchar(45) DEFAULT NULL,
  `attachment_name` varchar(45) DEFAULT NULL,
  `check_status` int(11) DEFAULT NULL COMMENT '复核状态(1：通过复核 2：未通过复核)',
  `register` varchar(45) DEFAULT NULL,
  `checker` varchar(45) DEFAULT NULL,
  `changer` varchar(45) DEFAULT NULL,
  `regist_time` date DEFAULT NULL,
  `check_time` date DEFAULT NULL,
  `change_time` date DEFAULT NULL,
  `lastly_change_time` date DEFAULT NULL,
  `delete_time` date DEFAULT NULL,
  `recovery_time` date DEFAULT NULL,
  `human_file_status` int(11) DEFAULT NULL COMMENT '档案状态 (1：待复核 2：正常 3：已删除)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `human_file`
--

LOCK TABLES `human_file` WRITE;
/*!40000 ALTER TABLE `human_file` DISABLE KEYS */;
INSERT INTO `human_file` VALUES (1,'1','2','集团','7','科技公司','4','外包公司','张三','北京三里屯','421000','经理','1','销售','1','区域经理','0736-6989918','18795689246','中国银行','120520052645154','39356982','3956982@qq.com','户外运动,','摄影','男','基督教','党员','中国','汉','1990-05-18','浙江温州',25,'本科',15,'心理学','125468657','43052219900518236x','挺不错的一个人','100001','薪酬标准名称',4000.5,6000,6000,2,3,1,2,'本科毕业','父亲，母亲，妹妹','1.jpg','附件名称 ',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'2','1',' I 级结构','1','  II级结构1','1','III级机构111','Ruby','北京朝阳区','421000','经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'3','2','集团','7','科技公司','4','外包公司','李四','攀枝花','468000','经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'4','2','集团','7','科技公司','4','外包公司','王五','郴州','431000','经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'5','2','集团','7','科技公司','4','外包公司','赵六','烟台',NULL,'经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'6','2','集团','7','科技公司','4','外包公司','田七','漠河',NULL,'经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'7','2','集团','7','科技公司','4','外包公司','王八','韶关',NULL,'经理','1','销售','1','区域经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `human_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `humanfile_dig`
--

DROP TABLE IF EXISTS `humanfile_dig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `humanfile_dig` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `human_id` varchar(11) DEFAULT NULL COMMENT '档案编号',
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '一级机构名称',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '二级机构编号(外健：Config_file_second_kind表中的second_kind_id)',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '二级机构名称',
  `third_kind_id` varchar(11) DEFAULT NULL COMMENT '三级机构编号(外健：Config_file_third_kind表中的third_kind_id)',
  `third_kind_name` varchar(45) DEFAULT NULL COMMENT '三级机构名称',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `human_address` varchar(45) DEFAULT NULL COMMENT '地址',
  `human_postcode` varchar(11) DEFAULT NULL COMMENT '邮政编码',
  `human_pro_designation` varchar(45) DEFAULT NULL COMMENT '职称',
  `human_major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `human_major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称 ',
  `human_major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `hunma_major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `human_telephone` varchar(12) DEFAULT NULL COMMENT '电话',
  `human_mobilephone` varchar(11) DEFAULT NULL COMMENT '手机号码 ',
  `human_bank` varchar(45) DEFAULT NULL COMMENT '开户银行',
  `human_account` varchar(45) DEFAULT NULL COMMENT '银行帐号',
  `human_qq` varchar(11) DEFAULT NULL COMMENT 'QQ号码',
  `human_email` varchar(45) DEFAULT NULL COMMENT '电子邮件',
  `human_hobby` varchar(45) DEFAULT NULL COMMENT '爱好',
  `human_speciality` varchar(45) DEFAULT NULL COMMENT '特长',
  `human_sex` char(1) DEFAULT NULL COMMENT '性别',
  `human_religion` varchar(45) DEFAULT NULL COMMENT '宗教信仰',
  `human_party` varchar(45) DEFAULT NULL COMMENT '政治面貌',
  `human_nationality` varchar(45) DEFAULT NULL COMMENT '国籍',
  `human_race` varchar(45) DEFAULT NULL COMMENT '民族',
  `human_birthday` date DEFAULT NULL COMMENT '出生日期',
  `human_birthplace` varchar(45) DEFAULT NULL COMMENT '出生地',
  `human_age` int(3) DEFAULT NULL COMMENT '年龄',
  `human_educated_degree` varchar(45) DEFAULT NULL COMMENT '学历',
  `human_educated_years` double DEFAULT NULL COMMENT '教育年限',
  `human_educated_major` varchar(45) DEFAULT NULL COMMENT '学历专业',
  `human_society_security_id` varchar(11) DEFAULT NULL COMMENT '社会保障号',
  `human_id_card` varchar(45) DEFAULT NULL COMMENT '身份证号',
  `remark` varchar(45) DEFAULT NULL COMMENT '备注',
  `salary_standard_id` varchar(11) DEFAULT NULL COMMENT '薪酬标准编号(外健：salary_standard_details表中standard_id)',
  `salary_standard_name` varchar(45) DEFAULT NULL COMMENT '薪酬标准名称',
  `salary_sum` double DEFAULT NULL COMMENT '基本薪酬总额',
  `demand_salaray_sum` double DEFAULT NULL COMMENT '应发薪酬总额',
  `paid_salary_sum` double DEFAULT NULL COMMENT '实发薪酬总额',
  `major_change_amount` int(11) DEFAULT NULL COMMENT '调动次数',
  `bonus_amount` int(11) DEFAULT NULL COMMENT '激励累计次数',
  `training_amount` int(11) DEFAULT NULL COMMENT '培训累计次数',
  `file_chang_amount` int(11) DEFAULT NULL COMMENT '档案变更累计次数',
  `human_histroy_records` varchar(45) DEFAULT NULL COMMENT '简历',
  `human_family_membership` varchar(45) DEFAULT NULL COMMENT '家庭关系',
  `human_picture` varchar(45) DEFAULT NULL COMMENT '相片',
  `attachment_name` varchar(45) DEFAULT NULL COMMENT '附件名称',
  `check_status` int(11) DEFAULT NULL COMMENT '复核状态(1：通过复核 2：未通过复核)',
  `register` varchar(45) DEFAULT NULL COMMENT '档案登记人',
  `checker` varchar(45) DEFAULT NULL COMMENT '档案复核人',
  `changer` varchar(45) DEFAULT NULL COMMENT '档案变更人',
  `regist_time` date DEFAULT NULL COMMENT '档案登记时间',
  `check_time` date DEFAULT NULL COMMENT '档案复核时间',
  `change_time` date DEFAULT NULL COMMENT '档案变更时间',
  `lastly_change_time` date DEFAULT NULL COMMENT '档案最近更改时间 ',
  `delete_time` date DEFAULT NULL COMMENT '档案删除时间',
  `recovery_time` date DEFAULT NULL COMMENT '档案恢复时间',
  `human_file_status` int(11) DEFAULT NULL COMMENT '档案状态 (1：待复核 2：正常 3：已删除)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录人力资源档案所做的任何更改';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `humanfile_dig`
--

LOCK TABLES `humanfile_dig` WRITE;
/*!40000 ALTER TABLE `humanfile_dig` DISABLE KEYS */;
/*!40000 ALTER TABLE `humanfile_dig` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `major_change`
--

DROP TABLE IF EXISTS `major_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `major_change` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '一级机构名称',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '二级机构编号(外健：Config_file_second_kind表中的second_kind_id)',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '二级机构名称',
  `third_kind_id` varchar(11) DEFAULT NULL COMMENT '三级机构编号(外健：Config_file_third_kind表中的third_kind_id)',
  `third_kind_name` varchar(45) DEFAULT NULL COMMENT '三级机构名称',
  `major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `new_first_kind_id` varchar(11) DEFAULT NULL COMMENT '新一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）',
  `new_first_kind_name` varchar(45) DEFAULT NULL COMMENT '新一级机构名称',
  `new_second_kind_id` varchar(11) DEFAULT NULL COMMENT '新二级机构编号(外健：Config_file_second_kind表中的second_kind_id)',
  `new_second_kind_name` varchar(45) DEFAULT NULL COMMENT '新二级机构名称',
  `new_third_kind_id` varchar(11) DEFAULT NULL COMMENT '新三级机构编号(外健：Config_file_third_kind表中的third_kind_id)',
  `new_third_kind_name` varchar(45) DEFAULT NULL COMMENT '新三级机构名称',
  `new_major_kind_id` varchar(11) DEFAULT NULL COMMENT '新职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `new_major_kind_name` varchar(45) DEFAULT NULL COMMENT '新职位分类名称 ',
  `new_major_id` varchar(11) DEFAULT NULL COMMENT '新职位编号(外健：Config_major 表中的major_id)',
  `new_major_name` varchar(45) DEFAULT NULL COMMENT '新职位名称',
  `human_id` varchar(11) DEFAULT NULL COMMENT '人力资源档案编号(外健：Human_file表中human_id)',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `salary_standard_id` varchar(11) DEFAULT NULL COMMENT '薪酬标准编号(外健：salary_standard_details表中standard_id)',
  `salary_standard_name` varchar(45) DEFAULT NULL COMMENT '薪酬标准名称',
  `salary_sum` double DEFAULT NULL COMMENT '薪酬总额',
  `new_salary_standard_id` varchar(11) DEFAULT NULL COMMENT '新薪酬标准编号(外健：salary_standard_details表中standard_id)',
  `new_salary_standard_name` varchar(45) DEFAULT NULL COMMENT '新薪酬标准名称 ',
  `new_salary_sum` double DEFAULT NULL COMMENT '新薪酬总额',
  `change_reason` varchar(45) DEFAULT NULL COMMENT '调动原因',
  `check_reason` varchar(45) DEFAULT NULL COMMENT '审核通过意见',
  `check_status` int(11) DEFAULT NULL COMMENT '复核通过状态',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='职位调动表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `major_change`
--

LOCK TABLES `major_change` WRITE;
/*!40000 ALTER TABLE `major_change` DISABLE KEYS */;
INSERT INTO `major_change` VALUES (1,'2','集团','7','科技公司','4','外包公司','02','销售','02','软件开发',NULL,'','0','','0','','0',NULL,'0','',NULL,'杰克','','',NULL,'0','',0,'','',1,'','better_admin','2012-11-24','2016-01-08'),(2,'2','集团','7','科技公司','4','外包公司','02','销售','02','软件开发','0','','0','','0','','0','','0','','5','杰克','','',NULL,'0','',0,'24',NULL,0,'234',NULL,'2016-01-08',NULL),(3,'2','集团','7','科技公司','4','外包公司','02','销售','02','区域经理','0','','0','','0','','0','','0','','5','王五','','',NULL,'0','',0,'',NULL,0,'',NULL,'2016-01-08',NULL),(4,'2','集团','7','科技公司','4','外包公司','02','销售','02','区域经理','0','','0','','0','','0','','0','','4','王五','','',NULL,'0','',0,'石帆胜丰',NULL,0,'',NULL,'2016-01-08',NULL);
/*!40000 ALTER TABLE `major_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `right`
--

DROP TABLE IF EXISTS `right`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `right_name` varchar(45) DEFAULT NULL,
  `right_path` varchar(100) DEFAULT NULL,
  `parent_id` varchar(11) DEFAULT NULL,
  `right_type` varchar(45) DEFAULT NULL COMMENT 'Folder:文件夹Document:普通...',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `right`
--

LOCK TABLES `right` WRITE;
/*!40000 ALTER TABLE `right` DISABLE KEYS */;
INSERT INTO `right` VALUES (5,'招聘管理',NULL,'0','Folder'),(6,'人力资源档案管理',NULL,'0','Folder'),(7,'薪酬标准管理',NULL,'0','Folder'),(8,'薪酬发放管理',NULL,'0','Folder'),(9,'调动管理',NULL,'0','Folder'),(10,'客户化设置',NULL,'0','Folder'),(11,'标准数据报表',NULL,'0','Folder'),(12,'职位发布管理',NULL,'5','Folder'),(13,'简历管理',NULL,'5','Folder'),(14,'面试管理',NULL,'5','Folder'),(15,'录用管理',NULL,'5','Folder'),(16,'职位发布登记','/Y2_HR/recruit/position!register','12','Document'),(17,'职位发布变更','/Y2_HR/recruit/position!positionChangeUpdate','12','Document'),(18,'职位发布查询','/Y2_HR/recruit/position!positionReleaseSearch','12','Document'),(19,'简历登记','/Y2_HR/recruit/resume!register','13','Document'),(20,'简历筛选','/Y2_HR/recruit/resume!resumeChoose','13','Document'),(21,'有效简历查询','/Y2_HR/recruit/resume!validResume','13','Document'),(22,'面试结果登记','/Y2_HR/recruit/interview!interviewList','14','Document'),(23,'面试筛选','/Y2_HR/recruit/interview!siftList','14','Document'),(24,'录用申请','/Y2_HR/recruit/employ!registerList','15','Document'),(25,'录用审批','/Y2_HR/recruit/employ!checkList','15','Document'),(26,'录用查询','/Y2_HR/recruit/employ!list','15','Document'),(27,'人力资源档案登记','/Y2_HR/profile/profileAction!humanRegister','6','Document'),(28,'人力资源档案登记复核','/Y2_HR/profile/profileAction!checkList','6','Document'),(29,'人力资源档案查询','/Y2_HR/profile/profileAction!toQueryLocate','6','Document'),(30,'人力资源档案变更','/Y2_HR/profile/profileAction!changeLocate','6','Document'),(31,'人力资源档案删除管理',NULL,'6','Folder'),(32,'人力资源档案删除',NULL,'31','Document'),(33,'档案删除恢复',NULL,'31','Document'),(34,'人力资源档案永久删除',NULL,'31','Document'),(35,'薪酬标准登记',NULL,'7','Document'),(36,'薪酬标准登记复核',NULL,'7','Document'),(37,'薪酬标准查询',NULL,'7','Document'),(38,'薪酬标准变更',NULL,'7','Document'),(39,'薪酬发放登记','/Y2_HR/grant/grantAction!registerLocate','8','Document'),(40,'薪酬发放登记复核','/Y2_HR/grant/grantAction!checkList','8','Document'),(41,'薪酬发放查询','/Y2_HR/grant/grantAction!queryList','8','Document'),(42,'调动登记','/Y2_HR/transfer/transferAction!toQueryLocate?majorKindId=0','9','Document'),(43,'调动审核','/Y2_HR/page/transfer/check_list.jsp','9','Document'),(44,'调动查询','/Y2_HR/transfer/transferAction!toQueryLocate2','9','Document'),(45,'人力资源档案管理设置',NULL,'10','Folder'),(46,'薪酬管理设置',NULL,'10','Folder'),(47,'其他设置',NULL,'10','Folder'),(48,' I 级机构设置','/Y2_HR/client/clientAction!findFirsts','45','Document'),(49,' II级机构设置','/Y2_HR/client/clientAction!findSeconds','45','Document'),(50,'III级机构设置','/Y2_HR/client/clientAction!findThirds','45','Document'),(51,'职称设置','/Y2_HR/client/clientAction!findPbcs1','45','Document'),(52,'职位分类设置','/Y2_HR/client/clientAction!findMajorKinds','45','Document'),(53,'职位设置','/Y2_HR/client/clientAction!findMajors','45','Document'),(54,'公共属性设置','/Y2_HR/client/clientAction!findPbcs','45','Document'),(55,'薪酬项目设置','/Y2_HR/client/clientAction!findSsds','46','Document'),(56,'薪酬发放方式设置','/Y2_HR/page/client/salary_grant_mode.jsp','46','Document'),(57,'关键字查询设置','/Y2_HR/client/clientAction!findAllTables','47','Document'),(58,'权限管理',NULL,'0','Folder'),(59,'用户管理','/Y2_HR/urr/powerAction!userList','58','Document'),(60,'Excel标准数据报表','/Y2_HR/data/dataAction!excelLocate','11','Document'),(61,'Pdfl标准数据报表','/Y2_HR/data/dataAction!pdfLocate','11','Document'),(62,'Xmll标准数据报表','/Y2_HR/data/dataAction!xmlLocate','11','Document'),(63,'角色管理','/Y2_HR/urr/powerAction!roleList','58','Document');
/*!40000 ALTER TABLE `right` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_grant`
--

DROP TABLE IF EXISTS `salary_grant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary_grant` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `salary_grant_id` varchar(11) DEFAULT NULL COMMENT '薪酬发放编号',
  `salary_standard_id` varchar(11) DEFAULT NULL COMMENT '薪酬标准编号(外健：salary_standard_details表中standard_id)',
  `first_kind_id` varchar(11) DEFAULT NULL COMMENT '一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）',
  `first_kind_name` varchar(45) DEFAULT NULL COMMENT '一级机构名称 ',
  `second_kind_id` varchar(11) DEFAULT NULL COMMENT '二级机构编号(外健：Config_file_second_kind表中的second_kind_id)',
  `second_kind_name` varchar(45) DEFAULT NULL COMMENT '二级机构名称',
  `third_kind_id` varchar(11) DEFAULT NULL COMMENT '三级机构编号(外健：Config_file_third_kind表中的third_kind_id)',
  `third_kind_name` varchar(45) DEFAULT NULL COMMENT '三级机构名称',
  `human_amount` int(11) DEFAULT NULL COMMENT '总人数 ',
  `salary_standard_sum` double DEFAULT NULL COMMENT '标准薪酬总金额',
  `salary_paid_sum` double DEFAULT NULL COMMENT '实发总金额',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `check_status` int(11) DEFAULT NULL COMMENT '复核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪酬发放登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_grant`
--

LOCK TABLES `salary_grant` WRITE;
/*!40000 ALTER TABLE `salary_grant` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_grant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_grant_details`
--

DROP TABLE IF EXISTS `salary_grant_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary_grant_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `salary_grant_id` varchar(11) DEFAULT NULL COMMENT '薪酬发放编号(外健：Salary_grant表中salary_grant_id)',
  `human_id` varchar(11) DEFAULT NULL COMMENT '档案编号(外健：human_file表中human_id)',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `bouns_sum` double DEFAULT NULL COMMENT '奖励金额',
  `sale_sum` double DEFAULT NULL COMMENT ' 销售绩效金额',
  `deduct_sum` double DEFAULT NULL COMMENT '应扣金额',
  `salary_standard_sum` double DEFAULT NULL COMMENT '标准薪酬总额',
  `salary_grant_detailscol` double DEFAULT NULL COMMENT '实发薪酬总额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪酬发放详细信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_grant_details`
--

LOCK TABLES `salary_grant_details` WRITE;
/*!40000 ALTER TABLE `salary_grant_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_grant_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_standard`
--

DROP TABLE IF EXISTS `salary_standard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary_standard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `standard_id` varchar(11) DEFAULT NULL COMMENT '薪酬标准单编号(外健：Salary_standard_details表中standard_id)',
  `standard_name` varchar(45) DEFAULT NULL COMMENT '薪酬标准单名称',
  `designer` varchar(45) DEFAULT NULL COMMENT '制定者名字',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人',
  `changer` varchar(45) DEFAULT NULL COMMENT ' 变更人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `change_time` date DEFAULT NULL COMMENT '变更时间',
  `salary_sum` double DEFAULT NULL COMMENT '薪酬总额',
  `check_status` int(11) DEFAULT NULL COMMENT '是否经过复核(1：通过 2:未通过)',
  `change_status` int(11) DEFAULT NULL COMMENT ' 更改状态 ',
  `check_comment` varchar(45) DEFAULT NULL COMMENT '复核意见 ',
  `remark` varchar(45) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='薪酬标准基本信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_standard`
--

LOCK TABLES `salary_standard` WRITE;
/*!40000 ALTER TABLE `salary_standard` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_standard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_standard_details`
--

DROP TABLE IF EXISTS `salary_standard_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary_standard_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `standard_id` int(11) DEFAULT NULL COMMENT '薪酬标准单编号',
  `standard_name` varchar(45) DEFAULT NULL COMMENT '薪酬标准单名称',
  `item_id` int(11) DEFAULT NULL COMMENT '薪酬项目序号 ',
  `item_name` varchar(45) DEFAULT NULL COMMENT '薪酬项目名称',
  `salary` double DEFAULT NULL COMMENT '薪酬金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='薪酬标准单详细信息 ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_standard_details`
--

LOCK TABLES `salary_standard_details` WRITE;
/*!40000 ALTER TABLE `salary_standard_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_standard_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长',
  `role_name` varchar(45) DEFAULT NULL COMMENT '''角色名称''',
  `role_desc` varchar(45) DEFAULT NULL COMMENT '角色描述',
  `role_flag` int(11) DEFAULT NULL COMMENT '角色状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='角色';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES (1,'人事专员','管理人事的人',0),(2,'人事经理','管理人事的人的大哥',1),(3,'薪酬专员',NULL,1),(4,'薪酬经理',NULL,1),(5,'招聘专员','',0),(6,'招聘经理',NULL,1),(7,'应聘者','',0),(8,'系统管理员','系统管理员，可以管理所有的权限',1),(10,'长沙发','sssdss水手sss',1),(11,'测试','test',1),(12,'手动阀','sdfsaf',1),(13,'说法','是',1),(14,'说法是否','十大首富',1);
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_right`
--

DROP TABLE IF EXISTS `sys_role_right`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `right_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=307 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_right`
--

LOCK TABLES `sys_role_right` WRITE;
/*!40000 ALTER TABLE `sys_role_right` DISABLE KEYS */;
INSERT INTO `sys_role_right` VALUES (7,2,2),(19,10,5),(20,10,12),(21,10,16),(22,10,17),(23,10,18),(24,10,13),(25,10,19),(26,10,20),(27,10,21),(28,10,14),(29,10,22),(30,10,23),(31,10,15),(32,10,24),(33,10,25),(34,10,26),(35,10,58),(36,10,59),(37,10,63),(156,8,5),(157,8,12),(158,8,16),(159,8,17),(160,8,18),(161,8,13),(162,8,19),(163,8,20),(164,8,21),(165,8,14),(166,8,22),(167,8,23),(168,8,15),(169,8,24),(170,8,25),(171,8,26),(172,8,6),(173,8,27),(174,8,28),(175,8,29),(176,8,30),(177,8,31),(178,8,32),(179,8,33),(180,8,34),(181,8,7),(182,8,35),(183,8,36),(184,8,37),(185,8,38),(186,8,8),(187,8,39),(188,8,40),(189,8,41),(190,8,9),(191,8,42),(192,8,43),(193,8,44),(194,8,10),(195,8,45),(196,8,48),(197,8,49),(198,8,50),(199,8,51),(200,8,52),(201,8,53),(202,8,54),(203,8,46),(204,8,55),(205,8,56),(206,8,47),(207,8,57),(208,8,11),(209,8,60),(210,8,61),(211,8,62),(212,8,58),(213,8,59),(214,8,63),(215,5,5),(216,5,12),(217,5,16),(218,5,17),(219,5,18),(220,5,13),(221,5,19),(222,5,20),(223,5,21),(224,5,14),(225,5,22),(226,5,23),(227,5,15),(228,5,24),(229,5,25),(230,5,26),(249,1,17),(250,1,26),(251,1,5),(252,1,18),(253,1,6),(254,1,13),(255,1,12),(256,1,16),(257,1,19),(258,1,17),(259,1,20),(260,1,18),(261,1,21),(262,1,13),(263,1,14),(264,1,19),(265,1,22),(266,1,20),(267,1,23),(268,1,21),(269,1,15),(270,1,14),(271,1,24),(272,1,22),(273,1,25),(274,1,23),(275,1,26),(276,1,15),(277,1,6),(278,1,24),(279,1,25),(280,1,26),(281,1,6),(282,14,5),(283,14,12),(284,14,16),(285,14,17),(286,14,18),(287,14,13),(288,14,19),(289,14,20),(290,14,21),(291,14,14),(292,14,22),(293,14,23),(294,14,15),(295,14,24),(296,14,25),(297,14,26),(298,14,6),(299,14,27),(300,14,28),(301,14,29),(302,14,30),(303,14,31),(304,14,32),(305,14,33),(306,14,34);
/*!40000 ALTER TABLE `sys_role_right` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `training`
--

DROP TABLE IF EXISTS `training`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `major_kind_id` varchar(11) DEFAULT NULL COMMENT '职位分类编号(外健：Config_major_kind表中的major_kind_id)',
  `major_kind_name` varchar(45) DEFAULT NULL COMMENT '职位分类名称',
  `major_id` varchar(11) DEFAULT NULL COMMENT '职位编号(外健：Config_major 表中的major_id)',
  `major_name` varchar(45) DEFAULT NULL COMMENT '职位名称',
  `human_id` varchar(11) DEFAULT NULL COMMENT '人力资源档案编号(外健：Human_file表中human_id)',
  `human_name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `training_item` varchar(45) DEFAULT NULL COMMENT '培训项目',
  `training_time` date DEFAULT NULL COMMENT '培训时间 ',
  `training_degree` varchar(11) DEFAULT NULL COMMENT '培训成绩等级',
  `training_hour` int(11) DEFAULT NULL COMMENT '培训课时',
  `register` varchar(45) DEFAULT NULL COMMENT '登记人',
  `checker` varchar(45) DEFAULT NULL COMMENT '复核人',
  `regist_time` date DEFAULT NULL COMMENT '登记时间',
  `check_time` date DEFAULT NULL COMMENT '复核时间',
  `checkstatus` int(11) DEFAULT NULL COMMENT '培训复核状态',
  `remark` varchar(450) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='培训登记表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training`
--

LOCK TABLES `training` WRITE;
/*!40000 ALTER TABLE `training` DISABLE KEYS */;
/*!40000 ALTER TABLE `training` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) DEFAULT NULL COMMENT '用户名',
  `user_true_name` varchar(60) DEFAULT NULL COMMENT '真实姓名',
  `user_password` varchar(60) DEFAULT NULL COMMENT '密码',
  `user_role_id` int(11) DEFAULT NULL COMMENT '权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','张三','123456',8),(2,'jimmy','杰克','111',2),(3,'admin1','tom','123456',3),(5,'bbbbbb','威威','123456',5),(6,'abcdef','公司','123456',1),(7,'aaaaaa','威威','aaaaaa',3),(9,'sssssss','fsadaf','123456',14);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-01-08  9:12:49

-- 删除旧表 (存在时)
DROP TABLE IF EXISTS `test`;

-- 创建新表（带完整注释）
CREATE TABLE `test` (
                        `id` BIGINT NOT NULL COMMENT '主键ID',
                        `name` VARCHAR(50) COMMENT '用户名称',
                        `password` VARCHAR(50) COMMENT '用户密码',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB
 DEFAULT CHARSET=utf8mb4
 COMMENT='测试用基础表';

insert into test values (1, '测试', 'password');






drop table if exists `ebook`;

create table `ebook` (
                         `id` bigint not null comment 'id',
                         `name` varchar(50) comment '名称',
                         `category1_id` bigint comment '分类1',
                         `category2_id` bigint comment '分类2',
                         `description` varchar(200) comment '描述',
                         `cover` varchar(200) comment '封面',
                         `doc_count` int comment '文档数',
                         `view_count` int comment '阅读数',
                         `vote_count` int comment '点赞数',
                         primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='电子书';

insert into `ebook` (id, name, description)
values (1, 'Spring Boot入门教程', '零基础入门Java开发，企业级应用开发最佳首选框架');

insert into `ebook` (id, name, description)
values (2, 'Vue入门教程', '零基础入门Vue开发，企业级应用开发最佳首选框架');

insert into `ebook` (id, name, description)
values (3, 'Python入门教程', '零基础入门Python开发，企业级应用开发最佳首选框架');

insert into `ebook` (id, name, description)
values (4, 'MySQL入门教程', '零基础入门MySQL开发，企业级应用开发最佳首选框架');

insert into `ebook` (id, name, description)
values (5, 'Oracle入门教程', '零基础入门Oracle开发，企业级应用开发最佳首选框架');






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


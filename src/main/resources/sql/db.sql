CREATE TABLE `user` (
                        `user_id` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `country` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `province` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `city` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `gender` int(11) NOT NULL,
                        `lang` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `nick_name` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `avatar_url` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `score` int(11) NOT NULL DEFAULT '0',
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `user_user_id_uindex` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='user table'


CREATE TABLE `task` (
                        `task_id` int(11) NOT NULL AUTO_INCREMENT,
                        `user_id` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `title` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `start_time` datetime NOT NULL,
                        `end_time` datetime NOT NULL,
                        `priority` int(11) NOT NULL,
                        `detail` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `status` int(11) NOT NULL DEFAULT '0',
                        PRIMARY KEY (`task_id`),
                        KEY `task_table_user_id_fk` (`user_id`),
                        CONSTRAINT `task_table_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

CREATE TABLE `comment` (
                           `comment_id` int(11) NOT NULL AUTO_INCREMENT,
                           `user_id` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
                           `comment_time` datetime NOT NULL,
                           `comment_detail` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                           PRIMARY KEY (`comment_id`),
                           KEY `comment_user_user_id_fk` (`user_id`),
                           CONSTRAINT `comment_user_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
CREATE TABLE `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
  `manager` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

CREATE TABLE `group_binding` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `user_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- auto-generated definition
create table time
(
    id          int auto_increment
        primary key,
    userId      int           not null,
    length      int default 0 not null,
    create_time varchar(36)   not null
);




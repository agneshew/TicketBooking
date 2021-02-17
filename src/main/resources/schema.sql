--liquibase formatted sql
--changeset author: agnes context: development
CREATE TABLE `users` (
    `email` VARCHAR(254) NOT NULL PRIMARY KEY,
    `passwordHash` VARCHAR(68) NOT NULL,
    `token` VARCHAR(68) NULL,
    `active` BOOL NOT NULL DEFAULT 0,
    `deleted` BOOL NOT NULL DEFAULT 0
);

DROP SCHEMA IF EXISTS `Faction`;

DROP TABLE IF EXISTS `Faction`.`faction_stats`;
DROP TABLE IF EXISTS `Faction`.`faction_members`;
DROP TABLE IF EXISTS `Faction`.`faction_raids`;
DROP TABLE IF EXISTS `Faction`.`faction_allies`;
DROP TABLE IF EXISTS `Faction`.`faction_perms`;
DROP TABLE IF EXISTS `Faction`.`faction_gifts`;
DROP TABLE IF EXISTS `Faction`.`faction_ranking`;

CREATE SCHEMA IF NOT EXISTS `Faction` DEFAULT CHARACTER SET utf8 ;
USE `Faction` ;

CREATE TABLE IF NOT EXISTS `Faction`.`faction_perms`
(
    `faction_id`                    INT,
    `group_perm_raidgui`            SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_raidgui BETWEEN 1 AND 4),
    `group_perm_raidjoin`           SMALLINT NOT NULL DEFAULT 3 CHECK(group_perm_raidjoin BETWEEN 1 AND 4),
    `group_perm_inventories`        SMALLINT NOT NULL DEFAULT 3 CHECK(group_perm_inventories BETWEEN 1 AND 4),
    `group_perm_interact`           SMALLINT NOT NULL DEFAULT 4 CHECK(group_perm_interact BETWEEN 1 AND 4),
    `group_perm_build`              SMALLINT NOT NULL DEFAULT 3 CHECK(group_perm_build BETWEEN 1 AND 4),
    `group_perm_invitePlayers`      SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_invitePlayers BETWEEN 1 AND 4),
    `group_perm_uninvitePlayers`    SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_uninvitePlayers BETWEEN 1 AND 4),
    `group_perm_promoteMembers`     SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_promoteMembers BETWEEN 1 AND 4),
    `group_perm_demoteMembers`      SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_demoteMembers BETWEEN 1 AND 4),  
    `group_perm_kickMembers`        SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_kickMembers BETWEEN 1 AND 4),
    `group_perm_allyFactions`       SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_allyFactions BETWEEN 1 AND 4),
    `group_perm_unallyFactions`     SMALLINT NOT NULL DEFAULT 2 CHECK(group_perm_unallyFactions BETWEEN 1 AND 4),
    `group_perm_withdrawFunds`      SMALLINT NOT NULL DEFAULT 1 CHECK(group_perm_withdrawFunds BETWEEN 1 AND 4),
    PRIMARY KEY (faction_id)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_stats`
(
    `faction_id`                INT AUTO_INCREMENT,
    `faction_name`              VARCHAR(15) NOT NULL,
    `server`                    VARCHAR(3) NOT NULL,
    `faction_experience`        INT DEFAULT 0 CHECK(faction_experience>=0),
    `faction_x_coordinate`      INT NOT NULL,
    `faction_z_coordinate`      INT NOT NULL,
    `faction_energy`            TINYINT DEFAULT 20 CHECK(energy>=0),
    `faction_plot_type`         TINYINT DEFAULT 0,
    `faction_points`            SMALLINT DEFAULT 0 CHECK(points>=0),
    `faction_balance`           FLOAT DEFAULT 0.0 CHECK(balance>=0),
    `faction_protection_date`   DATE,
    `faction_last_online_date`  VARCHAR(10) DEFAULT 'now',
    `faction_banner`            TEXT,
    PRIMARY KEY (`faction_id`),
    FOREIGN KEY (faction_id) REFERENCES faction_perms(faction_id)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_allies`
(
    `faction_id`                INT,
    `faction_ally`              INT,
    PRIMARY KEY (faction_id, faction_ally),
    FOREIGN KEY (faction_id) REFERENCES faction_stats(faction_id),
    FOREIGN KEY (faction_id) REFERENCES faction_perms(faction_id),
    FOREIGN KEY (faction_ally) REFERENCES faction_stats(faction_id)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_raids`
(
    `faction_id`                INT,
    `raid_date`                 DATE,
    `raid_points`               SMALLINT NOT NULL CHECK(raid_points>=0),
    `raid_opponent`             INT NOT NULL,
    PRIMARY KEY (`faction_id`, `raid_date`),
    FOREIGN KEY (`faction_id`) REFERENCES faction_stats(faction_id),
    FOREIGN KEY (`raid_opponent`) REFERENCES faction_stats(faction_id)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_ranking`
(
    `faction_rank`                  INT AUTO_INCREMENT,
    `faction_id`                    INT,
    PRIMARY KEY(faction_rank, faction_id),
    FOREIGN KEY (faction_id) REFERENCES faction_stats(faction_id),
    FOREIGN KEY (faction_id) REFERENCES faction_perms(faction_id)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_gifts`
(
    `member_gift_uuid`              VARCHAR(36),
    `member_gift_date`              DATE NOT NULL,
    PRIMARY KEY (member_gift_uuid)
);

CREATE TABLE IF NOT EXISTS `Faction`.`faction_members` 
(
    `faction_member_uuid`       VARCHAR(36),
    `faction_id`                INT NOT NULL,
    `faction_member_type`       SMALLINT NOT NULL CHECK(faction_member_type BETWEEN 1 AND 4),
    PRIMARY KEY (`faction_member_uuid`),
    FOREIGN KEY (faction_id) REFERENCES faction_stats(faction_id),
    FOREIGN KEY (faction_id) REFERENCES faction_perms(faction_id),
    FOREIGN KEY (faction_member_uuid) REFERENCES faction_gifts(member_gift_uuid)
);

ALTER TABLE `Faction`.`faction_perms`
ADD CONSTRAINT faction_perms_stats_fk
FOREIGN KEY faction_perms(faction_id)
REFERENCES faction_stats(faction_id);

ALTER TABLE `Faction`.`faction_gifts`
ADD CONSTRAINT faction_gifts_members_fk
FOREIGN KEY faction_gifts(member_gift_uuid)
REFERENCES faction_members(faction_member_uuid);

CREATE TRIGGER before_insert_faction_gifts
  BEFORE INSERT ON faction_gifts 
  FOR EACH ROW
  SET new.member_gift_date = CURRENT_TIMESTAMP;

CREATE TRIGGER before_insert_faction_stats
  BEFORE INSERT ON faction_stats 
  FOR EACH ROW
  SET new.faction_protection_date = DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 3 DAY);
CREATE TABLE `Artikel` (
	`article_id` int(255) NOT NULL AUTO_INCREMENT,
	`article_text` TEXT NOT NULL,
	`author` varchar NOT NULL,
	PRIMARY KEY (`article_id`)
);

CREATE TABLE `Video` (
	`video_id` int(255) NOT NULL AUTO_INCREMENT,
	`lengthInSeconds` INT(255) NOT NULL,
	`resolution` varchar NOT NULL,
	`photographer` varchar NOT NULL,
	PRIMARY KEY (`video_id`)
);

CREATE TABLE `Billede` (
	`billede_id` int(255) NOT NULL AUTO_INCREMENT,
	`file_type` varchar NOT NULL,
	`width` int(255) NOT NULL,
	`height` int(255) NOT NULL,
	`photographer` varchar NOT NULL,
	PRIMARY KEY (`billede_id`)
);


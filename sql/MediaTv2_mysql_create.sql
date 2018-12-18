CREATE TABLE `Artikel` (
	`article_id` int NOT NULL AUTO_INCREMENT,
	`article_text` TEXT NOT NULL,
	`author` varchar NOT NULL,
	PRIMARY KEY (`article_id`)
);

CREATE TABLE `Video` (
	`video_id` int NOT NULL AUTO_INCREMENT,
	`lengthInSeconds` INT NOT NULL,
	`resolution` varchar NOT NULL,
	`photographer` varchar NOT NULL,
	PRIMARY KEY (`video_id`)
);

CREATE TABLE `Billede` (
	`billede_id` int NOT NULL AUTO_INCREMENT,
	`file_type` varchar NOT NULL,
	`width` int NOT NULL,
	`height` int NOT NULL,
	`photographer` varchar NOT NULL,
	PRIMARY KEY (`billede_id`)
);


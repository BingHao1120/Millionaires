DROP database IF EXISTS dbQuestion;

CREATE database dbQuestion;

CREATE TABLE dbQuestion.questions
(
	qID int auto_increment,
	qContent varchar(50),

	PRIMARY KEY(qID)
);

CREATE TABLE dbQuestion.correctAns
(
	caID int auto_increment,
	caContent varchar(50),
	qID int,
	
	PRIMARY KEY(caID)
);

ALTER TABLE dbQuestion.correctAns
ADD FOREIGN KEY(qID) references dbQuestion.questions(qID);

CREATE TABLE dbQuestion.wrongAns
(
	waID int auto_increment,
	waContent varchar(50),
	
	PRIMARY KEY(waID)
);

CREATE TABLE dbQuestion.questions_wrongAns
(
	qID int,
	waID int,

	PRIMARY KEY(qID, waID)
);

ALTER TABLE dbQuestion.questions_wrongAns 
ADD FOREIGN KEY(qID) references dbQuestion.questions(qID),
ADD FOREIGN KEY(waID) references dbQuestion.wrongAns(waID);
	
	
	
	
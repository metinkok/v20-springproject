CREATE TABLE USERS(
	ID SERIAL NOT NULL UNIQUE,
	NAME TEXT NOT NULL,
	E_MAIL TEXT NOT NULL UNIQUE,
	PASSWORD TEXT NOT NULL,
	ADMN INTEGER,
	STORYTELLER INTEGER
);

CREATE TABLE CHARACTERS(
	ID SERIAL NOT NULL UNIQUE,
	NAME TEXT,
	CLAN TEXT,
	CONCEPT TEXT,
	DEMEANOR TEXT,
	GENERATION INTEGER,
	NPC INTEGER,
	BACKSTORY TEXT
);

CREATE TABLE ATTRIBUTES(
	ID INTEGER NOT NULL UNIQUE,
	STRENGTH INTEGER NOT NULL,
	DEXTERITY INTEGER NOT NULL,
	STAMINA INTEGER NOT NULL,
	CHARISMA INTEGER NOT NULL,
	MANIPULATION INTEGER NOT NULL,
	APPERANCE INTEGER NOT NULL,
	PERCEPTION INTEGER NOT NULL,
	INTELLIGENCE INTEGER NOT NULL,
	WITS INTEGER NOT NULL,
	
	FOREIGN KEY (ID) REFERENCES CHARACTERS(ID)
);

CREATE TABLE ABILITIES(
	ID INTEGER NOT NULL UNIQUE,
	ALERTNESS INTEGER NOT NULL,
	ATHLETICS INTEGER NOT NULL,
	AWARENESS INTEGER NOT NULL,
	BRAWL INTEGER NOT NULL,
	EMPATHY INTEGER NOT NULL,
	EXPRESSION INTEGER NOT NULL,
	INTIMIDATION INTEGER NOT NULL,
	LEADERSHIP INTEGER NOT NULL,
	STREETWISE INTEGER NOT NULL,
	SUBTERFUGE INTEGER NOT NULL,
	ANIMALKEN INTEGER NOT NULL,
	CRAFT INTEGER NOT NULL,
	DRIVE INTEGER NOT NULL,
	ETIQUETTE INTEGER NOT NULL,
	FIREARMS INTEGER NOT NULL,
	LARCENY INTEGER NOT NULL,
	MELEE INTEGER NOT NULL,
	PERFORMANCE INTEGER NOT NULL,
	STEALTH INTEGER NOT NULL,
	SURVIVAL INTEGER NOT NULL,
	ACADEMICS INTEGER NOT NULL,
	COMPUTER INTEGER NOT NULL,
	FINANCE INTEGER NOT NULL,
	INVESTIGATION INTEGER NOT NULL,
	LAW INTEGER NOT NULL,
	MEDICINE INTEGER NOT NULL,
	OCCULT INTEGER NOT NULL,
	POLITICS INTEGER NOT NULL,
	SCIENCE INTEGER NOT NULL,
	TECHNOLOGY INTEGER NOT NULL,
	
	FOREIGN KEY (ID) REFERENCES CHARACTERS(ID)
);

CREATE TABLE DISCIPLINES(
	ID SERIAL NOT NULL UNIQUE,
	NAME TEXT NOT NULL
);

CREATE TABLE LOCATIONS(
	ID SERIAL NOT NULL UNIQUE,
	NAME TEXT NOT NULL UNIQUE,
	ADDRESS TEXT
);

CREATE TABLE CHARACTERDISCIPLINE(
	ID SERIAL NOT NULL UNIQUE,
	CHARACTERID INTEGER NOT NULL,
	DISCIPLINEID INTEGER NOT NULL,
	POINTS INTEGER NOT NULL,
	
	FOREIGN KEY (CHARACTERID) REFERENCES CHARACTERS(ID),
	FOREIGN KEY (DISCIPLINEID) REFERENCES DISCIPLINES(ID)
);

CREATE TABLE BLOODHUNT(
	ID SERIAL NOT NULL UNIQUE,
	CITIES TEXT NOT NULL,
	CHARACTERID INTEGER NOT NULL,
	REDLIST INTEGER NOT NULL,
	
	FOREIGN KEY (CHARACTERID) REFERENCES CHARACTERS(ID)
);


CREATE TABLE NPCLOCATION(
	ID SERIAL NOT NULL UNIQUE,
	CHARACTERID INTEGER NOT NULL,
	LOCATIONID INTEGER NOT NULL,
	
	FOREIGN KEY (CHARACTERID) REFERENCES CHARACTERS(ID),
	FOREIGN KEY (LOCATIONID) REFERENCES LOCATIONS(ID)
);

CREATE TABLE POSTS(
	ID SERIAL NOT NULL UNIQUE,
	TITLE TEXT NOT NULL,
	POST TEXT NOT NULL
);

CREATE TABLE MESSAGES(
	ID SERIAL NOT NULL UNIQUE,
	MESSAGE TEXT NOT NULL,
	CHARACTERID INTEGER NOT NULL,
	
	FOREIGN KEY (CHARACTERID) REFERENCES CHARACTERS(ID)
);
CREATE TABLE CHARACTER_POSTS(
	ID SERIAL NOT NULL UNIQUE,
	CHARACTERID INTEGER NOT NULL,
	POSTID INTEGER NOT NULL,
	
	FOREIGN KEY (CHARACTERID) REFERENCES CHARACTERS(ID),
	FOREIGN KEY (POSTID) REFERENCES POSTS(ID)
);
CREATE TABLE MESSAGES_POSTS(
	ID SERIAL NOT NULL UNIQUE,
	MESSAGEID INTEGER NOT NULL,
	POSTID INTEGER NOT NULL,
	
	FOREIGN KEY (MESSAGEID) REFERENCES MESSAGES(ID),
	FOREIGN KEY (POSTID) REFERENCES POSTS(ID)
);

INSERT INTO DISCIPLINES (NAME) VALUES ('Animalism');
INSERT INTO DISCIPLINES (NAME) VALUES ('Auspex');
INSERT INTO DISCIPLINES (NAME) VALUES ('Celerity');
INSERT INTO DISCIPLINES (NAME) VALUES ('Chimestry');
INSERT INTO DISCIPLINES (NAME) VALUES ('Demention');
INSERT INTO DISCIPLINES (NAME) VALUES ('Dominate');
INSERT INTO DISCIPLINES (NAME) VALUES ('Fortitude');
INSERT INTO DISCIPLINES (NAME) VALUES ('Necromancy');
INSERT INTO DISCIPLINES (NAME) VALUES ('Obfuscate');
INSERT INTO DISCIPLINES (NAME) VALUES ('Potence');
INSERT INTO DISCIPLINES (NAME) VALUES ('Presence');
INSERT INTO DISCIPLINES (NAME) VALUES ('Protean');
INSERT INTO DISCIPLINES (NAME) VALUES ('Quietus');
INSERT INTO DISCIPLINES (NAME) VALUES ('Serpentis');
INSERT INTO DISCIPLINES (NAME) VALUES ('Thaumaturgy');
INSERT INTO DISCIPLINES (NAME) VALUES ('Vicissitude');
CREATE TABLE Student(
 StudentNumber varchar(7) not null primary key,
 StudentName varchar(255),
 StudentAddress text,
 StudentYear varchar(255),
 StudentEmail varchar(255)
);

INSERT INTO Student VALUES ("a123456","Saara","Hattulantie 2","Vuosi 1","saara@myy.haaga-helia.fi"),("a626262","Heidi","Kumpulantie 2","Vuosi 3","heidi@myy.haaga-helia.fi"),("a525242","Laura","Ansatie 4","Vuosi 2","laura@myy.haaga-helia.fi");
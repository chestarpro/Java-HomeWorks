create table Trainers(
ID integer unique primary key not null,
Full_Name varchar not null,
Shift time not null
);

create table visitors(
ID integer unique primary key not null,
Full_Name varchar not null,
Date_of_Birth date not null ,
Gender varchar not null
);

create table Visits(
	Visitor integer references Visitors(ID),
	Visit_Time timestamp,
	Trainer integer references Trainers(ID)
);

--Создаем таблицу trainers
create table trainers(
	ID integer unique primary key not null,
	Full_Name varchar not null,
	Start_Of_Shift time not null,
	End_Of_Shift time not null
);

--Создаем таблицу visitors
create table visitors(
	ID integer unique primary key not null,
	Full_Name varchar not null,
	Date_of_Birth date not null ,
	Gender varchar not null
);

--Создаем таблицу visits
create table visits(
	Visitor integer references Visitors(ID),
	Visit_Time timestamp,
	Trainer integer references Trainers(ID)
);

--Заполняем в тоблицу trainers
insert into trainers (ID, full_name,  Start_Of_Shift, End_Of_Shift)
values (1,'Trainer1', '09:00', '11:45'),
       (2,'Trainer2', '12:00', '14:45'),
       (3,'Trainer3', '15:00', '17:45'),
       (4,'Trainer4', '18:00', '20:45');
      commit;
     
--Заполняем в тоблицу visitors  
insert into visitors (ID, full_name, date_of_birth, gender)
values (1, 'Visitor1', '2000-01-01', 'man'),
       (2, 'Visitor2', '2001-02-01', 'woman'),
       (3, 'Visitor3', '2002-03-01', 'man'),
       (4, 'Visitor3', '1999-04-01', 'woman'),
       (5, 'Visitor2', '2001-05-01', 'man'),
       (6, 'Visitor3', '2002-06-01', 'man'),
       (7, 'Visitor3', '1999-07-01', 'woman'),
       (8, 'Visitor3', '1999-08-01', 'man');
      commit;
     
--Заполняем в тоблицу visits     
insert into visits (visitor, visit_time) 
values (1, '2021-01-01 09:00'), 
       (2, '2021-01-02 09:00'), 
       (3, '2021-01-01 12:00'),
       (4, '2021-01-02 12:00'),
       (5, '2021-01-01 15:00'), 
       (6, '2021-01-02 15:00'),
       (7, '2021-01-01 18:00'),
       (8, '2021-01-02 18:00');
       commit;
      
--Тут добавляются в тоблицу visits тренера по своим сменам.
     
      update visits           
      set trainer = 1
      where cast(visit_time as time) = '09:00';
      update visits
      set trainer = 2
      where cast(visit_time as time) = '12:00';
      update visits 
      set trainer = 3
      where cast(visit_time as time) = '15:00';
      update visits 
      set trainer = 4
      where cast(visit_time as time) = '18:00';
      commit;
      

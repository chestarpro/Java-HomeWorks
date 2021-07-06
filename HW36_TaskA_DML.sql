insert into trainers (ID, full_name, shift)
values (1,'Trainer1', '09:00:00'),
       (2,'Trainer1', '14:00:00'),
       (3,'Trainer1', '17:00:00');
      commit;

insert into visitors (ID, full_name, date_of_birth, gender)
values (1, 'Visitor1', '2000-01-01', 'man'),
       (2, 'Visitor2', '2001-02-01', 'woman'),
       (3, 'Visitor3', '2002-03-01', 'man');
      commit;

insert into visits (visitor, visit_time) 
values (1, '2021-01-01 09:00'), 
       (2, '2021-01-01 14:00'), 
       (3, '2021-01-01 17:00');
       commit;
      
      update visits 
      set trainer = 1
      where visit_time = '2021-01-01 09:00';
      update visits 
      set trainer = 2
      where visit_time = '2021-01-01 14:00';
      update visits 
      set trainer = 3
      where visit_time = '2021-01-01 17:00';
      commit;
--for testing prouposes we add the next line
--drop database if exists BancoPalabras;
--if we're not testing  we delete of comment the prevoius line
--we create the database
--create database BancoPalabras;
-- then we create the tables
create table animalesDificl(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table animalesFacil(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table animalesMedio(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table herramientasDificl(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table herramientasFacil(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table herramientasMedio(ID SERIAL primary key,
			    Palabra varchar(60) not null);
			    
create table nombresDificl(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table nombresFacil(ID SERIAL primary key,
			    Palabra varchar(60) not null);

create table nombresMedio(ID SERIAL primary key,
			    Palabra varchar(60) not null);

--then we insert the values for each table
insert into animalesDificl(Palabra)  values('RINOCERONTE'),
					   ('ELEFANTE'),
					   ('MANATI'),
					   ('PERESOSO'),
					   ('ORNITORINCO');
					     
insert into animalesFacil(Palabra)  values('PERRO'),
					  ('GATO'),
					  ('RATON'),
					  ('OSO'),
					  ('VACA');
					     
insert into animalesMedio(Palabra)  values('CANGREJO'),
					  ('LEOPARDO'),
					  ('TIBURON'),
					  ('DELFIN'),
					  ('MURCIELAGO');

insert into herramientasDificl(Palabra)  values('ESPECTROFOTOMETRO'),
					        ('BAROMETRO'),
					        ('CALORIMETRO'),
					        ('ESTETOSCOPIO'),
					        ('MOTOSIERRA');
					     
insert into herramientasFacil(Palabra)  values('DESARMADOR'),
					      ('MARTILLO'),
					      ('PINZAS'),
					      ('SEGUETA'),
					      ('PERFORADORA');
					     
insert into herramientasMedio(Palabra)  values('ESCALIMETRO'),
					      ('MICROSCOPIO'),
					      ('EXTRACTOR'),
					      ('TALADRO'),
					      ('TIJERAS');
					     
insert into nombresDificl(Palabra)  values('AIMON'),
					   ('TEOFILO'),
					   ('NEPOMUCENO'),
					   ('SCHNEIDER'),
					   ('VLADIMIR');
					     
insert into nombresFacil(Palabra)  values('JOSE'),
					 ('JUAN'),
					 ('LUIS'),
					 ('RENE'),
					 ('PEDRO');
					     
insert into nombresMedio(Palabra)  values('ALEJANDRO'),
					 ('MANUEL'),
					 ('CRISTINA'),
					 ('SERGIO'),
					 ('ANDREA');
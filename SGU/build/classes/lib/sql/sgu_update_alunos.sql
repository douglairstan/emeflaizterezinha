update alunos set prenome_dpalunos = 'GUILHERME NAOTTO ARAKAKI', sobrenome_dpalunos = 'LEONARDO', agnome_dpalunos = '', nomecompleto_dpalunos = 'GUILHERME NAOTTO ARAKAKI LEONARDO', dn_dpalunos = '03/03/2004', sexo_dfalunos = 'M' where ra_dpalunos = '106.334.780-4';
update registro_matricula set rm_regmatr = 6 where ra_dpalunos = '106.334.780-4';
insert into historico_alunos values (nextval('sid_his_alunos'), (select current_date), (select current_time), '106.334.780-4','GUILHERME NAOTTO ARAKAKI','LEONARDO','','GUILHERME NAOTTO ARAKAKI LEONARDO','03/03/2004','M',FALSE);
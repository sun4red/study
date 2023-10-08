create table study_type(
part varchar2(100) primary key);

drop table study_memorize;

create table study_memorize(
part varchar2(100) references study_type(part),
term varchar2(500),
def varchar2(2000));

drop sequence study_memorize_num;
alter table study_memorize modify (num default study_memorize_num.nextval);
create sequence study_memorize_num increment by 1 start with 1;

select rownum, part, term from study_memorize;
select * from study_type;

delete study_memorize where part = null;

insert into study_type part values('DB');

insert into study_memorize (part, term, def) values ('DB', 'test','test');
insert into study_memorize (num, part, term, def) values (study_memorize_num.nextval, 'DB', 'test','test');

delete study_memorize;

insert into study_type values('프로세스');

select term from (select rownum num, term from study_memorize) where num = 3;

select rownum num, term from study_memorize;
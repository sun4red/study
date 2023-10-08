insert into sorting_type values('insert');
insert into sorting_type values('selection');
insert into sorting_type values('bubble');

select * from sorting_type;
select * from sort_result;

insert into sort_result(type, list_length, executions, changes, ex_date)
values('insert','4','1','2',sysdate);

delete sort_result;

select to_char(ex_date, 'YY-MM-DD-hh-mi-ss') from sort_result;

select round(avg(executions),3) as "평균 실행 수", round(avg(changes),3) as "평균 자료 교환 수" from sort_result where type='insert' and list_length='10';
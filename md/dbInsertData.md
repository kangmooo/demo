# DB insert data
* create Table
```
create table if not exists test_table
(
	id bigint,
	name varchar
);

comment on table test_table is 'test';
alter table test_table owner to postgres;
```
* insert data
```
 insert into test_table (id, name) values (1,'강성태'), (2,'김창수'), (3,'임명섭'), (4,'최인호')
```

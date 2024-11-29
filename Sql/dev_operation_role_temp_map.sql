create table if not exists dev_operation_role_temp_map(
role_id Integer not null,
activity_id Integer null,
template_id Integer null,
access_type varchar(255) null,
is_active char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint dev_operation_role_temp_map_pk primary key(role_id));
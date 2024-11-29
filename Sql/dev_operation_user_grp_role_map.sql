create table if not exists dev_operation_user_grp_role_map(
dev_ops_user_grp_id Integer not null,
role_id Integer null,
is_active char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint dev_operation_user_grp_role_map_pk primary key(dev_ops_user_grp_id));
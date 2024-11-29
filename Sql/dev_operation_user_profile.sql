create table if not exists dev_operation_user_profile(
dev_ops_user_id varchar(255) not null,
dev_ops_user_name varchar(255) null,
email_id varchar(255) null,
dev_ops_user_status varchar(255) null,
contact_id varchar(255) null,
address_id varchar(255) null,
org_unit varchar(255) null,
bu_unit varchar(255) null,
cost_centre varchar(255) null,
manager_id varchar(255) null,
is_active char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint dev_operation_user_profile_pk primary key(dev_ops_user_id));
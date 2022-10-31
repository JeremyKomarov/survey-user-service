DROP TABLE user IF EXISTS ;

CREATE TABLE user (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL,
    last_name varchar(300) NOT NULL,
    email varchar(300) NOT NULL,
    age int(11) unsigned NOT NULL,
    address varchar(300) NOT NULL,
    register_date DATE NOT NULL,

    PRIMARY KEY (id)
);

DROP TABLE user IF EXISTS ;

CREATE TABLE user (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL,
    last_name varchar(300) NOT NULL,
    email varchar(300) NOT NULL,
    age int(11) unsigned NOT NULL,
    address varchar(300) NOT NULL,
    register_date DATE,

    PRIMARY KEY (id)
);

INSERT INTO user (first_name, last_name, email, age, address, register_date ) VALUES
    ('jeremy', 'komarov', 'jeremy@gmail.com', 31, 'ramat gan', '2015-12-17'),
    ('sapir', 'zadik', 'sapir@gmail.com', 31, 'holon', '2015-12-17'),
    ('daniel', 'sevastiyanov', 'daniel@gmail.com', 31, 'rishon lezion', '2015-12-17'),
    ('shachar', 'zadik', 'shachar@gmail.com', 31, 'petah tikva', '2015-12-17');


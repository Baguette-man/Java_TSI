USE db_tsi;

CREATE TABLE product(
    id int(11) NOT NULL,
    name varchar(20) NOT NULL,
    description varchar(250) NOT NULL,
    price float NOT NULL,
    pictureUrl varchar(500),
    PRIMARY KEY (id)
);


INSERT INTO product (id, name,description, price,pictureUrl) VALUES (1, 'Gaming computer','(to play rainbow 6)', 3000,'https://www.hp.com/fr-fr/shop/Html/Merch/Images/c07762776_1750x1285.jpg');
INSERT INTO product (id, name,description, price,pictureUrl) VALUES (2, 'iPhone', 'no that expensive', 1500,'https://www.apple.com/v/iphone-13/f/images/overview/hero/hero_1_static__feiuc1zaeiaa_large.jpg');
INSERT INTO product (id, name,description, price,pictureUrl) VALUES (3, 'Apple Homepod', 'Hey Siri, call dad', 500,'https://www.electrodepot.fr/fstrz/r/s/www.electrodepot.fr/media/catalog/product/cache/1a40d1f945549a9ec18309b0a600e55c/P972535.jpg?frz-v=2653');

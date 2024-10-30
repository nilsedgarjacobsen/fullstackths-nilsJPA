CREATE TABLE IF NOT EXISTS category (
                                        id SERIAL PRIMARY KEY,
                                        name VARCHAR(50) NOT NULL
    );

CREATE TABLE IF NOT EXISTS product (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(100) NOT NULL,
    category_id INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
    );

INSERT INTO category (name) VALUES
                                ('Electronics'),
                                ('Clothing'),
                                ('Sports'),
                                ('Books'),
                                ('Office'),
                                ('Accessories'),
                                ('Home');

INSERT INTO product (name, category_id, price) VALUES
                                                   ('Laptop', 1, 999.99),
                                                   ('T-Shirt', 2, 19.99),
                                                   ('Bicycle', 3, 349.99),
                                                   ('Book', 4, 14.99),
                                                   ('Headphones', 1, 79.99),
                                                   ('Jeans', 2, 39.99),
                                                   ('Basketball', 3, 24.99),
                                                   ('Notebook', 5, 9.99),
                                                   ('Sunglasses', 6, 29.99),
                                                   ('Desk Lamp', 7, 24.99);
package org.example;

public class SqlHomework {
    static void sqlRequest() {
        System.out.println(
                """
                        INSERT INTO author (name, surname) values ('Alexandr', 'Pushkin');
                        INSERT INTO author (name, surname) values ('Alexandr', 'Duma');
                        INSERT INTO author (name, surname) values ('Michail', 'Lermontod');
                        INSERT INTO author (name, surname) values ('Anton', 'Chehov');
                        INSERT INTO author (name, surname) values ('Lev', 'Tolstoy');
                        SELECT * FROM author;

                        UPDATE author SET surname = 'Lermontov' WHERE id = 3;

                        INSERT INTO book (title, author_id, pages) values ('Борис Годунов', 1, 250);
                        INSERT INTO book (title, author_id, pages) values ('Капитанская дочка', 1, 400);
                        INSERT INTO book (title, author_id, pages) values ('Евгений Онегин', 1, 350);
                        INSERT INTO book (title, author_id, pages) values ('Граф Монте-Кристо', 2, 280);
                        INSERT INTO book (title, author_id, pages) values ('Вишневый сад', 4, 280);
                        INSERT INTO book (title, author_id, pages) values ('Война и мир', 5, 900);
                        INSERT INTO book (title, author_id, pages) values ('Странный человек', 3, 200);
                        INSERT INTO book (title, author_id, pages) values ('Маскарад', 3, 150);
                        SELECT * FROM book;

                        SELECT author.name, author.surname, book.title, book.pages
                        FROM author LEFT OUTER JOIN book ON author.id = book.author_id;

                        SELECT * FROM book WHERE book.pages > 300;

                        SELECT DISTINCT
                            author.name AS name_author,
                            author.surname AS surname_author
                        FROM author JOIN book ON author.id = book.author_id
                        WHERE book.pages > 300;"""
        );
    }
}

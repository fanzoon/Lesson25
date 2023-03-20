package org.example;

public class SqlHomework {
    static void sqlRequest() {
        System.out.println(
                "INSERT INTO author (name, surname) values ('Alexandr', 'Pushkin');\n" +
                        "INSERT INTO author (name, surname) values ('Alexandr', 'Duma');\n" +
                        "INSERT INTO author (name, surname) values ('Michail', 'Lermontod');\n" +
                        "INSERT INTO author (name, surname) values ('Anton', 'Chehov');\n" +
                        "INSERT INTO author (name, surname) values ('Lev', 'Tolstoy');\n" +
                        "SELECT * FROM author;\n" +
                        "\n" +
                        "UPDATE author SET surname = 'Lermontov' WHERE id = 3;\n" +
                        "\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Борис Годунов', 1, 250);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Евгений Онегин', 1, 350);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Граф Монте-Кристо', 2, 280);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Вишневый сад', 4, 280);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Война и мир', 5, 900);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Странный человек', 3, 200);\n" +
                        "INSERT INTO book (title, author_id, pages) values ('Маскарад', 3, 150);\n" +
                        "SELECT * FROM book;\n" +
                        "\n" +
                        "SELECT author.name, author.surname, book.title, book.pages\n" +
                        "FROM author LEFT OUTER JOIN book ON author.id = book.author_id;\n" +
                        "\n" +
                        "SELECT * FROM book WHERE book.pages > 300;\n" +
                        "\n" +
                        "SELECT\n" +
                        "    author.name AS name_author,\n" +
                        "    author.surname AS surname_author,\n" +
                        "    book.title AS Book_title,\n" +
                        "    book.pages AS number_of_pages\n" +
                        "FROM author LEFT OUTER JOIN book ON author.id = book.author_id WHERE book.pages > 300;"
        );
    }
}

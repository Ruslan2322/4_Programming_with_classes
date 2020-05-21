package Lesson_04_Simple_classes_and_obj.Ex_9;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {

        BookArrayCreator GogolStore = new BookArrayCreator("Vechera na hutore", new ArrayList<Book>());
        GogolStore.bookAdd("978-5-902580-29-4", "Elections", "Alex Karal", "Moskva", "2017", 210, 120, "solid");
        GogolStore.bookAdd("978-5-9908517-7-1", "Time of Kumarun", "Veranda Si", "Moskva", "2020", 332, 200, "solid");
        GogolStore.bookAdd("978-5-902580-36-2", "Live good", "Svetlana Belova", "Moskva", "2016", 124, 80, "soft");
        GogolStore.bookAdd("978-5-9908517-2-6", "About The Cinema", "Vitaliy Kuznecov", "Moskva", "2018", 150, 100, "soft");
        GogolStore.bookAdd("978-5-9906234-0-8", "Wedding cake with blood ", "Pavel Sterhov", "Moskva", "2012", 250, 130, "soft");



        System.out.println("Gogol books:");
        ArrayList<Book> booksAuthors = GogolStore.booksAuthors("Gogol Nikolay");
        for (Book book : booksAuthors) {
            System.out.println(book);

        }
        System.out.println("\nbooks published by \"New York Review of Books\":");
        ArrayList<Book> publishersBook = GogolStore.bookPublishComp("New York Review of Books");
        for (Book book : publishersBook) {
            System.out.println(book);
        }
        System.out.println("\nbooks released after 2010:");
        ArrayList<Book> releasedAfter = GogolStore.releasedAfter(2010);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}

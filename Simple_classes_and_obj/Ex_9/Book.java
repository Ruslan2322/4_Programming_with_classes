package Lesson_04_Simple_classes_and_obj.Ex_9;

// Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

public class Book {
    private String  id;
    private String author;
    private String bookName;
    private String publishing_outfit;
    private String pubYear;
    private int numberOfPages;
    private double price;
    private String bindingType;

    // Create get-s and set-s
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishing_outfit() {
        return publishing_outfit;
    }

    public void setPublishing_outfit(String publishing_outfit) {
        this.publishing_outfit = publishing_outfit;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
// Create Book constructor
    public Book(String id, String author, String bookName, String publishing_outfit, String pubYear, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
        this.publishing_outfit = publishing_outfit;
        this.pubYear = pubYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }
// Create method toString()
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publishing_outfit='" + publishing_outfit + '\'' +
                ", pubYear='" + pubYear + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}

package Lesson_04_Simple_classes_and_obj.Ex_9;
import java.util.ArrayList;

public class BookArrayCreator {
    private String bookName;
    private ArrayList<Book> arrayList;

    // Create class constructor
    public BookArrayCreator(String bookName, ArrayList<Book> arrayList) {
        this.bookName = bookName;
        this.arrayList = arrayList;
    }

    // Create get-s and set-s
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public ArrayList<Book> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Book> arrayList) {
        this.arrayList = arrayList;
    }

    // Create fuction for add Book
    void bookAdd(String id, String bookName, String author, String publishing_outfit, String pubYear, int numberOfPages, float price, String bindingType) {
        this.arrayList.add(new Book(id, bookName, author, publishing_outfit, pubYear, numberOfPages, price, bindingType));
    }

    ArrayList<Book> booksAuthors(String author) {
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book book : this.arrayList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    ArrayList<Book> bookPublishComp(String publisher) {
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.arrayList) {
            if (book.getPublishing_outfit().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> releasedAfter(int year) {
        ArrayList<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.arrayList) {
//            if (book.getPubYear() >= year) {
                releasedAfterList.add(book);
            }

        return releasedAfterList;
    }


}

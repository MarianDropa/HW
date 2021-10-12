package HW8;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryReport library = new LibraryReport();
        library.takeABook(new KeyDate(2021, 5, 2), "bookTitle1");
        library.takeABook(new KeyDate(2021, 5, 10), "bookTitle2");
        library.takeABook(new KeyDate(2021, 5, 20), "bookTitle3");
        library.takeABook(new KeyDate(2021, 5, 28), "bookTitle4");
        System.out.println("Book for this day is - " + library.searchByDates(new KeyDate(2021, 5, 2)));
        System.out.println("Book for this day is - " + library.searchByDates(new KeyDate(2021, 5, 10)));
        System.out.println("Book for this day is - " + library.searchByDates(new KeyDate(2021, 5, 20)));
        System.out.println("Book for this day is - " + library.searchByDates(new KeyDate(2021, 5, 28)));
        System.out.println(library.searchByDates(new KeyDate(2020, 10, 19)));
        System.out.println("******************");
        System.out.println("Range of dates of taken books " + library.getAllDates());
        System.out.println("list of books for a whole range " + library.getAllBooks());
        System.out.println("******************");
        ArrayList<String> books = new ArrayList<>();
        books.add("bookTitle5");
        books.add("bookTitle6");
        books.add("bookTitle7");
        library.takeABook(new KeyDate(2021, 5, 3), books);
        System.out.println("Books for this day is - " + library.searchByDates(new KeyDate(2021, 5, 3)));
        System.out.println("******************");
        library.rangeForOneMonth(2021, 5);
    }
}





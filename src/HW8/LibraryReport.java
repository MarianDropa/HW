package HW8;

import java.util.*;

public class LibraryReport {
    Map<KeyDate, ArrayList<String>> library = new HashMap<>();


    public void takeABook(KeyDate localDate, String bookTitle) {

        if (library.containsKey(localDate)) {
            library.get(localDate).add(bookTitle);
        } else {
            ArrayList<String> books = new ArrayList<>();
            books.add(bookTitle);
            library.put(localDate, books);
        }
    }

    public void takeABook(KeyDate localDate, ArrayList<String> bookTitle) {
        if (library.containsKey(localDate)) {
            library.get(localDate).addAll(bookTitle);
        } else {
            library.put(localDate, bookTitle);
        }
    }
    public void rangeForOneMonth(KeyDate localDate){
       // YearMonth yearMonthObject = YearMonth.of(year, month);
       // int daysInMonth = yearMonthObject.lengthOfMonth();
        //library.
       // if (localDate <= new KeyDate(2021, 5, 2)|| localDate => new KeyDate(2021, 5, 28)) {
       // }


    }


    public Object searchByDates(KeyDate localDate) {
        if (library.containsKey(localDate)) {
            return library.get(localDate);
        } else {
            return "There are no books for date 2020-10-19";
        }
    }

    public Collection<ArrayList<String>> getAllBooks() {
        return library.values();
    }

    public Set<KeyDate> getAllDates() {
        return library.keySet();

    }

}

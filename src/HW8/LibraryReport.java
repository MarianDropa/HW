package HW8;

import java.time.YearMonth;
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

    public Object searchByDates(KeyDate localDate) {
        if (library.containsKey(localDate)) {
            return library.get(localDate);
        } else {
            return "There are no books for date 2020-10-19";
        }
    }

    public void rangeForOneMonth(int year, int month) {
        YearMonth days = YearMonth.of(year, month);
        int daysOfMonth = days.lengthOfMonth();

        for (int i = 1; i <= daysOfMonth; i++) {
            KeyDate date = new KeyDate(year, month, i);
            if (library.containsKey(date)) {
                System.out.println(date + " - " + library.get(date).size());
            } else {
                System.out.println(date + " - 0");
            }
        }
    }

    public Collection<ArrayList<String>> getAllBooks() {
        return library.values();
    }

    public Set<KeyDate> getAllDates() {
        return library.keySet();

    }
}

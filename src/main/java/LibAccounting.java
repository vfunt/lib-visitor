package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class LibAccounting {

    private Set<String> books = new HashSet<>();
    private Map<Date,String> libAcc = new HashMap<>();

//    public LibAccounting() {}

    LibAccounting(List<String> books) {
        this.books.addAll(books);
    }

    void addBook(String date, String book) throws ParseException{
        libAcc.put(new SimpleDateFormat("dd.mm.yyyy").parse(date),book);
    }

    String checkBook(String date) throws ParseException {
        System.out.println("Book that was taken: ");
        return libAcc.get(new SimpleDateFormat("dd.mm.yyyy").parse(date));

    }

    void getBooks() {
        System.out.println("***********************************");
        System.out.println("Available books: ");
        System.out.println("***********************************");
        for (String book: books) {
            System.out.println(book);
        }
        System.out.println("***********************************");
    }

    void showLib() {
        System.out.println("Library report: ");
        for (Date k: libAcc.keySet()) {
            System.out.println("Date: " + k);
            System.out.println("Book: " + libAcc.get(k));
        }
    }
}

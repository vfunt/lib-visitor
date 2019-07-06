package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibAccounting {

    private Set<String> books = new HashSet<>();
    private Map<Date,String> libAcc = new HashMap<>();

//    public LibAccounting() {}

    public LibAccounting(ArrayList<String> books) {
        this.books.addAll(books);
    }

    public void addBook(String date, String book) throws ParseException{
        libAcc.put(new SimpleDateFormat("dd.mm.yyyy").parse(date),book);
    }

    public String checkBook(String date) throws ParseException {
        return libAcc.get(new SimpleDateFormat("dd.mm.yyyy").parse(date));

    }

    public void showLib() {
        System.out.println(libAcc);
    }
}

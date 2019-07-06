package main.java;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("firstBook");
        books.add("secondBook");
        books.add("thirdBook");
        books.add("fourthBook");
        books.add("fivesBook");
        books.add("sixthBook");
        books.add("seventhBook");
        books.add("eightsBook");

        System.out.println("List of books that we have in our library: " + books);
        LibAccounting lib = new LibAccounting(books);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter book: ");
        String book = s.nextLine();
        System.out.println("Enter date: ");
        try {
            lib.addBook(s.nextLine(), book);
        } catch (ParseException e) {
            System.out.println(e);
        }
        System.out.println("Enter date to find book: ");
        try {
            System.out.println(lib.checkBook(s.nextLine()));;
        } catch (ParseException e) {
            System.out.println(e);
        }
        lib.showLib();




    }
}

package main.java;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean action = true;
        List<String> books = new ArrayList<>();
        books.add("firstBook");
        books.add("secondBook");
        books.add("thirdBook");
        books.add("fourthBook");
        books.add("fifthBook");
        books.add("sixthBook");
        books.add("seventhBook");
        books.add("eightsBook");

        LibAccounting lib = new LibAccounting(books);
        lib.getBooks();
        try {
            lib.addBook("10.06.2019", "firstBook");
            lib.addBook("10.07.2019", "secondBook");
            lib.addBook("10.02.2019", "thirdBook");
            lib.addBook("10.02.2011", "sixthBook");
        } catch (ParseException e) {
            System.out.println("Date is not valid");
        }

        Scanner s = new Scanner(System.in);
        String choice;
        while (action) {
            System.out.print("Please enter required action ['a' - addBook; 'c' - checkBook; 's' - showLibReport; 'q' - exit]: ");
            choice = s.next();
            if (choice.equals("a")) {
                System.out.print("Enter the book that available in th library: ");
                String book = s.next();
                System.out.print("Enter date [dd.mm.yyyy]: ");
                try {
                    lib.addBook(s.next(), book);
                } catch (ParseException e) {
                    System.out.println("Date is not valid");
                }
            } else if (choice.equals("c")) {
                System.out.print("Enter date to find book [dd.mm.yyyy]: ");
                try {
                    System.out.println(lib.checkBook(s.next()));
                } catch (ParseException e) {
                    System.out.println("Date is not valid");
                }
            } else if (choice.equals("s")) {
                lib.showLib();
            } else if (choice.equals("q")) {
                action = false;
            } else {
                System.out.println(choice + " is not a valid choice! Please enter it again!");
            }
        }


    }
}

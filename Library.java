package task_3;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered successfully!");
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued successfully!");
                    return;
                } else {
                    System.out.println("Book is already issued!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                    return;
                } else {
                    System.out.println("Book was not issued!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void viewBooks() {
        System.out.println("\n--- Available Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "9781401238964", "Batman: The Court of Owls", true, "James"),
                new Book(2, "9780785192558", "The Amazing Spider-Man: Coming Home", true, "Trevor"),
                new Book(3, "9781401207526", "Watchmen", false, ""),
                new Book(4, "9781401248192", "Batman: The Killing Joke", false, ""),
                new Book(5, "9780785139706", "Civil War", false, ""),
                new Book(6, "9781302900601", "Old Man Logan", true, "John"),
                //new Book(7, "9781401208417", "V for Vendetta"),
                //new Book(8, "9781616550417", "Hellboy: Seed of Destruction")

        };

        String mainMenuText = """
                What do you want to do?
                1 - Show Available Books
                2 - Show Checked Out Books
                3 - Quit
                Enter your command: """;

        int choice;
        do {
            choice = Console.promptForInt(mainMenuText);
            switch (choice) {
                case 1 -> showAvailableBooks(books);
                case 2 -> showCheckedOutBooks(books);
                case 3 -> System.out.println("Have a Blessed Day!");
                default -> System.out.println("Invalid command, please try again...");
            }
        } while (choice != 3);
    }

    public static void showAvailableBooks(Book[] books) {
        System.out.println("\nAvailable Books:");
        boolean found = false;

        for (Book book : books) {
            if (book != null && !book.isCheckedOut()) {
                System.out.printf("ID: %d  ISBN: %s  Title: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books are currently available.");
        }
        System.out.println();
    }

    public static void showCheckedOutBooks(Book[] books) {
        System.out.println("\nChecked Out Books:");
        boolean found = false;

        for (Book book : books) {
            if (book != null && book.isCheckedOut()) {
                System.out.printf("ID: %d  ISBN: %s  Title: %s  Checked out to: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books are currently checked out.");
        }
        System.out.println();
    }
}
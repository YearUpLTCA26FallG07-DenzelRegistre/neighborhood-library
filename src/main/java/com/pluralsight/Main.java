package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book[] books = {
                new Book(1, "9781401238964", "Batman: The Court of Owls"),
                new Book(2, "9780785192558", "The Amazing Spider-Man: Coming Home"),
                new Book(3, "9781401207526", "Watchmen"),
                new Book(4, "9781401248192", "Batman: The Killing Joke"),
                new Book(5, "9780785139706", "Civil War"),
                new Book(6, "9781302900601", "Old Man Logan"),
                new Book(7, "9781401208417", "V for Vendetta"),
                new Book(8, "9781616550417", "Hellboy: Seed of Destruction"),
                new Book(9, "9780785143413", "Planet Hulk"),
                new Book(10, "9781401225759", "Green Lantern: Secret Origin"),
                new Book(11, "9781779501127", "Superman: Red Son"),
                new Book(12, "9780785199830", "Ms. Marvel Vol. 1: No Normal"),
                new Book(13, "9781401219260", "Batman: Year One"),
                new Book(14, "9780785145165", "Infinity Gauntlet"),
                new Book(15, "9781606901427", "The Walking Dead Vol. 1"),
                new Book(16, "9781401245252", "Aquaman Vol. 1: The Trench"),
                new Book(17, "9781302917494", "Miles Morales: Spider-Man"),
                new Book(18, "9781401232740", "Justice League: Origin"),
                new Book(19, "9781534312173", "Spawn Origins Collection Vol. 1"),
                new Book(20, "9781779510273", "Wonder Woman: Dead Earth")
        }

        String mainMenuText = """
                What do you want to do?
                1 - Show Available Books
                2 - Show Checked Out Books
                3 - Quit
                Enter your command: """;


        int choice;
        do{
            choice = Console.promptForInt(mainMenuText);
            switch (choice){
                case 1 -> processSearchByAvailableBooks();
                case 2 -> processSearchByCheckedoutBooks();
                case 3 -> System.out.println("Have a Blessed Day!");
                default -> System.out.println("Invalid command, please try again...");
            }

        } while (choice != 3);

        public static void  processSearchByAvailableBooks(Book[] books){

        }


    }
}
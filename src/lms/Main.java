package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {

        // Create a Library
        Library library = new Library();

        // Create Books
        Book book1 = new Book(
                "B001", "Clean Code", "Robert C. Martin");

        Book book2 = new Book(
                "B002", "Effective Java", "Joshua Bloch");

        // Create a DVD
        DVD dvd1 = new DVD(
                "D001", "Introduction to Algorithms", 120);

        // Add items to the library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        // Create members
        Student student1 = new Student(
                "M001", "Nadeesha Perera");

        Staff staff1 = new Staff(
                "M002", "Mr. Kasun Silva");

        // Add members to the library
        library.addMember(student1);
        library.addMember(staff1);

        // Display all items
        library.listItems();

        // Display all members
        library.listMembers();

        // Calculate late fees for 3 days
        library.printAllLateFees(3);

        // Test validation
        try {
            Book invalidBook = new Book(
                    "B003", " ", "Unknown");

            library.addItem(invalidBook);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Rejected invalid book: " + e.getMessage());
        }
    }
}

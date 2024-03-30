package java_assignment_10_interfaces_and_packages.com.library.control;

import java_assignment_10_interfaces_and_packages.com.library.books.Book;
import java_assignment_10_interfaces_and_packages.com.library.members.Member;
import java_assignment_10_interfaces_and_packages.com.library.transaction.Transaction;
import java_assignment_7_class_and_object_and_encapsulation.TeamPlayerDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryControlView {

    private LibraryControlModel libraryControlModel;
    private Scanner scan;

    public LibraryControlView(){
        libraryControlModel = new LibraryControlModel(this);
        scan = new Scanner(System.in);
    }
    public void initialControl() {
        System.out.println("Simple Library Application\n----------------------------");
    whileloop:
    while(true) {
        System.out.println(
                "\n1.Add Book" +
                        "\n2.Add Member" +
                        "\n3.Borrow Book" +
                        "\n4.Return Book" +
                        "\n5.Search Book" +
                        "\n6.Generate Book Report" +
                        "\n7.Generate Member Report" +
                        "\n8.Generate Transaction Report" +
                        "\n9.Exit"
        );

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                addMember();
                break;
            case 3:
                borrowBook('B');
                break;
            case 4:
                borrowBook('R');
                break;
            case 5:
                searchBook();
                break;
            case 6:
                libraryControlModel.generateBookReport();
                break;
            case 7:
                libraryControlModel.generateMemberReport();
                break;
            case 8:
                libraryControlModel.generateTransactionReport();
                break;
            case 9:
                System.out.println("Bye Bye");
                break whileloop;
            default:
                System.out.println("Invalid choice");
        }
    }

    }

    public void addBook() {
        System.out.println("Enter the Book isbn - (Integer value)");
        int isbn = scan.nextInt();
        System.out.println("Enter the book name");
        String bookName = scan.next();
        System.out.println("Enter the book author name");
        String author = scan.next();
        System.out.println("Enter the book genre");
        String genre = scan.next();
        System.out.println("Enter the book publisher name");
        String publisher = scan.next();
        Book book = new Book(isbn,bookName,author,genre,publisher);
        book.setBookId();
        book.setBookAvailable(true);
        libraryControlModel.addBook(book);
    }

    public void addMember() {
        System.out.println("Enter Member Name");
        String name = scan.next();
        System.out.println("Enter Member Email");
        String email = scan.next();
        System.out.println("Enter Member Phone no");
        long phoneNo = scan.nextLong();
        System.out.println("Enter Member Address");
        String address = scan.next();
        Member member = new Member(name,email,phoneNo,address);
        member.setMemberId();
        libraryControlModel.addMember(member);
    }

    public void borrowBook(char type) {
        libraryControlModel.generateBookReport();
        System.out.println("Enter the Book Id");
        int bookId = scan.nextInt();
        libraryControlModel.generateMemberReport();
        System.out.println("Enter the Member Id");
        int memberId = scan.nextInt();
        libraryControlModel.borrowBook(bookId,memberId,type);
    }


    public void searchBook() {
        System.out.println("Enter the book words");
        String bookWords = scan.next();
        libraryControlModel.searchBook(bookWords);
    }
    public void printBookDetails(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }
    public void printMemberDetails(List<Member> list) {
        for (Member member : list) {
            System.out.println(member.toString());
        }
    }
    public void printTransactionDetails(List<Transaction> list) {
        for (Transaction transaction : list) {
            System.out.println(transaction.toString());
        }
    }

    public void showText(String text) {
        System.out.println(text);
    }
}

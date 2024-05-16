package java_assignment_10_interfaces_and_packages.com.library;


// Design a library management system using packages. Create packages such as library.books , library.members , and library.transactions . Implement classes within these packages to represent books, members, and transactions. Demonstrate the usage of packages to organize the code logically.

import java_assignment_10_interfaces_and_packages.com.library.control.LibraryControlView;

public class LibraryMain {
    public static void main(String[] args) {
        new LibraryControlView().initialControl();
    }
}

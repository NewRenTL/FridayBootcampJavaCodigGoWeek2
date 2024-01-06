import Classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1,"Drosky 1",true,"Dross");
        //b1.showDetails();
        Book b2 = new Book(2,"Drosky2",true,"Diego");

        DVD d1 = new DVD(1,"Mika 1",true,"Micaela J.",120);

        LibraryUser user1 = new LibraryUser(1,"Diego Bustamante Palomino");
        LibraryUser user2 = new LibraryUser(2,"Diana Monjaras Macedo");
        Library library1 = new Library("Library X");

        library1.addUser(user1);
        library1.addUser(user2);
        library1.addItem(b1);
        library1.addItem(b2);
        library1.addItem(d1);
        //library1.showAllItems();
        library1.showAllUsers();



    }
}
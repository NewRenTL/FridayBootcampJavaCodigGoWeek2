package Classes;

import java.security.PublicKey;
import java.util.ArrayList;


public class LibraryUser {

    int userID;
    String userName;
    ArrayList<LibraryItem> loanedItems;

    public LibraryUser(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        this.loanedItems = new ArrayList<>();
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }

    public void addItem(LibraryItem item)
    {
        loanedItems.add(item);
    }

    public void showUserDetails()
    {
        System.out.print("userID:"+userID+"\n"+"Username:"+userName+"\n"+"LoanedItems:\n");
        System.out.print("----------------------\n");
        for(LibraryItem item:loanedItems)
        {
            item.showDetails();
            System.out.println();
            System.out.print("----------------------\n");
        }
    }
}

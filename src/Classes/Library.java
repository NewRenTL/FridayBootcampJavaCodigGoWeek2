package Classes;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<LibraryItem> libraryItems;

    private ArrayList<LibraryUser> users;


    //Methods
    public boolean bookLoan(int idUser,int itemID)
    {
        LibraryUser l1 = null;
        for (LibraryUser user1:users)
        {
            if(user1.getUserID() == idUser)
            {
                l1 = user1;
                break;
            }
        }
        if(l1 == null)
        {
            return false;
        }
        for (LibraryItem item:libraryItems)
        {
            if(itemID == item.getId() && item.isAvailable()){
                l1.addItem(item);
                item.setAvailable(false);
                return true;
            }
            else if(itemID == item.getId() && !item.isAvailable())
            {
                return false;
            }
        }
        return false;
    }

    public void showAllItems()
    {
        System.out.println("Library Items:\n");
        System.out.print("----------------------\n");
        for (LibraryItem item: libraryItems)
        {
            item.showDetails();
            System.out.print("----------------------\n");
        }
    }

    public boolean addItem(LibraryItem item)
    {
        for (LibraryItem item_x:libraryItems)
        {
            if(item_x.getId() == item.getId()){
                return false;
            }
        }
        libraryItems.add(item);
        return true;
    }

    public LibraryItem returnItem(int idItem)
    {

            for (LibraryItem item:libraryItems)
            {
                if (item.getId() == idItem)
                {
                    return item;
                }
            }

            //Return a valid Objet but the programmer must know how to
            // identify when an object is not Found

            //Also, I can throw an exception
            return new LibraryItem(-1,"Not found",false);
    }


}

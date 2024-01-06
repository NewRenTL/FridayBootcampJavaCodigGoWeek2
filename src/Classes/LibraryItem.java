package Classes;

public class LibraryItem {
    protected int id;
    protected String title;

    protected boolean available;

    public LibraryItem(int id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void showDetails()
    {
        System.out.print("ID:"+id+"\n"+"Title:"+title+"\n"+"Available:"+available+"\n");

    }
}

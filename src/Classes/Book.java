package Classes;

public class Book extends LibraryItem{
    String author;
    public Book(int id,String title,Boolean available,String author)
    {
        super(id,title,available);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.print("Book\n");
        super.showDetails();
        System.out.print("Author:"+author);
    }
}

package Classes;

public class DVD extends LibraryItem{

    String director;
    float duration;

    public DVD(int id, String title, boolean available, String director, float duration) {
        super(id, title, available);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public float getDuration() {
        return duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
    @Override
    public void showDetails() {
        System.out.print("DVD\n");
        super.showDetails();
        System.out.print("Director:"+director);
    }
}

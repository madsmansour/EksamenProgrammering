import java.io.File;

public class Artikel extends Media {

    private String author;
    private String artikelText;
    private File picture;

    @Override
    public void logToConsol() {
        System.out.println(this.getName());
    }
}
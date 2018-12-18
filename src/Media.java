import java.io.File;
import java.time.Instant;
import java.util.Date;

// En privat klasse kaldt Media
public class Media {

    // her oprettes forskellige variabler af forskellige typer (int, String, Date, String)
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;


    // en public Constructer kaldt mMedia
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    // Getters og Setters til alle klassens variabler
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public void logToConsol() {
        System.out.println(this.name + "Media");

    }
}


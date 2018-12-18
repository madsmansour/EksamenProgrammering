import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Javadoc kommentarer
/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
// Public klasse kaldt MediaID
public class MediaID {

    // En privat statisk int kaldet latestId som er deklareret til 100
    private static int latestId = 100;

    // en public metode der hedder generate som returnerer en integer
    public static int generate() {

        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        // en try catch-block
        try {

            // hvis samme fileId eksistere oprettes en ny filereader, et nyt Scannerobjekt
            // Hvorefter latestId bliver incrementet, dvs. latestId + 1
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            latestId++;

            // opretter ny FileWriter objekt der omskriver latestId (int) til en String
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

            // Catch phrase der fanger alle fejl og printer hvilken type fejl der er tale om
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        // returnere latestId
        return latestId;
    }

}
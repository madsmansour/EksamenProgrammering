import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {


    // en metode der printer alle filer til konsollen  fra folderen i pathname

    public static void readMediaFolder(String folderNavn) {
        File folder = new File("C:\\Users\\Mads\\Desktop\\Eksamen programmering\\1sem_exam_2018_B-master\\media");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Fil" + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Folder " + listOfFiles[i].getName());
            }
        }
    }
}
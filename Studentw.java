package studentobj;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Studentw {

    String filepath1 = "G:\\java projects\\studento.txt";

    public void fileWrite(String filecontentw, String filepath1) {
        try {
            FileWriter fr = new FileWriter(filepath1);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(filecontentw);
            bw.close();
            fr.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
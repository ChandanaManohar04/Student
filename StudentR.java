package studentobj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentR {
    String filepath = "G:\\java projects\\students.txt";
    String filecontents = " ";

    public String fileRead(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = br.readLine();

            while (currentline != null) {
                filecontents += currentline + "\n";
                currentline = br.readLine();
            }
            br.close();
            fr.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return filecontents;
    }

}



package agr.xworkz.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Struct;

public class StringToRead {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("write.txt"));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();

        }

        catch(FileNotFoundException e){
            System.out.println("The file is not found.");
        }

        catch (IOException e){
            System.out.println("The error is occurred.");
        }
    }
}

package agr.xworkz.write;

import java.io.*;

public class StringToWrite {
    public static void main(String[] args) {

        String[] places = {"Chitradurga","Davanagere","Molkalmuru","Chikumthi"};

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write.txt"));
            bufferedWriter.write("HI,My name is Akasha GR.");
            bufferedWriter.write("\nI am learning Java.");
            bufferedWriter.write("\n");


            bufferedWriter.write("\nThe Places list:");
            for(String string:places){
                bufferedWriter.write("\n"+ string);
            }
            bufferedWriter.close();
        }

        catch(FileNotFoundException e){
            System.out.println("The file is not found.");
        }

        catch (IOException e){
            System.out.println("The error is occurred.");
        }
    }
}

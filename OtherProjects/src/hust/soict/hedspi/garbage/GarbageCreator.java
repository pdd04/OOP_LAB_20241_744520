package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "OtherProjects/src/hust/soict/hedspi/garbage/test.txt";
        // mở cả OOP_lAB_20241_744520 chương trình tìm đúng đường dẫn
        Path pathToFile = Paths.get(filename);
        byte[] inputBytes = {0};
        long startTime, endTime;

        try{
            if (!Files.exists(pathToFile.toAbsolutePath())) {
                System.err.println("File not found: " + pathToFile.toAbsolutePath());
                return;
            }
            inputBytes = Files.readAllBytes(pathToFile.toAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();
        String outputString = "";
        for(byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}

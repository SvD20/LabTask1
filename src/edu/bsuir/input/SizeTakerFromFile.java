package edu.bsuir.input;

import edu.bsuir.pathes.PathToFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SizeTakerFromFile implements SizeTaker{

    @Override
    public int getSize() throws FileNotFoundException {
        Scanner sc = new Scanner( new File(PathToFile.FILE1.getPath()));
        int size = sc.nextInt();
        return size;
    }

}

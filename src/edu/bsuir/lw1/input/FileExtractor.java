package edu.bsuir.lw1.input;

import java.io.*;
import java.util.Scanner;

import static edu.bsuir.lw1.pathes.PathToFile.FILE1;


public class FileExtractor extends DataExtractor{

    public static int getSizeFromFile() throws IOException {

        Scanner sc = new Scanner( new File(FILE1.getPath()));

        int size = sc.nextInt();

        return size;

    }

}

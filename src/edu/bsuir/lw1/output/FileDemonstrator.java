package edu.bsuir.lw1.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static edu.bsuir.lw1.pathes.PathToFile.FILE2;

public class FileDemonstrator extends SecDemonstrator{

    public static String getSequenceFromFile() throws IOException {

        FileReader fr = new FileReader(FILE2.getPath());

        Scanner sc = new Scanner(fr);

        String sequence  = sc.nextLine();

        fr.close();

        return sequence;

    }

}

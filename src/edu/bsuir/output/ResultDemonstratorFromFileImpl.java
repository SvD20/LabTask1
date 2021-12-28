package edu.bsuir.output;

import edu.bsuir.pathes.PathToFile;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ResultDemonstratorFromFile implements ResultDemonstrator{
    @Override
    public void resultDemonstartor() throws IOException {

        FileReader fr = new FileReader(PathToFile.FILE2.getPath());
        Scanner sc = new Scanner(fr);
        String sequence  = sc.nextLine();
        System.out.println(sequence);
        fr.close();

    }
}

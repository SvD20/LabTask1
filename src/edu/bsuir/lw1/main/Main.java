package edu.bsuir.lw1.main;

import edu.bsuir.lw1.input.DataExtractor;
import edu.bsuir.lw1.input.FileExtractor;
import edu.bsuir.lw1.output.FileDemonstrator;
import edu.bsuir.lw1.output.SecDemonstrator;
import edu.bsuir.lw1.secproc.FileCreator;
import edu.bsuir.lw1.secproc.SecCreator;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

            public static void main(String[] args) throws IOException {

                int size = FileExtractor.getSizeFromFile();
                FileCreator.writeSecInFile(FileCreator.createSequence(size));
                FileDemonstrator.showSequence(FileDemonstrator.getSequenceFromFile());

            }
        }



            //Работа с файлами

            /*
            int size = FileExtractor.getSizeFromFile();
                FileCreator.writeSecInFile(FileCreator.createSequence(size));
                FileDemonstrator.showSequence(FileDemonstrator.getSequenceFromFile());
             */

            //Работа с консолью
            /*int size = DataExtractor.getSizeFromTerminal();
              SecDemonstrator.showSequence(SecCreator.createSequence(size));*/
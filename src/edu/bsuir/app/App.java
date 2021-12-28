package edu.bsuir.main;

import edu.bsuir.input.FileExtractor;
import edu.bsuir.output.FileDemonstrator;
import edu.bsuir.sequence_processing.FileCreator;

import java.io.IOException;


public class App {

            public static void main(String[] args) throws IOException {

                int size = FileExtractor.getSizeFromFile();
                FileCreator.writeSecInFile(FileCreator.createSequence(size));
                FileDemonstrator.showSequence(FileDemonstrator.getSequenceFromFile());

            }
        }

    ////Знакомлюсь гитом////

///Ща смержу///

            //Работа с файлами

            /*
            int size = FileExtractor.getSizeFromFile();
                FileCreator.writeSecInFile(FileCreator.createSequence(size));
                FileDemonstrator.showSequence(FileDemonstrator.getSequenceFromFile());
             */

            //Работа с консолью
            /*int size = DataExtractor.getSizeFromTerminal();
              SecDemonstrator.showSequence(SecCreator.createSequence(size));*/

///Хочу спать///
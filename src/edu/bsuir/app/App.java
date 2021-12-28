package edu.bsuir.app;

import edu.bsuir.input.SizeTaker;
import edu.bsuir.input.SizeTakerFromConsole;
import edu.bsuir.input.SizeTakerFromFile;
import edu.bsuir.output.*;
import edu.bsuir.sequence_processing.SeqCreatorAndWriterSeqImpl;
import edu.bsuir.sequence_processing.SequenceCreator;
import edu.bsuir.sequence_processing.SequenceCreatorImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    static SizeTaker sizeTakerFromConsole = new SizeTakerFromConsole();
    static SizeTaker sizeTakerFromFile = new SizeTakerFromFile();

    static ResultDemonstratorFromCode resultDemonstratorFromCode = new ResultDemonstratorFromCodeImpl();
    static ResultDemonstratorFromFile resultDemonstratorFromFile = new ResultDemonstratorFromFileImpl();

    static SequenceCreator sequenceCreator = new SequenceCreatorImpl();
    static SeqCreatorAndWriterSeqImpl seqCreatorAndWriterSeq = new SeqCreatorAndWriterSeqImpl();

    private static int option = 0;//1 - console, 2 - file
    private static int size = 0;

    public static void main(String[] args) throws IOException {

        while (true){
            System.out.println("Для работы через консоль выберите 1, для работы через файлы выберите 2:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(bufferedReader.readLine());
            switch (option){
                case 1:
                    size = sizeTakerFromConsole.getSize();
                    String sequence1 = sequenceCreator.createSequence(size);
                    resultDemonstratorFromCode.resultDemonstrateFromCode(sequence1);
                    break;
                case 2:
                    size = sizeTakerFromFile.getSize();
                    String sequence2 = seqCreatorAndWriterSeq.createSequence(size);
                    resultDemonstratorFromFile.resultDemonstrateFromFile();
                    break;
                default:
                    System.out.println("Выберите один из предложенных вариантов");
                    break;
            }
        }
    }
}


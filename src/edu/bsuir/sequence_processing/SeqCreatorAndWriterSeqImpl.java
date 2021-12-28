package edu.bsuir.sequence_processing;

import java.io.*;
import java.util.Random;
import static edu.bsuir.pathes.PathToFile.FILE2;

public class SeqCreatorAndWriterSeqImpl implements SequenceCreator,WriterSequenceToFile {

      public String createSequence(int length){
          if (length > 0){
              Random random=new Random();
              StringBuffer sb=new StringBuffer();
              for(int i=0;i<length;i++){
                  int number=random.nextInt(SYMBOLS.length());
                  sb.append(SYMBOLS.charAt(number));
              }
              return sb.toString();
          }
          else{
              return "Рзамер последовательности отрицателен!";
          }
      }

      public  void writeSecInFile(String sequence) throws IOException {
          FileWriter fw = new FileWriter(FILE2.getPath());
          fw.write(sequence);
          fw.close();
      }

}

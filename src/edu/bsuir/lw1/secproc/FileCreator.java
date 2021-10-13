package edu.bsuir.lw1.secproc;

import java.io.*;
import java.util.Random;
import static edu.bsuir.lw1.pathes.PathToFile.FILE2;

public class FileCreator extends SecCreator{

      public static String createSequence(int length){

          if (length > 0){
              String str="bcdfghjklmnpqrstvwxyz";
              Random random=new Random();
              StringBuffer sb=new StringBuffer();
              for(int i=0;i<length;i++){
                  int number=random.nextInt(str.length());
                  sb.append(str.charAt(number));
              }
              return sb.toString();
          }
          else{
              return "В файле отрицательное число";
          }
      }

      public static void writeSecInFile(String sequence) throws IOException {

          FileWriter fw = new FileWriter(FILE2.getPath());

          fw.write(sequence);

          fw.close();

      }

}

package edu.bsuir.secproc;

import java.util.Random;

public class SequenceCreator {

    private static String SYMBOLS = "bcdfghjklmnpqrstvwxyz";

    public String createSequence(int length){
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(SYMBOLS.length());
            sb.append(SYMBOLS.charAt(number));
        }
        return sb.toString();
    }

}
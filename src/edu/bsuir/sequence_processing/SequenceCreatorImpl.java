package edu.bsuir.sequence_processing;

import java.util.Random;

public class SequenceCreatorImpl implements SequenceCreator {

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
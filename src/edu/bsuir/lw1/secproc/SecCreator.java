package edu.bsuir.lw1.secproc;

import java.util.Random;

public class SecCreator {

    public static String createSequence(int length){

        String str="bcdfghjklmnpqrstvwxyz";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
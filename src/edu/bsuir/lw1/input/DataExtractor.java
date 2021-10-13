package edu.bsuir.lw1.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataExtractor {

    public static int getSizeFromTerminal() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size=0;

        while(size<=0)
        {
            System.out.println("Введите размер последовательности,значение должно быть положительным: ");
            size = Integer.parseInt(bufferedReader.readLine());
        }
        return size;
    };

/////Знакомлюсь с гитом//////////
}

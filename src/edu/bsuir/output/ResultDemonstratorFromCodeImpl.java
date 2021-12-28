package edu.bsuir.output;

import java.io.IOException;

public class ResultDemonstratorFromCodeImpl implements ResultDemonstratorFromCode{
    @Override
    public void resultDemonstrateFromCode(String sequence) throws IOException {
        System.out.println(sequence);
    }
}

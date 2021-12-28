package edu.bsuir.sequence_processing;

public interface SequenceCreator {

    final String SYMBOLS = "bcdfghjklmnpqrstvwxyz";
    String createSequence(int length);

}

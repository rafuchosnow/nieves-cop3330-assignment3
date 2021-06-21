/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ex46 {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList());
        ArrayList<String> uniqueWordList = new ArrayList<String>(Arrays.asList());
        HashMap<String, String> wordTable = new HashMap<String, String>();

        //Create new class to include all table related methods
        WordFrequency WF = new WordFrequency();

        //Call method to read file and add words to list
        WF.readFile(wordList);
        WF.readFile(uniqueWordList);

        //Call method to remove duplicate words
        WF.duplicateRemover(uniqueWordList);

        //Call method to create histogram
        String finalOutput = WF.printTable(wordList, uniqueWordList, wordTable);

        System.out.println(finalOutput);

    }
}

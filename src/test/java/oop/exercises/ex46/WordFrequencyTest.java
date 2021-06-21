/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex46;

import oop.exercises.ex45.WordFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void printTable() {
        ArrayList<String> wordList = new ArrayList<String>
                (Arrays.asList("badger","badger","badger","badger","badger","badger","badger","mushroom","mushroom","snake"));
        ArrayList<String> uniqueWordList = new ArrayList<String>
                (Arrays.asList("badger","mushroom","snake"));
        HashMap<String, String> wordTable = new HashMap<String, String>();

        WordFrequency WF = new WordFrequency();

        String actual = WF.printTable(wordList,uniqueWordList,wordTable);
        String expected = "mushroom : \t\t**\n" +
                "snake : \t\t*\n" +
                "badger : \t\t*******\n";

        assertEquals(expected, actual);
    }

    @Test
    void printTable_more_different_words() {
        ArrayList<String> wordList = new ArrayList<String>
                (Arrays.asList("baby","baby","germany","juandissimo","mother","mother","mother","robot","robot","superman","superman"));
        ArrayList<String> uniqueWordList = new ArrayList<String>
                (Arrays.asList("baby","germany","juandissimo","mother","robot","superman"));
        HashMap<String, String> wordTable = new HashMap<String, String>();

        WordFrequency WF = new WordFrequency();

        String actual = WF.printTable(wordList,uniqueWordList,wordTable);
        String expected = "superman : \t\t**\n" +
                "baby : \t\t**\n" +
                "germany : \t\t*\n" +
                "mother : \t\t***\n" +
                "juandissimo : \t\t*\n" +
                "robot : \t\t**\n";

        assertEquals(expected, actual);
    }
}
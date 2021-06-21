/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void sortList() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"));

        FileManager FM = new FileManager();

        String actual = FM.sortList(Employees);
        String expected = "Total of 7 names: \n" +
                "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n";

        assertEquals(expected, actual);
    }

    @Test
    void sortList_just_letters() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("z", "s", "f", "a", "k", "u", "e"));

        FileManager FM = new FileManager();

        String actual = FM.sortList(Employees);
        String expected = "Total of 7 names: \n" +
                "a\n" +
                "e\n" +
                "f\n" +
                "k\n" +
                "s\n" +
                "u\n" +
                "z\n";

        assertEquals(expected, actual);
    }

    @Test
    void sortList_letters_and_numbers() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("Luis 100", "Luis 1", "Luis 1000", "Carl 2", "Carl 420", "Carl 69", "Luis 100000"));

        FileManager FM = new FileManager();

        String actual = FM.sortList(Employees);
        String expected = "Total of 7 names: \n" +
                "Carl 2\n" +
                "Carl 420\n" +
                "Carl 69\n" +
                "Luis 1\n" +
                "Luis 100\n" +
                "Luis 1000\n" +
                "Luis 100000\n";

        assertEquals(expected, actual);
    }
}
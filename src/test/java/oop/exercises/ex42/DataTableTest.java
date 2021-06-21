/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex42;

import oop.exercises.ex41.FileManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DataTableTest {

    @Test
    void printTable() {
        ArrayList<String> dataList = new ArrayList<String>
                (Arrays.asList("Ling,Mai,55900\n" +
                        "Johnson,Jim,56500\n" +
                        "Jones,Aaron,46000\n" +
                        "Jones,Chris,34500\n" +
                        "Swift,Geoffrey,14200\n" +
                        "Xiong,Fong,65000\n" +
                        "Zarnecki,Sabrina,51500"));

        DataTable DT = new DataTable();

        String actual = DT.printTable(dataList);
        String expected = "Last\t\t\tFirst\t\t\tSalary \n" +
                "--------------------------------------------\n" +
                "Ling\t\t\tMai\t\t\t55900\n" +
                "Johnson\t\t\tJim\t\t\t56500\n" +
                "Jones\t\t\tAaron\t\t\t46000\n" +
                "Jones\t\t\tChris\t\t\t34500\n" +
                "Swift\t\t\tGeoffrey\t\t\t14200\n" +
                "Xiong\t\t\tFong\t\t\t65000\n" +
                "Zarnecki\t\t\tSabrina\t\t\t51500\n";

        assertEquals(expected, actual);
    }
}
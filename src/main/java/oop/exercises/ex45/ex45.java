/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex45;

public class ex45 {
    public static String fileText = "";

    public static void main(String[] args) {

        //Create new class to include all html related methods
        WordFinder WF = new WordFinder();

        //Call method to read text file and save to String
        fileText = WF.readFile(fileText);

        //Call method to modify string
        fileText = WF.replaceWords(fileText);

        //Call method to create and write file
        WF.writeFile(fileText);

        //Test output
        //System.out.println(fileText);
    }

}


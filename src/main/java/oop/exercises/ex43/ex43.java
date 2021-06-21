/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex43;

import java.io.IOException;
import java.util.Scanner;

public class ex43 {
    private static final Scanner input = new Scanner(System.in);

    private static String Website;
    private static String Author;
    private static String JavaScript;
    private static String CSS;

    public static void main(String[] args) throws IOException {

        //Create new class to include all html related methods
        WebsiteManager WM = new WebsiteManager();

        //Call method for user input
        userString();
        //Call method to create website folder
        WM.websiteFolder();

        //Call method to create folder with website name
        String outputString = WM.websiteName(Website);
        //Call method to create html file
        outputString += WM.htmlFile(Website);
        //Call method to create JavaScript folder
        outputString += WM.jsFolder(Website, JavaScript);
        //Call method to create CSS folder
        outputString += WM.cssFolder(Website, CSS);
        //Call method to write html file
        WM.writeFile(Website, Author);

        //Print concatenated output
        System.out.println(outputString);

    }

    //Request user for input
    public static void userString() {

        System.out.print("Site name: ");
        Website = input.nextLine();

        System.out.print("Author: ");
        Author = input.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        JavaScript = input.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        CSS = input.nextLine();
    }

}

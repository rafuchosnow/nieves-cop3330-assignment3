/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteManager {

    //Create method to make a website folder
    public static void websiteFolder() {
        File Object = new File("src\\main\\java\\oop\\exercises\\ex43\\website");
        if (Object.mkdir()) {
        } else {
        }
    }

    //Create method to make folder with user input
    public static String websiteName(String Website) {
        String websiteOutput = "";

        //Type the desired path for the folder
        File Object = new File("src\\main\\java\\oop\\exercises\\ex43\\website\\" + Website);

        //Add output to confirm folder creation and testing
        if (Object.mkdir()) {
            websiteOutput = "Created ./website/" + Website + "\n";
        } else {
            websiteOutput = "That folder already exists";
        }
        return websiteOutput;
    }

    //Create method to make html file
    public static String htmlFile(String Website) throws IOException {
        String websiteOutput = "";

        //Type desired path for html file
        File Object = new File("src\\main\\java\\oop\\exercises\\ex43\\website\\" + Website + "\\index.html");

        //Add output to confirm folder creation and testing
        if (Object.createNewFile()) {
            websiteOutput = "Created ./website/" + Website + "/index.html\n";
        } else {
            websiteOutput = "That file already exists";
        }
        return websiteOutput;
    }

    //Create method to make JavaScript folder
    public static String jsFolder(String Website, String JavaScript) {
        String websiteOutput = "";

        //Add condition to determine folder creation
        if (JavaScript.equals("y") || JavaScript.equals("Y")) {
            File Object = new File("src\\main\\java\\oop\\exercises\\ex43\\website\\" + Website + "\\js");

            //Add output to confirm folder creation and testing
            if (Object.mkdir()) {
                websiteOutput = "Created ./website/" + Website + "/js/\n";
            } else {
                websiteOutput = "That folder already exists";
            }
        }
        return websiteOutput;
    }

    //Create method to make CSS folder
    public static String cssFolder(String Website, String CSS) {
        String websiteOutput = "";

        //Add condition to determine folder creation
        if (CSS.equals("y") || CSS.equals("Y")) {
            File Object = new File("src\\main\\java\\oop\\exercises\\ex43\\website\\" + Website + "\\css");

            //Add output to confirm folder creation and testing
            if (Object.mkdir()) {
                websiteOutput = "Created ./website/" + Website + "/css/\n";
            } else {
                websiteOutput = "That folder already exists";
            }
        }
        return websiteOutput;
    }

    //Create method to write html file
    public static void writeFile(String Website, String Author) {
        String websiteOutput = "";

        try {
            //Select file path
            FileWriter Object = new FileWriter("src\\main\\java\\oop\\exercises\\ex43\\website\\" + Website + "\\index.html");
            //Write file with site name and author
            Object.write("<html> \n<head> \n" +
                    "   <title>" + Website + "</title> \n" +
                    "   <meta author=\"" + Author + "\"> \n" +
                    "</head> \n</html>");
            Object.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

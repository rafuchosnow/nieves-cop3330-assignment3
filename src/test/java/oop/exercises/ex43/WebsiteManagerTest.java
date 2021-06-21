/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteManagerTest {


    @Test
    void websiteName() {
        WebsiteManager WM = new WebsiteManager();

        WM.websiteFolder();

        String actual = WM.websiteName("awesomeco");
        String expected = "Created ./website/awesomeco\n";

        assertEquals(expected, actual);
    }

    @Test
    void htmlFile() throws IOException {
        WebsiteManager WM = new WebsiteManager();

        String actual = WM.htmlFile("awesomeco");
        String expected = "Created ./website/awesomeco/index.html\n";

        assertEquals(expected, actual);
    }

    @Test
    void jsFolder() {
        WebsiteManager WM = new WebsiteManager();

        String actual = WM.jsFolder("awesomeco","y");
        String expected = "Created ./website/awesomeco/js/\n";

        assertEquals(expected, actual);
    }

    @Test
    void cssFolder() {
        WebsiteManager WM = new WebsiteManager();

        String actual = WM.cssFolder("awesomeco","y");
        String expected = "Created ./website/awesomeco/css/\n";

        assertEquals(expected, actual);
    }





}
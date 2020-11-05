package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Thief thief = new Thief("http://www.quizful.net/post/java-nio-tutorial");
        thief.saveToFile("E:\\3.txt");
    }




}

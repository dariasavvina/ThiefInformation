package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Thief {

    private String pathToSite;

    public String getPathToSite() {
        return pathToSite;
    }

    public Thief(String path){
        pathToSite =  path;
    }

    public void saveToFile(String pathToFile) {
        URL url;
        try{
            url = new URL(pathToSite);
        }
        catch (MalformedURLException e){
            System.out.println("Error connect");
            return;
        }
        try {
            InputStream input = url.openStream();
            Scanner scanner = new Scanner(input);
            ArrayList<String> words = new ArrayList<String>();
            while(scanner.hasNextLine()){
                words.add(scanner.nextLine());
            }
            Files.write(Paths.get(pathToFile), words, StandardOpenOption.WRITE);
            System.out.println("OK");
        }
        catch (IOException e){
            System.out.println("Error read or write file");
        }
    }
}

package org.example;
import java.util.*;
import java.io.*;
import com.opencsv.CSVReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "project.csv";
        File file = new File(filePath);
        MyFileReader reader = new MyFileReader();
        CsvObjectStructure[] allrecords = reader.read(file);

        for(CsvObjectStructure records: allrecords){
            System.out.println("Idea Name : " + records.getIdeaName());
            System.out.println("Idea Desc : " + records.getIdeaDesc());
            System.out.println("Vote Count : " + records.getVoteCount());
            System.out.println("Topic 1 : " + records.getTopic1());
            System.out.println("Topic 2 : " + records.getTopic2());
            System.out.println("Topic 3 : " + records.getTopic3());
            System.out.println("Status : " + records.getStatus());
            System.out.println("Authors Name : " + records.getAuthorsName());
            System.out.println("Authors Email : " + records.getAuthorsEmail());

        }


    }}
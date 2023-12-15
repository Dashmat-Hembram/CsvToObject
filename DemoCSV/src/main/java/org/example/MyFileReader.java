package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public  class MyFileReader {
    public CsvObjectStructure[] read(String[][] attributes, File file) throws  Exception{
        CsvObjectStructure csvObject;
        String[] records;
        CSVReader csvReader = null;
        final int MAX_RECORDS = 1000;
        CsvObjectStructure[] allRecords = new CsvObjectStructure[MAX_RECORDS];
        int recordCount = 0;

        try {
            CSVParser csvParser = new CSVParserBuilder()
                    .withSeparator(',') // Set the separator (comma in this case)
                    .build();

            // Create a CSVReader using the CSVParser and the File
            csvReader = new CSVReaderBuilder(new FileReader(file)) // Assuming 'file' is a File object
                    .withCSVParser(csvParser) // Set the created CSVParser
                    .build();

            // Extracted the attributes from csv file
            String[] attributeArray = csvReader.readNext();
            attributeArray[0] = attributeArray[0].trim().replace("\uFEFF", "");
            for (int i = 0; i < attributeArray.length; i++) {
                if (!(attributes[i][0].equals(attributeArray[i]))){
                    throw new Exception("Expected Attribute: " + attributes[i][0] + ", Received Attribute " + attributeArray[i]);
                }
            }

            while((records = csvReader.readNext()) != null){
                if(records.length == 10){
                    String id = records[0];
                    String ideaName = records[1];
                    String ideaDesc = records[2];
                    String voteCount = records[3];
                    String topic1 = records[4];
                    String topic2 = records[5];
                    String topic3 = records[6];
                    String status = records[7];
                    String authorsName = records[8];
                    String authorsEmail = records[9];

                    try{
                        int numericVoteCount = Integer.parseInt(voteCount);
                        int numericId = Integer.parseInt(voteCount);
//                        System.out.println("Idea Name: " + ideaName + " " +"Vote Count: " + numericValue                        );
//                        System.out.println("Idea Description: " + ideaDesc);
//                        System.out.println("Topic 1: " + topic1 + " " + "Topic 2: " + topic2 + " " + "Topic 3: " + topic3 +
//                                " " + "Status: " + status + "Authors Name: " + authorsName + "Authors Email: " + authorsEmail);

                        csvObject = new CsvObjectStructure(
                                numericId,
                                ideaName,
                                ideaDesc,
                                numericVoteCount,
                                topic1,
                                topic2,
                                topic3,
                                status,
                                authorsName,
                                authorsEmail);

                        allRecords[recordCount] = csvObject;
                        recordCount++;



                    }catch (NumberFormatException e){

                        System.err.println("Invalid value: " + voteCount);
                    }
                    }else {
                    System.err.println("Invalid tuple length: " + String.join(",", records));
                }
                }

        csvReader.close();
            }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Arrays.copyOf(allRecords, recordCount);
    }
}



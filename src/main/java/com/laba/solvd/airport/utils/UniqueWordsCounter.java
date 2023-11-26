package com.laba.solvd.airport.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class UniqueWordsCounter {
    private static final Logger LOGGER = LogManager.getLogger(UniqueWordsCounter.class);

    public static void main(String[] args) {
        countUniqueWordsInFile("src/main/resources/file.txt");

    }

    private static void countUniqueWordsInFile(String pathToFile) {
        try {
            File file = new File(pathToFile);
            String textFromFile = FileUtils.readFileToString(file);
            String[] wordsArray = StringUtils.split(textFromFile);
            int uniqueWordsCount = 0;
            for (String word : wordsArray) {
                if (StringUtils.countMatches(textFromFile, word) == 1) {
                    uniqueWordsCount++;
                }
            }
            FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), "Number of the unique words is " + uniqueWordsCount);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

}

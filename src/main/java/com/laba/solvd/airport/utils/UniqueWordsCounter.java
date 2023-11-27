package com.laba.solvd.airport.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsCounter {
    private static final Logger LOGGER = LogManager.getLogger(UniqueWordsCounter.class);

    public static void main(String[] args) {
        countUniqueWordsInFile("src/main/resources/file.txt", "src/main/resources/output.txt");

    }

    private static void countUniqueWordsInFile(String pathToFile, String pathToOutputFile) {
        try {
            File file = new File(pathToFile);
            String textFromFile = FileUtils.readFileToString(file);
            String[] wordsArray = StringUtils.split(textFromFile);
            Set<String> uniqueWords = new HashSet<>();
            for (String word : wordsArray) {
                uniqueWords.add(word);
            }
            FileUtils.writeStringToFile(new File(pathToOutputFile), "Number of the unique words is " + uniqueWords.size());
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

}

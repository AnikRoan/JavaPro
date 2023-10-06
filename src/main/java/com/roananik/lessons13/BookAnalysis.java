package com.roananik.lessons13;

import java.io.*;
import java.util.*;


public class BookAnalysis implements Runnable {
    private final String infoMessage = "Unique words:\n";

    private final StringBuilder bookStatistics = new StringBuilder();
    private String nameBook;
    private String[] allWordsFromBook;
    private int numberOfWordsNeeded;
    Map<String, Integer> wordsAndNumberOfRepetitions = new HashMap<>();


    public BookAnalysis() {

    }

    private void getScanner() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the book title");
        nameBook = scanner.nextLine();

        System.out.println("enter the number. hom many unique words do you want to get");
        numberOfWordsNeeded = scanner.nextInt();

        scanner.close();
    }

    @Override
    public void run() {
        getScanner();

        String pathFile = "src/" + this.nameBook + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String line;
            StringBuilder temporaryResult = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                temporaryResult.append(line).append(" ");

            }
            line = temporaryResult.toString().toLowerCase();
            line = line.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            allWordsFromBook = line.split("\\s+");

        } catch (FileNotFoundException e) {
            System.out.println("book not found");
            return;
        } catch (IOException e) {
            System.out.println("Something went wrong");
            return;
        }

        getSpecifiedNumberOfWords();

        amountOfAllUniqueWords();

        bookStatistics.append("name file: " + this.nameBook + "_statistic.txt");

        createStatisticFile();

        System.out.println(bookStatistics);
    }


    private void getSpecifiedNumberOfWords() {

        for (String word : allWordsFromBook) {
            if (word.length() > 2)
                wordsAndNumberOfRepetitions
                        .put(word, wordsAndNumberOfRepetitions.getOrDefault(word, 0) + 1);
        }


        List<Map.Entry<String, Integer>> popularWords = new ArrayList<>(wordsAndNumberOfRepetitions.entrySet());
        popularWords.sort((a, b) -> b.getValue()
                .compareTo(a.getValue()));

        List<String> selectedWords = popularWords.stream()
                .map(p -> p.getKey())
                .limit(this.numberOfWordsNeeded)
                .toList();

        bookStatistics.append(numberOfWordsNeeded).append(infoMessage);

        for (var word : selectedWords) {
            bookStatistics.append(word).append(": ")
                    .append(wordsAndNumberOfRepetitions.get(word)).append(". \n");
        }


    }

    private void amountOfAllUniqueWords() {
        bookStatistics.append(infoMessage + "total: ").append(wordsAndNumberOfRepetitions.size()).append("\n");
    }


    private void createStatisticFile() {
        String statisticFile = this.nameBook + "_statistic.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(statisticFile))) {
            writer.write(bookStatistics.toString());

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }


}







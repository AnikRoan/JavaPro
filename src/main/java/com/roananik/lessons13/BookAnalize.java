package com.roananik.lessons13;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookAnalize implements Runnable {
    private StringBuilder allInfo = new StringBuilder();
    private final String nameBook;
    private String[] bookData;

    private final int countLimit;
    Map<String, Integer> map = new HashMap<>();


    public BookAnalize(String nameBook, int countLimit) {
        this.nameBook = nameBook;
        this.countLimit = countLimit;
    }


    private void createStatisticFile() {
        String names = this.nameBook + "_statistic.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(names))) {
            writer.write(allInfo.toString());


        } catch (IOException e) {
            System.out.println("som wrong");
        }
    }


    private void unik() {
        int count = map.size();
//        for (var w : map.entrySet()) {
//            if (w.getKey().length() > 1) {
//                count++;
//            }
//
//        }
        System.out.println("Unique words in total: " + count);
        allInfo.append("Unique words in total: ").append(count).append("\n");
    }

    private void countWords() {

        for (String word : bookData) {

            if (word.length() > 3)
                map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> popularWords = new ArrayList<>(map.entrySet());
        popularWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        List<String> result10Words = popularWords.stream().map(p -> p.getKey()).limit(this.countLimit).toList();
        System.out.println(countLimit + " unique words:\n" + result10Words);
        allInfo.append(countLimit + " Unique words:\n");
        for (var res : result10Words) {
            allInfo.append(res).append(": ").append(map.get(res)).append(". \n");
        }


    }


    @Override
    public void run() {
        String adres = "src/" + this.nameBook + ".txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(adres))) {
            String line;
            StringBuilder bilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                bilder.append(line).append(" ");

            }
            line = bilder.toString().toLowerCase();
            line = line.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            bookData = line.split("\\s+");

        } catch (FileNotFoundException e) {
            System.out.println("file not faund");
            return;
        } catch (IOException e) {
            System.out.println("no conect");
            return;
        }

        countWords();
        unik();
        allInfo.append("name file: " + this.nameBook + "_statistic.txt");
        createStatisticFile();
    }


}







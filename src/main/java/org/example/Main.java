package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/resources/input"));
        List<Integer> inputs = new ArrayList<>();
        while (sc.hasNext()) {
            String inputLine = sc.nextLine();
            if (inputLine.isBlank()) {
                inputs.add(-1);
            } else {
                inputs.add(Integer.parseInt(inputLine));
            }
        }

        int buf = 0;
        int max = 0;
        int i = 1;
        int maxI = i;
        for (Integer input : inputs) {
            if (input != -1) {
                buf += input;
            } else {
                if (buf > max) {
                    max = buf;
                    maxI = i;
                }
                buf = 0;
                i++;
            }
        }

        System.out.println("Max calories are " + max + " carried by elf number " + maxI);
    }
}
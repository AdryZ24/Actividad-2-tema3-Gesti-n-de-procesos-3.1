package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPalabras = 0;

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (!linea.trim().isEmpty()) {
                String[] palabras = linea.trim().split("\\s+");
                totalPalabras += palabras.length;
            }
        }

        System.out.println("Total de palabras: " + totalPalabras);
        scanner.close();
    }
}


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (linea.length() > 20) {
                // Se imprime la línea normal → pasa al siguiente JAR
                System.out.println(linea);
            } else {
                // Se imprime en error para que no interfiera con la tubería
                System.err.println("[NO PASA] " + linea);
            }
        }

        scanner.close();
    }
}

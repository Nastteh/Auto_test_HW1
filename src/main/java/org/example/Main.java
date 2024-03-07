package org.example;

import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int totalWins = 0;
        int totalLosses = 0;
        int totalGames = 0;

        for (int i = 0; i < 1000; i++) {
            int carDoor = random.nextInt(3);
            int selectedDoor = random.nextInt(3);

            int shownDoor;
            do {
                shownDoor = random.nextInt(3);
            } while (shownDoor == carDoor || shownDoor == selectedDoor);

            int finalChoice;
            do {
                finalChoice = random.nextInt(3);
            } while (finalChoice == selectedDoor || finalChoice == shownDoor);

            if (finalChoice == carDoor) {
                totalWins++;
            } else {
                totalLosses++;
            }
        }
        totalGames = totalWins + totalLosses;
        System.out.println("Всего игр: " + totalGames);
        System.out.println("Количество выигрышей: " + totalWins);
        System.out.println("Количество проигрышей: " + totalLosses);
        System.out.println("Коэффициент успеха: " + (double) totalWins / totalGames);
    }
}

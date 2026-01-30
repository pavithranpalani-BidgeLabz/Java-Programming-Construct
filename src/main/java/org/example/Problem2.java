package org.example;

import java.util.Random;

public class Problem2 {

    // Constants
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    // Method to play Snake & Ladder
    public void playGame() {

        int player1Position = 0;
        int player2Position = 0;
        int diceCount = 0;

        Random random = new Random();
        boolean isPlayer1Turn = true;

        while (player1Position < WINNING_POSITION &&
                player2Position < WINNING_POSITION) {

            int dice = random.nextInt(6) + 1;
            diceCount++;

            int option = random.nextInt(3);
            int currentPosition;

            if (isPlayer1Turn) {
                currentPosition = player1Position;
                System.out.println("Player 1 rolls dice: " + dice);
            } else {
                currentPosition = player2Position;
                System.out.println("Player 2 rolls dice: " + dice);
            }

            switch (option) {
                case NO_PLAY:
                    System.out.println("No Play");
                    break;

                case LADDER:
                    System.out.println("Ladder");
                    currentPosition += dice;
                    break;

                case SNAKE:
                    System.out.println("Snake");
                    currentPosition -= dice;
                    break;
            }

            // UC4: Position below 0
            if (currentPosition < 0) {
                currentPosition = 0;
            }

            // UC5: Exact winning position
            if (currentPosition > WINNING_POSITION) {
                System.out.println("Position exceeds 100, stays same");
                currentPosition = isPlayer1Turn ? player1Position : player2Position;
            }

            // Update player position
            if (isPlayer1Turn) {
                player1Position = currentPosition;
                System.out.println("Player 1 Position: " + player1Position);
            } else {
                player2Position = currentPosition;
                System.out.println("Player 2 Position: " + player2Position);
            }

            System.out.println("--------------------------------");

            // UC7: If Ladder, same player plays again
            if (option != LADDER) {
                isPlayer1Turn = !isPlayer1Turn;
            }
        }

        // Winner
        if (player1Position == WINNING_POSITION) {
            System.out.println("🎉 Player 1 WON the game!");
        } else {
            System.out.println("🎉 Player 2 WON the game!");
        }

        // UC6: Dice count
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}

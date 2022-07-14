package tictactoe;

import java.util.Random;

public class EngineMedium {
    
    static int[] calculatePlayer(String[][] twoDimArray) {
        int numbersOfX = 0;
        int numbersOfO = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j].equals("X")) {
                    numbersOfX = numbersOfX + 1;
                }
                if (twoDimArray[i][j].equals("O")) {
                    numbersOfO = numbersOfO + 1;
                }
            }
        }

        int[] numbers = new int[2];
        numbers[0] = numbersOfX;
        numbers[1] = numbersOfO;

        return  numbers;
    }

    static String[][] machinePlaysMedium(String[][] twoDimArray) {

        int[] numbers = calculatePlayer(twoDimArray);

        int numbersOfX = numbers[0];
        int numbersOfO = numbers[1];

        String[][] copy = twoDimArray;
        String saveVariable = "";

        String player = "";

        if(numbersOfX <= numbersOfO) {
            player = "X";
        } else {
            player = "O";
        }

            for (int i = 0; i < copy.length; i++) {
                for (int j = 0; j < copy[i].length; j++) {
                    saveVariable = copy[i][j];
                    if (!copy[i][j].equals("X") && !copy[i][j].equals("O")) {
                        copy[i][j] = "X";
                        int winner = Win.verifyWinnerMachine(copy);
                        if (winner == -1) {
                            copy[i][j] = player;
                            Print.printTwoDimensionsArray(copy);
                            return copy;
                        } else {
                            copy[i][j] = saveVariable;
                        }
                    }
                }
            }
            for (int i = 0; i < copy.length; i++) {
                for (int j = 0; j < copy[i].length; j++) {
                    saveVariable = copy[i][j];
                    if (!copy[i][j].equals("X") && !copy[i][j].equals("O")) {
                        copy[i][j] = "O";
                        int winner = Win.verifyWinnerMachine(copy);
                        if (winner == -1) {
                            copy[i][j] = player;
                            Print.printTwoDimensionsArray(copy);
                            return copy;
                        } else {
                            copy[i][j] = saveVariable;
                        }
                    }
                }
            }


            Random random = new Random();
            int coordinateLine = random.nextInt(3);
            int coordinateColumn = random.nextInt(3);

            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    if (twoDimArray[coordinateLine][coordinateColumn].equals("X")) {
                        coordinateLine = random.nextInt(3);
                        coordinateColumn = random.nextInt(3);
                    }
                    if (twoDimArray[coordinateLine][coordinateColumn].equals("O")) {
                        coordinateLine = random.nextInt(3);
                        coordinateColumn = random.nextInt(3);
                    }
                }
            }

            if (numbersOfX <= numbersOfO) {
                twoDimArray[coordinateLine][coordinateColumn] = "X";
            } else {
                twoDimArray[coordinateLine][coordinateColumn] = "O";
            }

        Print.printTwoDimensionsArray(twoDimArray);
        return twoDimArray;
    }
}

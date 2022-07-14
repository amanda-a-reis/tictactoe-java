package tictactoe;

import java.util.Random;
import tictactoe.Print.*;

public class Engine {

    static String[][] machinePlays(String[][] twoDimArray, String level) {


        if (level ==  "easy") {
            System.out.println("Making move level \"easy\"");
        }

        if (level == "medium") {
            System.out.println("Making move level \"medium\"");
        }

        Random random = new Random();
        int coordinateLine = random.nextInt(3);
        int coordinateColumn = random.nextInt(3);
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

        if(numbersOfX <= numbersOfO) {
            twoDimArray[coordinateLine][coordinateColumn] = "X";
        } else {
            twoDimArray[coordinateLine][coordinateColumn] = "O";
        }

        Print.printTwoDimensionsArray(twoDimArray);

        return twoDimArray;
    }


    static String[][] userPlays (String[][] twoDimArray, String[] newCoordinates) {

        int coordinateLine = Integer.parseInt(newCoordinates[0]) - 1;
        int coordinateColumn = Integer.parseInt(newCoordinates[1]) - 1;
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

        if(numbersOfX <= numbersOfO) {
            twoDimArray[coordinateLine][coordinateColumn] = "X";
        } else {
            twoDimArray[coordinateLine][coordinateColumn] = "O";
        }

        Print.printTwoDimensionsArray(twoDimArray);

        return twoDimArray;
    }

}

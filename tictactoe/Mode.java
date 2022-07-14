package tictactoe;

import java.util.Scanner;

public class Mode {

    final static Scanner scanner = new Scanner(System.in);

    public static void easyEasy(String[][] twoDimArray) {
        int endGame = 0;
        while (endGame != -1) {
            String[][] newMachine = Engine.machinePlays(twoDimArray, "easy");
            twoDimArray = newMachine;
            endGame = Win.verifyWinner(newMachine);
        }
    }

    public static String[][] user(String[][] twoDimArray) {
        System.out.println("Enter the coordinates:");
        String userCoordinates = scanner.nextLine();
        String[] coordinates = userCoordinates.split(" ");

        String[][] newArray = Engine.userPlays(twoDimArray, coordinates);

        return newArray;
    }

    public static void userUser(String[][] twoDimArray) {
        int winOne = 0;
        int winTwo = 0;
        while (winOne != -1 && winTwo != -1) {
            String[][] userOne = user(twoDimArray);
            winOne = Win.verifyWinner(userOne);
            if(winOne == -1) break;
            String[][] userTwo = user(userOne);
            winTwo = Win.verifyWinner(userTwo);
            twoDimArray = userTwo;
            if(winTwo == -1) break;
        }
    }

    public static void easyUser(String[][] twoDimArray) {
        int winOne = 0;
        int winTwo = 0;
        while (winOne != -1 && winTwo != -1) {
            String [][] machine = Engine.machinePlays(twoDimArray, "easy");
            winOne = Win.verifyWinner(machine);
            if(winOne == -1) break;
            String[][] player = user(machine);
            winTwo = Win.verifyWinner(player);
            twoDimArray = player;
            if(winTwo == -1) break;
        }
    }

    public static void userEasy (String[][] twoDimArray){
        int winOne = 0;
        int winTwo = 0;
        boolean condition = true;
        while (winOne != -1 && winTwo != -1) {
            String[][] player = user(twoDimArray);
            winOne = Win.verifyWinner(player);
            if(winOne == -1) break;
            String[][] machine = Engine.machinePlays(player, "easy");
            winTwo = Win.verifyWinner(player);
            twoDimArray = machine;
            if(winTwo == -1) break;
        }
    }

    public static void mediumUser(String[][] twoDimArray) {
        int winOne = 0;
        int winTwo = 0;
        while (winOne != -1 && winTwo != -1) {
            String [][] machine = EngineMedium.machinePlaysMedium(twoDimArray);
            winOne = Win.verifyWinner(machine);
            if(winOne == -1) break;
            String[][] player = user(machine);
            winTwo = Win.verifyWinner(player);
            twoDimArray = player;
            if(winTwo == -1) break;
        }
    }

    public static void userMedium (String[][] twoDimArray){
        int winOne = 0;
        int winTwo = 0;
        while (winOne != -1 && winTwo != -1) {
            String[][] player = user(twoDimArray);
            winOne = Win.verifyWinner(player);
            if(winOne == -1) break;
            String[][] machine = EngineMedium.machinePlaysMedium(player);
            winTwo = Win.verifyWinner(player);
            twoDimArray = machine;
            if(winTwo == -1) break;
        }
    }

    public static void mediumMedium(String[][] twoDimArray) {
        int winOne = 0;
        int winTwo = 0;
        while (winOne != -1 && winTwo != -1) {
            String[][] newMachine = EngineMedium.machinePlaysMedium(twoDimArray);
            winOne = Win.verifyWinner(newMachine);
            if(winOne == -1) break;
            String[][] machineTwo = EngineMedium.machinePlaysMedium(newMachine);
            winTwo = Win.verifyWinner(machineTwo);
            if(winTwo == -1) break;
            twoDimArray = machineTwo;

        }
    }
}

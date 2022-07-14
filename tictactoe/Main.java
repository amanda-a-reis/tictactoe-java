package tictactoe;


import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //while stops when game ends
        int exit = 0;

        while (exit != -1) {

            String[] commands = starOrEndGame();

            String[][] twoDimArray = Print.printVoidArray();

            if(commands[1].equals("easy") && commands[2].equals("easy")) {
                Mode.easyEasy(twoDimArray);
            }
            if(commands[1].equals("user") && commands[2].equals("user")) {
                Mode.userUser(twoDimArray);
            }

            if(commands[1].equals("easy") && commands[2].equals("user")) {
                Mode.easyUser(twoDimArray);
            }

            if(commands[1].equals("user") && commands[2].equals("easy")) {
                Mode.userEasy(twoDimArray);
            }
        }
    }

    static String[] starOrEndGame() {

        System.out.println("Input command: ");
        String[] userCommands = scanner.nextLine().split(" ");

        return userCommands;
    }





}

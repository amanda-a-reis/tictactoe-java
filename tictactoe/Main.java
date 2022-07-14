package tictactoe;


import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //while stops when game ends
        int exitGame = 0;

        while (exitGame != -1) {

            String[] commands = starOrEndGame();

            while (commands.length != 3 && !commands[0].equals("exit")) {
                System.out.println("Bad parameters!");
                commands = starOrEndGame();
;            }

            if(commands[0].equals("exit")) {
                break;
            }

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

            if(commands[1].equals("medium") && commands[2].equals("user")) {
                Mode.mediumUser(twoDimArray);
            }

            if(commands[1].equals("user") && commands[2].equals("medium")) {
                Mode.userMedium(twoDimArray);
            }

            if(commands[1].equals("medium") && commands[2].equals("medium")) {
                Mode.mediumMedium(twoDimArray);
            }

        }
    }

    static String[] starOrEndGame() {

        System.out.println("Input command: ");
        String[] userCommands = scanner.nextLine().split(" ");

        return userCommands;
    }

}

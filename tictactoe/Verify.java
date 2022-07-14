package tictactoe;

public class Verify {

    static int verifyTheUserInput(String[][] twoDimArray, String[] newCoordinates) {
        for(int i = 0; i < newCoordinates.length; i++) {
            int n = Integer.parseInt(newCoordinates[i]);
            if(n < 1 || n > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                return 1;
            }
        }

        int coordinateLine = Integer.parseInt(newCoordinates[0]) - 1;
        int coordinateColumn = Integer.parseInt(newCoordinates[1]) - 1;

        if (twoDimArray[coordinateLine][coordinateColumn].equals("X") || twoDimArray[coordinateLine][coordinateColumn].equals("O")) {
            System.out.println("This cell is occupied! Choose another one!");
            return 1;
        }

        return -1;

    }
    static int verification(String[][] twoDimArray, String coordinates) {
        String[] newCoordinates = coordinates.split(" ");
        try {
            int coordinateLine = Integer.parseInt(newCoordinates[0]) - 1;
            int coordinateColumn = Integer.parseInt(newCoordinates[1]) - 1;
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            return 1;
        }
        int endGame = verifyTheUserInput(twoDimArray, newCoordinates);
        return endGame;
    }


}

package tictactoe;

public class Win {

    static int verifyWinner(String[][] playerOne) {

        String one = winner(playerOne);

        if(one != "") {
            System.out.println(one);
            return -1;
        } else {
            return 1;
        }

    }

    static int verifyWinnerMachine(String[][] playerOne) {

        String one = winner(playerOne);

        if(one != "") {
            return -1;
        } else {
            return 1;
        }

    }

    static String winner(String[][] twoDimArray) {

        String horizontal = linesHorizontal(twoDimArray);
        String vertical = linesVertical(twoDimArray);
        String diagonalOne = diagonalOne(twoDimArray);
        String diagonalTwo = diagonalTwo(twoDimArray);
        String draw = totalTable(twoDimArray);

        if (horizontal != "") {
            return horizontal;
        } else if (vertical != "") {
            return vertical;
        } else if (diagonalOne != "") {
            return diagonalOne;
        } else if (diagonalTwo != "") {
            return diagonalTwo;
        } else if (draw != "") {
            return draw;
        } else {
            return "";
        }

    }


    static String totalTable (String[][] twoDimArray) {
        int totalTable = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if(twoDimArray[i][j].equals("X") || twoDimArray[i][j].equals("O")) {
                    totalTable = totalTable + 1;
                }
            }
        }

        if(totalTable == 9) {
            return "Draw";
        }

        return "";
    }

    static  String diagonalOne (String[][] twoDimArray) {

        int sumX = 0;
        int sumO = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == j) {
                    if(twoDimArray[i][j].equals("X")) {
                        sumX = sumX + 1;
                    }
                    if(twoDimArray[i][j].equals("O")) {
                        sumO = sumO + 1;
                    }
                }
            }
            if(sumX == 3) {
                return "X wins";
            }
            if(sumO == 3) {
                return "O wins";
            }
        }
        return "";
    }

    static  String diagonalTwo (String[][] twoDimArray) {

        int sumX = 0;
        int sumO = 0;

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == 2 && j == 0 || i == 0 && j == 2 || i == 1 && j == 1) {
                    if(twoDimArray[i][j].equals("X")) {
                        sumX = sumX + 1;
                    }
                    if(twoDimArray[i][j].equals("O")) {
                        sumO = sumO + 1;
                    }
                }
            }
            if(sumX == 3) {
                return "X wins";
            }
            if(sumO == 3) {
                return "O wins";
            }
        }
        return "";
    }

    static String linesVertical (String[][] twoDimArray) {

        int sumX = 0;
        int sumO = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(twoDimArray[j][i].equals("X")) {
                    sumX = sumX + 1;
                }
                if(twoDimArray[j][i].equals("O")) {
                    sumO = sumO + 1;
                }
            }
            if(sumX == 3) {
                return "X wins";
            }
            if(sumO == 3) {
                return "O wins";
            }
            sumX = 0;
            sumO = 0;
        }
        return "";
    }

    static String linesHorizontal (String[][] twoDimArray) {

        int sumX = 0;
        int sumO = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(twoDimArray[i][j].equals("X")) {
                    sumX = sumX + 1;
                }
                if(twoDimArray[i][j].equals("O")) {
                    sumO = sumO + 1;
                }
            }
            if(sumX == 3) {
                return "X wins";
            }
            if(sumO == 3) {
                return "O wins";
            }
            sumX = 0;
            sumO = 0;
        }

        return "";
    }

}

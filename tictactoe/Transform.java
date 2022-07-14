package tictactoe;

public class Transform {

    static String[][] transformIntoTwoDimensionsArray(String[] newTable) {

        String [][] twoDimArray = new String[3][3];

        int num = 0;
        for (int i = 0; i < 3; i++) {
            for(int k = 0; k < 3; k++) {
                if (newTable[num].equals("_")) {
                    twoDimArray[i][k] = " ";
                } else {
                    twoDimArray[i][k] = newTable[num];
                }
                num = num + 1;
            }
        }
        return twoDimArray;
    }

}

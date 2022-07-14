package tictactoe;

public class Print {

    static String[][] printVoidArray() {
        String table = "_________";
        String[] newTable = table.split("");

        String[][] twoDimArray = Transform.transformIntoTwoDimensionsArray(newTable);
        printTwoDimensionsArray(twoDimArray);

        return twoDimArray;
    }

    static void printTwoDimensionsArray(String[][] twoDimArray) {

        System.out.println("---------");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if(j == 0) {
                    System.out.print("| " + twoDimArray[i][j] + " ");
                } else {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

}

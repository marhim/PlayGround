package senet;

public class GameBoard {
    private int rows = 11;
    private int cols = 51;
    private String[][] gb = new String[rows][cols];
    private int fieldcount = 30;

    /** Generates the game board with multiple for-loops.
     * TODO: Replace for-loops because they are unreadable, confusing and not maintainable.
     */
    public void generateGameBoard(){
        for(int k = 0; k < rows; k++){
            if (k == 0){
                for(int i = 0; i < cols; i++){
                    if(i == 23 || i == 29){
                        gb[k][i] = "-";
                    }else if(i == 24) {
                        gb[k][i] = "S";
                    }else if(i == 25 || i == 27) {
                        gb[k][i] = "e";
                    }else if(i == 26) {
                        gb[k][i] = "n";
                    }else if(i == 28) {
                        gb[k][i] = "t";
                    }else {
                        gb[k][i] = " ";
                    }
                }
            }else if (k == 1 || k == 10){
                for(int i = 0; i < cols; i++){
                    if(i == 0 || i == 50){
                        gb[k][i] = "+";
                    }else {
                        gb[k][i] = "-";
                    }
                }
            }else if (k == 2){
                for(int i = 0; i < cols; i++){
                    if (i == 0){
                        for(int j = i; j < cols; j += 5){
                            gb[k][j] = "|";
                        }
                    }else if (i == 1 || i == 4){
                        for(int j = i; j < cols; j += 5){
                            if (j == 21 || j == 24){
                                gb[k][j] = "-";
                            }else {
                                gb[k][j] = " ";
                            }
                        }
                    }else if (i == 2){
                        for(int j = i; j < cols; j += 5){
                            if (j == 47){
                                gb[k][j] = "1";
                            }else {
                                gb[k][j] = "0";
                            }
                        }
                    }else if (i == 3){
                        gb[k][i] = "1";
                    }else if (i == 8){
                        gb[k][i] = "2";
                    }else if (i == 13){
                        gb[k][i] = "3";
                    }else if (i == 18){
                        gb[k][i] = "4";
                    }else if (i == 23){
                        gb[k][i] = "5";
                    }else if (i == 28){
                        gb[k][i] = "6";
                    }else if (i == 33){
                        gb[k][i] = "7";
                    }else if (i == 38){
                        gb[k][i] = "8";
                    }else if (i == 43){
                        gb[k][i] = "9";
                    }else if (i == 48){
                        gb[k][i] = "0";
                    }
                }
            }else if (k == 3 || k == 6 || k == 9){
                for(int i = 0; i < cols; i++){
                    if (i == 0){
                        for(int j = i; j < cols; j += 5){
                            gb[k][j] = "|";
                        }
                    }else if (i == 1 || i == 4){
                        for(int j = i; j < cols; j += 5){
                            if (k == 9 && j == 31){
                                gb[k][j] = "/";
                            }else if (k == 9 && j == 34){
                                gb[k][j] = "\\";
                            }else{
                                gb[k][j] = ":";
                            }
                        }
                    }else if (i == 2 || i == 3){
                        for(int j = i; j < cols; j += 5){
                            gb[k][j] = " ";
                        }
                    }
                }
            }else if (k == 4 || k == 7){
                for(int i = 0; i < cols; i++){
                    if (i%5 == 0){
                        gb[k][i] = "+";
                    }else {
                        gb[k][i] = "-";
                    }
                }
            }else if (k == 5){
                for(int i = 0; i < cols; i++){
                    if (i == 0){
                        for(int j = i; j < cols; j += 5){
                            gb[5][j] = "|";
                        }
                    }else if (i == 1 || i == 4){
                        for(int j = i; j < cols; j += 5){
                            if (j == 26){
                                gb[k][j] = "[";
                            }else if (j == 29){
                                gb[k][j] = "]";
                            }else {
                                gb[k][j] = " ";
                            }
                        }
                    }else if (i == 2){
                        for(int j = i; j < cols; j += 5){
                            if (j == 2){
                                gb[k][j] = "2";
                            }else {
                                gb[k][j] = "1";
                            }
                        }
                    }else if (i == 3){
                        gb[k][i] = "0";
                    }else if (i == 8){
                        gb[k][i] = "9";
                    }else if (i == 13){
                        gb[k][i] = "8";
                    }else if (i == 18){
                        gb[k][i] = "7";
                    }else if (i == 23){
                        gb[k][i] = "6";
                    }else if (i == 28){
                        gb[k][i] = "5";
                    }else if (i == 33){
                        gb[k][i] = "4";
                    }else if (i == 38){
                        gb[k][i] = "3";
                    }else if (i == 43){
                        gb[k][i] = "2";
                    }else if (i == 48){
                        gb[k][i] = "1";
                    }
                }
            }else if (k == 8){
                for(int i = 0; i < cols; i++){
                    if (i == 0){
                        for(int j = i; j < cols; j += 5){
                            gb[k][j] = "|";
                        }
                    }else if (i == 1 || i == 4){
                        for(int j = i; j < cols; j += 5){
                            if (j == 26 || j == 36 || j == 41 || j == 46){
                                gb[k][j] = "(";
                            }else if (j == 29 || j == 39 || j == 44 || j == 49){
                                gb[k][j] = ")";
                            }else if (j == 31){
                                gb[k][j] = "\\";
                            }else if (j == 34){
                                gb[k][j] = "/";
                            }else {
                                gb[k][j] = " ";
                            }
                        }
                    }else if (i == 2){
                        for(int j = i; j < cols; j += 5){
                            if (j == 47){
                                gb[k][j] = "3";
                            }else {
                                gb[k][j] = "2";
                            }
                        }
                    }else if (i == 3){
                        gb[k][i] = "1";
                    }else if (i == 8){
                        gb[k][i] = "2";
                    }else if (i == 13){
                        gb[k][i] = "3";
                    }else if (i == 18){
                        gb[k][i] = "4";
                    }else if (i == 23){
                        gb[k][i] = "5";
                    }else if (i == 28){
                        gb[k][i] = "6";
                    }else if (i == 33){
                        gb[k][i] = "7";
                    }else if (i == 38){
                        gb[k][i] = "8";
                    }else if (i == 43){
                        gb[k][i] = "9";
                    }else if (i == 48){
                        gb[k][i] = "0";
                    }
                }
            }
        }
    }

    /** Method for printing the game board to the console. */
    public void printGameBoard(){
        for (String[] strings : gb) {
            for (int j = 0; j < gb[0].length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println("");
        }
    }

}

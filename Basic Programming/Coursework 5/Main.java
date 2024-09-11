public class Main {


    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    static void task1(){
        //read the file
        Scanner sc = new Scanner(Main.class.getResourceAsStream("matrix.txt"));
        //get the number of matrix
        int nm = sc.nextInt();

        //loop for each matrix
        for(int i = 0; i < nm ; i++){
            //read the number of row and colomn;
            int row = sc.nextInt();
            int column = sc.nextInt();

            //declare the original matrix
            int [][] matrix = new int[row][column];
            //declare the transpose matrix
            int [][] transposeMatrix = new int[column][row];

            //declare varible to hold the number
            int val;

            //assign the number into the 2D matrix
            for(int j = 0; j < row; j++){
                for(int k = 0; k < column; k++){
                    val = sc.nextInt();
                    matrix[j][k] = val;
                    transposeMatrix[k][j]= val;
                }
            }

            // Print the original matrix
            System.out.println("M:");
            for(int j = 0; j < row; j++){
                for(int k = 0; k < column; k++){
                    System.out.print(matrix[j][k] + "\t");
                }
                System.out.println();
            }

            // Print the transpose matrix
            System.out.println("M':");
            for(int j = 0; j < column; j++){
                for(int k = 0; k < row; k++){
                    System.out.print(transposeMatrix[j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }


    static void task2(){
        //read the input file and the number of test case
        Scanner sc = new Scanner(Main.class.getResourceAsStream("board.txt"));
        int t = sc.nextInt();

        int xPosQueen = 0;
        int yPosQueen = 0;
        int xPosPawn = 0;
        int yPosPawn = 0;

        // declare board array
        int[][] board = new int [8][8];

        //loop for each test case
        for(int n = 0; n < t; n++) {
            //declare the needed variable
            //loop to assign the number into 2D array and find the position of queen and Pawn
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = sc.nextInt();

                    if (board[i][j] == 1) {
                        xPosQueen = i;
                        yPosQueen = j;
                    } else if (board[i][j] == 2) {
                        xPosPawn = i;
                        yPosPawn = j;
                    }
                }
            }

            //declare the variable needed to check are the pawn is threatened
            boolean isThreatened = false;
            boolean isOneCol = false;
            boolean isOneRow = false;
            boolean isDiagonal = false;
            int minCol = 0;
            int maxCol = 0;
            int minRow = 0;
            int maxRow = 0;

            // check whether the pawn is threatened or not
            // apakah dalam satu kolom
            if (xPosQueen == xPosPawn){
                isOneCol = true;
                isThreatened = true;

                if (yPosPawn > yPosQueen){
                    minRow = yPosQueen;
                    maxRow = yPosPawn;
                } else {
                    minRow = yPosPawn;
                    maxRow = yPosQueen;
                }
            } else if (yPosQueen == yPosPawn) { // apakah dalam satu baris
                isOneRow = true;
                isThreatened = true;

                if (xPosPawn > xPosQueen) {
                    minCol = xPosQueen;
                    maxCol = xPosPawn;
                } else {
                    minCol = xPosPawn;
                    maxCol = xPosQueen;
                }
            } else if (Math.abs(yPosPawn - yPosQueen) == (Math.abs(xPosPawn - xPosQueen))){ // apakah dalam satu diagonal
                isDiagonal = true;
                isThreatened = true;

                if (xPosPawn > xPosQueen){
                    minCol = xPosQueen;
                    maxCol = xPosPawn;
                } else {
                    minCol = xPosPawn;
                    maxCol = xPosQueen;
                }

                if (yPosPawn > yPosQueen){
                    minRow = yPosQueen;
                    maxRow = yPosPawn;
                } else {
                    minRow = yPosPawn;
                    maxRow = yPosQueen;
                }
            }

            //your code here
            //print the chess board if the pawn is threatened by the queen
            if (isThreatened){
                System.out.println("YES");

                for(int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

                        if (board[i][j] == 1) {
                            System.out.print("Q\t");
                        } else if (board[i][j] == 2) {
                            System.out.print("P\t");
                        } else {

                            if (isOneCol && i == xPosQueen && j > minRow && j < maxRow) {
                                System.out.print("X\t");
                            } else if (isOneRow && j == yPosQueen && i > minCol && i < maxCol) {
                                System.out.print("X\t");
                            } else if (isDiagonal && i > minRow && i < maxRow && j > minCol && j < maxCol && (Math.abs(i - yPosQueen) == (Math.abs(j - xPosQueen)))) {
                                System.out.print("X\t");
                            } else {
                                System.out.print("O\t");
                            }
                        }
                    }
                    System.out.println();
                }
                System.out.println();

            } else {
                System.out.println("NO");
            }
        }
    }

    static void task3(){
        // read for the input file and the number of test case
        Scanner sc = new Scanner(Main.class.getResourceAsStream("penacomy.txt"));
        int t = sc.nextInt();

        int fromCity = 0;
        int toCity = 0;

        // initialize a matrix to represent the destinations
        int[][] destination = new int[6][6];

        // loops for each test case
        for (int n = 0; n < t; n++){
            // read for the mission destination
            fromCity = sc.nextInt()-1; // change to zero-based index
            toCity = sc.nextInt()-1;  // change to zero-based index

            // nested loops to make destination matrix
            for (int i = 0; i < 6; i++){
                for (int j = 0; j < 6; j++){
                    destination[i][j] = sc.nextInt();
                }
            }

            boolean canReachPenacomy = false;
            boolean canReachDestination = false;

            // check there is a route fromCity to Penacomy
            boolean[] visited = new boolean[6];
            visited[fromCity] = true;

            for (int i = 0; i < 6; i++){
                if (destination[fromCity][i] == 1){
                    if(fromCity == 5){
                        canReachPenacomy = true;
                    }
                    if(i == 5){
                        canReachPenacomy = true;
                        break;
                    } else if (i == toCity){
                        canReachDestination = false;
                        break;
                    }

                    // change the status of visited city
                    visited[i] = true;

                    for (int j = 0; j < 6; j++){
                        if (destination[i][j] == 1 && !visited[j]){
                            visited[j] = true;
                            if (j == 5){
                                canReachPenacomy = true;
                                break;
                            }
                            for (int k = 0; k < 6; k++){
                                if (destination[j][k] == 1 && !visited[k]){
                                    visited[k] = true;
                                    if (k == 5){
                                        canReachPenacomy = true;
                                        break;
                                    }

                                    for (int l = 0; l < 6; l++){
                                        if (destination[k][l] == 1 && !visited[l]){
                                            visited[l] = true;
                                            if (l == 5){
                                                canReachPenacomy = true;
                                                break;
                                            }

                                            for (int m = 0; m < 6; m++) {
                                                if (destination[l][m] == 1 && !visited[m]) {
                                                    visited[m] = true;
                                                    if (m == 5) {
                                                        canReachPenacomy = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // check there is a route Penacomy to toCity
            if (canReachPenacomy){
                boolean [] visited2 = new boolean[6];
                visited2[5] = true;

                for (int i = 0; i < 6; i++){
                    if (destination[5][i] == 1){
                        visited2[i] = true;
                        if (i == toCity){
                            canReachDestination = true;
                            break;
                        }
                        for (int j = 0; j < 6; j++){
                            if (destination[i][j] == 1 && !visited2[j]){
                                visited2[j] = true;
                                if (j == toCity){
                                    canReachDestination = true;
                                    break;
                                }
                                for (int k = 0; k < 6; k++){
                                    if (destination[j][k] == 1 && !visited2[k]){
                                        visited2[k] = true;
                                        if (k == toCity){
                                            canReachDestination = true;
                                            break;
                                        }
                                        for (int l = 0; l < 6; l++){
                                            if (destination[k][l] == 1 && !visited2[l]){
                                                visited2[l] = true;
                                                if (l == toCity){
                                                    canReachDestination = true;
                                                    break;
                                                }
                                            }
                                            for (int m = 0; m < 6; m++){
                                                if (destination[l][m] == 1 && !visited2[m]){
                                                    visited2[m] = true;
                                                    if (m == toCity){
                                                        canReachDestination = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (canReachPenacomy && canReachDestination){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

}

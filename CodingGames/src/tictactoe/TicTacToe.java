package tictactoe;

import processing.core.PApplet;

public class TicTacToe extends PApplet{
    // Variables
    int rows = 3;
    int cols = 3;
    int h;
    int w;
    int totalTurns = 0;
    GridSquare[][] board;

    public static void main(String[] args) {
        PApplet.main("tictactoe.TicTacToe");
    }

    public void setup() {
        surface.setTitle("Tic to the tack to the toe");
        h = height / rows;
        w = width / cols;
        board = new GridSquare[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++){
                board[r][c] = new GridSquare(r * w, c * h, w, h);
            }
        }

        System.out.println(board[1][2].x);

    }

    public void settings() {
        size(300, 300);
    }

    public void draw() {
        background(255);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                stroke(0);
                noFill();
                rect(w*i,h*j,w,h);
                board[i][j].drawTurn();
            }
        }

        if (winner != 1) {
            print("Win: " + winner);
        }
    }

    public void mousePressed() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                totalTurns = board[i][j].onClick(mouseX, mouseY, totalTurns);
            }
        }
    }

    // Check win should check to see if any player has one
    // It will need to check columns, rows, and diagonals
    int winner = -1;
    public void checkWin(int x, int y,int turn) {
        // Set win variables
        int colWin = 0;
        int rowWin = 0;
        int diag1Win = 0;
        int diag2Win = 0;

        // Loop through the three boxes to check in every combo
        for (int i = 0; i < 3; i++) {
            // Check the move's column
            if (board[x][i].state == turn) {
                colWin++;
            }
            // Check the move's row
            if (board[i][y].state == turn) {
                rowWin++;
            }
            // Check diagonal 1
            if (board[i][i].state == turn) {
                diag1Win++;
            }
            // Check diagonal 2
            if (board[i][2 - 1].state == turn) {
                diag2Win++;
            }
        }

        // Check if there were any full lines
        if (colWin == 3 || rowWin == 3 || diag1Win == 3 || diag2Win == 3) {
            winner = turn;
        }
    }

    public class GridSquare {
        public float x;
        public float y;
        public float w;
        public float h;
        public int state;
        public boolean full = false;

        public GridSquare(float tempX, float tempY, float tempW, float tempH){
            x = tempX;
            y = tempY;
            w = tempW;
            h = tempH;
            state = -1;
        }

        public void drawTurn() {
            if (state == 0) {
                //Draw O
                ellipse(x + w/2, y + h/2, w, h);
                ellipse((x + w/2), y + h/2, w - 10, h - 10);
            }
            if (state == 1) {
                //Draw X
                line(x,y,x + w, y + h);
                line(x + w, y, x, y + h);
            }
        }
        int onClick(int clickX, int clickY, int turn) {
            if (clickX > x && clickX < x + w && clickY > y && clickY < y + w && !full) {
                state = turn % 2;
                full = true;
                return turn +1;
            }
            return turn;
        }
    }
}

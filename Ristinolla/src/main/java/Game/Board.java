/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 * The board for a tic tac toe game. The size of the board will be an option for the players to choose.
 *
 * @author tolaakso
 */
public class Board {
    
    private Box[][] board;
    private int boardWidth;
    private int boardHeigth;
    
    public Board(){
        this(3,3);
    }
    
    public Board(int x, int y){
        this.boardWidth = x;
        this.boardHeigth = y;
        this.board = new Box[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                this.board[i][j]=new Box();
            }
        }
        
        
    }
    
    public Box getBox(int x, int y){
        return this.board[x][y];
    }
    
    public int getWidth(){
        return this.boardWidth;
    }
    
    public int getHeigth(){
        return this.boardHeigth;
    }

}

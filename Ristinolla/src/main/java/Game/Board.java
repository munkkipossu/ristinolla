/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;
import java.awt.Image;
import java.io.*;

/**
 * The board for a tic tac toe game. The size of the board will be an option for the players to choose.
 *
 * @author tolaakso
 */
public class Board {
    
    private Box[][] board;
    private int boardWidth;
    private int boardHeigth;
    
    public Board() throws IOException{
        this(3,3);
    }
    
    public Board(int x, int y) throws IOException{
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

    /**
     * 
     * Method searces the board for adjacent (vertically, horizontally or diagonally) images. If a given number of images is found, returns true.
     * 
     * @param numberOfSymbols how many adjacent images we are looking for
     * @param image the image the method searches for
     * @return returns true if the required number of symbols are found adjacent to each other.
     */
    
    public boolean successiveSymbols(int numberOfSymbols, Image image){
        /* This method test if the board contains the required number of adjacent symblos either vertically, horizontally, or diagonally */

        /* Horizontal */
        for(int i=0; i<boardHeigth; i++){
            for(int j=0; j<boardWidth-numberOfSymbols; j++){
                for(int k=0; k<numberOfSymbols; k++){
                    if(this.board[i][j+k].imageEquals(image) != true){
                        break;
                    }
                    if(k==numberOfSymbols-1){
                        return true;
                    }
                }
            }
        }
        
        /* Vertical */
        for(int i=0; i<boardWidth; i++){
            for(int j=0; j<boardHeigth-numberOfSymbols; j++){
                for(int k=0; k<numberOfSymbols; k++){
                    if(this.board[j+k][i].imageEquals(image) != true){
                        break;
                    }
                    if(k==numberOfSymbols-1){
                        return true;
                    }
                }
            }
        }
        
        /* Diagonally */
        for(int i=0; i<boardHeigth-numberOfSymbols; i++){
            for(int j=0; j<boardWidth - numberOfSymbols; j++){
                for(int k=0; k<numberOfSymbols; k++){
                    if(this.board[i+k][j+k].imageEquals(image) != true){
                        break;
                    }
                    if(k==numberOfSymbols-1){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}

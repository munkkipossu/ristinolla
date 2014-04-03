/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * The class that will contain the public methods used to play the game.
 * 
 * @author tolaakso
 */

import java.awt.Image;

public class Game {
    
    private int winCondition;
    private Board board;
    private Player player1;             // I know this is bad name to be using, but not sure what would be better
    private Player player2;
    private Player activePlayer;
    
    
    /**
     * 
     * Constructor for quick tic tac toe: 3x3 board, default player names.
     * 
     */
    
    public Game(){
        this.winCondition = 3;
        this.board = new Board();
        this.player1 = new Player();
        this.player2 = new Player();
        this.activePlayer = this.player1;        
    }
    
    /**
     * 
     * @param width describes the width of the game board
     * @param heigth the heigth of the game board
     * @param winCondition how many adjacent boxes a player must have to win the game
     * @param name1 name of the first player (the on e that start the game)
     * @param image1 symbol or an image the player uses to identify his choices (traditionally x or o)
     * @param name2 name of the second player
     * @param image2 symbol of the second player
     */
    
    public Game(int width, int heigth, int winCondition, String name1, Image image1, String name2, Image image2){
        this.winCondition = winCondition;
        this.board = new Board(width,heigth);
        this.player1 = new Player(name1, image1);
        this.player2 = new Player(name2, image2);
        this.activePlayer = this.player1;
    }

    
    /**
     * 
     * Method for checking if the required condition for a win has been met.
     *      
     * @return true if the current player has won, false if no winner is found
     */
    public boolean checkWinCondition(){
        return this.board.successiveSymbols(this.winCondition, this.activePlayer.getImage()); 
    }
    
    public Image clickBox(int x, int y){
        Image imageHolder = this.activePlayer.getImage();
        if(this.board.getBox(x,y).changeImage(imageHolder)){
            if(checkWinCondition()){
                endGame(activePlayer);
            }
            changeActivePlayer();
            return imageHolder;
        }
        return null;        
    }
    
    public String getFirstPlayerName(){
        return this.player1.getName();
    }
    
        public String getSecondPlayerName(){
        return this.player2.getName();
    }
        
    public void endGame(Player winner){
        System.out.print("we have a winner :)");
    }
    
    public void changeActivePlayer(){
        if(this.activePlayer.equals(this.player1)){
            this.activePlayer = this.player2;
        }
        else{
            this.activePlayer = this.player1;
        }
    }
    
}

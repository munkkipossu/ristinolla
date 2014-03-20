/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author tolaakso
 */
public class Game {
    
    private int winCondition;
    private Board board;
    private Player player1;             // I know this is bad name to be using, but not sure what would be better
    private Player player2;
    
    
    public Game(){
        this.winCondition = 3;
        this.board = new Board();
        this.player1 = new Player();
        this.player2 = new Player();
    }
    
    public Game(int x, int y, int winCondition, String name1, String name2){
        this.winCondition = winCondition;
        this.board = new Board(x,y);
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public boolean checkWinCondition(){
        return false;        
    }
    
    public boolean clickBox(int x, int y){
        return this.board.getBox(x,y).clickBox();
    }
    
}

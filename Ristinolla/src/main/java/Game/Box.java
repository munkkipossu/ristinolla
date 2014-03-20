/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 * The basic of tic tac toe, which usually contains X's and O's. I'll try to figure out an easy way to let players choose their symbol for the game.
 *
 * @author tolaakso
 */
public class Box {
    private boolean clicked;
    //private symbol xxx;
    
    public Box(){
        this.clicked = false;
        // initiate symbol to a boring grey box or smth....
    }

    public boolean clickBox(){
        if(this.clicked == false){
            this.clicked = true;
            // change symbol to what is given in the method parameters
            return true;
        }
        return false;
    }
    
}

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
import java.awt.Image;

public class Box {
    private boolean clicked;
    private Image image;
    
    public Box(){
        this.clicked = false;
        // initiate symbol to a boring grey box or smth....
    }

    /**
     * Method that gives the box an image. This image cannot be changed later.
     * 
     * @param image
     */
    public boolean changeImage(Image image){
        if(this.clicked == false){
            this.clicked = true;
            this.image = image;
            return true;
        }
        return false;
    }
    
    public boolean imageEquals(Image image){
        return this.image.equals(image);
    }
    
    
    
}

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

import java.awt.Image;

public class Player {
    
    private String name;
    private Image image;    // Instead of having only x's and o's, we'll have some pictures to choose from
    
    public Player(){
        this("Xavier", null);
    }
    
    public Player(String name, Image image){
        this.name = name;        
        this.image = image;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Image getImage(){
        return this.image;
    }
    
    
    
}

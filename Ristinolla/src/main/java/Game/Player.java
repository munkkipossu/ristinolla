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
public class Player {
    
    private String name;
    //private Symbol symbol;    // Instead of having only x's and o's, we'll have some pictures to choose from
    
    public Player(){
        this("Xavier");
    }
    
    public Player(String name){
        this.name = name;        
    }
    
    public String getName(){
        return this.name;
    }
    
}

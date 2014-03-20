package Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tolaakso
 */
public class GameTest {
    
    Game game;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    // Jostain tulee java.lang.nullpointerException... testataan

    @Test
    public void constructorCreatesFirstPlayerName() {
        game = new Game();
        String name1 = game.getFirstPlayerName();
        assertEquals(name1, "Xavier");
    }
    
    @Test
    public void constructorCreatesSecondPlayerName() {
        game = new Game();
        String name1 = game.getSecondPlayerName();
        assertEquals(name1, "Xavier");
    }
    /*      
    @Test
    public void clickingBoxWorks() {
        game = new Game();
        boolean test = game.clickBox(1,1);
        assertTrue(test);
    }
  
    @Test
    public void clickingBoxWorksOnlyOnce() {
        game = new Game();
        boolean test;
        game.clickBox(1,1);
        test = game.clickBox(1,1);
        assertFalse(test);
    }
    */
}

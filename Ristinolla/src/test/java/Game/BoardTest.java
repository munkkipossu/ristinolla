/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

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
public class BoardTest {
    
    Board board;
    int width;
    int heigth;
    
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

    @Test
    public void checkBoardWidth() {
        width = 5;
        heigth = 7;
        board = new Board(width, heigth);
        assertTrue(board.getWidth()==width);
    }
    
        @Test
    public void checkBoardHeigth() {
        width = 5;
        heigth = 7;
        board = new Board(width, heigth);
        assertTrue(board.getHeigth()==heigth);
    }
}

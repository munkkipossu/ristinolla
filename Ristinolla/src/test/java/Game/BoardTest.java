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
import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 *
 * @author tolaakso
 */
public class BoardTest{
    
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
    public void checkBoardWidth() throws IOException{
        width = 5;
        heigth = 7;
        board = new Board(width, heigth);
        assertTrue(board.getWidth()==width);
    }
    
        @Test
    public void checkBoardHeigth() throws IOException{
        width = 5;
        heigth = 7;
        board = new Board(width, heigth);
        assertTrue(board.getHeigth()==heigth);
    }
    
    @Test
    public void checkBoxClickingOnceTrue() throws IOException{
        board = new Board(5,5);
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        assertTrue(this.board.getBox(3,4).changeImage(image));
    }
    
    @Test
    public void emptyBoardHasNoWinner() throws IOException {
        board = new Board(5,5);
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        assertFalse(board.successiveSymbols(3, image));
    }
    
    @Test
    public void findHorizontalWin() throws IOException {
        board = new Board(5,5);
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        board.getBox(0,0).changeImage(image);
        board.getBox(0,1).changeImage(image);
        board.getBox(0,2).changeImage(image);
        assertTrue(board.successiveSymbols(3, image));
    }
    
    @Test
    public void findVerticalWin() throws IOException {
        board = new Board(5,5);
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        board.getBox(0,0).changeImage(image);
        board.getBox(1,0).changeImage(image);
        board.getBox(2,0).changeImage(image);
        assertTrue(board.successiveSymbols(3, image));
    }
   
    
    @Test
    public void findDiagonalWin() throws IOException {
        board = new Board(5,5);
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        board.getBox(0,0).changeImage(image);
        board.getBox(1,1).changeImage(image);
        board.getBox(2,2).changeImage(image);
        assertTrue(board.successiveSymbols(3, image));
    }
}

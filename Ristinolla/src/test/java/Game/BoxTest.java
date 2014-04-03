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
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.Toolkit.*;
import java.awt.image.BufferedImage;



/**
 *
 * @author tolaakso
 */
public class BoxTest {
    
    // /cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/
    
    Box box;
    Box box2;
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    InputStream input = classLoader.getResourceAsStream("kala.jpg");
    
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
    public void clickingBoxOnceIsTrue() throws IOException {
        box = new Box();
        BufferedImage image;
        //image = ImageIO.read(input);
        image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        assertTrue(box.changeImage(image));
    }
    
    @Test
    public void clickingBoxTwicIsFalse() throws IOException {
        box = new Box();
        Image image;
        image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        box.changeImage(image);
        assertFalse(box.changeImage(image));
    }
    
    @Test
    public void equalsMethodGivesTrueForSameImage() throws IOException{
        box = new Box();
        Image image1 = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        box.changeImage(image1);
        assertTrue(box.imageEquals(image1));
    }
    
    @Test
    public void equalsMethodGivesFalseForDifferentImage() throws IOException{
        box = new Box();
        Image image1 = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        Image image2 = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/testiKuva.jpg"));
        box.changeImage(image1);
        assertFalse(box.imageEquals(image2));
    }
    
    @Test
    public void equalsMethodWorksWithoutChangingTheImage() throws IOException{
        box = new Box();
        Image image = ImageIO.read(new File("/cs/fs2/home/tolaakso/Desktop/ristinolla/Ristinolla/src/kala.jpg"));
        assertFalse(box.imageEquals(image));
    }
}

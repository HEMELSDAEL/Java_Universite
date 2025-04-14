package image;

import static org.junit.Assert.*;

import org.junit.Test;

import image.color.GrayColor;
public class ImageTest {
    @Test
    public void testChangeColorPixelUnknownPixelException() {
        Image image = new Image(2, 4);
        // Tente de changer la couleur d'un pixel invalide
        assertThrows(UnknownPixelException.class, () -> image.changeColorPixel(3, 1, GrayColor.BLACK));
    }
    
    @Test
    public void testChangeColorPixel() {
        Image image = new Image(2, 4);
        try {
            // Change la couleur d'un pixel valide
            image.changeColorPixel(1, 2, GrayColor.WHITE);
            Pixel pixel = image.getPixel(1, 2);
            assertEquals(GrayColor.WHITE, pixel.getColor());
        } catch (UnknownPixelException e) {
            System.out.println("Ne devrait pas lever d'exception ici.");
        }
    }

    @Test
    public void testNegative() {
        // Crée une image avec des niveaux de gris
        Image image = new Image(2, 2);
        image.changeColorPixel(0, 0, new GrayColor(100)); // Niveau de gris 100
        image.changeColorPixel(0, 1, new GrayColor(150)); // Niveau de gris 150
        

        // Crée une image négative
        Image negativeImage = image.negative();

        // Vérifie que la couleur des pixels dans l'image négative est correcte
        assertEquals(155, negativeImage.getPixel(0, 0).getColor().getGrayLevel()); // 255 - 100 = 155
        assertEquals(105, negativeImage.getPixel(0, 1).getColor().getGrayLevel()); // 255 - 150 = 105
    }

    @Test
    public void testEdgeExtraction() {
        Image image = new Image(4, 4);
        image.fillRectangle(0, 0, 2, 2, new GrayColor(50));
        image.fillRectangle(2, 0, 2, 2, new GrayColor(100));
        Image resultImage = image.edgeExtraction(50);
    
        assertEquals(GrayColor.WHITE, resultImage.getPixel(0, 0).getColor());
        assertEquals(GrayColor.WHITE, resultImage.getPixel(1, 0).getColor());
        assertEquals(GrayColor.BLACK, resultImage.getPixel(0, 1).getColor());
        assertEquals(GrayColor.BLACK, resultImage.getPixel(1, 1).getColor());
    
        // Utilisez equals pour comparer les instances de GrayColor
        assertEquals(new GrayColor(255), resultImage.getPixel(0, 2).getColor());
        assertEquals(new GrayColor(255), resultImage.getPixel(1, 2).getColor());
        assertEquals(new GrayColor(255), resultImage.getPixel(0, 3).getColor());
        assertEquals(new GrayColor(255), resultImage.getPixel(1, 3).getColor());
    }

    @Test
    public void testDecreaseNbGrayLevels() {
        // Créer une image simple avec une taille connue
        Image image = new Image(2, 2);

        // Remplir l'image avec des niveaux de gris spécifiques
        try {
            image.changeColorPixel(0, 0, new GrayColor(50));
            image.changeColorPixel(0, 1, new GrayColor(100));
            image.changeColorPixel(1, 0, new GrayColor(150));
            image.changeColorPixel(1, 1, new GrayColor(200));
        } catch (UnknownPixelException e) {
            System.out.println("Erreur de niveau de gris");;
        }
        // Tester la méthode decreaseNbGrayLevels
        Image resultImage = image.decreaseNbGrayLevels(4);

        // Vérifier que les niveaux de gris de l'image résultante sont corrects
        assertEquals(0, resultImage.getPixel(0, 0).getColor().getGrayLevel());
        assertEquals(64, resultImage.getPixel(0, 1).getColor().getGrayLevel());
        assertEquals(128, resultImage.getPixel(1, 0).getColor().getGrayLevel());
        assertEquals(192, resultImage.getPixel(1, 1).getColor().getGrayLevel());
    }
    
}    



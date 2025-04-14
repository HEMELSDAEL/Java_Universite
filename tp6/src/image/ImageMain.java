package image;
import image.color.*;
import image.util.*;

public class ImageMain {
    private static final String LAMP_IMAGE = "/images/lamp.pgm";

    public static void main(String[] args){

        System.out.println("Nombre d'arguments : " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " : " + args[i]);
        }
        String cheminImage;
        if (args.length>=1){
            cheminImage = args[0];
            System.out.println("Chemin de l'image : " + cheminImage);
        }else{
            cheminImage = LAMP_IMAGE;
        }
        Image image = new Image(150, 200);
        image.fillRectangle(20, 30, 50, 30, GrayColor.BLACK);
        image.fillRectangle(50, 100, 40, 40, new GrayColor(128));
        image.fillRectangle(90, 20, 50, 70, new GrayColor(200));
        ImageDisplayer displayer = new ImageDisplayer();
        displayer.display(image, "image");
        Image lampImg = ImageLoader.loadPGM(cheminImage);
        displayer.display(lampImg, "Lampe", 100, 100);
        Image negativeImage = lampImg.negative();
        int xOffset = 20 + image.getWidth() + 10;
        int yOffset = 20;
        displayer.display(negativeImage, "Image Négative", xOffset, yOffset);
        int threshold;
        if(args.length>=2){
            threshold = Integer.parseInt(args[1]);
        }else{
            threshold = 10;
        }
        Image edgeImage = lampImg.edgeExtraction(threshold);
        int xOffsetEdge = xOffset + lampImg.getWidth()+10;
        int yOffsetEdge = yOffset;
        displayer.display(edgeImage, "Image après extraction", xOffsetEdge, yOffsetEdge);
        int nbGrayLevels;
        if (args.length>=3){
            nbGrayLevels = Integer.parseInt(args[2]);
        }else{
            nbGrayLevels=4;
        }
        Image decreasedGrayLevelsImage = lampImg.decreaseNbGrayLevels(nbGrayLevels);
        int xOffsetDecreasedGrayLevels = 20 + lampImg.getWidth() + 10;
        int yOffsetDecreasedGrayLevels = 20;
        displayer.display(decreasedGrayLevelsImage, "Image après decreaseNbGrayLevels", xOffsetDecreasedGrayLevels, yOffsetDecreasedGrayLevels);
    }
    
}

package image;
import image.color.GrayColor;

public class Image implements ImageInterface{
    private Pixel [][] tab;
    
    public Image(int width, int height){
        this.tab = new Pixel[width][height];
        for (int x=0; x<width; x++){
            for (int y=0; y<height; y++){
                this.tab[x][y] = new Pixel ((GrayColor.WHITE));
            }
        }
    }

    public int getWidth(){
        return this.tab.length;
    }

    public int getHeight(){
        return this.tab[0].length;
    }

    public Pixel getPixel(int x, int y){
        return this.tab[x][y];
    }

    public void changeColorPixel(int x, int y, GrayColor color) throws UnknownPixelException{
        if (x < 0 || x >= getWidth() || y < 0 || y >= getHeight()) {
            throw new UnknownPixelException("Coordonnées de pixel non valides : x = " + x + ", y = " + y);
        } else {
            this.tab[x][y].setColor(color);
        }
    }

    public void fillRectangle(int x, int y, int width, int height, GrayColor color) {
        for (int i = x; i < x + width; i++) {
            for (int j = y; j < y + height; j++) {
                if (i < 0 || i >= this.tab.length || j < 0 || j >= this.tab[0].length) {
                    throw new UnknownPixelException("Coordonnées de pixel non valides : x = " + i + ", y = " + j);
                }
                this.tab[i][j].setColor(color);
            }
        }
    }

    public Image negative() {
        int width = getHeight();
        int height = getWidth();
        Image negativeImage = new Image(height, width);
    
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Pixel originalPixel = getPixel(y, x);
                int originalGrayLevel = originalPixel.getColor().getGrayLevel();
                int invertedGrayLevel = 255 - originalGrayLevel;
                negativeImage.changeColorPixel(y, x, new GrayColor(invertedGrayLevel));
            }
        }
    
        return negativeImage;
    }

    /**
     * Applies edge extraction to the image.
     * 
     * @param threshold The threshold value for determining the difference between gray levels.
     * @return A new image representing the contours of the initial image.
     */
    public Image edgeExtraction(int threshold){
        int heigth = getHeight();
        int width = getWidth();
        Image resultImage = new Image(width, heigth);
        for (int x=0; x<width-1; x++){
            for (int y=0; y<heigth-1; y++){
                try{
                    int currentGrayLevel = getPixel(x, y).getColor().getGrayLevel();
                    int rightGrayLevel = getPixel(x+1, y).getColor().getGrayLevel();
                    int belowGrayLevel = getPixel(x, y+1).getColor().getGrayLevel();
                    if (Math.abs(currentGrayLevel-rightGrayLevel)>threshold || Math.abs(currentGrayLevel-belowGrayLevel)>threshold){
                        resultImage.changeColorPixel(x, y, GrayColor.BLACK);
                    }
                }catch(UnknownPixelException e){
                    System.out.println("Erreur de Pixel");
                }
            }
        }
        return resultImage;
    }

    /**
    * Produces a new image by reducing the number of grey levels.
    * @param nbGrayLevels The number of grey levels desired (must be a power of 2 between 2 and 128).
    * @return A new image with a limited number of grey levels.
    * @throws IllegalArgumentException If nbGrayLevels is not a power of 2 (between 2 and 128).
    */
    public Image decreaseNbGrayLevels(int nbGrayLevels) {
        if (nbGrayLevels < 2 || nbGrayLevels > 128) {
            throw new IllegalArgumentException("nbGrayLevels should be between 2 and 128 (inclusive).");
        }
    
        int width = getWidth();
        int height = getHeight();
        Image resultImage = new Image(width, height);
    
        int subIntervalSize = 256 / nbGrayLevels;
    
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                try {
                    int originalGrayLevel = getPixel(x, y).getColor().getGrayLevel();
                    int newGrayLevel = (originalGrayLevel / subIntervalSize) * subIntervalSize;
                    resultImage.changeColorPixel(x, y, new GrayColor(newGrayLevel));
                } catch (UnknownPixelException e) {
                    System.out.println("Erreur de Pixel");
                }
            }
        }
    
        return resultImage;
    }
    
    
}

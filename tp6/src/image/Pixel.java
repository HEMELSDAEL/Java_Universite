package image;
import image.color.GrayColor;

public class Pixel {
    private GrayColor color;

    public Pixel(GrayColor color){
        this.color = color;
    }
    
    public void setColor(GrayColor color){
        this.color = color;
    }

    public GrayColor getColor(){
        return this.color;
    }

    public boolean equals(Object o){
        if (!(o instanceof Pixel)){
            return false;
        }else{
            Pixel other = (Pixel)o;
            return (this.color.equals(other.color));
        }
    }

    public int colorLevelDifference(Pixel pixel, Pixel pixel1){
        GrayColor grayColor1 = pixel.getColor();
        GrayColor grayColor2 = pixel1.getColor();
        int grayLevel1 = grayColor1.getGrayLevel();
        int grayLevel2 = grayColor2.getGrayLevel();
        int difference = Math.abs(grayLevel1 - grayLevel2);
        return difference;

    }
}

package image.color;

public class GrayColor {
    public static final GrayColor BLACK = new GrayColor(0);
    public static final GrayColor WHITE = new GrayColor(255);
    private int GrayLevel;
    private double alpha;

    public GrayColor(int level){
        this.GrayLevel = level;
        this.alpha = 1.0;
    }

    public int getGrayLevel(){
        return this.GrayLevel;
    }

    public double getAlpha(){
        return this.alpha;
    }

    public void setAlpha(double alpha){
        if (alpha>=0.0 && alpha<=1.0){
            this.alpha = alpha;
        }
    }

    public boolean equals(Object o){
        if (!(o instanceof GrayColor)){
            return false;
        }else{
            GrayColor other = (GrayColor)o;
            return (this.GrayLevel==other.GrayLevel)&&(this.alpha==other.alpha);
        }
    }
    
}

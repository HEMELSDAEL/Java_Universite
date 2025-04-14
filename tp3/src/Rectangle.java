public class Rectangle {
    public double longueur;
    public double largeur;
    
    /**
     * It's a constructor of my Rectangle class
     * @param longueur : This is the first parameter that designates the length of my rectangle
     * @param largeur : This is the second parameter that designates the width of my rectangle
     */
    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * This getter will allow to recover the length of my rectangle
     * @return : the length of my rectangle
     */
    public double getLongueur(){
        return this.longueur;
    }

    /**
     * This getter will allow to recover the width of my rectangle
     * @return : the width of my rectangle
     */
    public double getLargeur(){
        return this.largeur;
    }

    /**
     * Calculate the area of the rectangle
     * @return : the area of the rectangle
     */
    public double aire(){
        double aire = getLargeur()*getLongueur();
        return aire;
    }

    /**
     * Calculate the perimeter of the rectangle
     * @return : the perimeter of the rectangle
     */
    public double perimetre(){
        return 2*aire();
    }

    /**
     * Indicates whether the rectangle is square or not
     * @return : true if the rectangle is a square and otherwise false
     */
    public boolean carre_ou_non(){
        if (this.longueur==this.largeur){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Indicates whether the rectangle equals other object
     * @param rectangle : Object to be compared
     * @return : true if the object is equal to the other otherwise false
     */
    public boolean equals(Rectangle rectangle){
        if (!(rectangle instanceof Rectangle)){
            return false;
        }else{
            Rectangle other = (Rectangle) rectangle;
            return (this.longueur==other.longueur) && (this.largeur==other.largeur);
        }
    }

    /**
     * toString function will be used to describe the rectangle
     * @return : the description of the rectangle
     */
    public String toString(){
        return "Ce carre a une longueur de " + this.longueur + " cm et une largeur de " + this.largeur + " cm";
    }
}

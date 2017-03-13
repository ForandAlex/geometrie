package geometrie;

class Rectangle extends Figure {
    private double coteHorizontal;
    private double coteVertical;
    
    Rectangle() {
        super();
        coteHorizontal = 0;
        coteVertical = 0;
    }
    
    Rectangle(double coteHorizontal,
                    double coteVertical){
        super();
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;
    }
    
    Rectangle(double coteHorizontal,
                    double coteVertical, Point centre){
        super(centre);
        this.coteHorizontal = coteHorizontal;
        this.coteVertical = coteVertical;
    }
    
    Rectangle(Rectangle r) {
        this.setCentre(r.getCentre());
        this.coteHorizontal = r.coteHorizontal;
        this.coteVertical = r.coteVertical;
    }
    
    double getCoteHorizontal() {
        return coteHorizontal;
    }
    
    void setCoteHorizontal(double coteHorizontal) {
        this.coteHorizontal = coteHorizontal;
    }
    
    double getCoteVertical() {
        return coteVertical;
    }
    
    void setCoteVertical(double coteVertical) {
        this.coteVertical = coteVertical;
    } 
    
    public String toString() {
        return "centre : " + getCentre().toString() + "\ndimensions : " + coteHorizontal + " x " + coteVertical;  
    }   
      
    double calculerLongueur() {
        return 2 * (coteHorizontal + coteVertical);
              
    }
    
    double calculerAire() {
        return coteHorizontal * coteVertical;
    }
     
    boolean estInscrit(Cercle c) {
        return 4 * c.getRayon() * c.getRayon() == coteHorizontal * coteHorizontal + coteVertical * coteVertical;
    }
    
    Cercle inscrire() {
        if(coteHorizontal != coteVertical)
            return null;
        return new Cercle(coteHorizontal / 2);
    }  
    
    
    boolean estCarre() {
        return coteHorizontal == coteVertical;
    }
    
    public void zoomer(double coefficient) {
        super.zoomer(coefficient);
        coteHorizontal = coefficient * coteHorizontal;
        coteVertical = coefficient * coteVertical;
    }
    
    public Losange pivoter() {
        if(estCarre())
            return new Losange(coteHorizontal);
        return null;
    }
    
}

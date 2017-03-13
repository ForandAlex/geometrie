package geometrie;

class Cercle extends Figure implements Comparable<Cercle>{
    private double rayon;
    
    Cercle() {
        super();
        rayon = 0;
    }    
    
    Cercle(double rayon) {
        super();
        this.rayon = rayon;
    }
    
    Cercle(double rayon, Point centre) {
        super(centre);
        this.rayon = rayon;
    }
    
    Cercle(Cercle c) {
        this.setCentre(c.getCentre());
        this.rayon = c.rayon;
    }
    
    double getRayon() {
        return rayon;
    }
    
    void setRayon(double rayon) {        
        this.rayon = rayon;
    }
    
    public String toString() {
        return "centre : " + getCentre().toString() + 
        "\nrayon : " + rayon;
    } 
    
    public String toStringSVG() {
        return "<circle cx=\"" + this.getCentre().getX() +
               "\" cy=\"" + this.getCentre().getY() +
               "\" r=\"" + rayon + "\" fill=\"grey\" />";
    } 
    
    double calculerLongueur() {
        return 2 * Math.PI * rayon;      
    }
    
    double calculerAire() {
        return Math.PI * (rayon * rayon);
    }
    
    boolean estInscrit(Rectangle r) {
        return r.getCoteHorizontal() ==                 r.getCoteVertical() && r.getCoteHorizontal() == 2 * rayon;
    }
    
    Rectangle inscrire() {
        return new Rectangle(rayon * Math.sqrt(2), rayon * Math.sqrt(2));
    }  
    
    public void zoomer(double coefficient) {
        super.zoomer(coefficient);
        rayon = coefficient * rayon;  
    }
    
    public int compareTo(Cercle c) {
        return (int) Math.signum(this.calculerAire() - c.calculerAire());
}
}


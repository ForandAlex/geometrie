package geometrie;

class Losange extends Figure{
    private double cote;
   
   //constructeur
   
   Losange() {
        cote = 0;
   }
   
   Losange(double cote){
        this.cote = cote;
   }
   
   Losange(Losange l) {
        this.cote = l.cote;
   }
   
   // get set (encapsuleur)
   
   double Cote() {
        return cote;
   }
    
   void setCote(double cote){
        this.cote = cote;
   }
   
   public String toString(){
        return "côté : " + cote;
   }
   
   double calculerLongueur() {
        return 4 * cote;
   }
   
   public void zoomer(double coefficient) {
        super.zoomer(coefficient);
        cote = coefficient * cote;
   }
   
   public Rectangle pivoter(){
        return new Rectangle(cote, cote);
   }
   

}

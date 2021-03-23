
package lab5;


public class Lab5_assignment_runner {
    public static void main(String[] args){
        Fraction frac1 = new Fraction(1 , 6);
        Fraction frac2 = new Fraction();
        
        frac2.setNuminator(5);
        frac2.setDinuminator(30);
        frac1.displayFraction();
        frac2.displayFraction();
        frac1.Equal(frac2);
        
        Fraction frac3 = new Fraction(11 , 45);
        Fraction frac4 = new Fraction(30 , 25);
        frac3.displayFraction();
        frac4.displayFraction();
         frac3.Equal(frac4);
      
    }   
}

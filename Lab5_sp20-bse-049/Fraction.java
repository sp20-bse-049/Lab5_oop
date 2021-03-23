
package lab5;


public class Fraction {
    private int numinator , dinuminator;
    public Fraction(){
        numinator = 5;
        dinuminator = 15;
    }
    public Fraction(int a , int b){
        numinator = a;
        dinuminator = b;
    }
    
    public void setNuminator(int a){
        numinator = a;
    }
    public void setDinuminator(int b){
        dinuminator = b;
    }
    public int getNuminator(){
        return numinator;
    }
    public int getDinuminator(){
        return dinuminator;
    }
    
    public void displayFraction(){
	System.out.print(numinator + "/" + dinuminator);
        System.out.println();
    }
    
    public boolean Equal(Fraction f){
        int gcd = 1;
	for (int i = 2; i <= Math.min(numinator, dinuminator); i++){
              if (numinator % i == 0 && dinuminator % i == 0)
		    gcd = i;
	}

	numinator = numinator / gcd;
	dinuminator = dinuminator / gcd;
        
        for (int i = 2; i <= Math.min(f.numinator, f.dinuminator); i++){
              if (f.numinator % i == 0 && f.dinuminator % i == 0)
		    gcd = i;
	}
        
        f.numinator = f.numinator/gcd;
        f.dinuminator = f.dinuminator / gcd;
        
        if(numinator == f.numinator && dinuminator == f.dinuminator){
            System.out.println("both are identical.");
            return true;
        }    
        else{
            System.out.println("not identical");
            return false;
        }
        
        
    }
   
}

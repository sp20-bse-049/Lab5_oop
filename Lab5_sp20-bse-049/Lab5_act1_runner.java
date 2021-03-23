
package lab5;


public class Lab5_act1_runner {
    public static void main(String[] args){
        Distance d1 = new Distance();
        Distance d2 = new Distance(23 , 2);
        Distance d3 = d1.addDistance(d2);
        d3.Show();
        
        d1.setFeet(5);
        d1.setInches(8);
        d3 = d1.addDistance(d2);
        d3.Show();
    }
}

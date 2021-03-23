
package lab5;


public class Distance {
    private int feet , inches;
    public Distance(){
        feet = 10;
        inches = 6;
    }
    public Distance(int a , int b){
        feet = a;
        inches = b;
    }
    public void setFeet(int a){
        feet = a;
    }
    public void setInches(int b){
        inches = b;
    }
    public int getFeet(){
        return feet;
    }
    public int getInches(){
        return inches;
    }
    public Distance addDistance(Distance d1){
        Distance new_dis = new Distance(feet + d1.feet , inches + d1.inches);
        return new_dis;
    }
    public void Show(){
        System.out.println("added distance in feet = " + feet + "\nadded distance in inches  = " + inches);
    }
    
    
}


package lab5;


public class Lab5_humeact2_runner {
    public static void main(String[] args){
       Book[] array = new Book[100];
       Book obj1 = new Book("farhan" , "harry potter");
       Book obj2 = new Book();
       obj2.setAuthor("farhan");
       obj2.setName("urdu");
       obj1.compareBooks(obj2);
       
       
       Book obj3 = new Book("chris" , "Alchemist");
       Book obj4 = new Book();
       obj2.setAuthor("Ibne safi");
       obj2.setName("imran series");
       obj3.compareBooks(obj4);
    }
    
}

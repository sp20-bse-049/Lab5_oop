
package lab5;


public class Book {
    private String author;
    private String[] chapterNames ;
    private String name;
    public Book(){
        author = "NULL";
        chapterNames = new String[100];
    }
    public Book(String author , String name){
        this.author = author;
        this.name = name;
    }

    public void setAuthor(String a){
        author = a;
    }
    public String getAuthor(){
        return author;
    }
    public void setName(String b){
        name = b;
    }
    public boolean compareBooks(Book autherName ){
        if(author == autherName.author){
            System.out.println("both books have same author");
            return true;
        }
        else{
            System.out.println("both books have different authors");
            return false;
        }
        
    }
    
    
    
}

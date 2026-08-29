public class Book {
    private String title;
    private int pages;

    Book(){
        //Null/Defualt Constructor
    }

    //Parameterized Constructors
    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    //Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    //Getters
    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    //ToString overriding

    public String toString(){
        String s = "Book name is : ( "+this.title+" ) and it has ( "+this.pages+" ) Pages";

        return s;
    }


    
}
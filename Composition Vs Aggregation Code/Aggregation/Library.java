public class Library {
    private Book[] books;
    private String name;
    private int year;

    Library(){
        //Null Constructor
    }

    //Parameterized Constructor
    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }


    //Overriding toString()

    public String toString(){
        String s = "Name of the Library is : ( "+this.name+" ) and it was built in the year ( "+this.year+" ) and its books list are \n";

        
        for(int i=0; i<books.length; i++){
            s = s + (i+1)+"."+ books[i]+"\n";    
        }

        return s;
    }



}

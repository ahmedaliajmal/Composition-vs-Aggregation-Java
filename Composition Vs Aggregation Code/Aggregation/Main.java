public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The fellowship of ring", 425);
        Book book3 = new Book("The Psychology of money",120);

        
        Book[] books = {book1,book2,book3};

        Library library1 = new Library("Berlin Library", 1823, books);
        System.out.println(library1);


        //EXPECTED OUTPUT 
        //Name of the Library is : ( Berlin Library ) and it was built in the year ( 1823 ) and its books list are: 
        // 1.Book name is : ( null ) and it has ( 0 ) Pages
        // 2.Book name is : ( The fellowship of ring ) and it has ( 425 ) Pages
        // 3.Book name is : ( The Psychology of money ) and it has ( 120 ) Pages
    }
}

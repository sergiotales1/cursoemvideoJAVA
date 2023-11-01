package Library;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args) {
        Book b[] = new Book[5];
        b[0] = new Book("Made to Stick", "Business", 200);
        b[1] = new Book("Made to drank", "Business", 200);
        b[2] = new Book("Made to Sink", "Business", 200);
        System.out.println(b[2]);
        for(Book book : b){
            if(book != null){
                if(book.getBookTitle() != "Made to drank"){
                    System.out.println(book);
             }
            }
        }
    }
}

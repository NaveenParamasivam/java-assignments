package managementsystem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    Book[] books;
    public Library(){
        this.books=new Book[5];

    }

    public void addBook(Book book){

        for (int i=0;i<books.length;i++) {
            if(books[i] == null) {
                books[i] = book;
                System.out.println("Book added at position: "+i);

               return;
            }

        }

            System.out.println("Library is full");



    }
    public void removeBook(int bookID){
        for(int i=0;i<books.length;i++){
            if(books[i] != null && books[i].getBookID() == bookID){

                    books[i] =null;
                System.out.println("Book removed successfully");
                    return;

            }
        }
        System.out.println("Book not found");

    }
    public void replaceBook(int bookID){

    }
    public void searchBook(int bookID){
      for (Book book:books){
          if(book!=null && book.getBookID() == bookID){
              displayBook(book);
              return;
          }
      }
        System.out.println("Book not found");
    }
private void displayBook(Book book){
    System.out.println("*****Book Details******");
    System.out.println("Book Id:"+book.getBookID());
    System.out.println("Title:"+book.getTitle());
    System.out.println("Author:"+book.getAuthor());
    String availability =book.isAvailable()?"Yes":"No";
    System.out.println("Availability:"+availability);
    System.out.println("*****End******");
}
    public void displayBooks(){
       boolean isEmpty = true;
        for(Book book:books){
           if(book != null){
               displayBook(book);
               isEmpty = false;
           }


       }
        if(isEmpty){
            System.out.println("Library is empty");
        }
    }

}

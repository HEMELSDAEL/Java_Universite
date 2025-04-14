
/**
 * books for simple object manipulations
 * 
 * @author jc
 */

public class Book {
   private int NbPages;

   /**
    * book is defined by its author, its title, and its publication year
    * 
    * @param author the author of this book
    * @param title  the title of this book
    * @param year   the publication year of this book
    */
   public Book(String title, Author author, int publicationYear, int NbPages) {
      this.title = title;
      this.author = author;
      this.publicationYear = publicationYear;
      this.NbPages = NbPages;
   }

   // les attributs de la classe Book

   private Author author;
   private String title;
   private int publicationYear;

   // les méthodes de la classe Book

   /**
    * get book information as a String
    * 
    * @return description for this book
    */
   public String toString() {
      if (this.NbPages ==0){
         return this.title + " by " + this.author + " published in " + this.publicationYear;
      }
      else{
         return this.title + " by " + this.author + " published in " + this.publicationYear + " and makes " + this.NbPages + " pages";
      }
   }

   /**
    * reads this book (simply displays a text)
    */
   public void read() {
      System.out.println("I read : " + this.title);
   }

   /**
    * returns this book's author
    * 
    * @return this book's author
    */
   public Author getAuthor() {
      return this.author;
   }

   public int getNbPages(){
      return this.NbPages;
   }
}

public class LibraryMain {
    public static void main (String[] args){
        Library library1 = new Library();
        Author auteur = new Author("Tolkien", "JRR", 1892);
        Author auteur2 = new Author("Herbert", "Franck", 1920);
        Book livre1 = new Book("Le Seigneur des Anneaux", auteur, 1954, 1600);
        Book livre2 = new Book("Bilbo le Hobbit", auteur, 1937, 408);
        Book livre3 = new Book("Dune", auteur2, 1965, 0);
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        System.out.println(livre3.toString());
        library1.addBook(livre1); 
        library1.addBook(livre2);
        library1.addBook(livre3);
    }
}

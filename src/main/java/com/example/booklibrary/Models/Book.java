package src.main.java.com.example.booklibrary.Models;

public class Book {
    String ISBN;
    String Title;
    String Autor;

    public Book ( String isbn, String title, String autor){
        this.ISBN = isbn;
        this.Title = title;
        this.Autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAutor() {
        return Autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        if (getISBN() != null ? !getISBN().equals(book.getISBN()) : book.getISBN() != null) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getAutor() != null ? getAutor().equals(book.getAutor()) : book.getAutor() == null;
    }

    @Override
    public int hashCode() {
        int result = getISBN() != null ? getISBN().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getAutor() != null ? getAutor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", Title='" + Title + '\'' +
                ", Autor='" + Autor + '\'' +
                '}';
    }
}

